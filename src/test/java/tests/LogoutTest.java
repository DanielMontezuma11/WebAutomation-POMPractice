package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;

public class LogoutTest extends BaseTest {

    @Test
    public void logOutTest(){
        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);
        MenuPage menu = new MenuPage(driver);

        login.login("standard_user", "secret_sauce");
        home.goToMenu();
        menu.logOut();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
    }
}
