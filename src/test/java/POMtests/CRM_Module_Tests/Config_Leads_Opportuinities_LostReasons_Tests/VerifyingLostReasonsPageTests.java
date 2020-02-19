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
                CRMUtils.login();
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
                CRMUtils.login();
                Driver.getDriver().get(Config.getProperty("lostReasonsUrl"));
                verifyingLostReasonsPage.createBtn.click();
                Assert.assertTrue(verifyingLostReasonsPage.activeCheckBox.isSelected());
                verifyingLostReasonsPage.nameLine.sendKeys("Too expensive");
                verifyingLostReasonsPage.discardBtn.click();
                Driver.getDriver().getWindowHandle();
                verifyingLostReasonsPage.okBtn1.click();
        }
    }
