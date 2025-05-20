package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "input[name='search_query']")
    private WebElement searchBox;

    @FindBy(name = "submit_search")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void search(String query) {
        searchBox.sendKeys(query);
        searchButton.click();
    }
}
