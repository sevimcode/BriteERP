package POMtests.CRM_Module_Tests.Pipeline_pipeline_Test;

import POMpages.CRM_Module_Pages.Pipeline_Pipeline.PipelinePages;
import Utilities.CRMUtils;
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

}
