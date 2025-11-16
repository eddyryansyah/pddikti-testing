package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p2ProfilLembaga extends BasePage {
    private static By profilLembagaHeader = By.xpath("//h1[text()='Pangkalan Data Pendidikan Tinggi']");

    public static boolean isProfilLembagaHeaderDisplayed() {
        return find(profilLembagaHeader).isDisplayed();
    }
}