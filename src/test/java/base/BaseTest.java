package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.PageLoadStrategy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.iLandingPage;

import java.time.Duration;

import static utilities.Utility.setUtilityDriver;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected iLandingPage landingPage;
    private String url = "https://pddikti.kemdiktisaintek.go.id";

    @BeforeClass
    public void setUp() {
        // Configure Chrome without blocking site content
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER); // still OK for speed, does not block content

        // Keep lightweight flags that do not block website features
        options.addArguments(
                "--disable-dev-shm-usage",
                "--no-sandbox",
                "--disable-extensions",
                "--disable-infobars",
                "--start-maximized"
        );

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        // Keep a reasonable page load timeout, but not too high
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        landingPage = new iLandingPage();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}