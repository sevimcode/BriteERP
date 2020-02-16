package Tests.Smoke_Test;

import Pages.CRM_Module_Pages.CRM_Module_Landing_Page.CRMmoduleLandingPage;
import Pages.CRM_Module_Pages.Pipeline_Pipeline.PipelinePages;
import Pages.Login_Page.LoginPage;
import Utilities.Config;
import Utilities.Driver;
import Utilities.SeleniumUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokeTest{

       LoginPage loginPage = new LoginPage ();
       CRMmoduleLandingPage crMmoduleLandingPage = new CRMmoduleLandingPage ();
       PipelinePages pipelinePages = new PipelinePages ();
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

    @Test (priority = 4)
    public void pipelinesmoke1(){


        crMmoduleLandingPage.PipelinePipeline.click ();
        SeleniumUtils.pause (4);
        Assert.assertTrue(pipelinePages.createButton.isDisplayed());


    }





}
