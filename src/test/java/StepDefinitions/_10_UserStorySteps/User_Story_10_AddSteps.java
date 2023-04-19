package StepDefinitions._10_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_Story_10_AddSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    LeftNav ln=new LeftNav();
    Parent parent=new Parent();
    @Given("Clicking on the Setup, Parameters, Grade Levels options from the menu categories")
    public void clickingOnTheSetupParametersGradeLevelsOptionsFromTheMenuCategories() {
        ln.clickFunction(ln.SetupOne);
        ln.clickFunction(ln.Parameters);
        ln.clickFunction(ln.gradeLevels);

    }

    @When("Add to Grade Levels")
    public void addToGradeLevels() {
        parent.waitEditButtonVerify();
        dc.clickFunction(dc.createButton);
        dc.sendKeysFunction(dc.nameInput,"Eness007");
        dc.sendKeysFunction(dc.shortNameInput,"Erol7");
        dc.sendKeysFunction(fm.order,"70");
        dc.clickFunction(dc.saveButton);

    }
}
