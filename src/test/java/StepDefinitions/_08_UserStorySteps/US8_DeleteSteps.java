package StepDefinitions._08_UserStorySteps;

import Pages.DialogContent;
import Pages.StaticString;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US8_DeleteSteps {
    DialogContent dc = new DialogContent();

    @Then("Click to delete button  and confirm the delete confirmation message")
    public void clickToDeleteButtonAndConfirmTheDeleteConfirmationMessage() {
        dc.waitUntilVisible(dc.deleteButton);
        dc.waitUntilClickable(dc.deleteButton);

           dc.clickFunction(dc.deleteButton);
            dc.clickFunction(dc.deleteButton2);



    }
}




