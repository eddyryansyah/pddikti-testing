package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class xxxviiiKontributor extends BasePage {
    private By navBeranda = By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div/span[1]");
    private By navKontributor = By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div/span[3]");
    private By tabBatch5 = By.xpath("//*[@id=\"custom-animation\"]/nav/ul/li[1]");
    private By tabBatch6 = By.xpath("//*[@id=\"custom-animation\"]/nav/ul/li[2]");
    private By tabBatch7 = By.xpath("//*[@id=\"custom-animation\"]/nav/ul/li[3]");
    private By linkedin5Kemal = By.xpath("//*[@id=\"custom-animation\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/a");
    private By linkedin6Rezky = By.xpath("//*[@id=\"custom-animation\"]/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/a");

    public void clickNavBeranda() {
        click(navBeranda);
    }

    public void clickNavKontributor() {
        click(navKontributor);
    }

    public void clickTabBatch5() {
            click(tabBatch5);
    }

    public void clickTabBatch6() {
            click(tabBatch6);
    }

    public void clickTabBatch7() {
            click(tabBatch7);
    }

    public void clickLinkedin5Kemal() {
            click(linkedin5Kemal);
    }

    public void clickLinkedin6Rezky() {
        click(tabBatch6);
        click(linkedin6Rezky);
    }
}
