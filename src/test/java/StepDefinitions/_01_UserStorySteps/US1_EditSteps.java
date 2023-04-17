package StepDefinitions._01_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import Pages.StaticString;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class US1_EditSteps {
    DialogContent dc = new DialogContent();
    FormContent fm = new FormContent();
    Parent parent = new Parent();

    @When("Edit to position category")
    public void editToPositionCategory() {
//
        dc.sendKeysFunction(dc.searchNameInput, StaticString.randomString);
        dc.clickFunction(dc.searchbutton);
        dc.verifyContainsText(dc.searchedCell, StaticString.randomString);
        dc.waitUntilVisible(dc.editButton);
        dc.clickFunction(dc.editButton);
        dc.sendKeysFunction(dc.shortNameInput, RandomStringUtils.randomAlphanumeric(3));
        dc.clickFunction(dc.saveButton);
    }
}