package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p21BidangMIPA extends BasePage {
    private static By bidangMIPAHeader = By.xpath("//div[text()='Program Studi di Bidang MIPA']");

    public static boolean isBidangMIPAHeaderDisplayed() {
        return find(bidangMIPAHeader).isDisplayed();
    }
}