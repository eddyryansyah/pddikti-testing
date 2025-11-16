package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p24BidangSeni extends BasePage {
    private static By bidangSeniHeader = By.xpath("//div[text()='Program Studi di Bidang Seni']");

    public static boolean isBidangSeniHeaderDisplayed() {
        return find(bidangSeniHeader).isDisplayed();
    }
}