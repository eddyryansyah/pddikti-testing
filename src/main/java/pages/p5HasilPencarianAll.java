package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p5HasilPencarianAll extends BasePage {
    private static By hasilPencarianALLHeader = By.xpath("//div[@id='root']//div[text()='Hasil Pencarian Semua']");

    public static boolean isHasilPencarianAllHeaderDisplayed() {
        return find(hasilPencarianALLHeader).isDisplayed();
    }
}
