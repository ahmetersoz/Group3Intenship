package StepDefinations.Story1;

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

        dc.findAndSend("NAMEINPUT","Ahmet22");
        dc.findAndClick("searchbutton");
        parent.waitUntilLoading();
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("nameInput","Tunaş");
        dc.findAndClick("saveButton");

    }
}
