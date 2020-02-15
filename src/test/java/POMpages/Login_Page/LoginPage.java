package POMpages.Login_Page;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    public LoginPage(){

        PageFactory.initElements (Driver.getDriver (), this);
    }

    //   http://app.briteerp.com/web/login#view_type=kanban&model=crm.lead&action=366



    @FindBy(xpath = "//input[@id='login']")
    public WebElement usernameInput;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy (xpath = "//*[contains(text(),'Wrong login/password')]")
    public WebElement errorMessage;


}


