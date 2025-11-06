package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static utilities.GetUtility.getTitle;

public class p1LandingPageTests extends BaseTest {
    @Test(priority = 1)
    public void testDirectProfilLembaga() {
        p2ProfilLembaga profilLembaga = landingPage.clickProfilLembaga();
        Assert.assertTrue(profilLembaga.isProfilLembagaHeaderDisplayed(),
                "\n Profil Lembaga Header Is Not Displayed \n");
    }

    @Test(priority = 2)
    public void testDirectStandarPelayanan() {
        p3StandarPelayanan standarPelayanan = landingPage.clickStandarPelayanan();
        Assert.assertTrue(standarPelayanan.isStandarPelayananHeaderDisplayed(),
                "\n Standar Pelayanan Header Is Not Displayed \n");
    }

    @Test(priority = 3)
    public void testDirectFaq() {
        landingPage.clickFaq();
        String actualTitle = getTitle();
        String expectedTitle = "Kanal Pengetahuan Dikti";
        Assert.assertEquals(actualTitle,expectedTitle,
                "\n Actual & Expected Title's Do Not Match \n");
    }

    @Test(priority = 4)
    public void testDirectKebijakanPrivasi() {
        landingPage.clickKebijakanPrivasi();
    }

    @Test(priority = 5)
    public void testDirectKebijakanKeamananInfo() {
        landingPage.clickKebijakanKeamananInfo();
    }

    @Test(priority = 6)
    public void testBannerPrevButton() {
        landingPage.clickPrevBanner();
    }

    @Test(priority = 7)
    public void testClickBanner() {
        landingPage.clickBanner();
    }

    @Test(priority = 8)
    public void testBannerNextButton() {
        landingPage.clickNextBanner();
    }

    @Test(priority = 9)
    public void testSearchAll() {
        p6HasilPencarianAll hasilPencarianAll = landingPage.logIntoSearchAll("Oman Komarudin");
        Assert.assertTrue(hasilPencarianAll.isHasilPencarianAllHeaderDisplayed(),
                "\n Hasil Pencarian All Header Is Not Displayed \n");
    }

    @Test(priority = 10)
    public void testSearchPT() {
        p7HasilPencarianPT hasilPencarianPT = landingPage.logIntoSearchPT("Universitas Singaperbangsa Karawang");
        Assert.assertTrue(hasilPencarianPT.isHasilPencarianPTHeaderDisplayed(),
                "\n Hasil Pencarian PT Header Is Not Displayed \n");
    }

    @Test(priority = 11)
    public void testSearchPS() {
        p9HasilPencarianPS hasilPencarianPS = landingPage.logIntoSearchPS("Informatika");
        Assert.assertTrue(hasilPencarianPS.isHasilPencarianPSHeaderDisplayed(),
                "\n Hasil Pencarian PS Header Is Not Displayed \n");
    }

    @Test(priority = 12)
    public void testSearchDs() {
        p11HasilPencarianDs hasilPencarianDs = landingPage.logIntoSearchDs("Intan Purnamasari");
        Assert.assertTrue(hasilPencarianDs.isHasilPencarianDsHeaderDisplayed(),
                "\n Hasil Pencarian Ds Header Is Not Displayed \n");
    }

    @Test(priority = 13)
    public void testSearchMhs() {
        p13HasilPencarianMhs hasilPencarianMhs = landingPage.logIntoSearchMhs("Eddy Ryansyah");
        Assert.assertTrue(hasilPencarianMhs.isHasilPencarianMhsHeaderDisplayed(),
                "\n Hasil Pencarian Mhs Header Is Not Displayed \n");
    }

    @Test(priority = 14)
    public void testErrorMessage() {
        landingPage.logIntoSearchMhs("");
        String actualMessage = landingPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Pencarian tidak boleh kosong!"));
    }

    @Test(priority = 15)
    public void testDirectPencarianSpesifik() {
        landingPage.clickPencarianSpesifik();
    }

    @Test(priority = 16)
    public void testMenuProgramStudi() {
        landingPage.clickMenuProgramStudi();
    }

    @Test(priority = 17)
    public void testMenuPerguruanTinggi() {
        landingPage.clickMenuPerguruanTinggi();
    }

    @Test(priority = 18)
    public void testMenuStatistik() {
        landingPage.clickMenuStatistik();
    }

    @Test(priority = 19)
    public void testMenuPublikasi() {
        landingPage.clickMenuPublikasi();
    }

    @Test(priority = 20)
    public void testMenuPengumuman() {
        landingPage.clickMenuPengumuman();
    }

    @Test(priority = 21)
    public void testMenuPeta() {
        landingPage.clickMenuPeta();
    }

    @Test(priority = 22)
    public void testCtaCariInformasi() {
        landingPage.clickCtaCariInformasi();
    }

    @Test(priority = 23)
    public void testCtaKomparasi() {
        landingPage.clickCtaKomparasi();
    }

    @Test(priority = 24)
    public void testShowToolTipBidangIlmu() {
        landingPage.showToolTipBidangIlmu();
        String actualMessage = landingPage.getToolTipBidangIlmu();
        Assert.assertTrue(actualMessage.contains("Bidang ilmu dengan jumlah"));
    }

    @Test(priority = 25)
    public void testCtaLihatBidangIlmu() {
        landingPage.clickCtaLihatBidangIlmu();
    }

    @Test(priority = 26)
    public void testClickBidangIlmu1() {
        landingPage.clickBidangIlmu1();
    }

    @Test(priority = 27)
    public void testClickBidangIlmu2() {
        landingPage.clickBidangIlmu2();
    }

    @Test(priority = 28)
    public void testClickBidangIlmu3() {
        landingPage.clickBidangIlmu3();
    }

    @Test(priority = 29)
    public void testCtaLihatStatistik() {
        landingPage.clickCtaLihatStatistik();
    }

    @Test(priority = 30)
    public void testShowToolTipStatistikMhs() {
        landingPage.showToolTipStatistikMhs();
        String actualMessage = landingPage.getToolTipStatistikMhs();
        Assert.assertTrue(actualMessage.contains("Jumlah Mahasiswa Terdaftar"));
    }

    @Test(priority = 31)
    public void testClickStatistikMhs() {
        landingPage.clickStatistikMhs();
    }

    @Test(priority = 32)
    public void testShowToolTipStatistikDs() {
        landingPage.showToolTipStatistikDs();
        String actualMessage = landingPage.getToolTipStatistikDs();
        Assert.assertTrue(actualMessage.contains("Jumlah dosen"));
    }

    @Test(priority = 33)
    public void testClickStatistikDs() {
        landingPage.clickStatistikDs();
    }

    @Test(priority = 34)
    public void testShowToolTipStatistikPT() {
        landingPage.showToolTipStatistikPT();
        String actualMessage = landingPage.getToolTipStatistikPT();
        Assert.assertTrue(actualMessage.contains("Jumlah perguruaan tinggi aktif"));
    }

    @Test(priority = 35)
    public void testClickStatistikPT() {
        landingPage.clickStatistikPT();
    }

    @Test(priority = 36)
    public void testShowToolTipStatistikPS() {
        landingPage.showToolTipStatistikPS();
        String actualMessage = landingPage.getToolTipStatistikPS();
        Assert.assertTrue(actualMessage.contains("Jumlah program studi aktif"));
    }

    @Test(priority = 37)
    public void testClickStatistikPS() {
        landingPage.clickStatistikPS();
    }

    @Test(priority = 38)
    public void testCtaLihatPublikasi() {
        landingPage.clickCtaLihatPublikasi();
    }

    @Test(priority = 39)
    public void testCtaPublikasi1() {
        landingPage.clickCtaPublikasi1();
    }

    @Test(priority = 40)
    public void testCtaPublikasi2() {
        landingPage.clickCtaPublikasi2();
    }

    @Test(priority = 41)
    public void testCtaPublikasi3() {
        landingPage.clickCtaPublikasi3();
    }

    @Test(priority = 42)
    public void testCtaPublikasi4() {
        landingPage.clickCtaPublikasi4();
    }

    @Test(priority = 43)
    public void testShowToolTipKegiatan() {
        landingPage.showToolTipKegiatan();
        String actualMessage = landingPage.getToolTipKegiatan();
        Assert.assertTrue(actualMessage.contains("dilakukan oleh Ditjen Diktiristek"));
    }

    @Test(priority = 44)
    public void testCtaLihatKegiatan() {
        landingPage.clickCtaLihatKegiatan();
    }

    @Test(priority = 45)
    public void testCtaKegiatan() {
        landingPage.clickCtaKegiatan();
    }

    @Test(priority = 46)
    public void testKontributor() {
        landingPage.clickKontributor();
    }

    @Test(priority = 47)
    public void testSocialX() {
        landingPage.clickSocialX();
    }

    @Test(priority = 48)
    public void testSocialInstagram() {
        landingPage.clickSocialInstagram();
    }

    @Test(priority = 49)
    public void testSocialFacebook() {
        landingPage.clickSocialFacebook();
    }

    @Test(priority = 50)
    public void testSocialYouTube() {
        landingPage.clickSocialYoutube();
    }
}