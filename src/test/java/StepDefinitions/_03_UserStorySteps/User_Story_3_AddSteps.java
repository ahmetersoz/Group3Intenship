package StepDefinitions._03_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.StaticString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class User_Story_3_AddSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    LeftNav ln=new LeftNav();

    @Given("Clicking on the Setup, Parameters, Document Types options from the menu categories")
    public void clickingOnTheSetupParametersDocumentTypesOptionsFromTheMenuCategories() {
        ln.clickFunction(ln.SetupOne);
        ln.clickFunction(ln.Parameters);
        ln.clickFunction(ln.documentTypes);

    }

    @When("Add to Document Types")
    public void addToDocumentTypes() {

        String name = DialogContent.generateRandomString(5);
        StaticString.randomString =name;



        dc.clickFunction(dc.createButton);
        fm.sendKeysFunction(dc.nameInput,name);
        fm.documentTypesAction();
        fm.sendKeysFunction(fm.description,name);
        fm.clickFunction(fm.useCamera);
        dc.clickFunction(dc.saveButton);


    }
}
