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

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(css = "[data-placeholder='Name']")
    private WebElement name2;

    @FindBy(xpath = "(//span[text()='Stage'])[3]")
    private WebElement stage;






    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.CODE'])[2]//input")
    private WebElement code1;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]//div[2]")
    private WebElement textSelect;

    @FindBy(xpath = "//span[text()=' Logical ']")
    private WebElement logical;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME'])[2]//input")
    private WebElement shortname;

    @FindBy(xpath = "//input[@data-placeholder='Short Name']")
    private WebElement shortname2;



    @FindBy(xpath = "//span[contains(text(),'Add')]")
    private WebElement addButton;

    @FindBy(xpath = "//span[text()='Section']")
    private WebElement section;


    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.CODE'])[1]//input")
    private WebElement codeInput;

    @FindBy(xpath = "//span[text()='Active']")
    private WebElement activeButton;





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
    WebElement myElement2;

    public void findAndSend2(String strElement,String value) {
        switch (strElement) {
            case "nameInput":myElement2=nameInput;break;
            case "name2":myElement2=name2;break;

            case "code":myElement=code1;break;

            case "shortname2":myElement=shortname2;break;


            case "codeInput":myElement=codeInput;break;







        }
        sendKeysFunction(myElement2, value);
    }

    public void findAndClick2(String strElement){
        switch (strElement){

            case "addButton":myElement2=addButton;break;
            case "section":myElement2=section;break;









        }
        clickFunction(myElement);
    }

    public void veriftText2(String strElement,String text){
        switch (strElement){
            case "activeButton":myElement=activeButton;break;



        }
        verifyContainsText(myElement,text);
    }



}


