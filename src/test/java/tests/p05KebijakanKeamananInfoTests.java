package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.p05KebijakanKeamananInfo;

public class p05KebijakanKeamananInfoTests extends BaseTest {
    @Test(priority = 1)
    public void testDirectToBeranda() {
        landingPage.clickKebijakanPrivasi();
        p05KebijakanKeamananInfo kebijakanKeamananInfo = new p05KebijakanKeamananInfo();
        kebijakanKeamananInfo.clickBerandaNavigation();
        Assert.assertTrue(landingPage.isLandingPageDisplayed(),
                "\n Landing Page Is Not Displayed \n");
    }

    @Test(priority = 2)
    public void testDirectToKebijakanKeamananInfo() {
        landingPage.clickKebijakanKeamananInfo();
        p05KebijakanKeamananInfo kebijakanKeamananInfo = new p05KebijakanKeamananInfo();
        kebijakanKeamananInfo.clickKebijakanKeamananInfoNavigation();
        Assert.assertTrue(kebijakanKeamananInfo.isKebijakanKeamananInfoHeaderDisplayed(),
                "\n Kebijakan Keamanan Informasi Header Is Not Displayed \n");
    }
}