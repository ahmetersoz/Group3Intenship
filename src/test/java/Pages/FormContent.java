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

    @FindBy(xpath = "//span[text()=' Student Registration ']")
    private WebElement getStage1;

    @FindBy(xpath = "//span[text()=' Examination ']")
    private WebElement getStage2;

    @FindBy(xpath = "//span[text()=' Employment ']")
    private WebElement getStage3;

    @FindBy(xpath = "//textarea[@formcontrolname='description']")
    private WebElement description;

    @FindBy(xpath = "(//span[@class='mat-slide-toggle-thumb-container'])[33]/span[1]")
    private WebElement useCamera;

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

    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]//div[2]")
    private WebElement locationType;

    @FindBy(xpath = "//span[text()=' Other ']")
    private WebElement other;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='capacity']//input")
    private WebElement capacity;

    @FindBy(xpath = "//span[text()='Department Constants']")
    private WebElement departmentConstants;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.KEY']//input")
    private WebElement key;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.VALUE']//input")
    private WebElement values;

    @FindBy(xpath = "//span[contains(text(),'Add')]")
    private WebElement addButton;

    @FindBy(xpath = "//span[text()='Section']")
    private WebElement section;

    @FindBy(xpath = "(//span[contains(text(),'School Department')])[4]")
    private WebElement schoolDepartment;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.CODE'])[1]//input")
    private WebElement codeInput;

    @FindBy(xpath = "//span[text()='Active']")
    private WebElement activeButton;

    @FindBy(xpath = "//ms-masked-text-field[@formcontrolname='iban']//input")
    private WebElement iban;

    @FindBy(xpath = "//mat-select[@formcontrolname='currency']/div")
    private WebElement currency;

    @FindBy(xpath = "//span[text()=' EUR ']")
    private WebElement EURO;

    @FindBy(xpath = "//span[text()=' TRY ']")
    private WebElement TRY;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']//input")
    private WebElement ıntegrationCode;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']//input")
    private WebElement order;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]/div[1]")
    private WebElement nextGrade;

    @FindBy(xpath = "//span[text()=' Gullu Julian Bednar ']")
    private WebElement gulluselect;

    @FindBy(xpath = "//span[text()=' capacitor ']")
    private WebElement leonard;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']//input")
    private WebElement getDescription;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement getIntegrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priority;











    WebElement myElement;

    public void findAndSend(String strElement,String value) {
        switch (strElement) {
            case "nameInput":myElement=nameInput;break;
            case "name2":myElement=name2;break;
            case "description":myElement=description;break;
            case "code":myElement=code1;break;
            case "capacity":myElement=capacity;break;
            case "shortname2":myElement=shortname2;break;
            case "key":myElement=key;break;
            case "values":myElement=values;break;
            case "codeInput":myElement=codeInput;break;
            case "iban":myElement=iban;break;
            case "ıntegrationCode":myElement=ıntegrationCode;break;
            case "order":myElement=order;break;
            case "getDescription":myElement=getDescription;break;
            case "getIntegrationCode":myElement=getIntegrationCode;break;
            case "priority":myElement=priority;break;






        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "useCamera":myElement=useCamera;break;
            case "textSelect":myElement=textSelect;break;
            case "logical":myElement=logical;break;
            case "locationType":myElement=locationType;break;
            case "other":myElement=other;break;
            case "departmentConstants":myElement=departmentConstants;break;
            case "addButton":myElement=addButton;break;
            case "section":myElement=section;break;
            case "schoolDepartment":myElement=schoolDepartment;break;
            case "currency":myElement=currency;break;
            case "EURO":myElement=EURO;break;
            case "TRY":myElement=TRY;break;
            case "nextGrade":myElement=nextGrade;break;
            case "gulluselect":myElement=gulluselect;break;
            case "leonard":myElement=leonard;break;








        }
        clickFunction(myElement);
    }

    public void veriftText(String strElement,String text){
        switch (strElement){
            case "activeButton":myElement=activeButton;break;



        }
        verifyContainsText(myElement,text);
    }


    public void documentTypesAction(){
        Actions actions=new Actions(GWD.getDriver());
        actions.moveToElement(stage).click().build().perform();
        actions.moveToElement(getStage1).click().build().perform();
        actions.moveToElement(getStage2).click().build().perform();
        actions.moveToElement(getStage3).click().build().perform();
        actions.keyDown(Keys.ESCAPE).build().perform();
    }

    public void sectionClick(){
        Actions actions=new Actions(GWD.getDriver());
        actions.moveToElement(section).click().build().perform();
    }
    public void departmentConstants(){
        Actions actions=new Actions(GWD.getDriver());
        actions.moveToElement(departmentConstants).click().build().perform();
    }

}
