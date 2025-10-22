package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p1LandingPage extends BasePage {
    private By closePopup = By.xpath("//div[@style='opacity: 1;']//button[text()='Skip All']");
    private By dropDownNavbar = By.xpath("//li[text()='Tentang PDDikti']");
    private By profilLembaga = By.xpath("//div[@class='flex flex-col']/a[text()='Profil Lembaga']");
    private By standarPelayanan = By.xpath("//div[@class='flex flex-col']/a[text()='Standar Pelayanan']");
    private By faq = By.xpath("//div[@class='flex flex-col']/a[text()='FAQ']");
    private By kebijakanPrivasi = By.xpath("//li/a[text()='Kebijakan Privasi']");
    private By kebijakanKeamananInformasi = By.xpath("//li/a[text()='Kebijakan Keamanan Informasi']");
    private By prevBanner = By.xpath("//div[@id='prev']");
    private By banner = By.xpath("//div[@class='slide-wrapper -z-20']/div[@class='slide undefined']");
    private By nextBanner = By.xpath("//div[@id='next']");
    private By dropdownSearch = By.xpath("//*[@id=\"root\"]/div/div[5]/div[1]/div/div/div[1]/div/button/div/img");
    private By selectedAll = By.xpath("//*[@id=\"material-tailwind-select-0\"]");
    private By selectedPT = By.xpath("//*[@id=\"material-tailwind-select-1\"]");
    private By selectedPS = By.xpath("//*[@id=\"material-tailwind-select-2\"]");
    private By selectedDs = By.xpath("//*[@id=\"material-tailwind-select-3\"]");
    private By selectedMhs = By.xpath("//*[@id=\"material-tailwind-select-4\"]");
    private By searchField = By.xpath("//*[@id=\"root\"]/div/div[5]/div[1]/div/div/div[2]/input");
    private By searchButton = By.xpath("//*[@id=\"root\"]/div/div[5]/div[1]/div/div/div[2]/div/img");
    private By recaptchaIframe = By.cssSelector("iframe[title='reCAPTCHA']");
    private By recaptchaCheckbox = By.cssSelector("div.recaptcha-checkbox-border");
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

    public p2ProfilLembaga clickProfilLembaga() {
        clickClosePopup();
        click(dropDownNavbar);
        click(profilLembaga);
        return new p2ProfilLembaga();
    }

    public p3StandarPelayanan clickStandarPelayanan() {
        clickClosePopup();
        click(dropDownNavbar);
        click(standarPelayanan);
        return new p3StandarPelayanan();
    }

    public void clickFaq() {
        clickClosePopup();
        click(dropDownNavbar);
        click(faq);
    }

    public p4KebijakanPrivasi clickKebijakanPrivasi() {
        clickClosePopup();
        click(kebijakanPrivasi);
        return new p4KebijakanPrivasi();
    }

    public p5KebijakanKeamananInfo clickKebijakanKeamananInformasi() {
        clickClosePopup();
        click(kebijakanKeamananInformasi);
        return new p5KebijakanKeamananInfo();
    }

    public void clickPrevBanner() {
        clickClosePopup();
        click(prevBanner);
    }

    public p30Pengumuman clickBanner() {
        clickClosePopup();
        click(banner);
        return new p30Pengumuman();
    }

    public void clickNextBanner() {
        clickClosePopup();
        click(nextBanner);
    }

    public p6HasilPencarianAll logIntoSearchAll(String value) {
        clickClosePopup();
        click(dropdownSearch);
        click(selectedAll);
        set(searchField, value);
        click(searchButton);
        clickRecaptchaCheckbox();
        return new p6HasilPencarianAll();
    }

    public p7HasilPencarianPT logIntoSearchPT(String value) {
        clickClosePopup();
        click(dropdownSearch);
        click(selectedPT);
        set(searchField, value);
        click(searchButton);
        clickRecaptchaCheckbox();
        return new p7HasilPencarianPT();
    }

    public p9HasilPencarianPS logIntoSearchPS(String value) {
        clickClosePopup();
        click(dropdownSearch);
        click(selectedPS);
        set(searchField, value);
        click(searchButton);
        clickRecaptchaCheckbox();
        return new p9HasilPencarianPS();
    }

    public p11HasilPencarianDs logIntoSearchDs(String value) {
        clickClosePopup();
        click(dropdownSearch);
        click(selectedDs);
        set(searchField, value);
        click(searchButton);
        clickRecaptchaCheckbox();
        return new p11HasilPencarianDs();
    }

    public p13HasilPencarianMhs logIntoSearchMhs(String value) {
        clickClosePopup();
        click(dropdownSearch);
        click(selectedMhs);
        set(searchField, value);
        click(searchButton);
        clickRecaptchaCheckbox();
        return new p13HasilPencarianMhs();
    }

    public String clickRecaptchaCheckbox() {
        try {
            utilities.WaitUtility.waitForPresence(3, recaptchaIframe);
            driver.switchTo().frame(find(recaptchaIframe));
            utilities.WaitUtility.waitForClickability(10, recaptchaCheckbox);
            click(recaptchaCheckbox);
            return null;
        } catch (Exception e) {
            driver.switchTo().defaultContent();
            return getErrorMessage();
        } finally {
            driver.switchTo().defaultContent();
        }
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }

    public p15PencarianSpesifikMhs clickPencarianSpesifik() {
        clickClosePopup();
        click(pencarianSpesifik);
        return new p15PencarianSpesifikMhs();
    }

    public p16ProgramStudi clickMenuProgramStudi() {
        clickClosePopup();
        click(programStudi);
        return new p16ProgramStudi();
    }

    public p27PerguruanTinggi clickMenuPerguruanTinggi() {
        clickClosePopup();
        click(perguruanTinggi);
        return new p27PerguruanTinggi();
    }

    public p28Statistik clickMenuStatistik() {
        clickClosePopup();
        click(statistik);
        return new p28Statistik();
    }

    public p29Publikasi clickMenuPublikasi() {
        clickClosePopup();
        click(publikasi);
        return new p29Publikasi();
    }

    public p30Pengumuman clickMenuPengumuman() {
        clickClosePopup();
        click(pengumuman);
        return new p30Pengumuman();
    }

    public p31Peta clickMenuPeta() {
        clickClosePopup();
        click(peta);
        return new p31Peta();
    }

    public void clickCtaCariInformasi() {
        clickClosePopup();
        click(ctaCariInformasi);
    }

    public p32KategoriPerbandingan clickCtaKomparasi() {
        clickClosePopup();
        click(ctaKomparasi);
        return new p32KategoriPerbandingan();
    }

    public void showToolTipBidangIlmu() {
        clickClosePopup();
        click(toolTipBidangIlmu);
    }

    public p16ProgramStudi clickCtaLihatBidangIlmu() {
        clickClosePopup();
        click(ctaLihatBidangIlmu);
        return new p16ProgramStudi();
    }

    public p22BidangPendidikan clickBidangIlmu1() {
        clickClosePopup();
        click(BidangIlmu1);
        return new p22BidangPendidikan();
    }

    public p18BidangEkonomi clickBidangIlmu2() {
        clickClosePopup();
        click(BidangIlmu2);
        return new p18BidangEkonomi();
    }

    public p26BidangTeknik clickBidangIlmu3() {
        clickClosePopup();
        click(BidangIlmu3);
        return new p26BidangTeknik();
    }

    public p28Statistik clickCtaLihatStatistik() {
        clickClosePopup();
        click(ctaLihatStatistik);
        return new p28Statistik();
    }

    public void showToolTipStatistikMhs() {
        clickClosePopup();
        click(toolTipStatistikMhs);
    }
    public p28Statistik clickStatistikMhs() {
        clickClosePopup();
        click(statistikMhs);
        return new p28Statistik();
    }

    public void showToolTipStatistikDs() {
        clickClosePopup();
        click(toolTipStatistikDs);
    }

    public p28Statistik clickStatistikDs() {
        clickClosePopup();
        click(statistikDs);
        return new p28Statistik();
    }

    public void showToolTipStatistikPT() {
        clickClosePopup();
        click(toolTipStatistikPT);
    }

    public p28Statistik clickStatistikPT() {
        clickClosePopup();
        click(statistikPT);
        return new p28Statistik();
    }

    public void showToolTipStatistikPS() {
        clickClosePopup();
        click(toolTipStatistikPS);
    }

    public p28Statistik clickStatistikPS() {
        clickClosePopup();
        click(statistikPS);
        return new p28Statistik();
    }

    public p29Publikasi clickCtaLihatPublikasi() {
        clickClosePopup();
        click(ctaLihatPublikasi);
        return new p29Publikasi();
    }

    public void clickCtaPublikasi1() {
        clickClosePopup();
        click(ctaPublikasi1);
    }

    public void clickCtaPublikasi2() {
        clickClosePopup();
        click(ctaPublikasi2);
    }

    public void clickCtaPublikasi3() {
        clickClosePopup();
        click(ctaPublikasi3);
    }

    public void clickCtaPublikasi4() {
        clickClosePopup();
        click(ctaPublikasi4);
    }

    public void showToolTipKegiatan() {
        clickClosePopup();
        click(toolTipKegiatan);
    }

    public p37Kegiatan clickCtaLihatKegiatan() {
        clickClosePopup();
        click(ctaLihatKegiatan);
        return new p37Kegiatan();
    }

    public p38DetailKegiatan clickCtaKegiatan() {
        clickClosePopup();
        click(ctaKegiatan);
        return new p38DetailKegiatan();
    }

    public p39Kontributor clickKontributor() {
        clickClosePopup();
        click(kontributor);
        return new p39Kontributor();
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