package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p15PencarianSpesifikMhs extends BasePage {
    private static By pencarianSpesifikHeader = By.xpath("//div[text()='Pencarian Spesifik Mahasiswa']");

    public static boolean isPencarianSpesifikHeaderDisplayed() {
        return find(pencarianSpesifikHeader).isDisplayed();
    }
}