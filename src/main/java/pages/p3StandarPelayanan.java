package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p3StandarPelayanan extends BasePage {
    private static By standarPelayananHeader = By.xpath("//div[text()='Standar Pelayanan']");

    public static boolean isStandarPelayananHeaderDisplayed() {
        return find(standarPelayananHeader).isDisplayed();
    }
}
