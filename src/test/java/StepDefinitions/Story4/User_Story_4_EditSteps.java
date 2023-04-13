package StepDefinitions.Story4;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_4_EditSteps {
    DialogContent dc = new DialogContent();
    FormContent fm = new FormContent();
    Parent parent = new Parent();

    @When("Edit to Fields")
    public void editToFields() {
        dc.findAndSend("NAMEINPUT", "Ramazan");
        dc.findAndClick("searchbutton");
        parent.waitUntilLoading();
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("nameInput", "Salih");
        fm.findAndSend("code", "1987");
        dc.findAndClick("saveButton");
    }
}