package POMpages.CRM_Module_Pages.Pipeline_Pipeline;

import Utilities.CRMUtils;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PipelinePages {
    public PipelinePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

 @FindBy (xpath = "//span[@class='oe_topbar_name']")
    public WebElement userNameOnPage;


}
