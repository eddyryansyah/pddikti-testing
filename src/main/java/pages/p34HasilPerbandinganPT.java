package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p34HasilPerbandinganPT extends BasePage {
    private static By hasilPerbandinganPTHeader = By.xpath("//div[text()='Perbandingan Perguruan Tinggi di Indonesia!']");

    public static boolean isHasilPerbandinganPTHeaderDisplayed() {
        return find(hasilPerbandinganPTHeader).isDisplayed();
    }
}