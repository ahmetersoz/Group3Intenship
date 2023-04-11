package StepDefinations.Story1Steps;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_1_EditSteps {
    DialogContent dc=new DialogContent();

    Parent parent=new Parent();
    @When("Edit to position category")
    public void editToPositionCategory() {

        dc.findAndSend("nameinput","İcardi");
        dc.findAndClick("searcbutton");
        parent.waitUntilLoading();
        dc.findAndClick("editbutton");
        dc.findAndSend2("nameInput","Tunisko");
        dc.findAndClick("saveButton");

    }
}
