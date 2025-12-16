package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.p5KebijakanKeamananInfo;

public class p5KebijakanKeamananInfoTests extends BaseTest {
    @Test(priority = 1)
    public void testDirectToBeranda() {
        landingPage.clickKebijakanPrivasi();
        p5KebijakanKeamananInfo kebijakanKeamananInfo = new p5KebijakanKeamananInfo();
        kebijakanKeamananInfo.clickBerandaNavigation();
        Assert.assertTrue(landingPage.isLandingPageDisplayed(),
                "\n Landing Page Is Not Displayed \n");
    }

    @Test(priority = 2)
    public void testDirectToKebijakanKeamananInfo() {
        landingPage.clickKebijakanKeamananInfo();
        p5KebijakanKeamananInfo kebijakanKeamananInfo = new p5KebijakanKeamananInfo();
        kebijakanKeamananInfo.clickKebijakanKeamananInfoNavigation();
        Assert.assertTrue(kebijakanKeamananInfo.isKebijakanKeamananInfoHeaderDisplayed(),
                "\n Kebijakan Keamanan Informasi Header Is Not Displayed \n");
    }
}