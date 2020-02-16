package POMpages.CRM_Module_Pages.CRM_Module_Landing_Page;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMmoduleLandingPage{


    public CRMmoduleLandingPage(){

        PageFactory.initElements (Driver.getDriver (), this);
    }


    @FindBy (xpath ="a[data-menu='274']")
    public WebElement PipelinePipeline;

    @FindBy (xpath ="a[data-menu='536']")
    public WebElement PipelineQuotations;

    @FindBy(xpath ="a[data-menu='279']")
    public WebElement CustomerPipeline;

    @FindBy (xpath ="a[data-menu='278']")
    public WebElement CustomerActivities;

    @FindBy (xpath ="a[data-menu='269']")
    public WebElement CustomerSaleChannels;

    @FindBy (xpath ="a[data-menu='267']")
    public WebElement ConfigSaleChannels;

    @FindBy (xpath ="a[data-menu='268']")
    public WebElement ConfigActivitytypes;

    @FindBy (xpath ="a[data-menu='263']")
    public WebElement LeadOportunities;

    @FindBy (xpath ="a[data-menu='275']")
    public WebElement LeadOpotunitiesLeadTags;

    @FindBy (xpath ="a[data-menu='276']")
    public WebElement LeadOpotunitiesLostReasons;
}
