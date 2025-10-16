package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iLandingPageTests extends BaseTest {
    @Test(priority = 1)
    public void testDirectProfilLembaga() {
        landingPage.clickClosePopup();
        landingPage.clickProfilLembaga();
    }

    @Test(priority = 2)
    public void testDirectStandarPelayanan() {
        landingPage.clickClosePopup();
        landingPage.clickStandarPelayanan();
    }

    @Test(priority = 3)
    public void testDirectFaq() {
        landingPage.clickClosePopup();
        landingPage.clickFaq();
    }

    @Test(priority = 4)
    public void testDirectKebijakanPrivasi() {
        landingPage.clickClosePopup();
        landingPage.clickKebijakanPrivasi();
    }

    @Test(priority = 5)
    public void testBannerInteract() {
        landingPage.clickClosePopup();
        landingPage.clickBanner();
    }

    @Test(priority = 6)
    public void testDataSemua() {
        landingPage.clickClosePopup();
        landingPage.searchAndProceed("Semua", "Oman Komarudin", 10);
    }

    @Test(priority = 7)
    public void testDataPerguruanTinggi() {
        landingPage.clickClosePopup();
        landingPage.searchAndProceed("Perguruan Tinggi", "Universitas Singaperbangsa Karawang", 10);
    }

    @Test(priority = 8)
    public void testDataProgramStudi() {
        landingPage.clickClosePopup();
        landingPage.searchAndProceed("Program Studi", "Informatika", 10);
    }

    @Test(priority = 9)
    public void testDataDosen() {
        landingPage.clickClosePopup();
        landingPage.searchAndProceed("Dosen", "Intan Purnamasari", 10);
    }

    @Test(priority = 10)
    public void testDataMahasiswa() {
        landingPage.clickClosePopup();
        landingPage.searchAndProceed("Mahasiswa", "Eddy Ryansyah", 10);
    }

    @Test(priority = 11)
    public void testErrorMessage() {
        landingPage.clickClosePopup();
        landingPage.clickCari();
        String actualMessage = landingPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Pencarian tidak boleh kosong!"));
    }

    @Test(priority = 12)
    public void testDirectPencarianSpesifik() {
        landingPage.clickClosePopup();
        landingPage.clickPencarianSpesifik();
    }

    @Test(priority = 13)
    public void testMenuProgramStudi() {
        landingPage.clickClosePopup();
        landingPage.clickMenuProgramStudi();
    }

    @Test(priority = 14)
    public void testMenuPerguruanTinggi() {
        landingPage.clickClosePopup();
        landingPage.clickMenuPerguruanTinggi();
    }

    @Test(priority = 15)
    public void testMenuStatistik() {
        landingPage.clickClosePopup();
        landingPage.clickMenuStatistik();
    }

    @Test(priority = 16)
    public void testMenuPublikasi() {
        landingPage.clickClosePopup();
        landingPage.clickMenuPublikasi();
    }

    @Test(priority = 17)
    public void testMenuPengumuman() {
        landingPage.clickClosePopup();
        landingPage.clickMenuPengumuman();
    }

    @Test(priority = 18)
    public void testMenuPeta() {
        landingPage.clickClosePopup();
        landingPage.clickMenuPeta();
    }

    @Test(priority = 19)
    public void testCtaCariInformasi() {
        landingPage.clickClosePopup();
        landingPage.clickCtaCariInformasi();
    }

    @Test(priority = 20)
    public void testCtaKomparasi() {
        landingPage.clickClosePopup();
        landingPage.clickCtaKomparasi();
    }

    @Test(priority = 21)
    public void testKontributor() {
        landingPage.clickClosePopup();
        landingPage.clickLinkKontributor();
    }

    @Test(priority = 22)
    public void testSocialX() {
        landingPage.clickClosePopup();
        landingPage.clickSocialIfPresent("twitter.com");
    }

    @Test(priority = 23)
    public void testSocialInstagram() {
        landingPage.clickClosePopup();
        landingPage.clickSocialIfPresent("instagram.com");
    }

    @Test(priority = 24)
    public void testSocialFacebook() {
        landingPage.clickClosePopup();
        landingPage.clickSocialIfPresent("facebook.com");
    }

    @Test(priority = 25)
    public void testSocialYouTube() {
        landingPage.clickClosePopup();
        landingPage.clickSocialIfPresent("youtube.com");
    }
}