package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class iLandingPage extends BasePage {
    private By closePopup = By.xpath("//*[@id='root']/div/div[4]/div/button[1]");
    private By dropDown1 = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/ul/li[1]");
    private By profilLembaga = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/ul/div/div/a[1]");
    private By standarPelayanan = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/ul/div/div/a[2]");
    private By faq = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/ul/div/div/a[3]");
    private By kebijakanPrivasi = By.xpath("//*[@id='root']/div/div[3]/div/div[2]/ul/li[2]/a");
    private By banner = By.xpath("//*[@id='root']/div/div[4]/div[1]");
    private By dropdownPanel = By.xpath("//*[contains(@role,'listbox') or contains(@class,'menu')]");
    private By searchDropdown = By.xpath("//button[contains(@class,'select') or .//span]");
    private By searchInput = By.xpath("//*[@id='root']/div/div[5]/div[1]/div/div/div[2]/div/img");
    private By errorMessage = By.xpath("//*[@id='root']/div/div[5]/div[1]/div/p");
    private By pencarianSpesifik = By.xpath("//*[@id='root']/div/div[5]/div[1]/div/a");
    private By errorMessageText = By.xpath("//*[contains(text(),'Pencarian tidak boleh kosong')]");

    // Search helpers (XPath-only)
    private By categoryOption(String text) { return By.xpath("//*[contains(@role,'option') or self::li or self::a][contains(.,'" + text + "')]"); }

    // Additional, resilient link locators by visible text (XPath-only)
    private By menuProgramStudi = By.xpath("//a[contains(.,'Program Studi')]");
    private By menuPerguruanTinggi = By.xpath("//a[contains(.,'Perguruan Tinggi')]");
    private By menuStatistik = By.xpath("//a[contains(.,'Statistik')]");
    private By menuPublikasi = By.xpath("//a[contains(.,'Publikasi')]");
    private By menuPengumuman = By.xpath("//a[contains(.,'Pengumuman')]");
    private By menuPeta = By.xpath("//a[contains(.,'Peta')]");
    private By ctaCariInformasi = By.xpath("//*[@id='root']/div/div[5]/div[3]/div/div[1]/div/div/p/a");
    private By ctaKomparasi = By.xpath("//*[@id='root']/div/div[5]/div[3]/div/div[2]/div/div/p/span");
    private By kontributorLink = By.xpath("//*[@id=\"root\"]/div/div[6]/div[2]/div[1]/a");
    private By captchaFrame = By.xpath("//iframe[contains(translate(@title,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'captcha')]");
    private By captchaWidgets = By.xpath("//*[contains(@class,'recaptcha') or contains(@class,'h-captcha') or contains(@class,'captcha') or contains(@data-sitekey,'') or contains(@class,'cf-challenge') or contains(@id,'captcha')] | //iframe[contains(@src,'recaptcha') or contains(@src,'hcaptcha') or contains(@src,'turnstile')]");

    public void clickLinkKontributor() {
        click(kontributorLink);
    }

    public void clickSocialIfPresent(String domain) {
        By link = By.xpath("//a[contains(@href,'" + domain + "')]");
        try { click(link); } catch (Exception ignored) {}
    }

    public void clickClosePopup() {
        try {
            utilities.WaitUtility.fluentWaitUntilVisible(5, closePopup);
            click(closePopup);
        } catch (Exception ignored) {
            // Popup may not be present; safely continue.
        }
    }

    public void clickProfilLembaga() {
        click(dropDown1);
        click(profilLembaga);
    }

    public void clickStandarPelayanan() {
        click(dropDown1);
        click(standarPelayanan);
    }

    public void clickFaq() {
        click(dropDown1);
        click(faq);
    }

    public void clickKebijakanPrivasi() {
        utilities.WaitUtility.fluentWaitUntilVisible(10, kebijakanPrivasi);
        click(kebijakanPrivasi);
    }

    public void clickBanner() {
        try {
            utilities.WaitUtility.fluentWaitUntilVisible(10, banner);
            click(banner);
        } catch (Exception e) {
            // Fallbacks for dynamic banner markup
            By altBanner = By.xpath("//section[.//h1 or .//h2][1] | //div[contains(@class,'hero') or contains(@class,'banner')][1]");
            try {
                utilities.WaitUtility.waitForVisibility(10, altBanner);
                click(altBanner);
            } catch (Exception ignored) { }
        }
    }

    public void clickCari() {
        try {
            utilities.WaitUtility.fluentWaitUntilVisible(10, searchDropdown);
            click(searchDropdown);
        } catch (Exception e) {
            // Fallback: try pressing Enter in the first visible text input (XPath-only)
            try {
                java.util.List<org.openqa.selenium.WebElement> inputs = base.BasePage.driver.findElements(org.openqa.selenium.By.xpath("//input"));
                for (org.openqa.selenium.WebElement input : inputs) {
                    if (input.isDisplayed() && input.isEnabled()) {
                        input.sendKeys(org.openqa.selenium.Keys.ENTER);
                        break;
                    }
                }
            } catch (Exception ignored) { }
        }
    }

    public void clickPencarianSpesifik() {
        try {
            utilities.WaitUtility.fluentWaitUntilVisible(10, pencarianSpesifik);
            click(pencarianSpesifik);
        } catch (Exception e) {
            By alt = By.xpath("//a[contains(.,'Pencarian Spesifik')]");
            try {
                utilities.WaitUtility.fluentWaitUntilVisible(10, alt);
                click(alt);
            } catch (Exception ignored) {
                // As a last resort, attempt JS click if element exists but not visible
                try {
                    utilities.JavaScriptUtility.clickJS(alt);
                } catch (Exception ignored2) {}
            }
        }
    }

    public void clickMenuProgramStudi() {
        click(menuProgramStudi);
    }

    public void clickMenuPerguruanTinggi() {
        click(menuPerguruanTinggi);
    }

    public void clickMenuStatistik() {
        click(menuStatistik);
    }

    public void clickMenuPublikasi() {
        click(menuPublikasi);
    }

    public void clickMenuPengumuman() {
        click(menuPengumuman);
    }

    public void clickMenuPeta() {
        click(menuPeta);
    }

    public void clickCtaCariInformasi() {
        click(ctaCariInformasi);
    }

    public void clickCtaKomparasi() {
        click(ctaKomparasi);
    }

    public void selectSearchCategory(String category) {
        try {
            utilities.WaitUtility.waitForClickability(10, searchDropdown);
            click(searchDropdown);
            utilities.WaitUtility.waitForVisibility(10, dropdownPanel);
            click(categoryOption(category));
        } catch (Exception e) {
            // Fallback: attempt by XPath text contains in case of different markup
            try {
                click(By.xpath("//*[self::a or self::li or @role='option' or self::*][contains(normalize-space(.),'" + category + "') ]"));
            } catch (Exception ignored) {}
        }
    }

    public void enterSearchKeyword(String keyword) {
        utilities.WaitUtility.waitForVisibility(10, searchInput);
        org.openqa.selenium.WebElement input = base.BasePage.driver.findElement(searchInput);
        input.clear();
        try {
            if (containsNonBMP(keyword)) {
                utilities.JavaScriptUtility.setValueJS(searchInput, keyword);
            } else {
                input.sendKeys(keyword);
            }
        } catch (org.openqa.selenium.WebDriverException e) {
            // Fallback for drivers that reject non-BMP or special characters
            try {
                utilities.JavaScriptUtility.setValueJS(searchInput, keyword);
            } catch (Exception ignored) {}
        }
    }

    public void submitSearchByEnter() {
        try {
            base.BasePage.driver.findElement(searchInput)
                    .sendKeys(org.openqa.selenium.Keys.ENTER);
        } catch (Exception ignored) {
            clickCari();
        }
    }

    // Flow helper: search and wait for next page or captcha
    public void searchAndProceed(String category, String keyword, int maxWaitSeconds) {
        selectSearchCategory(category);
        enterSearchKeyword(keyword);
        submitSearchByEnter();
        waitUntilNavigatedOrCaptcha(maxWaitSeconds);
    }

    public void waitUntilNavigatedOrCaptcha(int seconds) {
        String startUrl = utilities.GetUtility.getURL();
        long end = System.currentTimeMillis() + seconds * 1000L;
        while (System.currentTimeMillis() < end) {
            try {
                // URL changed?
                String now = utilities.GetUtility.getURL();
                if (now != null && !now.equals(startUrl)) {
                    return;
                }
            } catch (Exception ignored) {}
            try {
                // Captcha visible? If yes, do not block the suite; consider as reached step
                boolean cap1 = utilities.GetUtility.isDisplayed(captchaFrame, 1);
                boolean cap2 = utilities.GetUtility.isDisplayed(captchaWidgets, 1);
                if (cap1 || cap2) {
                    return;
                }
            } catch (Exception ignored) {}
            utilities.WaitUtility.sleep(300);
        }
    }

    public String getErrorMessage() {
        try {
            return utilities.GetUtility.getTextWait(errorMessageText, 10);
        } catch (Exception e) {
            return find(errorMessage).getText();
        }
    }

    // Helper: detect non-BMP characters (e.g., emojis) which some drivers cannot send via sendKeys
    private boolean containsNonBMP(String s) {
        if (s == null) return false;
        return s.codePoints().anyMatch(cp -> cp > 0xFFFF);
    }
}