package StepDefinations.Story4;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_4_EditSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    @When("Edit to Fields")
    public void editToFields() {
        dc.findAndSend("nameinput","Emine12");
        dc.findAndClick("searchbutton");
        parent.waitUntilLoading();
        dc.findAndClick("editbutton");
        fm.findAndSend("nameInput","Fatma1229");
        fm.findAndSend("code","19009813331");
        dc.findAndClick("saveButton");
    }
}
