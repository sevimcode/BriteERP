package Tests.CRM_Module_Tests.CRM_Module_Landing_Page_Tests;

import Pages.CRM_Module_Pages.CRM_Module_Landing_Page.CRMmoduleLandingPage;
import Pages.Home_Page.HomePage;
import Tests.Login_Page_Tests.LoginPageTests;
import Utilities.Config;
import Utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRMmoduleLandingPageTests{

    LoginPageTests loginPageTests = new LoginPageTests ();
    HomePage homePage = new HomePage ();
    CRMmoduleLandingPage crMmoduleLandingPage = new CRMmoduleLandingPage ();

    @BeforeClass
    public void setup(){ loginPageTests.LoginManager7 ();
        WebDriverWait wait = new WebDriverWait (Driver.getDriver (), 30);
        wait.until (ExpectedConditions.visibilityOf (homePage.CRMmodule));
        homePage.CRMmodule.click ();
    }

    @Test (priority = 1)
    public void CRM_Pipeline_Pipeline_Verification(){
        Assert.assertTrue (crMmoduleLandingPage.PipelinePipeline.isDisplayed (),"Pipeline-Pipeline option is not displayed");

    }

    @Test  (priority = 2)
    public void CRM_Pipeline_Quotations_Verification(){
        Assert.assertTrue (crMmoduleLandingPage.PipelineQuotations.isDisplayed (),"Pipeline-Quotations option  is not displayed");

    }
    @Test  (priority = 3)
    public void CRM_Customer_Pipeline_Verification(){
        Assert.assertTrue (crMmoduleLandingPage.CustomerPipeline.isDisplayed (),"Customer-Pipeline option  is not displayed");

    }
    @Test  (priority = 4)
    public void CRM_Customer_Activities_Verification(){
        Assert.assertTrue (crMmoduleLandingPage.CustomerPipeline.isDisplayed (),"CustomerPipeline option  is not displayed");

    }
    @Test  (priority = 5)
    public void CRM_Customer_SaleChannels_Verification(){
        Assert.assertTrue (crMmoduleLandingPage.CustomerSaleChannels.isDisplayed (),"CustomerSaleChannels option  is not displayed");

    }

    @Test  (priority = 6)
    public void CRM_Config_SaleChannels_Verification(){
        Assert.assertTrue (crMmoduleLandingPage.ConfigSaleChannels.isDisplayed (),"ConfigSaleChannels option  is not displayed");

    }

    @Test  (priority = 7)
    public void CRM_Config_ActivityTypes_Verification(){
        Assert.assertTrue (crMmoduleLandingPage.ConfigActivitytypes.isDisplayed (),"ConfigActivitytypes option  is not displayed");

    }

    @Test  (priority = 8)
    public void CRM_LeadsOportunities_Verification(){
        Assert.assertTrue (crMmoduleLandingPage.LeadOportunities.isDisplayed (),"LeadOportunities option  is not displayed");

    }

    @Test  (priority = 9)
    public void CRM_LeadTags_Verification() {

        crMmoduleLandingPage.LeadOportunities.click ();
        Assert.assertTrue (crMmoduleLandingPage.LeadOpotunitiesLeadTags.isDisplayed () , "LeadOpotunitiesLeadTags option  is not displayed");

    }

    @Test  (priority = 10)
    public void CRM_LostReasons_Verification() {

        crMmoduleLandingPage.LeadOportunities.click ();
        Assert.assertFalse (crMmoduleLandingPage.LeadOpotunitiesLostReasons.isDisplayed () , "LeadOpotunitiesLostReasons option  is not displayed");

    }








    }
