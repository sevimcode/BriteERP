package Pages.CRM_Module_Pages.Reports;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Reporting {
    public Reporting(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@data-menu-xmlid='crm.crm_opportunity_report_menu']")
    public WebElement reportingPipeline;

    @FindBy (xpath = "//a[@data-menu-xmlid='crm.crm_activity_report_menu']")
    public WebElement reportingActivities;

    @FindBy (xpath = "//a[@data-menu-xmlid='crm.sales_team_menu_report_crm']")
    public WebElement reportingSaleChannels;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm dropdown-toggle']")
    public WebElement buttonMeasures;

    @FindBy (xpath = "//ul[@class='dropdown-menu o_graph_measures_list']/li")
    public List<WebElement> listOfMeasures;








}
