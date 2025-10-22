package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.p2ProfilLembaga;
import pages.p3StandarPelayanan;
import pages.p5HasilPencarianAll;

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
    }

    @Test(priority = 4)
    public void testDirectKebijakanPrivasi() {
        landingPage.clickKebijakanPrivasi();
    }

    @Test(priority = 5)
    public void testBannerPrevButton() {
        landingPage.clickBanner();
    }

    @Test(priority = 6)
    public void testDataSemua() {
        landingPage.clickClosePopup();
    }

    @Test(priority = 7)
    public void testDataPerguruanTinggi() {
        landingPage.clickClosePopup();
    }

    @Test(priority = 8)
    public void testDataProgramStudi() {
        landingPage.clickClosePopup();
    }

    @Test(priority = 9)
    public void testDataDosen() {
        landingPage.clickClosePopup();
    }

    @Test(priority = 10)
    public void testDataMahasiswa() {
        landingPage.clickClosePopup();
    }

    @Test(priority = 12)
    public void testSearchAll() {
        p5HasilPencarianAll hasilPencarianAll = landingPage.logIntoSearchAll("Oman Komarudin");
        Assert.assertTrue(hasilPencarianAll.isHasilPencarianAllHeaderDisplayed(),
                "\n Hasil Pencarian All Header Is Not Displayed \n");
    }

    @Test(priority = 13)
    public void testErrorMessage() {
        landingPage.logIntoSearchMhs("");
        String actualMessage = landingPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Pencarian tidak boleh kosong!"));
    }

    @Test(priority = 14)
    public void testDirectPencarianSpesifik() {
        landingPage.clickPencarianSpesifik();
    }

    @Test(priority = 15)
    public void testMenuProgramStudi() {
        landingPage.clickMenuProgramStudi();
    }

    @Test(priority = 16)
    public void testMenuPerguruanTinggi() {
        landingPage.clickMenuPerguruanTinggi();
    }

    @Test(priority = 17)
    public void testMenuStatistik() {
        landingPage.clickMenuStatistik();
    }

    @Test(priority = 18)
    public void testMenuPublikasi() {
        landingPage.clickMenuPublikasi();
    }

    @Test(priority = 19)
    public void testMenuPengumuman() {
        landingPage.clickMenuPengumuman();
    }

    @Test(priority = 20)
    public void testMenuPeta() {
        landingPage.clickMenuPeta();
    }

    @Test(priority = 21)
    public void testCtaCariInformasi() {
        landingPage.clickCtaCariInformasi();
    }

    @Test(priority = 22)
    public void testCtaKomparasi() {
        landingPage.clickCtaKomparasi();
    }

    @Test(priority = 23)
    public void testKontributor() {
        landingPage.clickKontributor();
    }

    @Test(priority = 24)
    public void testSocialX() {
        landingPage.clickSocialX();
    }

    @Test(priority = 25)
    public void testSocialInstagram() {
        landingPage.clickSocialInstagram();
    }

    @Test(priority = 26)
    public void testSocialFacebook() {
        landingPage.clickSocialFacebook();
    }

    @Test(priority = 27)
    public void testSocialYouTube() {
        landingPage.clickSocialYoutube();
    }
}