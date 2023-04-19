package StepDefinitions._03_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import Pages.StaticString;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class User_Story_3_EditSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    @When("Edit to Document Types")
    public void editToDocumentTypes() {
        dc.sendKeysFunction(dc.searchNameInput, StaticString.randomString);
        dc.clickFunction(dc.searchbutton);

        dc.clickFunction(dc.editButton);
        dc.sendKeysFunction(dc.nameInput, RandomStringUtils.randomAlphanumeric(3));
        dc.clickFunction(dc.saveButton);


    }
}
