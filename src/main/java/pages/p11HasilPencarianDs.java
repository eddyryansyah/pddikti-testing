package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p11HasilPencarianDs extends BasePage {
    private static By hasilPencarianDsHeader = By.xpath("//div[@id='root']//div[text()='Hasil Pencarian Dosen']");

    public static boolean isHasilPencarianDsHeaderDisplayed() {
        return find(hasilPencarianDsHeader).isDisplayed();
    }
}
