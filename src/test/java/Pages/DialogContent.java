package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label=\"LOGIN\"]")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement Dashboard;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement AcceptCookies;

    @FindBy(xpath = "//button[@matbadgeposition='below']//fa-icon")
    private WebElement createButton;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement succesfully;

    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'NAME')])[1]//input")
    private WebElement nameinput;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    private WebElement searchbutton;

    @FindBy(xpath = "(//span[contains(@class,'mat-button-wrapper')])[12]//fa-icon")
    private WebElement editbutton;

    @FindBy(xpath = "(//span[contains(@class,'mat-button-wrapper')])[33]//fa-icon")
    private WebElement deletebuttonrow9;

    @FindBy(xpath = "(//span[contains(@class,'mat-button-wrapper')])[13]//fa-icon")
    private WebElement deletebutton;

    @FindBy(xpath = "//span[contains(text(),' Delete ')]")
    private WebElement deletebutton2;

    @FindBy(xpath = "//span[text()='Campus Project']")
    private WebElement schoolButton;



    @FindBy(xpath = "//div[text()=' Name ']")
    private WebElement nameVerify;



    WebElement myElement;

    public void findAndSend(String strElement,String value) {
        switch (strElement) {
            case "username":myElement=username;break;
            case "password":myElement=password;break;
            case "nameinput":myElement=nameinput;break;






        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "loginButton":myElement=loginButton;break;
            case "acceptCookies":myElement=AcceptCookies;break;
            case "createButton":myElement=createButton;break;
            case "saveButton":myElement=saveButton;break;
            case "searchbutton":myElement=searchbutton;break;
            case "editbutton":myElement=editbutton;break;
            case "deletebutton":myElement=deletebutton;break;
            case "deletebutton2":myElement=deletebutton2;break;
            case "schoolButton":myElement=schoolButton;break;

            case "deletebuttonrow9":myElement=deletebuttonrow9;break;

            



        }
        clickFunction(myElement);
    }



    public void verifyText(String strElement,String text){
        switch (strElement){
            case "Dashboard":myElement=Dashboard;break;
            case "succesfully":myElement=succesfully;break;
            case "nameVerify":myElement=nameVerify;break;



        }
        verifyContainsText(myElement,text);
    }

}
