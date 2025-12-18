package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.p06HasilPencarianAll;

public class p06HasilPencarianAllTests extends BaseTest {
    @Test(priority = 1)
    public void testDirectToBeranda() {
        landingPage.logIntoSearchAll("Oman Komarudin");
        p06HasilPencarianAll hasilPencarianAll = new p06HasilPencarianAll();
        hasilPencarianAll.clickBerandaNavigation();
        Assert.assertTrue(landingPage.isLandingPageDisplayed(),
                "\n Landing Page Is Not Displayed \n");
    }

    @Test(priority = 2)
    public void testDirectToHasilPencarianAll() {
        landingPage.clickKontributor();
        p06HasilPencarianAll kontributor = new p06HasilPencarianAll();
        kontributor.clickKontributorNavigation();
        Assert.assertTrue(p06HasilPencarianAll.isHasilPencarianAllHeaderDisplayed(),
                "\n Hasil Pencarian All Header Is Not Displayed \n");
    }
}
