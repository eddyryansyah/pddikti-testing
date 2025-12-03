package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p4KebijakanPrivasi extends BasePage {
    private static By kebijakanPrivasiHeader = By.xpath("//div[text()='Privacy Policy']");
    private By berandaNavigation = By.xpath("//span[text()='Beranda']");
    private By kebijakanPrivasiNavigation = By.xpath("//span[text()='Privacy Policy']");
    private By linkKonten1 = By.xpath("//a[text()='Akurasi Informasi']");
    public By isiKonten1 = By.xpath("//h2[text()='Akurasi Informasi']");
    private By linkKonten2 = By.xpath("//a[text()='Ketersediaan Layanan']");
    public By isiKonten2 = By.xpath("//h2[text()='Ketersediaan Layanan']");
    private By linkKonten3 = By.xpath("//a[text()='Konten Pihak Ketiga']");
    public By isiKonten3 = By.xpath("//h2[text()='Konten Pihak Ketiga']");
    private By linkKonten4 = By.xpath("//a[text()='Penggunaan Pribadi']");
    public By isiKonten4 = By.xpath("//h2[text()='Penggunaan Pribadi']");
    private By linkKonten5 = By.xpath("//a[text()='Perubahan Kebijakan']");
    public By isiKonten5 = By.xpath("//h2[text()='Perubahan Kebijakan']");

    public static boolean isKebijakanPrivasiHeaderDisplayed() {
        return find(kebijakanPrivasiHeader).isDisplayed();
    }

    public p1LandingPage clickBerandaNavigation() {
        click(berandaNavigation);
        return new p1LandingPage();
    }

    public void clickKebijakanPrivasiNavigation() {
        click(kebijakanPrivasiNavigation);
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

    public void clickLinkKonten5() {
        click(linkKonten5);
    }
}