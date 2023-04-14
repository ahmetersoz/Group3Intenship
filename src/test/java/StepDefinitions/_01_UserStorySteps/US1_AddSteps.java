package StepDefinitions._01_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.StaticString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class US1_AddSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    FormContent form=new FormContent();
    @Given("Clicking selected options in the campus menu")
    public void clickingSelectedOptionsInTheCampusMenu() {
        dc.clickFunction(ln.HumanResources);
        dc.clickFunction(ln.setupClick);
        dc.clickFunction(ln.Positions);
    }

    @When("Add to position category")
    public void addToPositionCategory() {
        String name = DialogContent.generateRandomString(5);
        StaticString.randomString =name;
       dc.clickFunction(dc.createButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.shortNameInput,"Ahmet951");
       dc.clickFunction(dc.saveButton);
    }

    @When("Confirmation of successfully")
    public void confirmationOfSuccessfully() {

        //dc.verifyText("succesfully","successfully");


    }
}
