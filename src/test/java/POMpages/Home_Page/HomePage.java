package POMpages.Home_Page;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{

    public HomePage(){

        PageFactory.initElements (Driver.getDriver (), this);
    }




    @FindBy(xpath = "(//span[@class='oe_menu_text'])[5]")
    public WebElement CRMmodule;



}





