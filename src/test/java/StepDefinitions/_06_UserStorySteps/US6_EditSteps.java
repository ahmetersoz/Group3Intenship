package StepDefinitions._06_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class US6_EditSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    @When("Edit to Subject Categories")
    public void editToSubjectCategories() {

        dc.sendKeysFunction(dc.searchNameInput,"Enes004329");
        dc.clickFunction(dc.searchbutton);
        dc.clickFunction(dc.editButton);
        dc.sendKeysFunction(dc.nameInput,"Enes00420711");
        dc.sendKeysFunction(fm.code1,"9087" );
        dc.clickFunction(dc.saveButton);


    }
}
