package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void login(){
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo.com/inventory.html"));
    }
}
