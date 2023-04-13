package StepDefinations.User_Story_12_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_Story_12_AddSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    FormContent fm=new FormContent();
    @Given("Clicking on the Setup, Parameters, Nationalities options from the menu categories")
    public void clickingOnTheSetupParametersNationalitiesOptionsFromTheMenuCategories() {
        ln.findAndClick("SetupOne");
        ln.findAndClick("Parameters");
        ln.findAndClick("Nationality");

    }

    @When("Add to Nationalities")
    public void addToNationalities() {
        dc.verifyText("nameVerify","Name");
        dc.findAndClick("createButton");
        fm.findAndSend("nameInput","Belize");
        dc.findAndClick("saveButton");

    }
}
