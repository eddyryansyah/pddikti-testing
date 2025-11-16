package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p20BidangKesehatan extends BasePage {
    private static By bidangKesehatanHeader = By.xpath("//div[text()='Program Studi di Bidang Kesehatan']");

    public static boolean isBidangKesehatanHeaderDisplayed() {
        return find(bidangKesehatanHeader).isDisplayed();
    }
}