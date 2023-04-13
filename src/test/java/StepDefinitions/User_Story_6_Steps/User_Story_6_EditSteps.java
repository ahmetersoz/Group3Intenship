package StepDefinitions.User_Story_6_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_6_EditSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    @When("Edit to Subject Categories")
    public void editToSubjectCategories() {
        dc.findAndSend("NAMEINPUT","PHYTON");
        dc.findAndClick("SEARCHBUTTON");
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("nameInput","RUBY");
        fm.findAndSend("code","12500");
        dc.findAndClick("saveButton");


    }
}
