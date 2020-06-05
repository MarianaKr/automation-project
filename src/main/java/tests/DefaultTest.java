package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import utilities.BaseProperties;
import utilities.CustomFile;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public abstract class DefaultTest {

    protected static WebDriver driver;
    protected CustomFile customFile;

    @BeforeSuite
    public void setUp() {
        customFile = new CustomFile();

        System.setProperty("webdriver.chrome.driver", customFile.getDriverFilePath(BaseProperties.CHROME_DRIVER_FILE_NAME));

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(BaseProperties.BASE_URL);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}
