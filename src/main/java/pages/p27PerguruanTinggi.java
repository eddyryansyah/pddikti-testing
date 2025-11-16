package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p27PerguruanTinggi extends BasePage {
    private static By perguruanTinggiHeader = By.xpath("//div[text()='Perguruan Tinggi di Indonesia!']");

    public static boolean isPerguruanTinggiHeaderDisplayed() {
        return find(perguruanTinggiHeader).isDisplayed();
    }
}