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

    @FindBy (xpath ="//button[@class ='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createButton;




//    public WebDriver driver;
//    public static String url = "https://saucelabs-sample-test-frameworks.github.io/training-test-page";
//
//    public static GuineaPigPage visitPage(WebDriver driver) {
//        GuineaPigPage page = new GuineaPigPage(driver);
//        page.visitPage();
//        return page;
//    }
//
//    public GuineaPigPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//
//    public void visitPage() {
//        this.driver.get(url);
//    }
//
//    public void followLink() {
//        theActiveLink.click();
//    }
//
//    public void submitComment(String text) {
//        commentsTextAreaInput.sendKeys(text);
//        submitButton.click();
//    }
//
//    public String getSubmittedCommentText() {
//        return yourCommentsSpan.getText();
//    }
//
//    public boolean isOnPage() {
//        String title = "I am a page title - Sauce Labs";
//        return driver.getTitle() == title;
//    }
//
//}
}





