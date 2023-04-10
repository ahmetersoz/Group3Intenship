package StepDefinations.Story1Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_1_DeleteSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    @When("Delete to position category")
    public void deleteToPositionCategory() {
        dc.findAndSend("nameinput","Emos23233");
        dc.findAndClick("searchbutton");
        parent.waitUntilLoading();
        dc.findAndClick("deletebutton");
        dc.findAndClick("deletebutton2");

    }
}
