package Pages.CRM_Module_Pages.Pipeline_Quatotions;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PipelineQuotationsPage {
    public PipelineQuotationsPage () {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//a[@data-menu-xmlid='sale_crm.sale_order_menu_quotations_crm']")
    public WebElement quotationsButton;
    @FindBy(css = "o_searchview_input")
    public WebElement searchButton;
    @FindBy(css = "button[class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;
    @FindBy(css = "button[class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;
    @FindBy(css = "button[class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;
}