package Tests.CRM_Module_Tests.Sale_Channel_Tests;

import Pages.CRM_Module_Pages.CRM_Module_Landing_Page.CRMmoduleLandingPage;
import Pages.CRM_Module_Pages.Sale_Channel_Page.SalesChannelPage;
import Pages.CRM_Module_Pages.Sale_Channel_Page.SaveFields;
import Pages.Home_Page.HomePage;
import Pages.Login_Page.LoginPage;
import Tests.Login_Page_Tests.LoginPageTests;
import Utilities.Config;
import Utilities.Driver;
import Utilities.SeleniumUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sale_Channel_Tests{

    LoginPage loginPage = new LoginPage();
    SalesChannelPage salesChannelPage = new SalesChannelPage ();
    HomePage homePage = new HomePage();
    SaveFields saveFields = new SaveFields();
    LoginPageTests loginPageTests = new LoginPageTests ();
    CRMmoduleLandingPage crMmoduleLandingPage = new CRMmoduleLandingPage ();


    @BeforeClass(groups = {"smoke"})
    public void setup(){
        Driver.getDriver().get(Config.getProperty("briteERPUrl"));
        loginPageTests.loginManager7 ();
        SeleniumUtils.pause (2);
        WebDriverWait wait = new WebDriverWait (Driver.getDriver () , 30);
        wait.until (ExpectedConditions.visibilityOf (homePage.CRMmodule));
        homePage.CRMmodule.click ();
       crMmoduleLandingPage.ConfigSaleChannels.click ();


    }
    @Test(groups = {"smoke"})
    public void saleChannelPageTitle(){
        SeleniumUtils.pause (5);
        System.out.println (Driver.getDriver ().getTitle ());
        Assert.assertEquals (Driver.getDriver ().getTitle (),"Sales Channels - Odoo");

    }


    @Test
    public void create(){

        salesChannelPage.create.click();
        saveFields.salesTeamName.sendKeys("ali");
        Assert.assertTrue(saveFields.quotations.isSelected(),"quotation is not selected");
        Assert.assertTrue(saveFields.pipelines.isSelected(),"pipeline is not selected");
        saveFields.channelLeader.sendKeys("Administrator");
        saveFields.emailAlias.sendKeys("abc@gmail.com");
        saveFields.save.click();
        saveFields.create.click();
    }

}

