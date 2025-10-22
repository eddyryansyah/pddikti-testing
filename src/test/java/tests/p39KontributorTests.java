package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.p39Kontributor;

public class p39KontributorTests extends BaseTest {
    @Test(priority = 1)
    public void testNavbarBeranda() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickNavBeranda();
    }

    @Test(priority = 2)
    public void testNavbarKontributor() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickNavKontributor();
    }

    @Test(priority = 3)
    public void testTabBatch5() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickTabBatch5();
    }

    @Test(priority = 4)
    public void testTabBatch6() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickTabBatch6();
    }

    @Test(priority = 5)
    public void testTabBatch7() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickTabBatch7();
    }

    @Test(priority = 6)
    public void testLinkedin5Kemal() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin5Kemal();
    }

    @Test(priority = 7)
    public void testLinkedin6Rezky() {
        landingPage.clickKontributor();
        p39Kontributor kontributor = new p39Kontributor();
        kontributor.clickLinkedin6Rezky();
    }
}