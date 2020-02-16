package Pages.CRM_Module_Pages.CRM_Module_Landing_Page;

import Pages.Home_Page.HomePage;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMmoduleLandingPage extends HomePage{


    public CRMmoduleLandingPage(){

        PageFactory.initElements (Driver.getDriver (), this);
    }


    @FindBy (css ="a[data-menu='274']")
    public WebElement PipelinePipeline;

    @FindBy (css ="a[data-menu='536']")
    public WebElement PipelineQuotations;

    @FindBy(css ="a[data-menu='279']")
    public WebElement CustomerPipeline;

    @FindBy (css ="a[data-menu='278']")
    public WebElement CustomerActivities;

    @FindBy (css ="a[data-menu='269']")
    public WebElement CustomerSaleChannels;

    @FindBy (css ="a[data-menu='267']")
    public WebElement ConfigSaleChannels;

    @FindBy (css ="a[data-menu='268']")
    public WebElement ConfigActivitytypes;

    @FindBy (css ="a[data-menu='263']")
    public WebElement LeadOportunities;

    @FindBy (css ="a[data-menu='275']")
    public WebElement LeadOpotunitiesLeadTags;

    @FindBy (css ="a[data-menu='276']")
    public WebElement LeadOpotunitiesLostReasons;
}
