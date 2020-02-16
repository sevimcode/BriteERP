package POMtests.CRM_Module_Tests.Config_Leads_Opportuinities_LostReasons_Tests;

import POMpages.CRM_Module_Pages.Config_Leads_Oportunities_LostReasons.VerifyingLostReasonsPage;
import Utilities.CRMUtils;
import Utilities.Config;
import Utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class VerifyingLostReasonsPageTests {

        VerifyingLostReasonsPage verifyingLostReasonsPage = new VerifyingLostReasonsPage();

        @Test
        public void usingSearchButtonOnLostReasonsPage (){
        CRMUtils.login();
        Driver.getDriver().get(Config.getProperty("lostReasonsUrl"));
        verifyingLostReasonsPage.searchInput.sendKeys(Config.getProperty("lostReasonName") + Keys.ENTER);
        verifyingLostReasonsPage.advancedSearch.click();

        Assert.assertTrue(verifyingLostReasonsPage.filtersBtn.isDisplayed()&&verifyingLostReasonsPage.groupByBtn.isDisplayed()&&verifyingLostReasonsPage.favoritesBtn.isDisplayed(),"Buttons aren't displayed on LostReasons page");

                verifyingLostReasonsPage.filtersBtn.click();
                Assert.assertTrue (verifyingLostReasonsPage.filtersDropdown.getText().contains(Config.getProperty("lostReasonsFilterDropdown1")));
                Assert.assertTrue (verifyingLostReasonsPage.filtersDropdown.getText().contains(Config.getProperty("lostReasonsFilterDropdown2")));
                verifyingLostReasonsPage.filtersBtn.click();

                verifyingLostReasonsPage.groupByBtn.click();
                Assert.assertTrue (verifyingLostReasonsPage.groupByDropdown.getText().contains(Config.getProperty("lostReasonsGroupByDropdown")));
                verifyingLostReasonsPage.groupByBtn.click();

                verifyingLostReasonsPage.favoritesBtn.click();
                Assert.assertTrue (verifyingLostReasonsPage.favoritesDropdown.getText().contains(Config.getProperty("lostReasonsFavoritesDropdown1")));
                Assert.assertTrue (verifyingLostReasonsPage.filtersDropdown.getText().contains(Config.getProperty("lostReasonsFavoritesDropdown2")));
                verifyingLostReasonsPage.favoritesBtn.click();
        }
    }
