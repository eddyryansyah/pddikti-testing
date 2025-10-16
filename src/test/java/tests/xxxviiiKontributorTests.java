package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.xxxviiiKontributor;

public class xxxviiiKontributorTests extends BaseTest {
    @Test(priority = 1)
    public void testNavbarBeranda() {
        landingPage.clickClosePopup();
        landingPage.clickLinkKontributor();
        xxxviiiKontributor kontributor = new xxxviiiKontributor();
        kontributor.clickNavBeranda();
    }

    @Test(priority = 2)
    public void testNavbarKontributor() {
        landingPage.clickClosePopup();
        landingPage.clickLinkKontributor();
        xxxviiiKontributor kontributor = new xxxviiiKontributor();
        kontributor.clickNavKontributor();
    }

    @Test(priority = 3)
    public void testTabBatch5() {
        landingPage.clickClosePopup();
        landingPage.clickLinkKontributor();
        xxxviiiKontributor kontributor = new xxxviiiKontributor();
        kontributor.clickTabBatch5();
    }

    @Test(priority = 4)
    public void testTabBatch6() {
        landingPage.clickClosePopup();
        landingPage.clickLinkKontributor();
        xxxviiiKontributor kontributor = new xxxviiiKontributor();
        kontributor.clickTabBatch6();
    }

    @Test(priority = 5)
    public void testTabBatch7() {
        landingPage.clickClosePopup();
        landingPage.clickLinkKontributor();
        xxxviiiKontributor kontributor = new xxxviiiKontributor();
        kontributor.clickTabBatch7();
    }

    @Test(priority = 6)
    public void testLinkedin5Kemal() {
        landingPage.clickClosePopup();
        landingPage.clickLinkKontributor();
        xxxviiiKontributor kontributor = new xxxviiiKontributor();
        kontributor.clickLinkedin5Kemal();
    }

    @Test(priority = 7)
    public void testLinkedin6Rezky() {
        landingPage.clickClosePopup();
        landingPage.clickLinkKontributor();
        xxxviiiKontributor kontributor = new xxxviiiKontributor();
        kontributor.clickLinkedin6Rezky();
    }
}