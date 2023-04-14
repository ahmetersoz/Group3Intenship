package StepDefinitions._01_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class US1_EditSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    @When("Edit to position category")
    public void editToPositionCategory() {
//
    dc.sendKeysFunction(dc.searchNameInput,"Ahmet65");
       dc.clickFunction(dc.searchbutton);
        dc.clickFunction(dc.editButton);
        dc.sendKeysFunction(dc.nameInput,"Tunnabab");
        dc.sendKeysFunction(dc.shortNameInput,"Ahmet9510");
        dc.clickFunction(dc.saveButton);
    }
}
