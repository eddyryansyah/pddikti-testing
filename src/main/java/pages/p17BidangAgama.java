package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p17BidangAgama extends BasePage {
    private static By bidangAgamaHeader = By.xpath("//div[text()='Program Studi di Bidang Agama']");

    public static boolean isBidangAgamaHeaderDisplayed() {
        return find(bidangAgamaHeader).isDisplayed();
    }
}