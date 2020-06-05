package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginForm;
import pages.ProductPage;
import utilities.BaseProperties;
import utilities.CustomFile;

import java.util.concurrent.TimeUnit;


public class OrderProductTest extends DefaultTest {

    @Test
    public void successOrderProductTest() {
        Assert.assertTrue(
                new ProductPage(driver)
                        .openShoppingCard()
                        .openOrderForm()
                        .fillOrderForm(BaseProperties.FIRST_NAME_LOGIN_FORM, BaseProperties.LAST_NAME_LOGIN_FORM, BaseProperties.ZIPCODE_LOGIN_FORM)
                        .continueForm()
                        .finishForm()
                        .isProductOrdered());

    }
}

