package StepDefinitions._04_UserStorySteps;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class US4_DeleteSteps {
    DialogContent dc = new DialogContent();
    Parent parent = new Parent();

    @When("Delete to Fields")
    public void deleteToFields() {

        ;


        dc.waitUntilVisible(dc.deleteButton);
        dc.clickFunction(dc.deleteButton);
        dc.clickFunction(dc.deleteButton2);
    }
}