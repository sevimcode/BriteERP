package POMpages.CRM_Module_Pages.Config_Leads_Oportunities_LostReasons;

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

        @FindBy (xpath = "(//button [@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
        public WebElement filtersBtn;

        @FindBy (xpath = "//ul [@class='dropdown-menu o_filters_menu']")
        public WebElement filtersDropdown;

        @FindBy (xpath = "(//button [@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[4]")
        public WebElement groupByBtn;

        @FindBy (xpath = "(//a[@href='#'])[16]")
        public WebElement groupByDropdown;

        @FindBy (xpath = "(//button [@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[5]")
        public WebElement favoritesBtn;

        @FindBy (xpath = "//ul [@class='dropdown-menu o_favorites_menu']")
        public WebElement favoritesDropdown;
    }