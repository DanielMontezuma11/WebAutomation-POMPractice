package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    public void clickCheckout(){
        waitForClickeable(checkoutBtn).click();
    }
}
