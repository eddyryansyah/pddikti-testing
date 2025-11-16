package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p35PerbandinganPS extends BasePage {
    private static By perbandinganPSHeader = By.xpath("//div[text()='Program Studi di Universitas Impianmu']");

    public static boolean isPerbandinganPSHeaderDisplayed() {
        return find(perbandinganPSHeader).isDisplayed();
    }
}