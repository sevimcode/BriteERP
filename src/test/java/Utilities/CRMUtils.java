package Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class CRMUtils{

    private static String usernameLocator = "//input[@id='login']";
    private static String passwordLocator = "//input[@id='password']";


    public static void login (){
        Driver.getDriver().get (Config.getProperty("briteERPUrl"));
        Driver.getDriver ().findElement (By.xpath (usernameLocator)).sendKeys (Config.getProperty ("username"));
        Driver.getDriver ().findElement (By.xpath (passwordLocator)).sendKeys (Config.getProperty ("password") + Keys.ENTER);
        SeleniumUtils.pause (3);
    }

    public static void navigateToModule(){

        String module = "(//span[contains(text(), '" + Config.getProperty ("moduleName") + "')])[1]";
        Driver.getDriver().findElement(By.xpath(module)).click();

    }
}