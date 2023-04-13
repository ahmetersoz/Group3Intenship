package StepDefinitions._04_UserStorySteps;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_4_DeleteSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    @When("Delete to Fields")
    public void deleteToFields() {
        dc.findAndSend("NAMEINPUT","Ramazan");
        dc.findAndClick("searchbutton");
        parent.waitUntilLoading();
        dc.findAndClick("DELETEBUTTON");
        dc.findAndClick("DELETEBUTTON2");

    }
}
