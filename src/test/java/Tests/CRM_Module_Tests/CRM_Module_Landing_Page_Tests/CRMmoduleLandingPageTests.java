package Tests.CRM_Module_Tests.CRM_Module_Landing_Page_Tests;

import Pages.CRM_Module_Pages.CRM_Module_Landing_Page.CRMmoduleLandingPage;
import Pages.Home_Page.HomePage;
import Tests.Login_Page_Tests.LoginPageTests;
import Utilities.Driver;
import Utilities.SeleniumUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class CRMmoduleLandingPageTests{

    LoginPageTests loginPageTests = new LoginPageTests ();
    HomePage homePage = new HomePage ();
    CRMmoduleLandingPage crMmoduleLandingPage = new CRMmoduleLandingPage ();

    @BeforeClass(groups = {"smoke"})
    public void setup(){
        loginPageTests.loginManager7 ();
        WebDriverWait wait = new WebDriverWait (Driver.getDriver (), 30);
        wait.until (ExpectedConditions.visibilityOf (homePage.CRMmodule));
        homePage.CRMmodule.click ();
    }

    @Test(groups = {"smoke"})
    public void CRM_Pipeline_Pipeline_Verification(){
        SeleniumUtils.pause (5);
        Assert.assertTrue (crMmoduleLandingPage.PipelinePipeline.isDisplayed (),"Pipeline-Pipeline option is not displayed");

    }

    @Test(groups = {"smoke"})
    public void CRM_Pipeline_Quotations_Verification(){
        SeleniumUtils.pause (3);
        Assert.assertTrue (crMmoduleLandingPage.PipelineQuotations.isDisplayed (),"Pipeline-Quotations option  is not displayed");

    }
    @Test(groups = {"smoke"})
    public void CRM_Customer_Pipeline_Verification(){
        SeleniumUtils.pause (3);
        Assert.assertTrue (crMmoduleLandingPage.CustomerPipeline.isDisplayed (),"Customer-Pipeline option  is not displayed");

    }
    @Test(groups = {"smoke"})
    public void CRM_Customer_Activities_Verification(){
        SeleniumUtils.pause (3);
        Assert.assertTrue (crMmoduleLandingPage.CustomerActivities.isDisplayed (),"CustomerPipeline option  is not displayed");

    }
    @Test(groups = {"smoke"})
    public void CRM_Customer_SaleChannels_Verification(){
        SeleniumUtils.pause (3);
        Assert.assertTrue (crMmoduleLandingPage.CustomerSaleChannels.isDisplayed (),"CustomerSaleChannels option  is not displayed");

    }

    @Test(groups = {"smoke"})
    public void CRM_Config_SaleChannels_Verification(){
        SeleniumUtils.pause (3);
        Assert.assertTrue (crMmoduleLandingPage.ConfigSaleChannels.isDisplayed (),"ConfigSaleChannels option  is not displayed");

    }

    @Test(groups = {"smoke"})
    public void CRM_Config_ActivityTypes_Verification(){
        SeleniumUtils.pause (3);
        Assert.assertTrue (crMmoduleLandingPage.ConfigActivitytypes.isDisplayed (),"ConfigActivitytypes option  is not displayed");

    }

    @Test(groups = {"smoke"})
    public void CRM_LeadsOportunities_Verification(){
        SeleniumUtils.pause (3);
        Assert.assertTrue (crMmoduleLandingPage.LeadOportunities.isDisplayed (),"LeadOportunities option  is not displayed");

    }

    @Test(groups = {"smoke"})
    public void CRM_LeadTags_Verification() {

        SeleniumUtils.pause (3);
        crMmoduleLandingPage.LeadOportunities.click ();
        SeleniumUtils.pause (2);
        Assert.assertTrue (crMmoduleLandingPage.LeadOpotunitiesLeadTags.isDisplayed () , "LeadOpotunitiesLeadTags option  is not displayed");

    }



//    @Test  (priority = 10)
//    public void CRM_LostReasons_Verification() {
//
//        crMmoduleLandingPage.LeadOportunities.click ();
//        Assert.assertFalse (crMmoduleLandingPage.LeadOpotunitiesLostReasons.isDisplayed () , "LeadOpotunitiesLostReasons option  is not displayed");

    }




