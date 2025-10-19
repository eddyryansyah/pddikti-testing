package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class p1LandingPageTests extends BaseTest {
    @Test(priority = 1)
    public void testDirectProfilLembaga() {
        landingPage.clickProfilLembaga();
    }

    @Test(priority = 2)
    public void testDirectStandarPelayanan() {
        landingPage.clickStandarPelayanan();
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
    public void testBannerInteract() {
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

    @Test(priority = 11)
    public void testErrorMessage() {
    }

    @Test(priority = 12)
    public void testDirectPencarianSpesifik() {
        landingPage.clickClosePopup();
        landingPage.clickPencarianSpesifik();
    }

    @Test(priority = 13)
    public void testMenuProgramStudi() {
        landingPage.clickMenuProgramStudi();
    }

    @Test(priority = 14)
    public void testMenuPerguruanTinggi() {
        landingPage.clickMenuPerguruanTinggi();
    }

    @Test(priority = 15)
    public void testMenuStatistik() {
        landingPage.clickMenuStatistik();
    }

    @Test(priority = 16)
    public void testMenuPublikasi() {
        landingPage.clickMenuPublikasi();
    }

    @Test(priority = 17)
    public void testMenuPengumuman() {
        landingPage.clickMenuPengumuman();
    }

    @Test(priority = 18)
    public void testMenuPeta() {
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
        landingPage.clickKontributor();
    }

    @Test(priority = 22)
    public void testSocialX() {
        landingPage.clickSocialX();
    }

    @Test(priority = 23)
    public void testSocialInstagram() {
        landingPage.clickSocialInstagram();
    }

    @Test(priority = 24)
    public void testSocialFacebook() {
        landingPage.clickSocialFacebook();
    }

    @Test(priority = 25)
    public void testSocialYouTube() {
        landingPage.clickSocialYoutube();
    }
}