package StepDefinations.Story4;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_Story_4_AddSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    @Given("Clicking on the Setup, Parameters, Fields options from the menu categories")
    public void clickingOnTheSetupParametersFieldsOptionsFromTheMenuCategories() {
        ln.findAndClick("SetupOne");
        ln.findAndClick("Parameters");
        ln.findAndClick("fields");
    }

    @When("Add to Fields")
    public void addToFields() {
        dc.findAndClick("createButton");
        dc.findAndSend2("nameInput","Tunababa");
        dc.findAndSend2("code","2010");
        dc.findAndClick("textSelect");
        dc.findAndClick("logical");
        dc.findAndClick("saveButton");

    }
}
