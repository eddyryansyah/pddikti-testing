package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p6HasilPencarianAll extends BasePage {
    private static By hasilPencarianAllHeader = By.xpath("//div[text()='Hasil Pencarian Semua']");

    public static boolean isHasilPencarianAllHeaderDisplayed() {
        return find(hasilPencarianAllHeader).isDisplayed();
    }
}