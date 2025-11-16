package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p32KategoriPerbandingan extends BasePage {
    private static By kategoriPerbandinganHeader = By.xpath("//div[text()='Perbandingan Perguruan Tinggi maupun Program Studi Impianmu']");

    public static boolean isKategoriPerbandinganHeaderDisplayed() {
        return find(kategoriPerbandinganHeader).isDisplayed();
    }
}