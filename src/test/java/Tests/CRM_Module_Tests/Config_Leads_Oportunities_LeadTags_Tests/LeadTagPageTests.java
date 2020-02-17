package Tests.CRM_Module_Tests.Config_Leads_Oportunities_LeadTags_Tests;

import Pages.CRM_Module_Pages.CRM_Module_Landing_Page.CRMmoduleLandingPage;
import Pages.CRM_Module_Pages.Config_Leads_Oportunities_LeadTags.LeadTagPage;
import Pages.Home_Page.HomePage;
import Tests.Login_Page_Tests.LoginPageTests;
import Utilities.Driver;
import Utilities.SeleniumUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LeadTagPageTests{


    LoginPageTests loginPageTests = new LoginPageTests ();
    HomePage homePage = new HomePage ();
    CRMmoduleLandingPage crMmoduleLandingPage = new CRMmoduleLandingPage ();
    LeadTagPage leadTagPage = new LeadTagPage ();

    @BeforeClass
    public void setup() {

        loginPageTests.LoginManager7 ();
        WebDriverWait wait = new WebDriverWait (Driver.getDriver () , 30);
        wait.until (ExpectedConditions.visibilityOf (homePage.CRMmodule));
        homePage.CRMmodule.click ();
        crMmoduleLandingPage.LeadOportunities.click ();
        crMmoduleLandingPage.LeadOpotunitiesLeadTags.click ();
    }
    @Test
    public void LeadTagPage(){
        Assert.assertEquals (Driver.getDriver ().getTitle (),"Odoo");

    }

    @Test
    public void verifyingButtons() {

        Assert.assertTrue (leadTagPage.createButton.isDisplayed (),"create button is not displayed");
        Assert.assertTrue (leadTagPage.importButton.isDisplayed (), "import button isnot displayed");
        Assert.assertTrue (leadTagPage.searchBox.isDisplayed (), "search box is not displayed");
        Assert.assertTrue (leadTagPage.advanceSearchButton.isDisplayed (),"advance search button is not displayed");


    }

    @Test
    public void verifyingDropdownAdvanceSearch() {
        WebDriverWait wait = new WebDriverWait (Driver.getDriver () , 30);
        wait.until (ExpectedConditions.visibilityOf (leadTagPage.createButton));
        leadTagPage.advanceSearchButton.click ();
      //  Assert.assertTrue (leadTagPage.filterDropDown.isDisplayed (), "filter drop down is not displayed");
    }
    @Test (priority = 6)
    public void verifySerchBoxFuntionality() {

        WebDriverWait wait = new WebDriverWait (Driver.getDriver () , 30);
        wait.until (ExpectedConditions.visibilityOf (leadTagPage.createButton));
        leadTagPage.searchBox.sendKeys ("Product" + Keys.ENTER);
        SeleniumUtils.pause (3);
        Assert.assertTrue (leadTagPage.searchDisplay.isDisplayed (),"search result is not displayed");

    }

}