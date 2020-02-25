package Tests.CRM_Module_Tests.Config_Leads_Oporunities_LostReasons_Tests;

import Pages.CRM_Module_Pages.CRM_Module_Landing_Page.CRMmoduleLandingPage;
import Pages.CRM_Module_Pages.Config_Leads_Oportunities_LostReasons.VerifyingLostReasonsPage;
import Pages.Home_Page.HomePage;
import Tests.Login_Page_Tests.LoginPageTests;
import Utilities.Config;
import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyingLostReasonsPageTests{

    LoginPageTests loginPageTests = new LoginPageTests ();
    HomePage homePage = new HomePage ();
    CRMmoduleLandingPage crMmoduleLandingPage = new CRMmoduleLandingPage ();
    VerifyingLostReasonsPage verifyingLostReasonsPage = new VerifyingLostReasonsPage ();


    @BeforeClass(groups = {"smoke"})
    public void setup() {

        loginPageTests.loginManager7 ();
        WebDriverWait wait = new WebDriverWait (Driver.getDriver () , 30);
        wait.until (ExpectedConditions.visibilityOf (homePage.CRMmodule));
        homePage.CRMmodule.click ();
        crMmoduleLandingPage.LeadOportunities.click ();
        WebDriver driver1= Driver.getDriver ();
        JavascriptExecutor js = (JavascriptExecutor) driver1;
        js.executeScript("arguments[0].scrollIntoView();",crMmoduleLandingPage.LeadOpotunitiesLostReasons );
        crMmoduleLandingPage.LeadOpotunitiesLostReasons.click ();
    }

    @Test
    public void LostReasonPageTitle(){
        System.out.println (Driver.getDriver ().getTitle ());
        Assert.assertEquals (Driver.getDriver ().getTitle (),"Odoo");

    }
    @Test
    public void usingSearchButtonOnLostReasonsPage (){

        Driver.getDriver().get(Config.getProperty("lostReasonsUrl"));
        verifyingLostReasonsPage.searchInput.sendKeys(Config.getProperty("lostReasonName") + Keys.ENTER);
        verifyingLostReasonsPage.advancedSearch.click();
        Assert.assertTrue(verifyingLostReasonsPage.buttonsLine.isDisplayed(),"Buttons aren't displayed on LostReasons page");
        verifyingLostReasonsPage.filtersBtn.click();
        Assert.assertTrue (verifyingLostReasonsPage.filtersDropdown1.getText().contains(Config.getProperty("lostReasonsFilterDropdown1")));
        Assert.assertTrue (verifyingLostReasonsPage.filtersDropdown2.getText().contains(Config.getProperty("lostReasonsFilterDropdown2")));
        verifyingLostReasonsPage.groupByBtn.click();
        Assert.assertTrue (verifyingLostReasonsPage.groupByDropdown.getText().contains(Config.getProperty("lostReasonsGroupByDropdown")));
        verifyingLostReasonsPage.favoritesBtn.click();
        Assert.assertTrue (verifyingLostReasonsPage.favoritesDropdown1.getText().contains(Config.getProperty("lostReasonsFavoritesDropdown1")));
        Assert.assertTrue (verifyingLostReasonsPage.favoritesDropdown2.getText().contains(Config.getProperty("lostReasonsFavoritesDropdown2")));
    }
    @Test
    public void verifyingNameCheckboxes () {

        Driver.getDriver().get(Config.getProperty("lostReasonsUrl"));
        verifyingLostReasonsPage.nameCheckbox.click();
        verifyingLostReasonsPage.actionBtn.click();
        //Assert.assertTrue(verifyingLostReasonsPage.actionDropdownMenu.getText().contains(Config.getProperty("lostReasonsActionDropdown1"))&&verifyingLostReasonsPage.actionDropdownMenu.getText().contains(Config.getProperty("lostReasonsActionDropdown2"))&&verifyingLostReasonsPage.actionDropdownMenu.getText().contains("lostReasonsActionDropdown3")&&verifyingLostReasonsPage.actionDropdownMenu.getText().contains("lostReasonsActionDropdown4"));
        Assert.assertTrue(verifyingLostReasonsPage.actionDropdownMenu.getText().contains(Config.getProperty("lostReasonsActionDropdown1")));
        Assert.assertTrue(verifyingLostReasonsPage.actionDropdownMenu.getText().contains(Config.getProperty("lostReasonsActionDropdown2")));
        Assert.assertTrue(verifyingLostReasonsPage.actionDropdownMenu.getText().contains(Config.getProperty("lostReasonsActionDropdown3")));
        Assert.assertTrue(verifyingLostReasonsPage.actionDropdownMenu.getText().contains(Config.getProperty("lostReasonsActionDropdown4")));
        verifyingLostReasonsPage.actionExportBtn.click();
        Driver.getDriver().getWindowHandle();
        verifyingLostReasonsPage.nextWindowCloseBtn.click();
        Driver.getDriver().switchTo().parentFrame();
        verifyingLostReasonsPage.actionBtn.click();
        verifyingLostReasonsPage.actionArchiveBtn.click();
        Assert.assertTrue(verifyingLostReasonsPage.messageOnNewPage.getText().contains("lostReasonsNewPageMessage"));
//                verifyingLostReasonsPage.actionBtn.click();
//                verifyingLostReasonsPage.actionUnarchiveBtn.click();
//                Assert.assertTrue(verifyingLostReasonsPage.messageOnNewPage.getText().contains("lostReasonsNewPageMessage"));
//
//                verifyingLostReasonsPage.actionBtn.click();
//                verifyingLostReasonsPage.actionDeleteBtn.click();
//                verifyingLostReasonsPage.okBtn.click();
//                Assert.assertTrue(verifyingLostReasonsPage.messageOnNewPage.getText().contains("lostReasonsNewPageMessage"));
    }
    @Test
    public void verifyingCreateAndImportBtn () {

        Driver.getDriver().get(Config.getProperty("lostReasonsUrl"));
        verifyingLostReasonsPage.createBtn.click();
        Assert.assertTrue(verifyingLostReasonsPage.activeCheckBox.isSelected());
        verifyingLostReasonsPage.nameLine.sendKeys("Too expensive");
        verifyingLostReasonsPage.discardBtn.click();
        Driver.getDriver().getWindowHandle();
        verifyingLostReasonsPage.okBtn1.click();
    }
}

