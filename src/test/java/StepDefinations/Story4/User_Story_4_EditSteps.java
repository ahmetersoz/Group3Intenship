package StepDefinations.Story4;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_Story_4_EditSteps {
    DialogContent dc = new DialogContent();
    FormContent fm = new FormContent();
    Parent parent = new Parent();

    @When("Edit to Fields")
    public void editToFields() {
        dc.findAndSend("NAMEINPUT", "Eminos");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("nameInput", "Yüksel");
        fm.findAndSend("code", "1972");
        dc.findAndClick("saveButton");
    }
}