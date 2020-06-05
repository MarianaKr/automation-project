package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends DefaultPage {

    @FindBy(xpath = "//html/body/div/div[2]/div[2]/div/div/div/button")
    private WebElement addToCardButton;

    @FindBy(xpath = "//html/body/div/div[2]/div[1]/div[2]/a/span")
    private WebElement shoppingCardAddedIndicator;

    @FindBy (xpath = "//html/body/div/div[2]/div[1]/div[2]/a")
    private WebElement ShoppingCard;


    public ProductPage(WebDriver driver) {

        super(driver);
    }

    public ProductPage addToCart(){
        clickElement(addToCardButton);
        return this;
    }

    public boolean isProductAdded(){
        return isElementDisplayed(shoppingCardAddedIndicator);
    }

    public GoToShoppingCard openShoppingCard(){
        clickElement(ShoppingCard);
        return new GoToShoppingCard (driver);
    }

}

