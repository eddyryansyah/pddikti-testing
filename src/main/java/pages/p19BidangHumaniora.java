package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p19BidangHumaniora extends BasePage {
    private static By bidangHumanioraHeader = By.xpath("//div[text()='Program Studi di Bidang Humaniora']");

    public static boolean isBidangHumanioraHeaderDisplayed() {
        return find(bidangHumanioraHeader).isDisplayed();
    }
}