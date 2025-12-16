package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.p39Kontributor;

import static utilities.GetUtility.getText;
import static utilities.GetUtility.getURL;

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
        kontributor.clickLinkedin501Kemal();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 7)
    public void testLinkedin502Aulia() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin502Aulia();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 8)
    public void testLinkedin503Syifa() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin503Syifa();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 9)
    public void testLinkedin504Magnolia() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin504Magnolia();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 10)
    public void testLinkedin505Rheina() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin505Rheina();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 11)
    public void testLinkedin506Lintang() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin506Lintang();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 12)
    public void testLinkedin507Muhammad() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin507Muhammad();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 13)
    public void testLinkedin508Fery() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin508Fery();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 14)
    public void testLinkedin509Ruth() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin509Ruth();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 15)
    public void testLinkedin510Abdul() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin510Abdul();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 16)
    public void testLinkedin511Mohammad() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin511Mohammad();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 17)
    public void testLinkedin512J() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin512J();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 18)
    public void testLinkedin513Yosafat() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin513Yosafat();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 19)
    public void testLinkedin514Muhammad() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin514Muhammad();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 20)
    public void testLinkedin515Hakasa() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin515Hakasa();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 21)
    public void testLinkedin516Meiza() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin516Meiza();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 22)
    public void testLinkedin517Muhammad() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin517Muhammad();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 23)
    public void testLinkedin518Salman() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin518Salman();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 24)
    public void testLinkedin519Fernando() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin519Fernando();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 25)
    public void testLinkedin520Shafa() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin520Shafa();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 26)
    public void testLinkedin521Hawa() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin521Hawa();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 27)
    public void testLinkedin522Randy() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin522Randy();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 28)
    public void testLinkedin523Ragil() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin523Ragil();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }

    @Test(priority = 29)
    public void testLinkedin524Ryhan() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin524Ryhan();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("linkedin.com/"));
    }
}