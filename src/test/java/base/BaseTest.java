package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LandingPage;

import static utilities.Utility.setUtilityDriver;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected LandingPage landingPage;
    private String url = "https://pddikti.kemdiktisaintek.go.id/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        landingPage = new LandingPage();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}