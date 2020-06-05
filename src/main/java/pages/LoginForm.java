package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginForm extends DefaultPage {

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//html/body/div[2]/div[1]/div[1]/div/form/input[3]")
    private WebElement logInButton;


    public LoginForm(WebDriver driver) {

        super(driver);
    }

    public LoginForm fillLoginForm(String userName, String password) {

        fillElement(this.userName, userName);
        fillElement(this.password, password);
        return this;

    }

    public ShoppingPage submitLoginForm() {
        clickElement(logInButton);
        return new ShoppingPage(driver);
    }
}
