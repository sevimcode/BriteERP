package POMtests.CRM_Module_Tests.config_sales_channel_test;

import POMpages.CRM_Module_Pages.config_Sales_channel_Page.SalesChannelPage;
import POMpages.CRM_Module_Pages.config_Sales_channel_Page.SaveFields;
import POMpages.Home_Page.HomePage;
import POMpages.Login_Page.LoginPage;
import Utilities.Config;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateSalesChannelTest {
        LoginPage loginPage = new LoginPage();
        SalesChannelPage salesChannelPage = new SalesChannelPage();
        HomePage homePage = new HomePage();
        SaveFields saveFields = new SaveFields();


    @BeforeMethod
    public void setup(){
        Driver.getDriver().get(Config.getProperty("briteERPUrl"));


    }

    @Test
    public void create(){

        loginPage.usernameInput.sendKeys(Config.getProperty("username"));
        loginPage.passwordInput.sendKeys(Config.getProperty("password"));
        loginPage.loginButton.click();
        homePage.CRMmodule.click();
        salesChannelPage.salesChannel.click();
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
