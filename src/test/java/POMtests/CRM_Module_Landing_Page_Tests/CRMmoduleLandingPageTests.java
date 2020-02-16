package POMtests.CRM_Module_Landing_Page_Tests;

import POMpages.CRM_Module_Pages.CRM_Module_Landing_Page.CRMmoduleLandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CRMmoduleLandingPageTests{

   CRMmoduleLandingPage crMmoduleLandingPage = new CRMmoduleLandingPage ();

    @Test
    public void CRM_Pipeline_Pipeline_Verification(){
      Assert.assertTrue (crMmoduleLandingPage.PipelinePipeline.isDisplayed (),"Pipeline-Pipeline option is not displayed");

    }

    @Test
    public void CRM_Pipeline_Quotations_Verification(){
        Assert.assertTrue (crMmoduleLandingPage.PipelineQuotations.isDisplayed (),"Pipeline-Quotations option  is not displayed");

    }
    @Test
    public void CRM_Customer_Pipeline_Verification(){
        Assert.assertTrue (crMmoduleLandingPage.CustomerPipeline.isDisplayed (),"Customer-Pipeline option  is not displayed");

    }
    @Test
    public void CRM_Customer_Activities_Verification(){
        Assert.assertTrue (crMmoduleLandingPage.CustomerPipeline.isDisplayed (),"CustomerPipeline option  is not displayed");

    }
    @Test
    public void CRM_Customer_SaleChannels_Verification(){
        Assert.assertTrue (crMmoduleLandingPage.CustomerSaleChannels.isDisplayed (),"CustomerSaleChannels option  is not displayed");

    }

    @Test
    public void CRM_Config_SaleChannels_Verification(){
        Assert.assertTrue (crMmoduleLandingPage.ConfigSaleChannels.isDisplayed (),"ConfigSaleChannels option  is not displayed");

    }

    @Test
    public void CRM_Config_ActivityTypes_Verification(){
        Assert.assertTrue (crMmoduleLandingPage.ConfigActivitytypes.isDisplayed (),"ConfigActivitytypes option  is not displayed");

    }

    @Test
    public void CRM_LeadsOportunities_Verification(){
        Assert.assertTrue (crMmoduleLandingPage.LeadOportunities.isDisplayed (),"LeadOportunities option  is not displayed");

    }

    @Test
    public void CRM_LeadTags_Verification() {

        crMmoduleLandingPage.LeadOportunities.click ();
        Assert.assertTrue (crMmoduleLandingPage.LeadOpotunitiesLeadTags.isDisplayed () , "LeadOpotunitiesLeadTags option  is not displayed");

    }

    @Test
    public void CRM_LostReasons_Verification() {

        crMmoduleLandingPage.LeadOportunities.click ();
        Assert.assertTrue (crMmoduleLandingPage.LeadOpotunitiesLostReasons.isDisplayed () , "LeadOpotunitiesLostReasons option  is not displayed");

    }








    }
