package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static utilities.GetUtility.*;

public class p1LandingPageTests extends BaseTest {
    @Test(priority = 1)
    public void testDirectProfilLembaga() {
        p2ProfilLembaga profilLembaga = landingPage.clickProfilLembaga();
        Assert.assertTrue(profilLembaga.isProfilLembagaHeaderDisplayed(),
                "\n Profil Lembaga Header Is Not Displayed \n");
    }

    @Test(priority = 2)
    public void testDirectStandarPelayanan() {
        p3StandarPelayanan standarPelayanan = landingPage.clickStandarPelayanan();
        Assert.assertTrue(standarPelayanan.isStandarPelayananHeaderDisplayed(),
                "\n Standar Pelayanan Header Is Not Displayed \n");
    }

    @Test(priority = 3)
    public void testDirectFaq() {
        landingPage.clickFaq();
        String actualTitle = getTitle();
        String expectedTitle = "Kanal Pengetahuan Dikti";
        Assert.assertEquals(actualTitle,expectedTitle,
                "\n Actual & Expected Title's Do Not Match \n");
    }

    @Test(priority = 4)
    public void testDirectKebijakanPrivasi() {
        p4KebijakanPrivasi kebijakanPrivasi = landingPage.clickKebijakanPrivasi();
        Assert.assertTrue(kebijakanPrivasi.isKebijakanPrivasiHeaderDisplayed(),
                "\n Kebijakan Privasi Header Is Not Displayed \n");
    }

    @Test(priority = 5)
    public void testDirectKebijakanKeamananInfo() {
        p5KebijakanKeamananInfo kebijakanKeamananInfo = landingPage.clickKebijakanKeamananInfo();
        Assert.assertTrue(kebijakanKeamananInfo.isKebijakanKeamananInfoHeaderDisplayed(),
                "\n Kebijakan Keamanan Info Header Is Not Displayed \n");
    }

    @Test(priority = 6)
    public void testBannerPrevButton() {
        landingPage.clickPrevBanner();
        String actualAction = getAttribute(landingPage.banner, "style");
        String expectedAction = "background-image: url(\"/images/banner-3.png\");";
        Assert.assertEquals(actualAction,expectedAction,
                "\n Actual & Expected Action's Do Not Match \n");
    }

    @Test(priority = 7)
    public void testClickBanner() {
        p30Pengumuman pengumuman = landingPage.clickBanner();
        Assert.assertTrue(pengumuman.isPengumumanNavigationDisplayed(),
                "\n Pengumuman Navigation Is Not Displayed \n");
    }

    @Test(priority = 8)
    public void testBannerNextButton() {
        landingPage.clickNextBanner();
        String actualAction = getAttribute(landingPage.banner, "style");
        String expectedAction = "background-image: url(\"/images/banner-2.png\");";
        Assert.assertEquals(actualAction,expectedAction,
                "\n Actual & Expected Action's Do Not Match \n");
    }

    @Test(priority = 9)
    public void testSearchAll() {
        p6HasilPencarianAll hasilPencarianAll = landingPage.logIntoSearchAll("Oman Komarudin");
        Assert.assertTrue(hasilPencarianAll.isHasilPencarianAllHeaderDisplayed(),
                "\n Hasil Pencarian All Header Is Not Displayed \n");
    }

    @Test(priority = 10)
    public void testSearchPT() {
        p7HasilPencarianPT hasilPencarianPT = landingPage.logIntoSearchPT("Universitas Singaperbangsa Karawang");
        Assert.assertTrue(hasilPencarianPT.isHasilPencarianPTHeaderDisplayed(),
                "\n Hasil Pencarian PT Header Is Not Displayed \n");
    }

    @Test(priority = 11)
    public void testSearchPS() {
        p9HasilPencarianPS hasilPencarianPS = landingPage.logIntoSearchPS("Informatika");
        Assert.assertTrue(hasilPencarianPS.isHasilPencarianPSHeaderDisplayed(),
                "\n Hasil Pencarian PS Header Is Not Displayed \n");
    }

    @Test(priority = 12)
    public void testSearchDs() {
        p11HasilPencarianDs hasilPencarianDs = landingPage.logIntoSearchDs("Intan Purnamasari");
        Assert.assertTrue(hasilPencarianDs.isHasilPencarianDsHeaderDisplayed(),
                "\n Hasil Pencarian Ds Header Is Not Displayed \n");
    }

    @Test(priority = 13)
    public void testSearchMhs() {
        p13HasilPencarianMhs hasilPencarianMhs = landingPage.logIntoSearchMhs("Eddy Ryansyah");
        Assert.assertTrue(hasilPencarianMhs.isHasilPencarianMhsHeaderDisplayed(),
                "\n Hasil Pencarian Mhs Header Is Not Displayed \n");
    }

    @Test(priority = 14)
    public void testErrorMessage() {
        landingPage.logIntoSearchMhs("");
        String actualMessage = landingPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Pencarian tidak boleh kosong!"));
    }

    @Test(priority = 15)
    public void testDirectPencarianSpesifik() {
        p15PencarianSpesifikMhs pencarianSpesifikMhs = landingPage.clickPencarianSpesifik();
        Assert.assertTrue(pencarianSpesifikMhs.isPencarianSpesifikHeaderDisplayed(),
                "\n Pencarian Spesifik Header Is Not Displayed \n");
    }

    @Test(priority = 16)
    public void testMenuProgramStudi() {
        p16ProgramStudi programStudi = landingPage.clickMenuProgramStudi();
        Assert.assertTrue(programStudi.isProgramStudiHeaderDisplayed(),
                "\n Program Studi Header Is Not Displayed \n");
    }

    @Test(priority = 17)
    public void testMenuPerguruanTinggi() {
        p27PerguruanTinggi perguruanTinggi = landingPage.clickMenuPerguruanTinggi();
        Assert.assertTrue(perguruanTinggi.isPerguruanTinggiHeaderDisplayed(),
                "\n Perguruan Tinggi Header Is Not Displayed \n");
    }

    @Test(priority = 18)
    public void testMenuStatistik() {
        p28Statistik statistik = landingPage.clickMenuStatistik();
        Assert.assertTrue(statistik.isStatistikHeaderDisplayed(),
                "\n Statistik Header Is Not Displayed \n");
    }

    @Test(priority = 19)
    public void testMenuPublikasi() {
        p29Publikasi publikasi = landingPage.clickMenuPublikasi();
        Assert.assertTrue(publikasi.isPublikasiHeaderDisplayed(),
                "\n Publikasi Header Is Not Displayed \n");
    }

    @Test(priority = 20)
    public void testMenuPengumuman() {
        p30Pengumuman pengumuman = landingPage.clickMenuPengumuman();
        Assert.assertTrue(pengumuman.isPengumumanNavigationDisplayed(),
                "\n Pengumuman Navigation Is Not Displayed \n");
    }

    @Test(priority = 21)
    public void testMenuPeta() {
        p31Peta peta = landingPage.clickMenuPeta();
        Assert.assertTrue(peta.isPetaHeaderDisplayed(),
                "\n Peta Header Is Not Displayed \n");
    }

    @Test(priority = 22)
    public void testCtaCariInformasi() {
        landingPage.clickCtaCariInformasi();
        String actualTitle = getTitle();
        String expectedTitle = "Kanal Pengetahuan Dikti";
        Assert.assertEquals(actualTitle,expectedTitle,
                "\n Actual & Expected Title's Do Not Match \n");
    }

    @Test(priority = 23)
    public void testCtaKomparasi() {
        p32KategoriPerbandingan kategoriPerbandingan = landingPage.clickCtaKomparasi();
        Assert.assertTrue(kategoriPerbandingan.isKategoriPerbandinganHeaderDisplayed(),
                "\n Kategori Perbandingan Header Is Not Displayed \n");
    }

    @Test(priority = 24)
    public void testShowToolTipBidangIlmu() {
        landingPage.showToolTipBidangIlmu();
        String actualMessage = landingPage.getToolTipBidangIlmu();
        Assert.assertTrue(actualMessage.contains("Bidang ilmu dengan jumlah"));
    }

    @Test(priority = 25)
    public void testCtaLihatBidangIlmu() {
        p16ProgramStudi programStudi = landingPage.clickCtaLihatBidangIlmu();
        Assert.assertTrue(programStudi.isProgramStudiHeaderDisplayed(),
                "\n Program Studi Header Is Not Displayed \n");
    }

    @Test(priority = 26)
    public void testClickBidangIlmu1() {
        p22BidangPendidikan bidangPendidikan = landingPage.clickBidangIlmu1();
        Assert.assertTrue(bidangPendidikan.isBidangPendidikanHeaderDisplayed(),
                "\n Bidang Pendidikan Header Is Not Displayed \n");
    }

    @Test(priority = 27)
    public void testClickBidangIlmu2() {
        p18BidangEkonomi bidangEkonomi = landingPage.clickBidangIlmu2();
        Assert.assertTrue(bidangEkonomi.isBidangEkonomiHeaderDisplayed(),
                "\n Bidang Ekonomi Header Is Not Displayed \n");
    }

    @Test(priority = 28)
    public void testClickBidangIlmu3() {
        p26BidangTeknik bidangTeknik = landingPage.clickBidangIlmu3();
        Assert.assertTrue(bidangTeknik.isBidangTeknikHeaderDisplayed(),
                "\n Bidang Teknik Header Is Not Displayed \n");
    }

    @Test(priority = 29)
    public void testCtaLihatStatistik() {
        p28Statistik statistik = landingPage.clickCtaLihatStatistik();
        Assert.assertTrue(statistik.isStatistikHeaderDisplayed(),
                "\n Statistik Header Is Not Displayed \n");
    }

    @Test(priority = 30)
    public void testShowToolTipStatistikMhs() {
        landingPage.showToolTipStatistikMhs();
        String actualMessage = landingPage.getToolTipStatistikMhs();
        Assert.assertTrue(actualMessage.contains("Jumlah Mahasiswa Terdaftar"));
    }

    @Test(priority = 31)
    public void testClickStatistikMhs() {
        p28Statistik statistik = landingPage.clickStatistikMhs();
        Assert.assertTrue(statistik.isStatistikHeaderDisplayed(),
                "\n Statistik Header Is Not Displayed \n");
    }

    @Test(priority = 32)
    public void testShowToolTipStatistikDs() {
        landingPage.showToolTipStatistikDs();
        String actualMessage = landingPage.getToolTipStatistikDs();
        Assert.assertTrue(actualMessage.contains("Jumlah dosen"));
    }

    @Test(priority = 33)
    public void testClickStatistikDs() {
        p28Statistik statistik = landingPage.clickStatistikDs();
        Assert.assertTrue(statistik.isStatistikHeaderDisplayed(),
                "\n Statistik Header Is Not Displayed \n");
    }

    @Test(priority = 34)
    public void testShowToolTipStatistikPT() {
        landingPage.showToolTipStatistikPT();
        String actualMessage = landingPage.getToolTipStatistikPT();
        Assert.assertTrue(actualMessage.contains("Jumlah perguruaan tinggi aktif"));
    }

    @Test(priority = 35)
    public void testClickStatistikPT() {
        p28Statistik statistik = landingPage.clickStatistikPT();
        Assert.assertTrue(statistik.isStatistikHeaderDisplayed(),
                "\n Statistik Header Is Not Displayed \n");
    }

    @Test(priority = 36)
    public void testShowToolTipStatistikPS() {
        landingPage.showToolTipStatistikPS();
        String actualMessage = landingPage.getToolTipStatistikPS();
        Assert.assertTrue(actualMessage.contains("Jumlah program studi aktif"));
    }

    @Test(priority = 37)
    public void testClickStatistikPS() {
        p28Statistik statistik = landingPage.clickStatistikPS();
        Assert.assertTrue(statistik.isStatistikHeaderDisplayed(),
                "\n Statistik Header Is Not Displayed \n");
    }

    @Test(priority = 38)
    public void testCtaLihatPublikasi() {
        p29Publikasi publikasi = landingPage.clickCtaLihatPublikasi();
        Assert.assertTrue(publikasi.isPublikasiHeaderDisplayed(),
                "\n Publikasi Header Is Not Displayed \n");
    }

    @Test(priority = 39)
    public void testCtaPublikasi1() {
        landingPage.clickCtaPublikasi1();
        String actualTitle = getTitle();
        String expectedTitle = "BUKU STATISTIK PENDIDIKAN TINGGI 2024 - PUSDATIN KEMDIKTISAINTEK.pdf - Google Drive";
        Assert.assertEquals(actualTitle,expectedTitle,
                "\n Actual & Expected Title's Do Not Match \n");
    }

    @Test(priority = 40)
    public void testCtaPublikasi2() {
        landingPage.clickCtaPublikasi2();
        String actualTitle = getTitle();
        String expectedTitle = "BUKU STATISTIK PENDIDIKAN TINGGI 2023.pdf";
        Assert.assertEquals(actualTitle,expectedTitle,
                "\n Actual & Expected Title's Do Not Match \n");
    }

    @Test(priority = 41)
    public void testCtaPublikasi3() {
        landingPage.clickCtaPublikasi3();
        String actualTitle = getTitle();
        String expectedTitle = "Buku Statistik Pendidikan Tinggi 2022.pdf";
        Assert.assertEquals(actualTitle,expectedTitle,
                "\n Actual & Expected Title's Do Not Match \n");
    }

    @Test(priority = 42)
    public void testCtaPublikasi4() {
        landingPage.clickCtaPublikasi4();
        String actualTitle = getTitle();
        String expectedTitle = "Statistik Pendidikan Tinggi 2021 (Final).pdf";
        Assert.assertEquals(actualTitle,expectedTitle,
                "\n Actual & Expected Title's Do Not Match \n");
    }

    @Test(priority = 43)
    public void testShowToolTipKegiatan() {
        landingPage.showToolTipKegiatan();
        String actualMessage = landingPage.getToolTipKegiatan();
        Assert.assertTrue(actualMessage.contains("dilakukan oleh Ditjen Diktiristek"));
    }

    @Test(priority = 44)
    public void testCtaLihatKegiatan() {
        p37Kegiatan kegiatan = landingPage.clickCtaLihatKegiatan();
        Assert.assertTrue(kegiatan.isKegiatanHeaderDisplayed(),
                "\n Kegiatan Header Is Not Displayed \n");
    }

    @Test(priority = 45)
    public void testCtaKegiatan() {
        p38DetailKegiatan detailKegiatan = landingPage.clickCtaKegiatan();
        Assert.assertTrue(detailKegiatan.isDetailKegiatanNavigationDisplayed(),
                "\n Detail Kegiatan Header Is Not Displayed \n");
    }

    @Test(priority = 46)
    public void testKontributor() {
        p39Kontributor kontributor = landingPage.clickKontributor();
        Assert.assertTrue(kontributor.isKontributorHeaderDisplayed(),
                "\n Kontributor Header Is Not Displayed \n");
    }

    @Test(priority = 47)
    public void testSocialX() {
        landingPage.clickSocialX();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("x.com/ditjendikti"));
    }

    @Test(priority = 48)
    public void testSocialInstagram() {
        landingPage.clickSocialInstagram();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("instagram.com/ditjen.dikti"));
    }

    @Test(priority = 49)
    public void testSocialFacebook() {
        landingPage.clickSocialFacebook();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("facebook.com/ditjen.dikti"));
    }

    @Test(priority = 50)
    public void testSocialYouTube() {
        landingPage.clickSocialYoutube();
        String actualURL = getURL();
        Assert.assertTrue(actualURL.contains("youtube.com/c/DitjenDiktiSIGAPMelayani"));
    }
}