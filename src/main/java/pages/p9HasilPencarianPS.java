package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p9HasilPencarianPS extends BasePage {
    private static By hasilPencarianPSHeader = By.xpath("//div[@id='root']//div[text()='Hasil Pencarian Program Studi']");

    public static boolean isHasilPencarianPSHeaderDisplayed() {
        return find(hasilPencarianPSHeader).isDisplayed();
    }
}
