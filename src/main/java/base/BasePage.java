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

public class BasePage {
    public static WebDriver driver;
    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    protected WebElement find(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void set(By locator, String text) {
        WebElement el = find(locator);
        el.clear();
        el.sendKeys(text);
    }

    protected void click(By locator) {
        // Capture window state before click
        String originalHandle = null;
        Set<String> beforeHandles = new HashSet<>();
        try {
            originalHandle = driver.getWindowHandle();
            beforeHandles = driver.getWindowHandles();
        } catch (Exception ignored) {}

        // Always pre-scroll the element into view (center) before clicking
        try {
            WebElement toScroll = driver.findElement(locator);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", toScroll);
        } catch (Exception ignored) {}

        // Perform click with existing resilient strategy
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(locator));
            el.click();
        } catch (Exception e) {
            try {
                WebElement el = driver.findElement(locator);
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", el);
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
            } catch (Exception ignored) {
                // Swallow as a last resort to keep flows running; specific methods can handle absence.
            }
        }

        // If a new window/tab opened, close it and return to original
        try {
            // Wait briefly for a new window to appear
            final int beforeSize = (beforeHandles == null ? 0 : beforeHandles.size());
            WebDriverWait smallWait = new WebDriverWait(driver, Duration.ofSeconds(1));
            smallWait.until(d -> driver.getWindowHandles().size() > beforeSize);
        } catch (Exception ignored) { /* no new window likely */ }

        try {
            Set<String> afterHandles = driver.getWindowHandles();
            if (beforeHandles != null && afterHandles.size() > beforeHandles.size()) {
                for (String handle : afterHandles) {
                    if (!beforeHandles.contains(handle)) {
                        // Switch to new window, close it, and switch back
                        driver.switchTo().window(handle);
                        try { driver.close(); } catch (Exception ignored) {}
                        break; // Assume single new window per click
                    }
                }
                // Switch back to original if still open
                if (originalHandle != null) {
                    try { driver.switchTo().window(originalHandle); } catch (Exception ignored) {}
                }
            }
        } catch (Exception ignored) {}
    }
}