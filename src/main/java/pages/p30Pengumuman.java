package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p30Pengumuman extends BasePage {
    private static By pengumumanNavigation = By.xpath("//span[text()='Pengumuman']");

    public static boolean isPengumumanNavigationDisplayed() {
        return find(pengumumanNavigation).isDisplayed();
    }
}