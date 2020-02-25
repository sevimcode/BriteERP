package Pages.Home_Page;

import Pages.Login_Page.LoginPage;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends LoginPage{


    public HomePage() {

        PageFactory.initElements (Driver.getDriver (), this);
    }

    @FindBy(xpath = "//ul/li[5]")
    public WebElement CRMmodule;

       @FindBy (xpath ="//*[.='EventsCRM_Manager7']")
    public WebElement displayedUser;

    @FindBy (xpath ="//button")
    public WebElement toggleButton;




}





