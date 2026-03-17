package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    @FindBy(tagName = "button")
    List<WebElement> buttons;

    @FindBy(className = "cart_item")
    List<WebElement> items;

    public void clickCheckout(){
        waitForClickeable(checkoutBtn).click();
    }

    public void removeElements(){
        for(WebElement btn : buttons){
            if(btn.getText().equals("Remove")){
                waitForClickeable(btn).click();
            }
        }
    }

    public int getCartSize(){
        return items.size();
    }
}
