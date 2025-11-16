package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p14DetailMhs extends BasePage {
    private static By detailMhsHeader = By.xpath("//div[text()='Biodata Mahasiswa']");

    public static boolean isDetailMhsHeaderDisplayed() {
        return find(detailMhsHeader).isDisplayed();
    }
}