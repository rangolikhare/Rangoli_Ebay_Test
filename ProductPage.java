package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    private By addToCartButton = By.id("atcRedesignId_btn");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }
}