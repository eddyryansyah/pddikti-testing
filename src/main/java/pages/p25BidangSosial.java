package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p25BidangSosial extends BasePage {
    private static By bidangSosialHeader = By.xpath("//div[text()='Program Studi di Bidang Sosial']");

    public static boolean isBidangSosialHeaderDisplayed() {
        return find(bidangSosialHeader).isDisplayed();
    }
}