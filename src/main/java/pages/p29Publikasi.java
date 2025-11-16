package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p29Publikasi extends BasePage {
    private static By publikasiHeader = By.xpath("//div[text()='Publikasi DIKTI']");

    public static boolean isPublikasiHeaderDisplayed() {
        return find(publikasiHeader).isDisplayed();
    }
}