package StepDefinitions._12_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import Pages.StaticString;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class US12_EditSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    FormContent fm=new FormContent();

    @When("Edit to Nationalities")
    public void editToNationalities() {

        dc.sendKeysFunction(dc.searchNameInput,"Cat");
        dc.clickFunction(dc.searchbutton);
        dc.clickFunction(dc.editButton);
        dc.sendKeysFunction(dc.nameInput,"Yunus");

        dc.clickFunction(dc.saveButton);


    }
}
