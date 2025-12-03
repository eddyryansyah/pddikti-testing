package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p2ProfilLembaga extends BasePage {
    private static By profilLembagaHeader = By.xpath("//h1[text()='Pangkalan Data Pendidikan Tinggi']");
    private By selengkapnya = By.xpath("//button[text()='Selengkapnya']");
    private By fullText = By.xpath("//p[contains(., 'Pada tahun 2014')]");
    private By tutup = By.xpath("//button[text()='Tutup']");
    private By shortlText = By.xpath("//p[contains(text(),'Pangkalan Data Pendidikan Tinggi,')]");

    public static boolean isProfilLembagaHeaderDisplayed() {
        return find(profilLembagaHeader).isDisplayed();
    }

    public String clickSelengkapnya() {
        click(selengkapnya);
        return getFullText();
    }

    public String getFullText() {
        return find(fullText).getText();
    }

    public String clickTutup() {
        click(selengkapnya);
        click(tutup);
        return getShortText();
    }

    public String getShortText() {
        return find(shortlText).getText();
    }
}