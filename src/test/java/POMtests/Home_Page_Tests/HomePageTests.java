package POMtests.Home_Page_Tests;

import POMpages.Home_Page.HomePage;
import POMpages.Login_Page.LoginPage;
import Utilities.CRMUtils;
import Utilities.Config;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePageTests{

    HomePage homePage = new HomePage ();


    @BeforeMethod
    public void setUp() {

        Driver.getDriver ().get (Config.getProperty ("briteERPUrl"));
    }



    @Test(priority = 1)
    public void verifyingUserNameTest() {
        CRMUtils.login ();
        Assert.assertEquals (homePage.displayedUser.getText(),Config.getProperty ("displayedUser"));

    }

    @Test(priority = 2)
    public void verifyingCRMmoduleTab() {
        CRMUtils.login ();
        Assert.assertEquals (homePage.CRMmodule.getText(),Config.getProperty ("CRMmodule"));

    }


}
