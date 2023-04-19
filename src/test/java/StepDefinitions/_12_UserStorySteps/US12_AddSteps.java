package StepDefinitions._12_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.StaticString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class US12_AddSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    FormContent fm=new FormContent();
    @Given("Clicking on the Setup, Parameters, Nationalities options from the menu categories")
    public void clickingOnTheSetupParametersNationalitiesOptionsFromTheMenuCategories() {

        dc.clickFunction(ln.SetupOne);
        dc.clickFunction(ln.Parameters);
        dc.clickFunction(ln.nationalities);



    }

    @When("Add to Nationalities")
    public void addToNationalities() {
        String name = DialogContent.generateRandomString(5);
        StaticString.randomString =name;

        dc.clickFunction(dc.createButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.clickFunction(dc.saveButton);



    }
}
