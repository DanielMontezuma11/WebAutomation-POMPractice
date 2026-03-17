package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class HomePage extends BasePage{
    WebDriver driver;
    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "inventory_item")
    List<WebElement> products;

    @FindBy(className = "shopping_cart_link")
    WebElement cartBtn;

    public void addRandomProduct(){
        Random rand = new Random();
        WebElement product = products.get(rand.nextInt(products.size()));
        product.findElement(By.tagName("button")).click();
    }

    public void goToCart(){
        waitForClickeable(cartBtn).click();
    }
}
