package Utilities;
import POMpages.Home_Page.HomePage;
import POMpages.Login_Page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class CRMUtils{


    private static String usernameLocator = "login";
    private static String passwordLocator = "password";


    public static void login (){
        Driver.getDriver ().get (Config.getProperty ("briteERPUrl"));
        SeleniumUtils.pause (2);

        Driver.getDriver ().findElement ( By.name (usernameLocator)).sendKeys ( Config.getProperty ("username"));
        SeleniumUtils.pause (2);
        Driver.getDriver ().findElement (By.name (passwordLocator)).sendKeys (Config.getProperty ("password") + Keys.ENTER);

    }

    public static void navigateToModule(){

        String module = "(//span[contains(text(), '" + Config.getProperty ("moduleName") + "')])[1]";
        SeleniumUtils.pause (4);
        Driver.getDriver().findElement(By.xpath(module)).click();

    }
}




