package Pages;

import Utilities.GWD;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {
    public FormContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

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
            case "nameInput":myElement=nameInput;break;
            case "name2":myElement=name2;break;

            case "code":myElement=code1;break;

            case "shortname2":myElement=shortname2;break;


            case "codeInput":myElement=codeInput;break;







        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement){

            case "addButton":myElement=addButton;break;
            case "section":myElement=section;break;









        }
        clickFunction(myElement);
    }

    public void veriftText(String strElement,String text){
        switch (strElement){
            case "activeButton":myElement=activeButton;break;



        }
        verifyContainsText(myElement,text);
    }



    }


