package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p05KebijakanKeamananInfo extends BasePage {
    private static By kebijakanKeamananInfoHeader = By.xpath("//div[text()='KEBIJAKAN SISTEM MANAJEMEN KEAMANAN INFORMASI']");
    private By berandaNavigation = By.xpath("//span[text()='Beranda']");
    private By kebijakanKeamananInfoNavigation = By.xpath("//span[text()='Kebijakan Keamanan Informasi']");

    public static boolean isKebijakanKeamananInfoHeaderDisplayed() {
        return find(kebijakanKeamananInfoHeader).isDisplayed();
    }

    public p01LandingPage clickBerandaNavigation() {
        click(berandaNavigation);
        return new p01LandingPage();
    }

    public void clickKebijakanKeamananInfoNavigation() {
        click(kebijakanKeamananInfoNavigation);
    }
}