package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;

public class RemoveElementsFromCartTest extends BaseTest {
    @Test
    public void removeElementFromCarTest(){
        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);
        CartPage cart = new CartPage(driver);

        login.login("standard_user", "secret_sauce");
        home.addRandomProduct();
        home.addRandomProduct();
        home.addRandomProduct();
        home.goToCart();
        cart.removeElements();

        Assert.assertEquals(cart.getCartSize(), 0);

    }
}
