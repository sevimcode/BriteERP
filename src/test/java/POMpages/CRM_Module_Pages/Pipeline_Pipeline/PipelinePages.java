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


    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createButton;



    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement opportunityTitleInputBox;


    @FindBy(xpath = "//button[@name='close_dialog']")
    public WebElement createButtonWindowPage;

    @FindBy (xpath = "(//div[@class='oe_kanban_color_0 oe_kanban_global_click o_kanban_record ui-sortable-handle'])[4]")
    public WebElement createdDeal;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    @FindBy(xpath = "//span[.='New']")
    public WebElement newColomn;

    @FindBy(xpath = "//span[.='Qualified']")
    public WebElement qualifiedColomn;
    @FindBy(xpath = "//span[.='Approved']")
    public WebElement approvedColomn;
    @FindBy(xpath = "//span[.='Proposition']")
    public WebElement propositionColomn;
    @FindBy(xpath = "//span[.='Pending']")
    public WebElement pendingColomn;

    @FindBy (xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='oe_kanban_content']")
    public WebElement serchBoxResult;

    @FindBy (xpath = "//div[@class='o_facet_values']")
    public WebElement pipelineFilter;
    @FindBy(xpath = "//div[@class='fa fa-sm fa-remove o_facet_remove']")
    public WebElement mypipelineClosingButton;
}
