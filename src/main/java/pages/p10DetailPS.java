package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p10DetailPS extends BasePage {
    private static By detailPSHeader = By.xpath("//p[text()='Kode']");

    public static boolean isDetailPSHeaderDisplayed() {
        return find(detailPSHeader).isDisplayed();
    }
}