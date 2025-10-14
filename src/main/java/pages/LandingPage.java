package pages;

import base.BasePage;
import org.openqa.selenium.By;
import static utilities.JavaScriptUtility.scrollToElementJS;

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
        scrollToElementJS(closePopup);
        click(closePopup);
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
        click(kebijakanPrivasi);
    }

    public void clickBanner() {
        click(banner);
    }

    public void clickDataSelected() {
        click(dropDown2);
        click(dataSelected);
    }

    public void clickCari() {
        click(cari);
    }

    public void clickPencarianSpesifik() {
        click(pencarianSpesifik);
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }
}