package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.p03StandarPelayanan;

import static utilities.GetUtility.getAttribute;

public class p03StandarPelayananTests extends BaseTest {
    @Test(priority = 1)
    public void testDirectToBeranda() {
        landingPage.clickStandarPelayanan();
        p03StandarPelayanan standarPelayanan = new p03StandarPelayanan();
        standarPelayanan.clickBerandaNavigation();
        Assert.assertTrue(landingPage.isLandingPageDisplayed(),
                "\n Landing Page Is Not Displayed \n");
    }

    @Test(priority = 2)
    public void testDirectToStandarPelayanan() {
        landingPage.clickStandarPelayanan();
        p03StandarPelayanan standarPelayanan = new p03StandarPelayanan();
        standarPelayanan.clickStandarPelayananNavigation();
        Assert.assertTrue(standarPelayanan.isStandarPelayananHeaderDisplayed(),
                "\n Standar Pelayanan Header Is Not Displayed \n");
    }

    @Test(priority = 3)
    public void testGetIsiKonten1() {
        landingPage.clickStandarPelayanan();
        p03StandarPelayanan standarPelayanan = new p03StandarPelayanan();
        standarPelayanan.clickLinkKonten1();
        String actualMessage = getAttribute(standarPelayanan.isiKonten1, "alt");
        String expectedMessage = "Perubahan Data Mahasiswa";
        Assert.assertEquals(actualMessage,expectedMessage,
                "\n Actual & Expected Message's Do Not Match \n");
    }

    @Test(priority = 4)
    public void testGetIsiKonten2() {
        landingPage.clickStandarPelayanan();
        p03StandarPelayanan standarPelayanan = new p03StandarPelayanan();
        standarPelayanan.clickLinkKonten2();
        String actualMessage = getAttribute(standarPelayanan.isiKonten2, "alt");
        String expectedMessage = "Prosedur PDM Pokok";
        Assert.assertEquals(actualMessage,expectedMessage,
                "\n Actual & Expected Message's Do Not Match \n");
    }

    @Test(priority = 5)
    public void testGetIsiKonten3() {
        landingPage.clickStandarPelayanan();
        p03StandarPelayanan standarPelayanan = new p03StandarPelayanan();
        standarPelayanan.clickLinkKonten3();
        String actualMessage = getAttribute(standarPelayanan.isiKonten3, "alt");
        String expectedMessage = "Pembukaan Periode Lampau";
        Assert.assertEquals(actualMessage,expectedMessage,
                "\n Actual & Expected Message's Do Not Match \n");
    }

    @Test(priority = 6)
    public void testGetIsiKonten4() {
        landingPage.clickStandarPelayanan();
        p03StandarPelayanan standarPelayanan = new p03StandarPelayanan();
        standarPelayanan.clickLinkKonten4();
        String actualMessage = getAttribute(standarPelayanan.isiKonten4, "alt");
        String expectedMessage = "Permohonan Akses Data";
        Assert.assertEquals(actualMessage,expectedMessage,
                "\n Actual & Expected Message's Do Not Match \n");
    }
}