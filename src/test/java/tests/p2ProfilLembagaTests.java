package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class p2ProfilLembagaTests extends BaseTest {
    @Test(priority = 1)
    public void testShowSelengkapnya() {
        landingPage.clickProfilLembaga();
        p2ProfilLembaga profilLembaga = new p2ProfilLembaga();
        profilLembaga.clickSelengkapnya();
        String actualText = profilLembaga.getFullText();
        Assert.assertTrue(actualText.contains("Tidak berhenti disitu saja, PDDikti terus berinovasi"));
    }

    @Test(priority = 2)
    public void testShowTutup() {
        landingPage.clickProfilLembaga();
        p2ProfilLembaga profilLembaga = new p2ProfilLembaga();
        profilLembaga.clickTutup();
        String actualText = profilLembaga.getShortText();
        Assert.assertTrue(actualText.contains("Pangkalan Data Pendidikan Tinggi, mencerminkan perjalanan evolusi"));
    }
}
