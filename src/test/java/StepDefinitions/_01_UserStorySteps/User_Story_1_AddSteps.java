package StepDefinitions._01_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_Story_1_AddSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    FormContent form=new FormContent();
    @Given("Clicking selected options in the campus menu")
    public void clickingSelectedOptionsInTheCampusMenu() {
        ln.findAndClick("HumanResources");
        ln.findAndClick("setupClick");
        ln.findAndClick("positionCategories");

    }

    @When("Add to position category")
    public void addToPositionCategory() {
        dc.findAndClick("createButton");
        form.findAndSend("nameInput","ahmet8181");
        dc.findAndClick("saveButton");

    }

    @When("Confirmation of successfully")
    public void confirmationOfSuccessfully() {

        dc.verifyText("succesfully","successfully");


    }
}
