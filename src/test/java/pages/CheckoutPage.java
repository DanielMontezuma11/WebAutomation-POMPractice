package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage{

    public CheckoutPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(id = "continue")
    WebElement continueBtn;

    public void fillInformation(String name, String last, String code){
        waitForVisibility(firstName).sendKeys(name);
        waitForVisibility(lastName).sendKeys(last);
        waitForVisibility(postalCode).sendKeys(code);
    }

    public void clickContinue(){
        waitForClickeable(continueBtn).click();
    }
}
