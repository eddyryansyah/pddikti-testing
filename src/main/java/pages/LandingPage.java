package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {
    private By closePopup = By.xpath("//*[@id=\"root\"]/div/div[4]/div/button[1]");
    private By dropDown1 = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/ul/li[1]");
    private By profilLembaga = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/ul/div/div/a[1]");
    private By standarPelayanan = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/ul/div/div/a[2]");
    private By faq = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/ul/div/div/a[3]");
    private By kebijakanPrivasi = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/ul/li[2]/a");
    private By banner = By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]");
    private By dropDown2 = By.xpath("//*[@id=\"root\"]/div/div[5]/div[1]/div/div/div[1]/div/button/span");
    private By dataSelected = By.xpath("//*[@id=\"material-tailwind-select-4\"]");
    private By cari = By.xpath("//*[@id=\"root\"]/div/div[5]/div[1]/div/div/div[2]/div/img");
    private By errorMessage = By.xpath("//*[@id=\"root\"]/div/div[5]/div[1]/div/p");
    private By pencarianSpesifik = By.xpath("//*[@id=\"root\"]/div/div[5]/div[1]/div/a");

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
        utilities.WaitUtility.fluentWaitUntilVisible(10, banner);
        click(banner);
    }

    public void clickDataSelected() {
        utilities.WaitUtility.fluentWaitUntilVisible(10, dropDown2);
        click(dropDown2);
        utilities.WaitUtility.fluentWaitUntilVisible(10, dataSelected);
        click(dataSelected);
    }

    public void clickCari() {
        utilities.WaitUtility.fluentWaitUntilVisible(10, cari);
        click(cari);
    }

    public void clickPencarianSpesifik() {
        try {
            utilities.WaitUtility.fluentWaitUntilVisible(10, pencarianSpesifik);
            click(pencarianSpesifik);
        } catch (Exception e) {
            By alt = By.partialLinkText("Pencarian Spesifik");
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

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }
}