package Tests.CRM_Module_Tests.Pipeline_pipeline_Test;

import Pages.CRM_Module_Pages.CRM_Module_Landing_Page.CRMmoduleLandingPage;
import Pages.CRM_Module_Pages.Pipeline_Pipeline.PipelinePages;
import Pages.CRM_Module_Pages.Pipeline_Quatotions.PipelineQuotationsPage;
import Pages.Home_Page.HomePage;
import Tests.Login_Page_Tests.LoginPageTests;
import Utilities.Config;
import Utilities.Driver;
import Utilities.SeleniumUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pipeline_Pipeline_Test{


        LoginPageTests loginPageTests = new LoginPageTests ();
        HomePage homePage = new HomePage ();
        CRMmoduleLandingPage crMmoduleLandingPage = new CRMmoduleLandingPage ();
        PipelinePages pipelinePages = new PipelinePages ();

        @BeforeClass(groups = {"smoke"})
        public void setup() {

            loginPageTests.loginManager7 ();
            WebDriverWait wait = new WebDriverWait (Driver.getDriver () , 30);
            wait.until (ExpectedConditions.visibilityOf (homePage.CRMmodule));
            homePage.CRMmodule.click ();
            SeleniumUtils.pause (6);
            crMmoduleLandingPage.PipelinePipeline.click ();
            SeleniumUtils.pause (4);

        }
        @Test(groups = {"smoke"})
        public void pipelinePipelinePageTitle(){

            System.out.println (Driver.getDriver ().getTitle ());
            Assert.assertEquals (Driver.getDriver ().getTitle (),"Pipeline - Odoo");

        }


    @Test
    public void  nameIsDisplayedVerification(){

      SeleniumUtils.pause (4);
      Assert.assertTrue(pipelinePages.userNameOnPage.isDisplayed());

  }


  @Test
    public void verifyCreateButtonIsDisplayed(){
      SeleniumUtils.pause (4);
      Assert.assertTrue(pipelinePages.createButton.isDisplayed());

  }

  @Test
    public void createButtonFuntionality(){
      SeleniumUtils.pause (4);
      pipelinePages.createButton.click();
      pipelinePages.opportunityTitleInputBox.sendKeys("abc");
      pipelinePages.createButtonWindowPage.click();
      Assert.assertTrue(pipelinePages.createdDeal.isDisplayed());


  }

    @Test
    public void importButtonVerification(){
        SeleniumUtils.pause (4);
      Assert.assertTrue(pipelinePages.importButton.isDisplayed());

  }


    @Test
    public void verifyColomsAreDisplayed(){

            Assert.assertTrue(pipelinePages.newColomn.isDisplayed());
    Assert.assertTrue(pipelinePages.approvedColomn.isDisplayed());
    Assert.assertTrue(pipelinePages.pendingColomn.isDisplayed());
    Assert.assertTrue(pipelinePages.qualifiedColomn.isDisplayed());
    Assert.assertTrue(pipelinePages.propositionColomn.isDisplayed());


}


@Test
    public void  serchBoxVerification(){

      Assert.assertTrue(pipelinePages.searchBox.isDisplayed());

}


@Test
    public void verifySerchBoxFuntionality(){

      pipelinePages.searchBox.sendKeys("abc"+ Keys.ENTER);

      Assert.assertTrue(pipelinePages.serchBoxResult.isDisplayed());



}
@Test
    public void myPipelineFilterVerification(){

  Assert.assertTrue(pipelinePages.pipelineFilter.isDisplayed());

}


}
