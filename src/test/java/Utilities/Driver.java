package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;


    public class Driver{
        private static WebDriver driver;

        private Driver(){ // private constructor can not instantiate again only once


        }
        public static WebDriver getDriver(){
            if (driver==null) {
                switch (Config.getProperty ("browser")) {

                    case "chrome":
                        WebDriverManager.chromedriver ().setup ();
                        driver = new ChromeDriver ();
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver ().setup ();
                        driver = new FirefoxDriver ();
                        break;

                    case "opera" :
                        WebDriverManager.operadriver ().setup ();
                        driver = new OperaDriver ();
                        break;

                    case "safari":
                        if(System.getProperty("os.name").toLowerCase().contains("windows")){
                            throw new WebDriverException ("Windows OS does not support safari");
                        }
                        WebDriverManager.getInstance(SafariDriver.class).setup();
                        driver = new SafariDriver();
                        break;
                }

                driver.manage ().window ().maximize ();
                driver.manage ().timeouts ().implicitlyWait (10 , TimeUnit.SECONDS);



            }
            return driver;
        }

    }


