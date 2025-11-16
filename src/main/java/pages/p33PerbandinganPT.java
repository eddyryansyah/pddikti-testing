package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p33PerbandinganPT extends BasePage {
    private static By perbandinganPTHeader = By.xpath("//div[text()='Perguruan Tinggi di Indonesia!']");

    public static boolean isPerbandinganPTHeaderDisplayed() {
        return find(perbandinganPTHeader).isDisplayed();
    }
}