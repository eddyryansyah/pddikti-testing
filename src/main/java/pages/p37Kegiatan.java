package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p37Kegiatan extends BasePage {
    private static By kegiatanHeader = By.xpath("//div[text()='Kegiatan DIKTI']");

    public static boolean isKegiatanHeaderDisplayed() {
        return find(kegiatanHeader).isDisplayed();
    }
}