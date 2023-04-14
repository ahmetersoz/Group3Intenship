package StepDefinitions._09_UserStorySteps;

import Pages.DialogContent;
import io.cucumber.java.en.Then;

public class US9_DeleteSteps {
    DialogContent dc = new DialogContent();
    @Then("Click to delete icon for remove the account and confirm the delete confirmation message")
    public void clickToDeleteIconForRemoveTheAccountAndConfirmTheDeleteConfirmationMessage() {
        dc.clickFunction(dc.deleteButton);
        dc.clickFunction(dc.deleteButton2);
    }
}
