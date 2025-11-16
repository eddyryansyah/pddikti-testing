package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p4KebijakanPrivasi extends BasePage {
    private static By kebijakanPrivasiHeader = By.xpath("//div[text()='Privacy Policy']");

    public static boolean isKebijakanPrivasiHeaderDisplayed() {
        return find(kebijakanPrivasiHeader).isDisplayed();
    }
}