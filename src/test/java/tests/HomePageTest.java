package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        homePage = new HomePage(driver);
    }

    @Test
    public void testSearch() {
        homePage.search("dress");
        // Add assertions here if needed
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
