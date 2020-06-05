package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginForm;
import utilities.BaseProperties;
import utilities.CustomFile;

import java.util.concurrent.TimeUnit;

public class LoginTest extends DefaultTest {

    @Test
    public void successCitySelect() {
        Assert.assertTrue(
                new LoginForm(driver)
                        .fillLoginForm(BaseProperties.BASE_ADMIN_LOGIN, BaseProperties.BASE_ADMIN_PASSWORD)
                        .submitLoginForm()
                        .isShoppingPageDisplayed());

    }
}
