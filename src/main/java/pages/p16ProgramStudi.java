package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class p16ProgramStudi extends BasePage {
    private static By programStudiHeader = By.xpath("//div[text()='Program Studi Berdasarkan Bidang Ilmu di Indonesia']");

    public static boolean isProgramStudiHeaderDisplayed() {
        return find(programStudiHeader).isDisplayed();
    }
}