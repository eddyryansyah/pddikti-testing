package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p28Statistik extends BasePage {
    private static By statistikHeader = By.xpath("//div[text()='Statistik Perguruan Tinggi Di Indonesia']");

    public static boolean isStatistikHeaderDisplayed() {
        return find(statistikHeader).isDisplayed();
    }
}