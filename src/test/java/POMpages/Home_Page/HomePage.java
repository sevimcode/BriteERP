package POMpages.Home_Page;

import Utilities.Config;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{


    public HomePage(){

        PageFactory.initElements (Driver.getDriver (), this);
    }



    @FindBy(css = "a[data-menu='261']")
    public WebElement CRMmodule;

    @FindBy (xpath ="//span[contains(text(),'EventsCRM_Manager7')])")
    public WebElement displayedUser;


}





