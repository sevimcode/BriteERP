package Tests.CRM_Module_Tests.Pipeline_pipeline_Test;

import Pages.CRM_Module_Pages.CRM_Module_Landing_Page.CRMmoduleLandingPage;
import Pages.CRM_Module_Pages.Pipeline_Pipeline.PipelinePages;
import Utilities.Config;
import Utilities.Driver;
import Utilities.SeleniumUtils;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pipeline_Pipeline_Test{

    CRMmoduleLandingPage crMmoduleLandingPage = new CRMmoduleLandingPage ();
    PipelinePages pipelinePages =new PipelinePages();



    @BeforeMethod
    public void setUp() {
        Driver.getDriver ().get (Config.getProperty ("briteERPUrl"));
    }


    @Test (priority = 1)
    public void  nameIsDisplayedVerification(){
      SeleniumUtils.pause (4);
      Assert.assertTrue(pipelinePages.userNameOnPage.isDisplayed());

  }


  @Test (priority = 2)
    public void verifyCreateButtonIsDisplayed(){
      SeleniumUtils.pause (4);
      Assert.assertTrue(pipelinePages.createButton.isDisplayed());

  }

  @Test (priority = 3)
    public void createButtonFuntionality(){
      SeleniumUtils.pause (4);
      pipelinePages.createButton.click();

      pipelinePages.opportunityTitleInputBox.sendKeys("abc");
      pipelinePages.createButtonWindowPage.click();
      Assert.assertTrue(pipelinePages.createdDeal.isDisplayed());


  }

    @Test (priority = 3)
    public void importButtonVerification(){
        SeleniumUtils.pause (4);
      Assert.assertTrue(pipelinePages.importButton.isDisplayed());

  }


    @Test (priority = 4)
    public void verifyColomsAreDisplayed(){

      Assert.assertTrue(pipelinePages.newColomn.isDisplayed());
    Assert.assertTrue(pipelinePages.approvedColomn.isDisplayed());
    Assert.assertTrue(pipelinePages.pendingColomn.isDisplayed());
    Assert.assertTrue(pipelinePages.qualifiedColomn.isDisplayed());
    Assert.assertTrue(pipelinePages.propositionColomn.isDisplayed());


}


@Test (priority = 5)
    public void  serchBoxVerification(){

      Assert.assertTrue(pipelinePages.searchBox.isDisplayed());

}


@Test (priority = 6)
    public void verifySerchBoxFuntionality(){

      pipelinePages.searchBox.sendKeys("abc"+ Keys.ENTER);

      Assert.assertTrue(pipelinePages.serchBoxResult.isDisplayed());



}
@Test (priority = 7)
    public void myPipelineFilterVerification(){

  Assert.assertTrue(pipelinePages.pipelineFilter.isDisplayed());

}


}
