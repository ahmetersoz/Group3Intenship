package StepDefinitions._05_UserStorySteps;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.StaticString;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class US5_AddSteps {
    LeftNav ln= new LeftNav();
    DialogContent dc = new DialogContent();

    @When("Navigate to Positions Page")
    public void navigateToPositionsPage() {
        dc.clickFunction(ln.HumanResources);
        dc.clickFunction(ln.setupClick);
        dc.clickFunction(ln.Positions);
    }

    @Then("Add new position and click the toggle")
    public void addNewPositionAndToggle() {
        String name = DialogContent.generateRandomString(5);
        StaticString.randomString =name;
        String shortName = RandomStringUtils.randomAlphanumeric(3);

        dc.clickFunction(dc.createButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.shortNameInput,shortName);
        dc.clickFunction(dc.toggleBar);
        dc.clickFunction(dc.saveButton);
    }

    @And("Successful message should be displayed")
    public void successfulMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.succesfully,"successfully");
    }
}
