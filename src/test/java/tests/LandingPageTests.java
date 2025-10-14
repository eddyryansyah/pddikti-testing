package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPageTests extends BaseTest {
    @Test
    public void testDirectProfilLembaga() {
        landingPage.clickClosePopup();
        landingPage.clickProfilLembaga();
    }

    @Test
    public void testDirectStandarPelayanan() {
        landingPage.clickClosePopup();
        landingPage.clickStandarPelayanan();
    }

    @Test
    public void testDirectFaq() {
        landingPage.clickClosePopup();
        landingPage.clickFaq();
    }

    @Test
    public void testDirectKebijakanPrivasi() {
        landingPage.clickClosePopup();
        landingPage.clickKebijakanPrivasi();
    }

    @Test
    public void testBannerInteract() {
        landingPage.clickClosePopup();
        landingPage.clickBanner();
    }

    @Test
    public void testDataSelected() {
        landingPage.clickClosePopup();
        landingPage.clickDataSelected();
    }

    @Test
    public void testErrorMessage() {
        landingPage.clickClosePopup();
        landingPage.clickCari();
        String actualMessage = landingPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Pencarian tidak boleh kosong!"));
    }

    @Test
    public void testDirectPencarianSpesifik() {
        landingPage.clickClosePopup();
        landingPage.clickPencarianSpesifik();
    }
}
