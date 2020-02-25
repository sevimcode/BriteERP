package Tests.Login_Page_Tests;

import Pages.Login_Page.LoginPage;
import Utilities.Config;
import Utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTests{
    LoginPage loginPage = new LoginPage ();

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("http://app.briteerp.com/web/login");
    }
    @Test
    public void loginManager7() {
        Driver.getDriver ().get ("http://app.briteerp.com/web/login");
        WebDriverWait wait = new WebDriverWait (Driver.getDriver (), 30);
        wait.until (ExpectedConditions.visibilityOf (loginPage.usernameInput));
        loginPage.usernameInput.sendKeys (Config.getProperty ("username"));
        loginPage.passwordInput.sendKeys (Config.getProperty ("password"));
        loginPage.loginButton.click ();

    }


    }
