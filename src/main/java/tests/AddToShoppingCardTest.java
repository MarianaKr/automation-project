package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginForm;
import pages.ProductPage;
import pages.ShoppingPage;
import utilities.BaseProperties;
import utilities.CustomFile;

import java.util.concurrent.TimeUnit;

public class AddToShoppingCardTest extends DefaultTest {

    @Test
    public void successAddProductTest() {
        Assert.assertTrue(
                new ShoppingPage(driver)
                        .openProductPage()
                        .addToCart()
                        .isProductAdded());
    }
}
