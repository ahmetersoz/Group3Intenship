package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement SetupOne;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement Countries;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement Parameters;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    public WebElement bankAccounts;

    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement Citizenships;

    @FindBy(xpath = "//span[text()='Nationalities']")
    public WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    public WebElement Fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    public WebElement EntranceExams1;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    public WebElement EntranceExams2;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    public WebElement SetupTwo;
    //-------------------------------------------------------------//
    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement HumanResources;

    @FindBy(xpath = "//span[text()='Positions']")
    public WebElement Positions;


    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement setupClick;

    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    public WebElement locations;


    //-----------------------------------------------------------//
    @FindBy(xpath = "//span[text()='Employees']")
    public WebElement Employees;

    @FindBy(xpath = "//span[text()='School Setup']")
    public WebElement SchoolSetup;

    @FindBy(xpath = "//span[text()='Departments']")
    public WebElement SchoolDepartments;

    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    public WebElement positionCategories;

    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    public WebElement attestations;

    @FindBy(xpath = "(//span[text()='Document Types'])[1]")
    public WebElement documentTypes;

    @FindBy(xpath = "//span[text()='Fields']")
    public WebElement fields;

    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    public WebElement positions;

    @FindBy(xpath = "//span[text()='Education']")
    public WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    public WebElement setup4;

    @FindBy(xpath = "(//span[text()='Subject Categories'])[1]")
    private WebElement subjectCategories;

    @FindBy(xpath = "//span[text()='Locations']")
    public WebElement schoolLocations;

    @FindBy(xpath = "//span[text()='Departments']")
    public WebElement departments;

    @FindBy(xpath = "(//span[text()='Grade Levels'])[1]")
    public WebElement gradeLevels;

    @FindBy(xpath = "(//span[text()='Discounts'])[1]")
    public WebElement discounts;
}
