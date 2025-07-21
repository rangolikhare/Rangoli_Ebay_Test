package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private By cartCount = By.cssSelector("span#gh-cart-n");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getCartItemCount() {
        return driver.findElement(cartCount).getText();
    }
}