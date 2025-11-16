package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p22BidangPendidikan extends BasePage {
    private static By bidangPendidikanHeader = By.xpath("//div[text()='Program Studi di Bidang Pendidikan']");

    public static boolean isBidangPendidikanHeaderDisplayed() {
        return find(bidangPendidikanHeader).isDisplayed();
    }
}