package StepDefinitions._05_UserStorySteps;

import Pages.DialogContent;
import Pages.StaticString;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class US5_EditSteps {
    DialogContent dc = new DialogContent();


    @Then("Search the position name added previously")
    public void searchThePositionNameAddedPreviously() {
        dc.sendKeysFunction(dc.searchNameInput, StaticString.randomString);
        dc.clickFunction(dc.searchbutton);
    }

    @And("Verify that the correct record found")
    public void verifyThatTheCorrectRecordFound() {

        dc.verifyContainsText(dc.searchedCell,StaticString.randomString);
//3, 8, 13
    }

    @Then("Click to edit button and change the name then click to save")
    public void clickToEditButtonAndChangeTheNameThenClickToSave() {
        dc.waitUntilVisible(dc.editButton);
        dc.clickFunction(dc.editButton);
        dc.sendKeysFunction(dc.shortNameInput, RandomStringUtils.randomAlphanumeric(3));
        dc.clickFunction(dc.saveButton);
    }
}
