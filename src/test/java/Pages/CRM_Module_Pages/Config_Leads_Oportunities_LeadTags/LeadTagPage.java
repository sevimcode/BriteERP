package Pages.CRM_Module_Pages.Config_Leads_Oportunities_LeadTags;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadTagPage{

    public LeadTagPage(){
        PageFactory.initElements (Driver.getDriver (),this);
    }

    @FindBy( xpath ="//button[contains(text(),'Create')]")
    public WebElement createButton;

    @FindBy( xpath ="//button[contains(text(),'Import')]")
     public WebElement importButton;

    @FindBy( xpath =" //input[@placeholder='Search...']")
    public WebElement searchBox;

    @FindBy( xpath ="//span[@title='Advanced Search...']")
    public WebElement advanceSearchButton;

    @FindBy( xpath = "//button[@data-toggle='dropdown']")
    public WebElement filterDropDown;

    @FindBy (xpath = "//tbody/tr")
    public WebElement searchDisplay;

}
