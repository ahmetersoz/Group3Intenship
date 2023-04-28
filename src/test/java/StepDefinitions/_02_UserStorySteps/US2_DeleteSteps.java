package StepDefinitions._02_UserStorySteps;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.Then;

public class US2_DeleteSteps {

    DialogContent dc=new DialogContent();

    @Then("Click to delete button and confirm the delete confirmation message")
    public void clickToDeleteButtonAndConfirmTheDeleteConfirmationMessage() {
        dc.waitUntilVisible(dc.deleteButton);
        dc.waitUntilClickable(dc.deleteButton);

        dc.clickFunction(dc.deleteButton);
        dc.clickFunction(dc.deleteButton2);
    }
}
