package StepDefinitions._09_UserStorySteps;

import Pages.DialogContent;
import Pages.StaticString;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;

public class US9_EditSteps {
    DialogContent dc = new DialogContent();
    @Then("Search the Bank Account name added previously")
    public void searchTheBankAccountNameAddedPreviously() {
        dc.sendKeysFunction(dc.searchNameInput, StaticString.randomString);
        dc.clickFunction(dc.searchbutton);
    }

    @Then("Click to edit button and change the iban then click to save")
    public void clickToEditButtonAndChangeTheIbanThenClickToSave() {

        dc.sendKeysFunction(dc.iban,RandomStringUtils.randomNumeric(11));
        dc.clickFunction(dc.saveButton);
    }
}
