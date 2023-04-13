package StepDefinitions._04_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_Story_4_AddSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    FormContent fm=new FormContent();
    @Given("Clicking on the Setup, Parameters, Fields options from the menu categories")
    public void clickingOnTheSetupParametersFieldsOptionsFromTheMenuCategories() {
        ln.findAndClick("SetupOne");
        ln.findAndClick("Parameters");
        ln.findAndClick("fields");
    }

    @When("Add to Fields")
    public void addToFields() {
        dc.findAndClick("createButton");
        fm.findAndSend("nameInput","Ramazan");
        fm.findAndSend("code","1959");
        fm.findAndClick("textSelect");
        fm.findAndClick("logical");
        dc.findAndClick("saveButton");

    }
}
