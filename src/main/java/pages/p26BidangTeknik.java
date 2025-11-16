package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p26BidangTeknik extends BasePage {
    private static By bidangTeknikHeader = By.xpath("//div[text()='Program Studi di Bidang Teknik']");

    public static boolean isBidangTeknikHeaderDisplayed() {
        return find(bidangTeknikHeader).isDisplayed();
    }
}