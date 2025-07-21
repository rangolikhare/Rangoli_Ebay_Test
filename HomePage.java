package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By searchBox = By.id("gh-ac");
    private By searchButton = By.id("gh-btn");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchFor(String item) {
        driver.findElement(searchBox).sendKeys(item);
        driver.findElement(searchButton).click();
    }
}