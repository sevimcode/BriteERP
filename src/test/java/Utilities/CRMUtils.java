package Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class CRMUtils{

    private static String usernameLocator = "login";
    private static String passwordLocator = "password";


    public static void login (){

        Driver.getDriver ().findElement (By.name (usernameLocator)).sendKeys (Config.getProperty ("username"));

        Driver.getDriver ().findElement (By.name (passwordLocator)).sendKeys (Config.getProperty ("password") + Keys.ENTER);

    }

    public static void navigateToModule(){

        String module = "(//span[contains(text(), '" + Config.getProperty ("moduleName") + "')])[1]";
        Driver.getDriver().findElement(By.xpath(module)).click();

    }
}




