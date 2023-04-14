package StepDefinitions._05_UserStorySteps;

import Pages.DialogContent;
import io.cucumber.java.en.Then;

public class US5_DeleteSteps {
    DialogContent dc = new DialogContent();
    @Then("Click to delete icon and confirm the delete confirmation message")
    public void clickToDeleteIconAndConfirmTheDeleteConfirmationMessage() {
        dc.waitUntilVisible(dc.deleteButton);
        dc.clickFunction(dc.deleteButton);
        dc.clickFunction(dc.deleteButton2);
    }
}
