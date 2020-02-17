package Pages.CRM_Module_Pages.Config_Leads_Oportunities_LostReasons;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyingLostReasonsPage{

        public VerifyingLostReasonsPage()
        {
            PageFactory.initElements(Driver.getDriver(), this);
        }



        @FindBy(xpath = "(//span[@class='oe_menu_text'])[5]")
        public WebElement CRMBtn;

        @FindBy(className="o_searchview_input")
        public WebElement searchInput;

        @FindBy (xpath = "//span [@title='Advanced Search...']")
        public WebElement advancedSearch;

        @FindBy (xpath = "(//button [@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
        public WebElement filtersBtn;



    }


