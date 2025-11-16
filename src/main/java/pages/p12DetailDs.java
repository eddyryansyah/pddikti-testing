package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p12DetailDs extends BasePage {
    private static By detailDsHeader = By.xpath("//div[text()='Biodata Dosen']");

    public static boolean isDetailDsHeaderDisplayed() {
        return find(detailDsHeader).isDisplayed();
    }
}