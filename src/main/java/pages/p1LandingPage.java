package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p1LandingPage extends BasePage {
    private By closePopup = By.xpath("//*[@id=\"root\"]/div/div[4]/div/button[1]");
    private By dropDownNavbar = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/ul/li[1]");
    private By profilLembaga = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/ul/div/div/a[1]");
    private By standarPelayanan = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/ul/div/div/a[2]");
    private By faq = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/ul/div/div/a[3]");
    private By kebijakanPrivasi = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/ul/li[2]/a");
    private By prevBanner = By.xpath("//*[@id=\"prev\"]/svg/path");
    private By banner = By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]");
    private By nextBanner = By.xpath("//*[@id=\"next\"]/svg/path");
    private By dropdownSearch = By.xpath("//*[@id=\"root\"]/div/div[5]/div[1]/div/div/div[1]/div/button/div/img");
    private By selectedAll = By.xpath("//*[@id=\"material-tailwind-select-0\"]");
    private By selectedPT = By.xpath("//*[@id=\"material-tailwind-select-1\"]");
    private By selectedPS = By.xpath("//*[@id=\"material-tailwind-select-2\"]");
    private By selectedDs = By.xpath("//*[@id=\"material-tailwind-select-3\"]");
    private By selectedMhs = By.xpath("//*[@id=\"material-tailwind-select-4\"]");
    private By searchField = By.xpath("//*[@id=\"root\"]/div/div[5]/div[1]/div/div/div[2]/input");
    private By searchButton = By.xpath("//*[@id=\"root\"]/div/div[5]/div[1]/div/div/div[2]/div/img");
    private By errorMessage = By.xpath("//*[@id=\"root\"]/div/div[5]/div[1]/div/p");
    private By pencarianSpesifik = By.xpath("//*[@id=\"root\"]/div/div[5]/div[1]/div/a");
    private By programStudi = By.xpath("//*[@id=\"book-wrapper\"]");
    private By perguruanTinggi = By.xpath("//*[@id=\"buildings-wrapper\"]");
    private By statistik = By.xpath("//*[@id=\"bar-wrapper\"]");
    private By publikasi = By.xpath("//*[@id=\"books-wrapper\"]");
    private By pengumuman = By.xpath("//*[@id=\"sound-wrapper\"]");
    private By peta = By.xpath("//*[@id=\"map-wrapper\"]");
    private By ctaCariInformasi = By.xpath("//*[@id=\"root\"]/div/div[5]/div[3]/div/div[1]/div/div/p/a");
    private By ctaKomparasi = By.xpath("//*[@id=\"root\"]/div/div[5]/div[3]/div/div[2]/div/div/p/span");
    private By toolTipBidangIlmu = By.xpath("//*[@id=\"root\"]/div/div[5]/div[4]/div[1]/div[1]/span/svg");
    private By ctaLihatBidangIlmu = By.xpath("//*[@id=\"root\"]/div/div[5]/div[4]/div[1]/div[2]/p");
    private By BidangIlmu1 = By.xpath("//*[@id=\"root\"]/div/div[5]/div[4]/div[2]/a[1]/div");
    private By BidangIlmu2 = By.xpath("//*[@id=\"root\"]/div/div[5]/div[4]/div[2]/a[2]/div");
    private By BidangIlmu3 = By.xpath("//*[@id=\"root\"]/div/div[5]/div[4]/div[2]/a[3]/div");
    private By ctaLihatStatistik = By.xpath("//*[@id=\"root\"]/div/div[5]/div[5]/div[1]/div[2]/p");
    private By toolTipStatistikMhs = By.xpath("//*[@id=\"root\"]/div/div[5]/div[5]/div[2]/div[1]/div/span/svg");
    private By statistikMhs = By.xpath("//*[@id=\"root\"]/div/div[5]/div[5]/div[2]/div[1]");
    private By toolTipStatistikDs = By.xpath("//*[@id=\"root\"]/div/div[5]/div[5]/div[2]/div[2]/div/span/svg");
    private By statistikDs = By.xpath("//*[@id=\"root\"]/div/div[5]/div[5]/div[2]/div[2]");
    private By toolTipStatistikPT = By.xpath("//*[@id=\"root\"]/div/div[5]/div[5]/div[2]/div[3]/div/span/svg");
    private By statistikPT = By.xpath("//*[@id=\"root\"]/div/div[5]/div[5]/div[2]/div[3]");
    private By toolTipStatistikPS = By.xpath("//*[@id=\"root\"]/div/div[5]/div[5]/div[2]/div[4]/div/span/svg");
    private By statistikPS = By.xpath("//*[@id=\"root\"]/div/div[5]/div[5]/div[2]/div[4]");
    private By ctaLihatPublikasi = By.xpath("//*[@id=\"root\"]/div/div[5]/div[6]/div[1]/div[2]/p");
    private By ctaPublikasi1 = By.xpath("//*[@id=\"root\"]/div/div[5]/div[6]/div[2]/div[1]/a");
    private By ctaPublikasi2 = By.xpath("//*[@id=\"root\"]/div/div[5]/div[6]/div[2]/div[2]/a");
    private By ctaPublikasi3 = By.xpath("//*[@id=\"root\"]/div/div[5]/div[6]/div[2]/div[3]/a");
    private By ctaPublikasi4 = By.xpath("//*[@id=\"root\"]/div/div[5]/div[6]/div[2]/div[4]/a");
    private By toolTipKegiatan = By.xpath("//*[@id=\"root\"]/div/div[5]/div[7]/div[1]/div/span/svg");
    private By ctaLihatKegiatan = By.xpath("//*[@id=\"root\"]/div/div[5]/div[7]/div[1]/a/p");
    private By ctaKegiatan = By.xpath("//*[@id=\"root\"]/div/div[5]/div[7]/div[2]/div/div/a");
    private By kontributor = By.xpath("//*[@id=\"root\"]/div/div[6]/div[2]/div[1]/a");
    private By socialX = By.xpath("//*[@id=\"root\"]/div/div[6]/div[2]/div[2]/div");
    private By socialInstagram = By.xpath("//*[@id=\"root\"]/div/div[6]/div[2]/div[2]/a[1]");
    private By socialFacebook = By.xpath("//*[@id=\"root\"]/div/div[6]/div[2]/div[2]/a[2]");
    private By socialYoutube = By.xpath("//*[@id=\"root\"]/div/div[6]/div[2]/div[2]/a[3]");

    public void clickClosePopup() {
            utilities.WaitUtility.fluentWaitUntilVisible(5, closePopup);
            click(closePopup);
    }

    public void clickProfilLembaga() {
        clickClosePopup();
        click(dropDownNavbar);
        click(profilLembaga);
    }

    public void clickStandarPelayanan() {
        clickClosePopup();
        click(dropDownNavbar);
        click(standarPelayanan);
    }

    public void clickFaq() {
        clickClosePopup();
        click(dropDownNavbar);
        click(faq);
    }

    public void clickKebijakanPrivasi() {
        clickClosePopup();
        click(kebijakanPrivasi);
    }

    public void clickPrevBanner() {
        clickClosePopup();
        click(prevBanner);
    }

    public void clickBanner() {
        clickClosePopup();
        click(banner);
    }

    public void clickNextBanner() {
        clickClosePopup();
        click(nextBanner);
    }

    public p5HasilPencarianAll logIntoSearchAll(String value) {
        clickClosePopup();
        click(dropdownSearch);
        click(selectedAll);
        set(searchField, value);
        return new p5HasilPencarianAll();
    }

    public p6HasilPencarianPT logIntoSearchPT(String value) {
        clickClosePopup();
        click(dropdownSearch);
        click(selectedPT);
        set(searchField, value);
        return new p6HasilPencarianPT();
    }

    public p8HasilPencarianPS logIntoSearchPS(String value) {
        clickClosePopup();
        click(dropdownSearch);
        click(selectedPS);
        set(searchField, value);
        return new p8HasilPencarianPS();
    }

    public p10HasilPencarianDs logIntoSearchDs(String value) {
        clickClosePopup();
        click(dropdownSearch);
        click(selectedDs);
        set(searchField, value);
        return new p10HasilPencarianDs();
    }

    public p12HasilPencarianMhs logIntoSearchMhs(String value) {
        clickClosePopup();
        click(dropdownSearch);
        click(selectedMhs);
        set(searchField, value);
        return new p12HasilPencarianMhs();
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }

    public void clickPencarianSpesifik() {
        try {
            utilities.WaitUtility.fluentWaitUntilVisible(10, pencarianSpesifik);
            click(pencarianSpesifik);
        } catch (Exception e) {
            By alt = By.xpath("//a[contains(.,'Pencarian Spesifik')]");
            try {
                utilities.WaitUtility.fluentWaitUntilVisible(10, alt);
                click(alt);
            } catch (Exception ignored) {
                // As a last resort, attempt JS click if element exists but not visible
                try {
                    utilities.JavaScriptUtility.clickJS(alt);
                } catch (Exception ignored2) {}
            }
        }
    }

    public void clickMenuProgramStudi() {
        clickClosePopup();
        click(programStudi);
    }

    public void clickMenuPerguruanTinggi() {
        clickClosePopup();
        click(perguruanTinggi);
    }

    public void clickMenuStatistik() {
        clickClosePopup();
        click(statistik);
    }

    public void clickMenuPublikasi() {
        clickClosePopup();
        click(publikasi);
    }

    public void clickMenuPengumuman() {
        clickClosePopup();
        click(pengumuman);
    }

    public void clickMenuPeta() {
        clickClosePopup();
        click(peta);
    }

    public void clickCtaCariInformasi() {
        click(ctaCariInformasi);
    }

    public void clickCtaKomparasi() {
        click(ctaKomparasi);
    }

    public void clickKontributor() {
        clickClosePopup();
        click(kontributor);
    }

    public void clickSocialX() {
        clickClosePopup();
        click(socialX);
    }

    public void clickSocialInstagram() {
        clickClosePopup();
        click(socialInstagram);
    }

    public void clickSocialFacebook() {
        clickClosePopup();
        click(socialFacebook);
    }

    public void clickSocialYoutube() {
        clickClosePopup();
        click(socialYoutube);
    }
}