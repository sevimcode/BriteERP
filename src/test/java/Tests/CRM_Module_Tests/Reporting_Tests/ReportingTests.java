package Tests.CRM_Module_Tests.Reporting_Tests;

import Pages.CRM_Module_Pages.CRM_Module_Landing_Page.CRMmoduleLandingPage;
import Pages.CRM_Module_Pages.Reports.Reporting;
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
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class ReportingTests {


    Reporting reporting = new Reporting();
    HomePage homePage = new HomePage ();
    CRMmoduleLandingPage crmmoduleLandingPage = new CRMmoduleLandingPage ();
    LoginPageTests loginPageTests = new LoginPageTests ();

    @BeforeClass(groups = {"smoke"})
    public void setup(){
        loginPageTests.loginManager7 ();
        WebDriverWait wait = new WebDriverWait (Driver.getDriver () , 30);
        wait.until (ExpectedConditions.visibilityOf (homePage.CRMmodule));
        homePage.CRMmodule.click ();
        SeleniumUtils.pause (4);


    }
    @Test(groups = {"smoke"})
    public void reportPipelineTitle(){
        crmmoduleLandingPage.reportingPipeline.click ();
        SeleniumUtils.pause (4);
        Assert.assertEquals (Driver.getDriver ().getTitle (),"Pipeline Analysis - Odoo");

    }
    @Test(groups = {"smoke"})
    public void reportActivitesTitle(){

        crmmoduleLandingPage.reportingActivities.click ();
        SeleniumUtils.pause (5);
        Assert.assertEquals (Driver.getDriver ().getTitle (),"Activities Analysis - Odoo");

    }
    @Test(groups = {"smoke"})
    public void reportSaleChannelsTitle(){

        crmmoduleLandingPage.reportingSaleChannels.click ();
        SeleniumUtils.pause (4);
        Assert.assertEquals (Driver.getDriver ().getTitle (),"Sales Channels - Odoo");

    }



    @Test(groups = {"smoke"})
    public void reportingPipelineMeasuresListOption_IsMatched(){
        SeleniumUtils.pause (3);
        crmmoduleLandingPage.reportingPipeline.click();
        reporting.buttonMeasures.click();

       List<String> expectedListOfPipelineMeasures = new ArrayList<>();
        expectedListOfPipelineMeasures.add("Probable Turnover");
        expectedListOfPipelineMeasures.add("Delay to Assign");
        expectedListOfPipelineMeasures.add("Delay to Close");
        expectedListOfPipelineMeasures.add("Overpassed Deadline");
        expectedListOfPipelineMeasures.add("# of Activities");
        expectedListOfPipelineMeasures.add("Probability");
        expectedListOfPipelineMeasures.add("Total Revenue");
        expectedListOfPipelineMeasures.add("");
        expectedListOfPipelineMeasures.add("Count");

       for(int i = 0; i < expectedListOfPipelineMeasures.size(); i++) {
           Assert.assertTrue(reporting.listOfMeasures.get(i).getText().contains(expectedListOfPipelineMeasures.get(i)));
       }
    }

    @Test
    public void reportingPipeline_IsReportDownloadedButton() throws InterruptedException {
      crmmoduleLandingPage.reportingPipeline.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(reporting.pivotButton));
        reporting.pivotButton.click();
        reporting.downloadButton.click();
        Thread.sleep(3000);
        String pathToDownloadedFile = "/Users/sevim/Downloads";
        String expectedDownloadedFileName = "table.xls";
        Assert.assertTrue(Reporting.isFileDownloaded(pathToDownloadedFile,expectedDownloadedFileName));

    }



}
