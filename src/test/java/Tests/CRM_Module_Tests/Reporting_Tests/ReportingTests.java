package Tests.CRM_Module_Tests.Reporting_Tests;

import Pages.CRM_Module_Pages.Reports.Reporting;
import Pages.Home_Page.HomePage;
import Pages.Login_Page.LoginPage;
import Tests.Login_Page_Tests.LoginPageTests;
import Utilities.Config;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.text.Utilities;
import java.util.ArrayList;
import java.util.List;

public class ReportingTests {

    LoginPage loginPage = new LoginPage();
    Reporting reporting = new Reporting();
    HomePage homePage = new HomePage ();

    @BeforeClass
    public void setup(){
        Driver.getDriver().get(Config.getProperty ("briteERPUrl"));
        Driver.getDriver ().get (Config.getProperty ("briteERPUrl"));
        WebDriverWait wait = new WebDriverWait (Driver.getDriver (), 30);
        wait.until (ExpectedConditions.visibilityOf (loginPage.usernameInput)).sendKeys (Config.getProperty ("username"));
        loginPage.passwordInput.sendKeys (Config.getProperty ("password"));
        loginPage.loginButton.click ();
        homePage.CRMmodule.click();
    }
    @Test(priority = 0)
    public void reportingPipelineIsDisplayed(){
        System.out.println(reporting.reportingPipeline.getText());
        Assert.assertTrue(reporting.reportingPipeline.isDisplayed(), "Reporting Pipeline is not displayed");
    }

    @Test(priority = 1)
    public void reportingActivitiesIsDisplayed(){
        System.out.println(reporting.reportingActivities.getText());
        Assert.assertTrue(reporting.reportingActivities.isDisplayed(), "Reporting Activities is not displayed");
    }

    @Test(priority = 2)
    public void reportingSalesChannelsIsDisplayed(){
        System.out.println(reporting.reportingSaleChannels.getText());
        Assert.assertTrue(reporting.reportingSaleChannels.isDisplayed(), "Reporting Sales Channels is not displayed");
    }

    @Test(priority = 3)
    public void reportingPipelineMeasuresListOption_IsMatched(){
        reporting.reportingPipeline.click();
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

    @Test(priority = 4)
    public void reportingPipeline_IsReportDownloadedButton() throws InterruptedException {
        reporting.reportingPipeline.click();

        
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(reporting.pivotButton));

        reporting.pivotButton.click();
        reporting.downloadButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(Reporting.isFileDownloaded("/Users/dmytrochernetskyi/Downloads","table.xls"));

    }



}
