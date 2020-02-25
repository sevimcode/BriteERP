package Tests.Home_Page_Tests;
import Pages.Home_Page.HomePage;
import Tests.Login_Page_Tests.LoginPageTests;
import Utilities.*;
import org.testng.Assert;
import org.testng.annotations.*;

import javax.swing.text.Utilities;


public class HomePageTests{

    LoginPageTests loginPageTests = new LoginPageTests ();
    HomePage homePage = new HomePage ();


    @BeforeClass(groups = {"smoke"})
    public void setup() {
        loginPageTests.loginManager7 ();
    }

    @Test(groups = {"smoke"})
    public void verifyingUserNameTest() {
        SeleniumUtils.pause (5);
        Assert.assertEquals (homePage.displayedUser.getText () , Config.getProperty ("displayedUser"));

    }

    @Test(groups = {"smoke"})
    public void verifyingCreateButtonTest() {
        SeleniumUtils.pause (3);
        Assert.assertFalse (homePage.toggleButton.isDisplayed ());

    }


}