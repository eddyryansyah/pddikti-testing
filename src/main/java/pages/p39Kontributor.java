package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class p39Kontributor extends BasePage {
    private static By kontributorHeader = By.xpath("//div[text()='Kontributor Laman PDDikti']");
    private By berandaNavigation = By.xpath("//span[text()='Beranda']");
    private By kontributorNavigation = By.xpath("//span[text()='Kontributor']");
    private By tabBatch5 = By.xpath("//div[text()='Batch 5']");
    private By tabBatch6 = By.xpath("//div[text()='Batch 6']");
    private By tabBatch7 = By.xpath("//div[text()='Batch 7']");
    public By card501Kemal = By.xpath("//p[text()='Kemal Aziz']");
    private By linkedin501Kemal = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[1]//a[text()='LinkedIn']");
    private By card502Aulia = By.xpath("//p[text()='Aulia Rozandari']");
    private By linkedin502Aulia = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[2]//a[text()='LinkedIn']");
    private By card503Syifa = By.xpath("//p[text()='Syifa Rahmadina']");
    private By linkedin503Syifa = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[3]//a[text()='LinkedIn']");
    private By card504Magnolia = By.xpath("//p[text()='Magnolia Fayza Zulkary']");
    private By linkedin504Magnolia = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[4]//a[text()='LinkedIn']");
    private By card505Rheina = By.xpath("//p[text()='Rheina Elvaretta']");
    private By linkedin505Rheina = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[5]//a[text()='LinkedIn']");
    private By card506Lintang = By.xpath("//p[text()='Lintang Mahesa Prana Sukma']");
    private By linkedin506Lintang = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[6]//a[text()='LinkedIn']");
    private By card507Muhammad = By.xpath("//p[text()='Muhammad Bintang Syawal']");
    private By linkedin507Muhammad = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[7]//a[text()='LinkedIn']");
    private By card508Fery = By.xpath("//p[text()='Fery Anuar Ramadhan Putra']");
    private By linkedin508Fery = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[8]//a[text()='LinkedIn']");
    private By card509Ruth = By.xpath("//p[text()='Ruth Margareth Mutiara']");
    private By linkedin509Ruth = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[9]//a[text()='LinkedIn']");
    private By card510Abdul = By.xpath("//p[text()='Abdul Rahman']");
    private By linkedin510Abdul = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[10]//a[text()='LinkedIn']");
    private By card511Mohammad = By.xpath("//p[text()='Mohammad Rafi Azzaky']");
    private By linkedin511Mohammad = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[11]//a[text()='LinkedIn']");
    private By card512J = By.xpath("//p[text()='J Angga Wijaya']");
    private By linkedin512J = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[12]//a[text()='LinkedIn']");
    private By card513Yosafat = By.xpath("//p[text()='Yosafat']");
    private By linkedin513Yosafat = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[13]//a[text()='LinkedIn']");
    private By card514Muhammad = By.xpath("//p[text()='Muhammad Raziv Zulfikar']");
    private By linkedin514Muhammad = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[14]//a[text()='LinkedIn']");
    private By card515Hakasa = By.xpath("//p[text()='Hakasa Putri']");
    private By linkedin515Hakasa = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[15]//a[text()='LinkedIn']");
    private By card516Meiza = By.xpath("//p[text()='Meiza Alliansa']");
    private By linkedin516Meiza = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[16]//a[text()='LinkedIn']");
    private By card517Muhammad = By.xpath("//p[text()='Muhammad Rizaldi Dwinanto']");
    private By linkedin517Muhammad = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[17]//a[text()='LinkedIn']");
    private By card518Salman = By.xpath("//p[text()='Salman Rausyan Fikri']");
    private By linkedin518Salman = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[18]//a[text()='LinkedIn']");
    private By card519Fernando = By.xpath("//p[text()='Fernando']");
    private By linkedin519Fernando = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[19]//a[text()='LinkedIn']");
    private By card520Shafa = By.xpath("//p[text()='Shafa Meira Wahyono']");
    private By linkedin520Shafa = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[20]//a[text()='LinkedIn']");
    private By card521Hawa = By.xpath("//p[text()='Hawa Sylviana']");
    private By linkedin521Hawa = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[21]//a[text()='LinkedIn']");
    private By card522Randy = By.xpath("//p[text()='Randy Dwi Saputra']");
    private By linkedin522Randy = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[22]//a[text()='LinkedIn']");
    private By card523Ragil = By.xpath("//p[text()='Ragil Yunitasari']");
    private By linkedin523Ragil = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[23]//a[text()='LinkedIn']");
    private By card524Ryhan = By.xpath("//p[text()='Ryhan Rahma Aulia Martono']");
    private By linkedin524Ryhan = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[1]/div[2]/div[24]//a[text()='LinkedIn']");
    public By card601Rezky = By.xpath("//p[text()='Rezky Auliah Mahda']");
    private By linkedin601Rezky = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[1]//a[text()='LinkedIn']");
    private By card602Azhari = By.xpath("//p[text()='Azhari Ramadhani']");
    private By linkedin602Azhari = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[2]//a[text()='LinkedIn']");
    private By card603Secilia = By.xpath("//p[text()='Secilia Karunia Karen']");
    private By linkedin603Secilia = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[3]//a[text()='LinkedIn']");
    private By card604Arini = By.xpath("//p[text()='Arini Elsa Azkaminnati']");
    private By linkedin604Arini = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[4]//a[text()='LinkedIn']");
    private By card605Prihandini = By.xpath("//p[text()='Prihandini Daffa N. R. F.']");
    private By linkedin605Prihandini = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[5]//a[text()='LinkedIn']");
    private By card606Muhammad = By.xpath("//p[text()='Muhammad Aufa T. M.']");
    private By linkedin606Muhammad = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[6]//a[text()='LinkedIn']");
    private By card607Billy = By.xpath("//p[text()='Billy Fahd Qodama']");
    private By linkedin607Billy = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[7]//a[text()='LinkedIn']");
    private By card608Mufidus = By.xpath("//p[text()='Mufidus Sani']");
    private By linkedin608Mufidus = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[8]//a[text()='LinkedIn']");
    private By card609Bendry = By.xpath("//p[text()='Bendry Lakburlawal']");
    private By linkedin609Bendry = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[9]//a[text()='LinkedIn']");
    private By card610Raisa = By.xpath("//p[text()='Raisa Salsabil Y.']");
    private By linkedin610Raisa = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[10]//a[text()='LinkedIn']");
    private By card611Gamas = By.xpath("//p[text()='Gamas Namara Akbar']");
    private By linkedin611Gamas = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[11]//a[text()='LinkedIn']");
    private By card612Aisyah = By.xpath("//p[text()='Aisyah R. Pohontu']");
    private By linkedin612Aisyah = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[12]//a[text()='LinkedIn']");
    private By card613Nisaul = By.xpath("//p[text()=\"Nisa'ul Fadhilah\"]");
    private By linkedin613Nisaul = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[13]//a[text()='LinkedIn']");
    private By card614Hanif = By.xpath("//p[text()='Hanif Abyan Ayyasyi']");
    private By linkedin614Hanif = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[14]//a[text()='LinkedIn']");
    private By card615Bryan = By.xpath("//p[text()='Bryan Tjandra']");
    private By linkedin615Bryan = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[15]//a[text()='LinkedIn']");
    private By card616Najwaa = By.xpath("//p[text()='Najwaa Nahda Assegaf']");
    private By linkedin616Najwaa = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[16]//a[text()='LinkedIn']");
    private By card617Ivykaeyla = By.xpath("//p[text()='Ivykaeyla Adriana Z.']");
    private By linkedin617Ivykaeyla = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[17]//a[text()='LinkedIn']");
    private By card618Hanifah = By.xpath("//p[text()='Hanifah Ismi Arni']");
    private By linkedin618Hanifah = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[18]//a[text()='LinkedIn']");
    private By card619Eddy = By.xpath("//p[text()='Eddy Ryansyah']");
    private By linkedin619Eddy = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[19]//a[text()='LinkedIn']");
    private By card620Ega = By.xpath("//p[text()='Ega Nisa Anggraeni']");
    private By linkedin620Ega = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[20]//a[text()='LinkedIn']");
    private By card621Enas = By.xpath("//p[text()='Enas E. Zakiya Y.']");
    private By linkedin621Enas = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[21]//a[text()='LinkedIn']");
    private By card622Muhammad = By.xpath("//p[text()='Muhammad Iqbal']");
    private By linkedin622Muhammad = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[22]//a[text()='LinkedIn']");
    private By card623Jonathan = By.xpath("//p[text()='Jonathan Aditya P.']");
    private By linkedin623Jonathan = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[23]//a[text()='LinkedIn']");
    private By card624Aziza = By.xpath("//p[text()='Aziza Jihan R. Argyanti']");
    private By linkedin624Aziza = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[24]//a[text()='LinkedIn']");
    private By card625Aisyah = By.xpath("//p[text()='Aisyah Ramadhani']");
    private By linkedin625Aisyah = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[25]//a[text()='LinkedIn']");
    private By card626Alia = By.xpath("//p[text()='Alia Rahmardhatilla S.']");
    private By linkedin626Alia = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[2]/div[2]/div[26]//a[text()='LinkedIn']");
    public By card701Tino = By.xpath("//p[text()='Tino Vienza Widiatna\t']");
    private By linkedin701Tino = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[1]//a[text()='LinkedIn']");
    private By card702Esther = By.xpath("//p[text()='Esther Vanny Aprilla ']");
    private By linkedin702Esther = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[2]//a[text()='LinkedIn']");
    private By card703Evan = By.xpath("//p[text()='Evan Laksana Wira P.']");
    private By linkedin703Evan = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[3]//a[text()='LinkedIn']");
    private By card704M = By.xpath("//p[text()='M. Cahyana Bintang Fajar\t']");
    private By linkedin704M = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[4]//a[text()='LinkedIn']");
    private By card705Agus = By.xpath("//p[text()='Agus Puji Pamungkas\t']");
    private By linkedin705Agus = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[5]//a[text()='LinkedIn']");
    private By card706Lifdaria = By.xpath("//p[text()='Lifdaria Utari']");
    private By linkedin706Lifdaria = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[6]//a[text()='LinkedIn']");
    private By card707Najla = By.xpath("//p[text()='Najla Eltira Gaynell\t']");
    private By linkedin707Najla = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[7]//a[text()='LinkedIn']");
    private By card708Putera = By.xpath("//p[text()='Putera Patria Anugerah\t']");
    private By linkedin708Putera = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[8]//a[text()='LinkedIn']");
    private By card709Andra = By.xpath("//p[text()='Andra R. Pratama']");
    private By linkedin709Andra = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[9]//a[text()='LinkedIn']");
    private By card710Bendry = By.xpath("//p[text()='Bendry  Lakburlawal']");
    private By linkedin710Bendry = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[10]//a[text()='LinkedIn']");
    private By card711Nawal = By.xpath("//p[text()='Nawal Rizky Kautsar']");
    private By linkedin711Nawal = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[11]//a[text()='LinkedIn']");
    private By card712Lintang = By.xpath("//p[text()='Lintang Yandi Nugraha']");
    private By linkedin712Lintang = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[12]//a[text()='LinkedIn']");
    private By card713Azhra = By.xpath("//p[text()='Azhra Yashna Azka']");
    private By linkedin713Azhra = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[13]//a[text()='LinkedIn']");
    private By card714Muhammad = By.xpath("//p[text()='Muhammad Haris Sitompul']");
    private By linkedin714Muhammad = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[14]//a[text()='LinkedIn']");
    private By card715Revandy = By.xpath("//p[text()='Revandy Aira Pratama']");
    private By linkedin715Revandy = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[15]//a[text()='LinkedIn']");
    private By card716Zikri = By.xpath("//p[text()='Zikri Endisyah Munandar']");
    private By linkedin716Zikri = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[16]//a[text()='LinkedIn']");
    private By card717Rio = By.xpath("//p[text()='Rio Taofan\t']");
    private By linkedin717Rio = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[17]//a[text()='LinkedIn']");
    private By card718Carissa = By.xpath("//p[text()='Carissa Banafsaj Danka\t']");
    private By linkedin718Carissa = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[18]//a[text()='LinkedIn']");
    private By card719Satrio = By.xpath("//p[text()='Satrio Aryo Wicaksono']");
    private By linkedin719Satrio = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[19]//a[text()='LinkedIn']");
    private By card720Nabila = By.xpath("//p[text()='Nabila Daniasti Darno\t']");
    private By linkedin720Nabila = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[20]//a[text()='LinkedIn']");
    private By card721Dalila = By.xpath("//p[text()='Dalila Fathrani\t']");
    private By linkedin721Dalila = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[21]//a[text()='LinkedIn']");
    private By card722Angela = By.xpath("//p[text()='Angela Putri Felisha\t']");
    private By linkedin722Angela = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[22]//a[text()='LinkedIn']");
    private By card723Tiara = By.xpath("//p[text()='Tiara Fridiana Lirifa\t']");
    private By linkedin723Tiara = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[23]//a[text()='LinkedIn']");
    private By card724Muhammad = By.xpath("//p[text()='Muhammad Iqbal\t']");
    private By linkedin724Muhammad = By.xpath("//div[@class='block w-full relative bg-transparent overflow-hidden']/div[3]/div[2]/div[24]//a[text()='LinkedIn']");

    public static boolean isKontributorHeaderDisplayed() {
        return find(kontributorHeader).isDisplayed();
    }

    public p01LandingPage clickBerandaNavigation() {
        click(berandaNavigation);
        return new p01LandingPage();
    }

    public void clickKontributorNavigation() {
        click(kontributorNavigation);
    }

    public void clickTabBatch5() {
        click(tabBatch7);
        click(tabBatch5);
    }

    public void clickTabBatch6() {
            click(tabBatch6);
    }

    public void clickTabBatch7() {
            click(tabBatch7);
    }

    public void clickLinkedin501Kemal() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card501Kemal)).perform();
        click(linkedin501Kemal);
        switchToTab();
    }

    public void clickLinkedin502Aulia() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card502Aulia)).perform();
        click(linkedin502Aulia);
        switchToTab();
    }

    public void clickLinkedin503Syifa() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card503Syifa)).perform();
        click(linkedin503Syifa);
        switchToTab();
    }

    public void clickLinkedin504Magnolia() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card504Magnolia)).perform();
        click(linkedin504Magnolia);
        switchToTab();
    }

    public void clickLinkedin505Rheina() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card505Rheina)).perform();
        click(linkedin505Rheina);
        switchToTab();
    }

    public void clickLinkedin506Lintang() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card506Lintang)).perform();
        click(linkedin506Lintang);
        switchToTab();
    }

    public void clickLinkedin507Muhammad() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card507Muhammad)).perform();
        click(linkedin507Muhammad);
        switchToTab();
    }

    public void clickLinkedin508Fery() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card508Fery)).perform();
        click(linkedin508Fery);
        switchToTab();
    }

    public void clickLinkedin509Ruth() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card509Ruth)).perform();
        click(linkedin509Ruth);
        switchToTab();
    }

    public void clickLinkedin510Abdul() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card510Abdul)).perform();
        click(linkedin510Abdul);
        switchToTab();
    }

    public void clickLinkedin511Mohammad() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card511Mohammad)).perform();
        click(linkedin511Mohammad);
        switchToTab();
    }

    public void clickLinkedin512J() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card512J)).perform();
        click(linkedin512J);
        switchToTab();
    }

    public void clickLinkedin513Yosafat() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card513Yosafat)).perform();
        click(linkedin513Yosafat);
        switchToTab();
    }

    public void clickLinkedin514Muhammad() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card514Muhammad)).perform();
        click(linkedin514Muhammad);
        switchToTab();
    }

    public void clickLinkedin515Hakasa() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card515Hakasa)).perform();
        click(linkedin515Hakasa);
        switchToTab();
    }

    public void clickLinkedin516Meiza() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card516Meiza)).perform();
        click(linkedin516Meiza);
        switchToTab();
    }

    public void clickLinkedin517Muhammad() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card517Muhammad)).perform();
        click(linkedin517Muhammad);
        switchToTab();
    }

    public void clickLinkedin518Salman() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card518Salman)).perform();
        click(linkedin518Salman);
        switchToTab();
    }

    public void clickLinkedin519Fernando() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card519Fernando)).perform();
        click(linkedin519Fernando);
        switchToTab();
    }

    public void clickLinkedin520Shafa() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card520Shafa)).perform();
        click(linkedin520Shafa);
        switchToTab();
    }

    public void clickLinkedin521Hawa() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card521Hawa)).perform();
        click(linkedin521Hawa);
        switchToTab();
    }

    public void clickLinkedin522Randy() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card522Randy)).perform();
        click(linkedin522Randy);
        switchToTab();
    }

    public void clickLinkedin523Ragil() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card523Ragil)).perform();
        click(linkedin523Ragil);
        switchToTab();
    }

    public void clickLinkedin524Ryhan() {
        Actions act = new Actions(driver);
        act.moveToElement(find(card524Ryhan)).perform();
        click(linkedin524Ryhan);
        switchToTab();
    }

    public void clickLinkedin601Rezky() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card601Rezky)).perform();
        click(linkedin601Rezky);
        switchToTab();
    }

    public void clickLinkedin602Azhari() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card602Azhari)).perform();
        click(linkedin602Azhari);
        switchToTab();
    }

    public void clickLinkedin603Secilia() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card603Secilia)).perform();
        click(linkedin603Secilia);
        switchToTab();
    }

    public void clickLinkedin604Arini() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card604Arini)).perform();
        click(linkedin604Arini);
        switchToTab();
    }

    public void clickLinkedin605Prihandini() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card605Prihandini)).perform();
        click(linkedin605Prihandini);
        switchToTab();
    }

    public void clickLinkedin606Muhammad() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card606Muhammad)).perform();
        click(linkedin606Muhammad);
        switchToTab();
    }

    public void clickLinkedin607Billy() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card607Billy)).perform();
        click(linkedin607Billy);
        switchToTab();
    }

    public void clickLinkedin608Mufidus() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card608Mufidus)).perform();
        click(linkedin608Mufidus);
        switchToTab();
    }

    public void clickLinkedin609Bendry() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card609Bendry)).perform();
        click(linkedin609Bendry);
        switchToTab();
    }

    public void clickLinkedin610Raisa() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card610Raisa)).perform();
        click(linkedin610Raisa);
        switchToTab();
    }

    public void clickLinkedin611Gamas() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card611Gamas)).perform();
        click(linkedin611Gamas);
        switchToTab();
    }

    public void clickLinkedin612Aisyah() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card612Aisyah)).perform();
        click(linkedin612Aisyah);
        switchToTab();
    }

    public void clickLinkedin613Nisaul() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card613Nisaul)).perform();
        click(linkedin613Nisaul);
        switchToTab();
    }

    public void clickLinkedin614Hanif() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card614Hanif)).perform();
        click(linkedin614Hanif);
        switchToTab();
    }

    public void clickLinkedin615Bryan() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card615Bryan)).perform();
        click(linkedin615Bryan);
        switchToTab();
    }

    public void clickLinkedin616Najwaa() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card616Najwaa)).perform();
        click(linkedin616Najwaa);
        switchToTab();
    }

    public void clickLinkedin617Ivykaeyla() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card617Ivykaeyla)).perform();
        click(linkedin617Ivykaeyla);
        switchToTab();
    }

    public void clickLinkedin618Hanifah() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card618Hanifah)).perform();
        click(linkedin618Hanifah);
        switchToTab();
    }

    public void clickLinkedin619Eddy() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card619Eddy)).perform();
        click(linkedin619Eddy);
        switchToTab();
    }

    public void clickLinkedin620Ega() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card620Ega)).perform();
        click(linkedin620Ega);
        switchToTab();
    }

    public void clickLinkedin621Enas() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card621Enas)).perform();
        click(linkedin621Enas);
        switchToTab();
    }

    public void clickLinkedin622Muhammad() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card622Muhammad)).perform();
        click(linkedin622Muhammad);
        switchToTab();
    }

    public void clickLinkedin623Jonathan() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card623Jonathan)).perform();
        click(linkedin623Jonathan);
        switchToTab();
    }

    public void clickLinkedin624Aziza() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card624Aziza)).perform();
        click(linkedin624Aziza);
        switchToTab();
    }

    public void clickLinkedin625Aisyah() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card625Aisyah)).perform();
        click(linkedin625Aisyah);
        switchToTab();
    }

    public void clickLinkedin626Alia() {
        clickTabBatch6();
        Actions act = new Actions(driver);
        act.moveToElement(find(card626Alia)).perform();
        click(linkedin626Alia);
        switchToTab();
    }

    public void clickLinkedin701Tino() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card701Tino)).perform();
        click(linkedin701Tino);
        switchToTab();
    }

    public void clickLinkedin702Esther() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card702Esther)).perform();
        click(linkedin702Esther);
        switchToTab();
    }

    public void clickLinkedin703Evan() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card703Evan)).perform();
        click(linkedin703Evan);
        switchToTab();
    }

    public void clickLinkedin704M() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card704M)).perform();
        click(linkedin704M);
        switchToTab();
    }

    public void clickLinkedin705Agus() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card705Agus)).perform();
        click(linkedin705Agus);
        switchToTab();
    }

    public void clickLinkedin706Lifdaria() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card706Lifdaria)).perform();
        click(linkedin706Lifdaria);
        switchToTab();
    }

    public void clickLinkedin707Najla() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card707Najla)).perform();
        click(linkedin707Najla);
        switchToTab();
    }

    public void clickLinkedin708Putera() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card708Putera)).perform();
        click(linkedin708Putera);
        switchToTab();
    }

    public void clickLinkedin709Andra() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card709Andra)).perform();
        click(linkedin709Andra);
        switchToTab();
    }

    public void clickLinkedin710Bendry() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card710Bendry)).perform();
        click(linkedin710Bendry);
        switchToTab();
    }

    public void clickLinkedin711Nawal() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card711Nawal)).perform();
        click(linkedin711Nawal);
        switchToTab();
    }

    public void clickLinkedin712Lintang() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card712Lintang)).perform();
        click(linkedin712Lintang);
        switchToTab();
    }

    public void clickLinkedin713Azhra() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card713Azhra)).perform();
        click(linkedin713Azhra);
        switchToTab();
    }

    public void clickLinkedin714Muhammad() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card714Muhammad)).perform();
        click(linkedin714Muhammad);
        switchToTab();
    }

    public void clickLinkedin715Revandy() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card715Revandy)).perform();
        click(linkedin715Revandy);
        switchToTab();
    }

    public void clickLinkedin716Zikri() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card716Zikri)).perform();
        click(linkedin716Zikri);
        switchToTab();
    }

    public void clickLinkedin717Rio() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card717Rio)).perform();
        click(linkedin717Rio);
        switchToTab();
    }

    public void clickLinkedin718Carissa() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card718Carissa)).perform();
        click(linkedin718Carissa);
        switchToTab();
    }

    public void clickLinkedin719Satrio() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card719Satrio)).perform();
        click(linkedin719Satrio);
        switchToTab();
    }

    public void clickLinkedin720Nabila() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card720Nabila)).perform();
        click(linkedin720Nabila);
        switchToTab();
    }

    public void clickLinkedin721Dalila() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card721Dalila)).perform();
        click(linkedin721Dalila);
        switchToTab();
    }

    public void clickLinkedin722Angela() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card722Angela)).perform();
        click(linkedin722Angela);
        switchToTab();
    }

    public void clickLinkedin723Tiara() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card723Tiara)).perform();
        click(linkedin723Tiara);
        switchToTab();
    }

    public void clickLinkedin724Muhammad() {
        clickTabBatch7();
        Actions act = new Actions(driver);
        act.moveToElement(find(card724Muhammad)).perform();
        click(linkedin724Muhammad);
        switchToTab();
    }
}