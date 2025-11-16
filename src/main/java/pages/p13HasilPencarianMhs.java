package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p13HasilPencarianMhs extends BasePage {
    private static By hasilPencarianMhsHeader = By.xpath("//div[text()='Hasil Pencarian Mahasiswa']");

    public static boolean isHasilPencarianMhsHeaderDisplayed() {
        return find(hasilPencarianMhsHeader).isDisplayed();
    }
}