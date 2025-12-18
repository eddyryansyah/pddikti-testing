package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class p02ProfilLembagaTests extends BaseTest {
    @Test(priority = 1)
    public void testShowSelengkapnya() {
        landingPage.clickProfilLembaga();
        p02ProfilLembaga profilLembaga = new p02ProfilLembaga();
        profilLembaga.clickSelengkapnya();
        String actualText = profilLembaga.getFullText();
        Assert.assertTrue(actualText.contains("Tidak berhenti disitu saja, PDDikti terus berinovasi"));
    }

    @Test(priority = 2)
    public void testShowTutup() {
        landingPage.clickProfilLembaga();
        p02ProfilLembaga profilLembaga = new p02ProfilLembaga();
        profilLembaga.clickTutup();
        String actualText = profilLembaga.getShortText();
        Assert.assertTrue(actualText.contains("Pangkalan Data Pendidikan Tinggi, mencerminkan perjalanan evolusi"));
    }
}
