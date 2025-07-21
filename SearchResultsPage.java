package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage {

    private By firstItem = By.cssSelector("ul.srp-results > li.s-item a.s-item__link");

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstItem() {
        driver.findElement(firstItem).click();
    }
}