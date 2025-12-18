package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.p04KebijakanPrivasi;

import static utilities.GetUtility.getText;

public class p04KebijakanPrivasiTests extends BaseTest {
    @Test(priority = 1)
    public void testDirectToBeranda() {
        landingPage.clickKebijakanPrivasi();
        p04KebijakanPrivasi kebijakanPrivasi = new p04KebijakanPrivasi();
        kebijakanPrivasi.clickBerandaNavigation();
        Assert.assertTrue(landingPage.isLandingPageDisplayed(),
                "\n Landing Page Is Not Displayed \n");
    }

    @Test(priority = 2)
    public void testDirectToKebijakanPrivasi() {
        landingPage.clickKebijakanPrivasi();
        p04KebijakanPrivasi kebijakanPrivasi = new p04KebijakanPrivasi();
        kebijakanPrivasi.clickKebijakanPrivasiNavigation();
        Assert.assertTrue(kebijakanPrivasi.isKebijakanPrivasiHeaderDisplayed(),
                "\n Kebijakan Privasi Header Is Not Displayed \n");
    }

    @Test(priority = 3)
    public void testGetIsiKonten1() {
        landingPage.clickKebijakanPrivasi();
        p04KebijakanPrivasi kebijakanPrivasi = new p04KebijakanPrivasi();
        kebijakanPrivasi.clickLinkKonten1();
        String actualMessage = getText(kebijakanPrivasi.isiKonten1);
        String expectedMessage = "Akurasi Informasi";
        Assert.assertEquals(actualMessage,expectedMessage,
                "\n Actual & Expected Message's Do Not Match \n");
    }

    @Test(priority = 4)
    public void testGetIsiKonten2() {
        landingPage.clickKebijakanPrivasi();
        p04KebijakanPrivasi kebijakanPrivasi = new p04KebijakanPrivasi();
        kebijakanPrivasi.clickLinkKonten2();
        String actualMessage = getText(kebijakanPrivasi.isiKonten2);
        String expectedMessage = "Ketersediaan Layanan";
        Assert.assertEquals(actualMessage,expectedMessage,
                "\n Actual & Expected Message's Do Not Match \n");
    }

    @Test(priority = 5)
    public void testGetIsiKonten3() {
        landingPage.clickKebijakanPrivasi();
        p04KebijakanPrivasi kebijakanPrivasi = new p04KebijakanPrivasi();
        kebijakanPrivasi.clickLinkKonten3();
        String actualMessage = getText(kebijakanPrivasi.isiKonten3);
        String expectedMessage = "Konten Pihak Ketiga";
        Assert.assertEquals(actualMessage,expectedMessage,
                "\n Actual & Expected Message's Do Not Match \n");
    }

    @Test(priority = 6)
    public void testGetIsiKonten4() {
        landingPage.clickKebijakanPrivasi();
        p04KebijakanPrivasi kebijakanPrivasi = new p04KebijakanPrivasi();
        kebijakanPrivasi.clickLinkKonten4();
        String actualMessage = getText(kebijakanPrivasi.isiKonten4);
        String expectedMessage = "Penggunaan Pribadi";
        Assert.assertEquals(actualMessage,expectedMessage,
                "\n Actual & Expected Message's Do Not Match \n");
    }

    @Test(priority = 7)
    public void testGetIsiKonten5() {
        landingPage.clickKebijakanPrivasi();
        p04KebijakanPrivasi kebijakanPrivasi = new p04KebijakanPrivasi();
        kebijakanPrivasi.clickLinkKonten5();
        String actualMessage = getText(kebijakanPrivasi.isiKonten5);
        String expectedMessage = "Perubahan Kebijakan";
        Assert.assertEquals(actualMessage,expectedMessage,
                "\n Actual & Expected Message's Do Not Match \n");
    }
}