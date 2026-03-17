package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PurchaseAProductTest extends BaseTest {
    @Test
    public void purchaseAProductTest(){
        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);
        CartPage cart = new CartPage(driver);
        CheckoutPage checkout = new CheckoutPage(driver);
        CheckoutStepTwo checkoutStepTwo = new CheckoutStepTwo(driver);
        CheckoutComplete checkoutComplete = new CheckoutComplete(driver);

        login.login("standard_user", "secret_sauce");
        home.addRandomProduct();
        home.goToCart();
        cart.clickCheckout();
        checkout.fillInformation("Daniel", "Montezuma", "111111");
        checkout.clickContinue();
        checkoutStepTwo.clickFinish();

        Assert.assertEquals(checkoutComplete.getConfirmationText(), "Thank you for your order!");
    }
}
