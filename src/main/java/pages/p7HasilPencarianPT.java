package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p7HasilPencarianPT extends BasePage {
    private static By hasilPencarianPTHeader = By.xpath("//div[@id='root']//div[text()='Hasil Pencarian Perguruan Tinggi']");

    public static boolean isHasilPencarianPTHeaderDisplayed() {
        return find(hasilPencarianPTHeader).isDisplayed();
    }
}
