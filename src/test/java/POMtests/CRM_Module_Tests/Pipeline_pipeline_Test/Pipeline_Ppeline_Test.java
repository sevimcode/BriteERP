package POMtests.CRM_Module_Tests.Pipeline_pipeline_Test;

import POMpages.CRM_Module_Pages.Pipeline_Pipeline.PipelinePages;
import Utilities.CRMUtils;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pipeline_Ppeline_Test {
    PipelinePages pipelinePages =new PipelinePages();

  @BeforeMethod
    public void login_Navigate_to_Crm()
  {

      CRMUtils.login();
      CRMUtils.navigateToModule();
  }

  @Test
    public void  nameIsDisplayedVerification(){

      Assert.assertTrue(pipelinePages.userNameOnPage.isDisplayed());
  }


  @Test
    public void verifyCreateButtonIsDisplayed(){

      Assert.assertTrue(pipelinePages.createButton.isDisplayed());
  }

  @Test
    public void createButtonFuntionality(){

      pipelinePages.createButton.click();

      pipelinePages.opportunityTitleInputBox.sendKeys("abc");
      pipelinePages.createButtonWindowPage.click();
      Assert.assertTrue(pipelinePages.createdDeal.isDisplayed());

  }

  @Test
    public void importButtonVerification(){
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
