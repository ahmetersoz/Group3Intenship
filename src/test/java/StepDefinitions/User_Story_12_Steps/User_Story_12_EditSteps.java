package StepDefinations.User_Story_12_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_12_EditSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    FormContent fm=new FormContent();

    @When("Edit to Nationalities")
    public void editToNationalities() {
        dc.verifyText("nameVerify","Name");
        dc.findAndSend("NAMEINPUT","California");
        dc.findAndClick("searchbutton");
        parent.waitUntilLoading();
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("nameInput","Kocaeli");
        dc.findAndClick("saveButton");

    }
}
