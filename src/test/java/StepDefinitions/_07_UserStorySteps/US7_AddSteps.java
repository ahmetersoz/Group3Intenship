package StepDefinitions._07_UserStorySteps;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.StaticString;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class US7_AddSteps {
    LeftNav ln= new LeftNav();
    DialogContent dc = new DialogContent();
    @When("Navigate to Locations Page")
    public void navigateToLocationsPage() {
        dc.clickFunction(ln.SetupOne);
        dc.clickFunction(ln.SchoolSetup);
        dc.clickFunction(ln.locations);
    }

    @Then("Add new location and click the toggle")
    public void addNewLocationAndToggle() {
        String name =  DialogContent.generateRandomString(5);
        StaticString.randomString = name;
        String shortName = RandomStringUtils.randomAlphanumeric(3);

        dc.clickFunction(dc.createButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.shortNameInput,shortName);
        dc.sendKeysFunction(dc.capacityInput,"250");
        dc.clickFunction(dc.toggleBar);
        dc.clickFunction(dc.saveButton);
    }
}
