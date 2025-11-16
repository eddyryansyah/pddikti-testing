package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p5KebijakanKeamananInfo extends BasePage {
    private static By kebijakanKeamananInfoHeader = By.xpath("//div[text()='KEBIJAKAN SISTEM MANAJEMEN KEAMANAN INFORMASI']");

    public static boolean isKebijakanKeamananInfoHeaderDisplayed() {
        return find(kebijakanKeamananInfoHeader).isDisplayed();
    }
}