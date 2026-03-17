package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutComplete extends BasePage{
    public CheckoutComplete (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "complete-header")
    WebElement confirmationText;

    public String getConfirmationText(){
        return waitForVisibility(confirmationText).getText();
    }
}
