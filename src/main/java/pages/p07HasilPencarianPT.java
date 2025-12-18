package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p07HasilPencarianPT extends BasePage {
    private static By hasilPencarianPTHeader = By.xpath("//div[text()='Hasil Pencarian Perguruan Tinggi']");

    public static boolean isHasilPencarianPTHeaderDisplayed() {
        return find(hasilPencarianPTHeader).isDisplayed();
    }
}