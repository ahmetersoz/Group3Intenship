package StepDefinitions._02_UserStorySteps;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.StaticString;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;

public class US2_EditSteps {

    DialogContent dc=new DialogContent();

    @Then("Search the position attestations added previously")
    public void searchThePositionAttestationsAddedPreviously() {

        dc.sendKeysFunction(dc.searchNameInput, StaticString.randomString);
        dc.clickFunction(dc.searchbutton);

    }

    @And("Verify that the correct record found to attestations")
    public void verifyThatTheCorrectRecordFoundToAttestations() {
        dc.verifyContainsText(dc.searchedCell,StaticString.randomString);

    }

    @Then("Click to edit button and change the attestations then click to save")
    public void clickToEditButtonAndChangeTheAttestationsThenClickToSave() {
        dc.waitUntilVisible(dc.editButton);
        dc.clickFunction(dc.editButton);
        dc.clickFunction(dc.saveButton);
    }
}
