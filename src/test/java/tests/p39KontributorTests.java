package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.p39Kontributor;

import static utilities.GetUtility.*;

public class p39KontributorTests extends BaseTest {
    @Test(priority = 1)
    public void testDirectToBeranda() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickBerandaNavigation();
        Assert.assertTrue(landingPage.isLandingPageDisplayed(),
                "\n Landing Page Is Not Displayed \n");
    }

    @Test(priority = 2)
    public void testDirectToKontributor() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickKontributorNavigation();
        Assert.assertTrue(kontributor.isKontributorHeaderDisplayed(),
                "\n Kontributor Header Is Not Displayed \n");
    }

    @Test(priority = 3)
    public void testShowTabBatch5() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickTabBatch5();
        String actualMessage = getText(kontributor.card501Kemal);
        String expectedMessage = "Kemal Aziz";
        Assert.assertEquals(actualMessage,expectedMessage,
                "\n Actual & Expected Message's Do Not Match \n");
    }

    @Test(priority = 4)
    public void testShowTabBatch6() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickTabBatch6();
        String actualMessage = getText(kontributor.card601Rezky);
        String expectedMessage = "Rezky Auliah Mahda";
        Assert.assertEquals(actualMessage,expectedMessage,
                "\n Actual & Expected Message's Do Not Match \n");
    }

    @Test(priority = 5)
    public void testShowTabBatch7() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickTabBatch7();
        String actualMessage = getText(kontributor.card701Tino);
        String expectedMessage = "Tino Vienza Widiatna";
        Assert.assertEquals(actualMessage,expectedMessage,
                "\n Actual & Expected Message's Do Not Match \n");
    }

    @Test(priority = 6)
    public void testLinkedin501Kemal() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin501Kemal();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 7)
    public void testLinkedin502Aulia() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin502Aulia();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 8)
    public void testLinkedin503Syifa() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin503Syifa();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 9)
    public void testLinkedin504Magnolia() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin504Magnolia();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 10)
    public void testLinkedin505Rheina() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin505Rheina();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 11)
    public void testLinkedin506Lintang() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin506Lintang();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 12)
    public void testLinkedin507Muhammad() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin507Muhammad();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 13)
    public void testLinkedin508Fery() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin508Fery();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 14)
    public void testLinkedin509Ruth() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin509Ruth();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 15)
    public void testLinkedin510Abdul() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin510Abdul();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 16)
    public void testLinkedin511Mohammad() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin511Mohammad();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 17)
    public void testLinkedin512J() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin512J();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 18)
    public void testLinkedin513Yosafat() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin513Yosafat();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 19)
    public void testLinkedin514Muhammad() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin514Muhammad();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 20)
    public void testLinkedin515Hakasa() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin515Hakasa();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 21)
    public void testLinkedin516Meiza() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin516Meiza();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 22)
    public void testLinkedin517Muhammad() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin517Muhammad();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 23)
    public void testLinkedin518Salman() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin518Salman();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 24)
    public void testLinkedin519Fernando() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin519Fernando();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 25)
    public void testLinkedin520Shafa() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin520Shafa();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 26)
    public void testLinkedin521Hawa() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin521Hawa();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 27)
    public void testLinkedin522Randy() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin522Randy();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 28)
    public void testLinkedin523Ragil() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin523Ragil();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 29)
    public void testLinkedin524Ryhan() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin524Ryhan();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 30)
    public void testLinkedin601Rezky() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin601Rezky();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 31)
    public void testLinkedin602Azhari() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin602Azhari();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 32)
    public void testLinkedin603Secilia() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin603Secilia();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 33)
    public void testLinkedin604Arini() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin604Arini();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 34)
    public void testLinkedin605Prihandini() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin605Prihandini();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 35)
    public void testLinkedin606Muhammad() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin606Muhammad();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 36)
    public void testLinkedin607Billy() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin607Billy();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 37)
    public void testLinkedin608Mufidus() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin608Mufidus();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 38)
    public void testLinkedin609Bendry() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin609Bendry();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 39)
    public void testLinkedin610Raisa() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin610Raisa();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 40)
    public void testLinkedin611Gamas() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin611Gamas();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 41)
    public void testLinkedin612Aisyah() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin612Aisyah();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 42)
    public void testLinkedin613Nisaul() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin613Nisaul();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 43)
    public void testLinkedin614Hanif() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin614Hanif();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 44)
    public void testLinkedin615Bryan() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin615Bryan();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 45)
    public void testLinkedin616Najwaa() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin616Najwaa();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 46)
    public void testLinkedin617Ivykaeyla() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin617Ivykaeyla();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 47)
    public void testLinkedin618Hanifah() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin618Hanifah();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 48)
    public void testLinkedin619Eddy() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin619Eddy();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 49)
    public void testLinkedin620Ega() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin620Ega();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 50)
    public void testLinkedin621Enas() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin621Enas();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 51)
    public void testLinkedin622Muhammad() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin622Muhammad();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 52)
    public void testLinkedin623Jonathan() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin623Jonathan();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 53)
    public void testLinkedin624Aziza() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin624Aziza();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 54)
    public void testLinkedin625Aisyah() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin625Aisyah();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 55)
    public void testLinkedin626Alia() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin626Alia();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 56)
    public void testLinkedin701Tino() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin701Tino();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 57)
    public void testLinkedin702Esther() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin702Esther();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 58)
    public void testLinkedin703Evan() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin703Evan();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 59)
    public void testLinkedin704M() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin704M();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 60)
    public void testLinkedin705Agus() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin705Agus();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 61)
    public void testLinkedin706Lifdaria() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin706Lifdaria();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 62)
    public void testLinkedin707Najla() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin707Najla();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 63)
    public void testLinkedin708Putera() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin708Putera();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 64)
    public void testLinkedin709Andra() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin709Andra();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 65)
    public void testLinkedin710Bendry() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin710Bendry();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 66)
    public void testLinkedin711Nawal() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin711Nawal();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 67)
    public void testLinkedin712Lintang() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin712Lintang();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 68)
    public void testLinkedin713Azhra() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin713Azhra();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 69)
    public void testLinkedin714Muhammad() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin714Muhammad();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 70)
    public void testLinkedin715Revandy() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin715Revandy();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 71)
    public void testLinkedin716Zikri() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin716Zikri();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 72)
    public void testLinkedin717Rio() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin717Rio();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 73)
    public void testLinkedin718Carissa() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin718Carissa();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 74)
    public void testLinkedin719Satrio() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin719Satrio();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 75)
    public void testLinkedin720Nabila() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin720Nabila();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 76)
    public void testLinkedin721Dalila() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin721Dalila();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 77)
    public void testLinkedin722Angela() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin722Angela();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 78)
    public void testLinkedin723Tiara() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin723Tiara();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }

    @Test(priority = 79)
    public void testLinkedin724Muhammad() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        String mainHandle = getWindowHandle();
        kontributor.clickLinkedin724Muhammad();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
        basePage.closeAllTabsExceptMain(mainHandle);
    }
}