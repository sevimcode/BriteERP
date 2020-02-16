package POMtests.Config_Leads_Oportunities_LeadTags_Tests;

import POMpages.Home_Page.HomePage;
import Utilities.CRMUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Verifying_LeadTag_Page_Tests{

HomePage homePage = new HomePage ();
    @Test
    public void verifyingLeadTagPageTitle(){
        CRMUtils.login ();
        CRMUtils.navigateToModule ();
        homePage.LeadOportunities.click ();
        Select select = new Select (homePage.LeadOportunities);
        List <WebElement> options = select.getOptions ();
        for (WebElement element : options ){
            if (element.getText ().equals ("Lead Tags"))
                element.click (); }


    }






}
