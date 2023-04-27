package StepDefinitions._02_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.StaticString;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US2_EditSteps {

    DialogContent dc=new DialogContent();
    FormContent fc = new FormContent();

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
        dc.waitUntilClickable(dc.searchEditButton);
//        List<WebElement> items = GWD.getDriver().findElements(By.xpath("//td[@role='cell']"));
//        for (int i = 0; i < items.size(); i++) {
//
//            if (items.get(i).getText().equals(StaticString.randomString)) {
//
//                dc.clickFunction(items.get(i));
//            }
//        }

        dc.clickFunction(dc.searchEditButton);

        String name = DialogContent.generateRandomString(5);
        StaticString.randomString =name;
        dc.sendKeysFunction(fc.nameInput, name);
        dc.clickFunction(dc.saveButton);
    }
}
