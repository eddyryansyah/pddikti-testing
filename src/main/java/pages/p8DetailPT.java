package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p8DetailPT extends BasePage {
    private static By detailPTHeader = By.xpath("//div[@class='']/p[text()='Kode']");

    public static boolean isDetailPTHeaderDisplayed() {
        return find(detailPTHeader).isDisplayed();
    }
}