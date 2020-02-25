package Tests.CRM_Module_Tests.Pipeline_Quotations_Tests;

import Pages.CRM_Module_Pages.CRM_Module_Landing_Page.CRMmoduleLandingPage;
import Pages.CRM_Module_Pages.Config_Leads_Oportunities_LeadTags.LeadTagPage;
import Pages.CRM_Module_Pages.Pipeline_Quatotions.PipelineQuotationsPage;
import Pages.Home_Page.HomePage;
import Tests.Login_Page_Tests.LoginPageTests;
import Utilities.Driver;
import Utilities.SeleniumUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PipelineQuotationsTests{

    LoginPageTests loginPageTests = new LoginPageTests ();
    HomePage homePage = new HomePage ();
    CRMmoduleLandingPage crMmoduleLandingPage = new CRMmoduleLandingPage ();
    PipelineQuotationsPage pipelineQuotationsPage = new PipelineQuotationsPage ();

    @BeforeClass(groups = {"smoke"})
    public void setup() {

        loginPageTests.loginManager7 ();
        WebDriverWait wait = new WebDriverWait (Driver.getDriver () , 30);
        wait.until (ExpectedConditions.visibilityOf (homePage.CRMmodule));
        homePage.CRMmodule.click ();
        crMmoduleLandingPage.PipelineQuotations.click ();

    }
    @Test(groups = {"smoke"})
    public void pipelineQuotationsPageTitle(){
        SeleniumUtils.pause (5);
        System.out.println (Driver.getDriver ().getTitle ());
        Assert.assertEquals (Driver.getDriver ().getTitle (),"Quotations - Odoo");

    }
}
