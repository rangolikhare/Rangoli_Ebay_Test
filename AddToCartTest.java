package tests;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import pages.*;
import utils.DriverFactory;
import static org.testng.Assert.assertEquals;

public class AddToCartTest {
    WebDriver driver;
    HomePage homePage;
    SearchResultsPage searchResultsPage;
    ProductPage productPage;
    CartPage cartPage;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.initDriver();
        driver.get("https://www.ebay.com");
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }

    @Test
    public void verifyItemCanBeAddedToCart() throws InterruptedException {
        homePage.searchFor("book");
        Thread.sleep(2000);
        searchResultsPage.clickFirstItem();
        Thread.sleep(2000);
        productPage.addToCart();
        Thread.sleep(2000);
        driver.navigate().to("https://www.ebay.com");
        String cartCount = cartPage.getCartItemCount();
        assertEquals(cartCount, "1", "Cart count should be 1");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}