package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p09HasilPencarianPS extends BasePage {
    private static By hasilPencarianPSHeader = By.xpath("//div[text()='Hasil Pencarian Program Studi']");

    public static boolean isHasilPencarianPSHeaderDisplayed() {
        return find(hasilPencarianPSHeader).isDisplayed();
    }
}