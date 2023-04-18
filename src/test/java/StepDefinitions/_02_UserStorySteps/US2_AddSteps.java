package StepDefinitions._02_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.StaticString;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class US2_AddSteps {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    FormContent fm=new FormContent();
    @When("Navigate to Attestations page")
    public void navigateToAttestationsPage() {

        dc.clickFunction(ln.HumanResources);
        dc.clickFunction(ln.setupClick);
        dc.clickFunction(ln.attestations);

    }

    @Then("Add new attestations and click the toggle")
    public void addNewAttestationsAndClickTheToggle() {
        String name = DialogContent.generateRandomString(6);
        StaticString.randomString =name;

        dc.clickFunction(dc.createButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.clickFunction(dc.saveButton);
    }

}
