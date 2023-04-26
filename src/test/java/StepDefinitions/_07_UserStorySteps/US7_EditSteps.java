package StepDefinitions._07_UserStorySteps;

import Pages.DialogContent;
import Pages.StaticString;
import io.cucumber.java.en.Then;

public class US7_EditSteps {

    DialogContent dc = new DialogContent();


    @Then("Search the location name added previously")
    public void searchTheLocationNameAddedPreviously() {
        dc.sendKeysFunction(dc.searchNameInput, StaticString.randomString);
        dc.clickFunction(dc.searchbutton);
    }

}
