package POMpages.CRM_Module_Pages.config_Sales_channel_Page;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaveFields {
    public SaveFields(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
    public WebElement save;

    @FindBy(xpath = "//input[@placeholder=\"Salesteam name...\"]")
    public WebElement salesTeamName;

    @FindBy(id = "o_field_input_10")
    public WebElement quotations;

    @FindBy(id = "o_field_input_11")
    public WebElement pipelines;

    @FindBy(id = "o_field_input_14")
    public WebElement channelLeader;

    @FindBy(id = "o_field_input_15")
    public WebElement emailAlias;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement create;








}
