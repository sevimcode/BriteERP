package POMpages.CRM_Module_Pages.Pipeline_Pipeline;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyingCreateButton{

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createButton;

}


