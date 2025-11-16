package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p18BidangEkonomi extends BasePage {
    private static By bidangEkonomiHeader = By.xpath("//div[text()='Program Studi di Bidang Ekonomi']");

    public static boolean isBidangEkonomiHeaderDisplayed() {
        return find(bidangEkonomiHeader).isDisplayed();
    }
}