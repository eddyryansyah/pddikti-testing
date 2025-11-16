package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p23BidangPertanian extends BasePage {
    private static By bidangPertanianHeader = By.xpath("//div[text()='Program Studi di Bidang Pertanian']");

    public static boolean isBidangPertanianHeaderDisplayed() {
        return find(bidangPertanianHeader).isDisplayed();
    }
}