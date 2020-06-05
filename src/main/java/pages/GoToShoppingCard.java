package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoToShoppingCard extends DefaultPage {

    @FindBy(xpath = "//html/body/div/div[2]/div[3]/div/div[2]/a[2]")
    private WebElement checkOutButton;

    public GoToShoppingCard(WebDriver driver) {
        super(driver);
    }

    public OrderForm openOrderForm() {
        clickElement(checkOutButton);
        return new OrderForm(driver);
    }
}
