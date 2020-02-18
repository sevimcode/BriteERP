package Pages.CRM_Module_Pages.Sale_Channel_Page;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesChannelPage{

    public SalesChannelPage(){

            PageFactory.initElements (Driver.getDriver () , this);
        }

        @FindBy(xpath = "//a[@href='/web#menu_id=267&action=242']")
        public WebElement salesChannel;

        @FindBy(xpath = "//button[@accesskey='c']")
        public WebElement create;


    }
