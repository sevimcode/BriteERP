package Tests.Login_Page_Tests;

import Pages.CRM_Module_Pages.CRM_Module_Landing_Page.CRMmoduleLandingPage;
import Pages.Home_Page.HomePage;
import Pages.Login_Page.LoginPage;
import Utilities.Config;
import Utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTests{
    LoginPage loginPage = new LoginPage ();


    @BeforeClass
    public void setUp() {

        Driver.getDriver ().get (Config.getProperty ("briteERPUrl"));

    }

    @Test
    public void LoginManager7() {
        Driver.getDriver ().get (Config.getProperty ("briteERPUrl"));
        WebDriverWait wait = new WebDriverWait (Driver.getDriver (), 30);
        wait.until (ExpectedConditions.visibilityOf (loginPage.usernameInput)).sendKeys (Config.getProperty ("username"));
        loginPage.passwordInput.sendKeys (Config.getProperty ("password"));
        loginPage.loginButton.click ();

    }




}
