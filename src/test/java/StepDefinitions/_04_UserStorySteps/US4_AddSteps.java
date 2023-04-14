package StepDefinitions._04_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.StaticString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class US4_AddSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    FormContent fm=new FormContent();
    @Given("Clicking on the Setup, Parameters, Fields options from the menu categories")
    public void clickingOnTheSetupParametersFieldsOptionsFromTheMenuCategories() {
        ln.clickFunction(ln.SetupOne);
     ln.clickFunction(ln.Parameters);
     ln.clickFunction(ln.fields);
    }

    @When("Add to Fields")
    public void addToFields() {
      dc.clickFunction(dc.createButton);
        String name = DialogContent.generateRandomString(5);
        StaticString.randomString =name;
       dc.sendKeysFunction(dc.nameInput,name);
       dc.sendKeysFunction(fm.code1,"999900");
        dc.clickFunction(fm.textSelect);
        dc.clickFunction(fm.logical);
        dc.clickFunction(dc.saveButton);

    }
}
