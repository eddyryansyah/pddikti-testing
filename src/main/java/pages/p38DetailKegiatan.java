package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p38DetailKegiatan extends BasePage {
    private static By detailKegiatanNavigation = By.xpath("//span[text()='Kegiatan']");

    public static boolean isDetailKegiatanNavigationDisplayed() {
        return find(detailKegiatanNavigation).isDisplayed();
    }
}