package StepDefinitions.User_Story_10_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_10_EditSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    FormContent fm=new FormContent();
    @When("Edit to Grade Levels")
    public void editToGradeLevels() {
        parent.waitEditButtonVerify();
        dc.clickFunction(dc.gradeEditButton);
        fm.sendKeysFunction(dc.nameInput,"Grup03");
        dc.sendKeysFunction(fm.shortname2,"ENes");
        dc.sendKeysFunction(fm.order,"003");
        dc.clickFunction(dc.saveButton);

    }
}
