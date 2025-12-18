package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p06HasilPencarianAll extends BasePage {
    private static By hasilPencarianAllHeader = By.xpath("//div[text()='Hasil Pencarian Semua']");
    private By berandaNavigation = By.xpath("//span[text()='Beranda']");
    private By kontributorNavigation = By.xpath("//span[text()='Hasil Pencarian']");

    public static boolean isHasilPencarianAllHeaderDisplayed() {
        return find(hasilPencarianAllHeader).isDisplayed();
    }

    public p01LandingPage clickBerandaNavigation() {
        click(berandaNavigation);
        return new p01LandingPage();
    }

    public void clickKontributorNavigation() {
        click(kontributorNavigation);
    }
}