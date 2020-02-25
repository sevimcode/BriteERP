package Pages.CRM_Module_Pages.Config_Leads_Oportunities_LostReasons;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyingLostReasonsPage{
        public VerifyingLostReasonsPage(){
                PageFactory.initElements(Driver.getDriver(), this);
        }
        //VerifyingLostReasonsPage verifyingLostReasonsPage = new VerifyingLostReasonsPage();
//        @FindBy(xpath = "(//span[@class='oe_menu_text'])[5]")
//        public WebElement CRMBtn;
        @FindBy(className="o_searchview_input")
        public WebElement searchInput;
        @FindBy (xpath = "//span [@title='Advanced Search...']")
        public WebElement advancedSearch;
        @FindBy (xpath = "//div[@class='btn-group o_search_options']")
        public WebElement buttonsLine;
        @FindBy (xpath = "(//button [@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
        public WebElement filtersBtn;
        @FindBy (xpath = "//*[text()='Include archived']")
        public WebElement filtersDropdown1;
        @FindBy (xpath = "//*[text()='Add Custom Filter']")
        public WebElement filtersDropdown2;
        @FindBy (xpath = "//div [@class='btn-group hidden-xs o_dropdown']")
        public WebElement groupByBtn;
        @FindBy (xpath = "//*[text()='Add custom group']")
        public WebElement groupByDropdown;
        @FindBy (xpath = "(//div [@class='btn-group o_dropdown'])[4]")
        public WebElement favoritesBtn;
        @FindBy (xpath = "//* [text()='Save current search']")
        public WebElement favoritesDropdown1;
        @FindBy (xpath = "//* [text()='Add to my Dashboard']")
        public WebElement favoritesDropdown2;
        @FindBy (xpath = "(//input [@type='checkbox'])[3]")
        public WebElement nameCheckbox;
        @FindBy (xpath = "(//div[@class='btn-group o_dropdown'])[2]")
        public WebElement actionBtn;
        @FindBy (xpath = "(//ul[@class='dropdown-menu'])[4]")
        public WebElement actionDropdownMenu;
        @FindBy (xpath = " //a[contains(text(),'Export')]")
        public WebElement actionExportBtn;
        @FindBy (xpath = " //a[contains(text(),'Archive')]")
        public WebElement actionArchiveBtn;
        @FindBy (xpath = " //a[contains(text(),'Unarchive')]")
        public WebElement actionUnarchiveBtn;
        @FindBy (xpath = " //a[contains(text(),'Delete')]")
        public WebElement actionDeleteBtn;
        @FindBy (xpath = "//button[@class='btn btn-sm btn-default']")
        public WebElement nextWindowCloseBtn;
        @FindBy (xpath = "//p[@class='oe_view_nocontent_create']")
        public WebElement messageOnNewPage;
        @FindBy (xpath = "//*[text()='Ok']")
        public WebElement okBtn;
        @FindBy (xpath = "//button[@class ='btn btn-primary btn-sm o_list_button_add']")
        public WebElement createBtn;
        @FindBy (xpath = "//input[@id='o_field_input_127']")
        public WebElement activeCheckBox;
        @FindBy (xpath = "//input[@class = 'o_field_char o_field_widget o_input o_required_modifier']")
        public WebElement nameLine;
        @FindBy (xpath = "//button[@class = 'btn btn-primary btn-sm o_form_button_save']")
        public WebElement saveBtn;
        @FindBy (xpath = "//button[@class = 'btn btn-default btn-sm o_form_button_cancel']")
        public WebElement discardBtn;
        @FindBy (xpath = "//button[@class = 'btn btn-sm btn-primary']")
        public WebElement okBtn1;
}


