package POMpages.Login_Page;

import Utilities.Config;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    public LoginPage(){

        PageFactory.initElements (Driver.getDriver (), this);
    }

    //   http://app.briteerp.com/web/login#view_type=kanban&model=crm.lead&action=366

    LoginPage loginPage = new LoginPage ();

    @FindBy(name = "login")
    public WebElement usernameInput;

    @FindBy (name = "password")
    public WebElement passwordInput;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy (xpath = "//p[contains(text(),'Wrong login/password' )]")

    public WebElement errorMessage;
    public void login (){

        Driver.getDriver ().get (Config.getProperty ("briteERPUrl"));
        loginPage.usernameInput.sendKeys (Config.getProperty ("username"));
        loginPage.passwordInput.sendKeys (Config.getProperty ("password"));
        loginPage.loginButton.click ();

    }

}


