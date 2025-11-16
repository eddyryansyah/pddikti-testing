package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

import static utilities.GetUtility.*;
import static utilities.SwitchToUtility.*;
import static utilities.WaitUtility.*;

public class p1LandingPage extends BasePage {
    private By closePopup = By.xpath("//button[text()='Skip All']");
    private By dropDownNavbar = By.xpath("//li[text()='Tentang PDDikti']");
    private By profilLembaga = By.xpath("//a[text()='Profil Lembaga']");
    private By standarPelayanan = By.xpath("//a[text()='Standar Pelayanan']");
    private By faq = By.xpath("//a[text()='FAQ']");
    private By kebijakanPrivasi = By.xpath("//a[text()='Kebijakan Privasi']");
    private By kebijakanKeamananInfo = By.xpath("//a[text()='Kebijakan Keamanan Informasi']");
    private By prevBanner = By.xpath("//div[@id='prev']");
    public By banner = By.xpath("//div[@class='slide undefined']");
    private By nextBanner = By.xpath("//div[@id='next']");
    private By dropdownSearch = By.xpath("//button[@type='button']");
    private By selectedAll = By.xpath("//li[text()='Semua']");
    private By selectedPT = By.xpath("//li[text()='Perguruan Tinggi']");
    private By selectedPS = By.xpath("//li[text()='Program Studi']");
    private By selectedDs = By.xpath("//li[text()='Dosen']");
    private By selectedMhs = By.xpath("//li[text()='Mahasiswa']");
    private By searchField = By.xpath("//input[@type='text']");
    private By searchButton = By.xpath("//img[@alt='cari']");
    private By recaptchaIframe = By.xpath("//iframe[@title='reCAPTCHA']");
    private By recaptchaCheckbox = By.xpath("//div[@class='recaptcha-checkbox-border']");
    private By errorMessage = By.xpath("//p[text()='Pencarian tidak boleh kosong!']");
    private By pencarianSpesifik = By.xpath("//a[text()='Pencarian Spesifik']");
    private By programStudi = By.xpath("//a[@href='/program-studi']//p[text()='Program Studi']");
    private By perguruanTinggi = By.xpath("//a[@href='/perguruan-tinggi']//p[text()='Perguruan Tinggi']");
    private By statistik = By.xpath("//a[@href='/statistik']//p[text()='Statistik']");
    private By publikasi = By.xpath("//a[@href='/publikasi']//p[text()='Publikasi']");
    private By pengumuman = By.xpath("//a[@href='/pengumuman']//p[text()='Pengumuman']");
    private By peta = By.xpath("//a[@href='/pt/peta']//p[text()='Peta']");
    private By ctaCariInformasi = By.xpath("//a[text()='di sini']");
    private By ctaKomparasi = By.xpath("//span[text()='di sini']");
    private By iconInfoBidangIlmu = By.xpath("//h1[text()='Bidang Ilmu Terpopuler']/following-sibling::span[@class='relative']");
    private By toolTipBidangIlmu = By.xpath("//p[text()='mahasiswa terbanyak ']");
    private By ctaLihatBidangIlmu = By.xpath("//div[4]//p[text()='Lihat semua']");
    private By BidangIlmu1 = By.xpath("//h2[text()='Pendidikan']");
    private By BidangIlmu2 = By.xpath("//h2[text()='Ekonomi']");
    private By BidangIlmu3 = By.xpath("//h2[text()='Teknik']");
    private By ctaLihatStatistik = By.xpath("//div[5]/div[1]/div[2]/p[text()='Lihat semua']");
    private By iconInfoStatistikMhs = By.xpath("//p[text()='Mahasiswa']/following-sibling::span[@class='relative']");
    private By toolTipStatistikMhs = By.xpath("//p[text()='Jumlah Mahasiswa Terdaftar']");
    private By statistikMhs = By.xpath("//div[@class='flex items-center gap-1 text-lg font-medium']//p[text()='Mahasiswa']");
    private By iconInfoStatistikDs = By.xpath("//p[text()='Dosen']/following-sibling::span[@class='relative']");
    private By toolTipStatistikDs = By.xpath("//p[text()='Jumlah dosen']");
    private By statistikDs = By.xpath("//div[@class='flex items-center gap-1 text-lg font-medium']//p[text()='Dosen']");
    private By iconInfoStatistikPT = By.xpath("//p[text()='Perguruan Tinggi']/following-sibling::span[@class='relative']");
    private By toolTipStatistikPT = By.xpath("//p[text()='Jumlah perguruaan tinggi aktif']");
    private By statistikPT = By.xpath("//div[@class='flex items-center gap-1 text-lg font-medium']//p[text()='Perguruan Tinggi']");
    private By iconInfoStatistikPS = By.xpath("//p[text()='Program Studi']/following-sibling::span[@class='relative']");
    private By toolTipStatistikPS = By.xpath("//p[text()='Jumlah program studi aktif']");
    private By statistikPS = By.xpath("//div[@class='flex items-center gap-1 text-lg font-medium']//p[text()='Program Studi']");
    private By ctaLihatPublikasi = By.xpath("//div[6]//p[text()='Lihat semua']");
    private By ctaPublikasi1 = By.xpath("//div[1]/a[text()='Unduh']");
    private By ctaPublikasi2 = By.xpath("//div[2]/a[text()='Unduh']");
    private By ctaPublikasi3 = By.xpath("//div[3]/a[text()='Unduh']");
    private By ctaPublikasi4 = By.xpath("//div[4]/a[text()='Unduh']");
    private By iconInfoKegiatan = By.xpath("//h1[text()='Kegiatan']/following-sibling::span[@class='relative']");
    private By toolTipKegiatan = By.xpath("//p[text()='Program dan aktivitas yang ']");
    private By ctaLihatKegiatan = By.xpath("//div[7]//p[text()='Lihat semua']");
    private By ctaKegiatan = By.xpath("//a[text()='Baca selengkapnya']");
    private By kontributor = By.xpath("//a[@href='/contributor']");
    private By socialX = By.xpath("//a[@href='https://twitter.com/ditjendikti?s=21&t=-7Nfc0Q9TzWmzHjfDdlceQ']");
    private By socialInstagram = By.xpath("//a[@href='https://www.instagram.com/ditjen.dikti/']");
    private By socialFacebook = By.xpath("//a[@href='https://m.facebook.com/ditjen.dikti']");
    private By socialYoutube = By.xpath("//a[@href='https://m.youtube.com/c/DitjenDiktiSIGAPMelayani/featured']");

    public void clickClosePopup() {
            fluentWaitUntilVisible(5, closePopup);
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
        switchToTab();
    }

    public void switchToTab() {
        String currentHandle = getWindowHandle();
        Set<String> allHandles = getWindowHandles();
        for (String handle : allHandles) {
            if (!currentHandle.equals(handle)) {
                switchToWindow(handle);
            }
        }
    }

    public p4KebijakanPrivasi clickKebijakanPrivasi() {
        clickClosePopup();
        click(kebijakanPrivasi);
        return new p4KebijakanPrivasi();
    }

    public p5KebijakanKeamananInfo clickKebijakanKeamananInfo() {
        clickClosePopup();
        click(kebijakanKeamananInfo);
        return new p5KebijakanKeamananInfo();
    }

    public void clickPrevBanner() {
        clickClosePopup();
        Actions act = new Actions(driver);
        act.moveToElement(find(banner)).perform();
        click(prevBanner);
    }

    public p30Pengumuman clickBanner() {
        clickClosePopup();
        click(banner);
        return new p30Pengumuman();
    }

    public void clickNextBanner() {
        clickClosePopup();
        Actions act = new Actions(driver);
        act.moveToElement(find(banner)).perform();
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
            waitForPresence(3, recaptchaIframe);
            switchToFrameElement(find(recaptchaIframe));
            waitForClickability(10, recaptchaCheckbox);
            click(recaptchaCheckbox);
            return null;
        } catch (Exception e) {
            switchToDefaultContent();
            return getErrorMessage();
        } finally {
            switchToDefaultContent();
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
        switchToTab();
    }

    public p32KategoriPerbandingan clickCtaKomparasi() {
        clickClosePopup();
        click(ctaKomparasi);
        return new p32KategoriPerbandingan();
    }

    public String showToolTipBidangIlmu() {
        clickClosePopup();
        Actions act = new Actions(driver);
        act.moveToElement(find(iconInfoBidangIlmu)).perform();
        return getToolTipBidangIlmu();
    }

    public String getToolTipBidangIlmu() {
        return find(toolTipBidangIlmu).getText();
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

    public String showToolTipStatistikMhs() {
        clickClosePopup();
        Actions act = new Actions(driver);
        act.moveToElement(find(iconInfoStatistikMhs)).perform();
        return getToolTipStatistikMhs();
    }

    public String getToolTipStatistikMhs() {
        return find(toolTipStatistikMhs).getText();
    }

    public p28Statistik clickStatistikMhs() {
        clickClosePopup();
        click(statistikMhs);
        return new p28Statistik();
    }

    public String showToolTipStatistikDs() {
        clickClosePopup();
        Actions act = new Actions(driver);
        act.moveToElement(find(iconInfoStatistikDs)).perform();
        return getToolTipStatistikDs();
    }

    public String getToolTipStatistikDs() {
        return find(toolTipStatistikDs).getText();
    }

    public p28Statistik clickStatistikDs() {
        clickClosePopup();
        click(statistikDs);
        return new p28Statistik();
    }

    public String showToolTipStatistikPT() {
        clickClosePopup();
        Actions act = new Actions(driver);
        act.moveToElement(find(iconInfoStatistikPT)).perform();
        return getToolTipStatistikPT();
    }

    public String getToolTipStatistikPT() {
        return find(toolTipStatistikPT).getText();
    }

    public p28Statistik clickStatistikPT() {
        clickClosePopup();
        click(statistikPT);
        return new p28Statistik();
    }

    public String showToolTipStatistikPS() {
        clickClosePopup();
        Actions act = new Actions(driver);
        act.moveToElement(find(iconInfoStatistikPS)).perform();
        return getToolTipStatistikPS();
    }

    public String getToolTipStatistikPS() {
        return find(toolTipStatistikPS).getText();
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
        switchToTab();
    }

    public void clickCtaPublikasi2() {
        clickClosePopup();
        click(ctaPublikasi2);
        switchToTab();
    }

    public void clickCtaPublikasi3() {
        clickClosePopup();
        click(ctaPublikasi3);
        switchToTab();
    }

    public void clickCtaPublikasi4() {
        clickClosePopup();
        click(ctaPublikasi4);
        switchToTab();
    }

    public String showToolTipKegiatan() {
        clickClosePopup();
        Actions act = new Actions(driver);
        act.moveToElement(find(iconInfoKegiatan)).perform();
        return getToolTipKegiatan();
    }

    public String getToolTipKegiatan() {
        return find(toolTipKegiatan).getText();
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