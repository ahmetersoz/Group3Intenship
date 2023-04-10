package StepDefinations.Story1Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_1_EditSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    @When("Edit to position category")
    public void editToPositionCategory() {

        dc.findAndSend("nameinput","Emos23233");
        dc.findAndClick("searcbutton");
        parent.waitUntilLoading();
        dc.findAndClick("editbutton");
        fm.findAndSend("nameInput","Tunis");
        dc.findAndClick("saveButton");

    }
}
