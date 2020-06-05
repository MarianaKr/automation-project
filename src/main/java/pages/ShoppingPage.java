package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingPage extends DefaultPage {
    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingButton;

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]") //if not works add one more slash
    private WebElement productPage;

    public ShoppingPage(WebDriver driver) {
        super(driver);
    }

    public boolean isShoppingPageDisplayed() {
        return isElementDisplayed(shoppingButton);

    }

    public ProductPage openProductPage(){
        clickElement(productPage);
        return new ProductPage(driver);
    }
}

