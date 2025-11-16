package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p31Peta extends BasePage {
    private static By petaHeader = By.xpath("//p[text()='PETA PERGURUAN TINGGI DI INDONESIA']");

    public static boolean isPetaHeaderDisplayed() {
        return find(petaHeader).isDisplayed();
    }
}