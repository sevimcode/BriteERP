package POMtests.Smoke_Test;

import POMpages.Home_Page.HomePage;
import POMpages.Login_Page.LoginPage;
import Utilities.Config;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokeTest{

       LoginPage loginPage = new LoginPage ();
        @BeforeMethod
        public void setUp() {
            Driver.getDriver ().get (Config.getProperty ("briteERPUrl"));
        }

        @Test (priority = 1)
        public void wrongUsernameTest() {

            loginPage.usernameInput.sendKeys (Config.getProperty ("wrongUsername"));
            loginPage.passwordInput.sendKeys (Config.getProperty ("password"));
            loginPage.loginButton.click ();
            Assert.assertTrue(loginPage.errorMessage.isDisplayed (),"Error Message is not displayed");

        }

        @Test (priority = 2)
        public void wrongPasswordTest(){
            loginPage.usernameInput.sendKeys(Config.getProperty ("username"));
            loginPage.passwordInput.sendKeys(Config.getProperty ("wrongPassword"));
            loginPage.loginButton.click ();
            Assert.assertTrue(loginPage.errorMessage.isDisplayed (),"Error Message is not displayed");
        }

         @Test (priority = 3)
         public void loginTest() {
            loginPage.usernameInput.sendKeys (Config.getProperty ("username"));
        loginPage.passwordInput.sendKeys (Config.getProperty ("password"));
        loginPage.loginButton.click ();
        Assert.assertEquals (Config.getProperty ("homepagetitle") , Driver.getDriver ().getTitle ());
    }





}
