package Tests.Home_Page_Tests;
import Pages.Home_Page.HomePage;
import Pages.Login_Page.LoginPage;
import Tests.Login_Page_Tests.LoginPageTests;
import Utilities.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HomePageTests {

    LoginPageTests loginPageTests = new LoginPageTests ();
    HomePage homePage = new HomePage ();

    @BeforeClass (groups = "smoke")
     public void setup(){ loginPageTests.LoginManager7 ();}

    @Test (groups = "smoke")
    public void verifyingUserNameTest() {
        SeleniumUtils.pause (5);
        Assert.assertEquals (homePage.displayedUser.getText (),Config.getProperty ("displayedUser"));

    }

    @Test
    public void verifyingCreateButtonTest() {
        Assert.assertTrue (homePage.createButton.isDisplayed ());

    }



}
