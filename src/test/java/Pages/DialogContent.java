package Pages;

import Utilities.GWD;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(id = "mat-input-0")
    public WebElement username;

    @FindBy(id = "mat-input-1")
    public WebElement password;

    @FindBy(css = "button[aria-label=\"LOGIN\"]")
    public WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    public WebElement Dashboard;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    public WebElement AcceptCookies;

    @FindBy(xpath = "//button[@matbadgeposition='below']//fa-icon")
    public WebElement createButton;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
   public WebElement succesfully;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='iban']/input")
    public WebElement iban;

    @FindBy(xpath = "//mat-select[@formcontrolname='currency']")
    public WebElement currency;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
    public WebElement currencyTRY;
    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    public WebElement searchNameInput;

    @FindBy(xpath = "(//td[@role='cell'])[2]")
    public WebElement searchedCell;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    public WebElement searchbutton;

    @FindBy(xpath="//mat-slide-toggle[@formcontrolname='active']")
    public WebElement toggleBar;
    @FindBy(xpath = "(//ms-edit-button[@class='ng-star-inserted']//button)[1]")
    public WebElement editButton;

    @FindBy(xpath = "(//span[contains(@class,'mat-button-wrapper')])[33]//fa-icon")
    public WebElement DELETEBUTTONROW9;

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted']//button)[1]")
    public WebElement deleteButton;
    //ms-edit-button[@class='ng-star-inserted']//button)[1]
    //ms-delete-button[@table='true'])//button[1]
    @FindBy(xpath = "//span[contains(text(),' Delete ')]")
    public WebElement deleteButton2;

    @FindBy(xpath = "//span[text()='Campus Project']")
    private WebElement schoolButton;

    @FindBy(xpath = "//span[text()=' Halo Imperial College  ']")
    public WebElement haloImperial;

    @FindBy(xpath = "(//button[@color='accent'])[9]//fa-icon")
    public WebElement gradeEditButton;

    @FindBy(xpath = "//ms-text-field[@placeholder='DISCOUNT.TITLE.DESCRIPTION']//input")
    public WebElement descriptionInput;

    @FindBy(xpath = "//div[text()=' Name ']")
    public WebElement nameVerify;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortNameInput;

    WebElement myElement;


    public static String generateRandomString(int length) {

        String randomString = RandomStringUtils.randomAlphanumeric(length);
        StaticString.randomString = randomString;
        return randomString;
    }

}
