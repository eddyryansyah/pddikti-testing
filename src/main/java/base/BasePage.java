package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

import static utilities.GetUtility.getWindowHandle;
import static utilities.GetUtility.getWindowHandles;
import static utilities.SwitchToUtility.switchToWindow;

public class BasePage {
    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    protected static WebElement find(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void set(By locator, String text) {
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected void click(By locator) {
        // Capture window state before click
        String originalHandle = null;
        Set<String> beforeHandles = new HashSet<>();
        try {
            originalHandle = driver.getWindowHandle();
            beforeHandles = driver.getWindowHandles();
        } catch (Exception ignored) {
        }

        // Always pre-scroll the element into view (center) before clicking
        try {
            WebElement toScroll = driver.findElement(locator);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", toScroll);
        } catch (Exception ignored) {
        }

        // Perform click with existing resilient strategy
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
        } catch (Exception e) {
            try {
                WebElement element = driver.findElement(locator);
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            } catch (Exception ignored) {
                // Swallow as a last resort to keep flows running; specific methods can handle absence.
            }
        }
    }

    public void switchToTab() {
        String currentHandle = getWindowHandle();
        Set<String> allHandles = getWindowHandles();
        for (String handle : allHandles) {
            if (!currentHandle.equals(handle)) {
                switchToWindow(handle);
            }
        }
    }

    public void closeAllTabsExceptMain(String mainHandle) {
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainHandle)) {
                switchToWindow(handle);
                driver.close();
            }
        }
        driver.switchTo().window(mainHandle);
    }

    public static void delay(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }
}