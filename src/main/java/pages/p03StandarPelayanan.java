package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p03StandarPelayanan extends BasePage {
    private static By standarPelayananHeader = By.xpath("//div[text()='Standar Pelayanan']");
    private By berandaNavigation = By.xpath("//span[text()='Beranda']");
    private By standarPelayananNavigation = By.xpath("//span[text()='Standar Pelayanan']");
    private By linkKonten1 = By.xpath("//p[text()='Prosedur Perubahan Data Mahasiswa Pokok dan Jenis Keluar']");
    public By isiKonten1 = By.xpath("//img[@alt='Perubahan Data Mahasiswa']");
    private By linkKonten2 = By.xpath("//p[text()='Prosedur Perubahan Data Mahasiswa (PDM) Pokok']");
    public By isiKonten2 = By.xpath("//img[@alt='Prosedur PDM Pokok']");
    private By linkKonten3 = By.xpath("//p[text()='Pembukaan Periode Lampau Atau Perbaikan Data Aktivitas Pembelajaran']");
    public By isiKonten3 = By.xpath("//img[@alt='Pembukaan Periode Lampau']");
    private By linkKonten4 = By.xpath("//p[text()='Permohonan Akses Data By Application Programming Interface (API)']");
    public By isiKonten4 = By.xpath("//img[@alt='Permohonan Akses Data']");

    public static boolean isStandarPelayananHeaderDisplayed() {
        return find(standarPelayananHeader).isDisplayed();
    }

    public p01LandingPage clickBerandaNavigation() {
        click(berandaNavigation);
        return new p01LandingPage();
    }

    public void clickStandarPelayananNavigation() {
        click(standarPelayananNavigation);
    }

    public void clickLinkKonten1() {
        click(linkKonten1);
    }

    public void clickLinkKonten2() {
        click(linkKonten2);
    }

    public void clickLinkKonten3() {
        click(linkKonten3);
    }

    public void clickLinkKonten4() {
        click(linkKonten4);
    }
}