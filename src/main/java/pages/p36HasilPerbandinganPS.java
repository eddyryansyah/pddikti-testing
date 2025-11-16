package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p36HasilPerbandinganPS extends BasePage {
    private static By hasilPerbandinganPSHeader = By.xpath("//div[text()='Perbandingan Program Studi di Universitas Impianmu']");

    public static boolean isHasilPerbandinganPSHeaderDisplayed() {
        return find(hasilPerbandinganPSHeader).isDisplayed();
    }
}