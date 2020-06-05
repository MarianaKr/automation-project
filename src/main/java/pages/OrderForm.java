package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderForm extends DefaultPage {

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id = "postal-code")
    private WebElement zipCode;

    @FindBy(xpath = "//html/body/div/div[2]/div[3]/div/form/div[2]/input")
    private WebElement continueButton;

    @FindBy (xpath = "//html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]")
    private WebElement finishButton;

    @FindBy( id="checkout_complete_container")
    private WebElement orderCompleteCheckout;


    public OrderForm(WebDriver driver) {
        super(driver);
    }

    public OrderForm fillOrderForm(String firstName, String lastName, String zipCode) {
        fillElement(this.firstName, firstName);
        fillElement(this.lastName, lastName);
        fillElement(this.zipCode,zipCode);
        return this;
    }

    public OrderForm continueForm(){
        clickElement(continueButton);
        return this;// to be checked
    }

    public OrderForm finishForm(){
        clickElement(finishButton);
        return this;// to be checked
    }

    public boolean isProductOrdered(){
        return isElementDisplayed(orderCompleteCheckout);
    }


}
