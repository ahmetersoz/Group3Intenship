package StepDefinations.Story4;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_4_DeleteSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    @When("Delete to Fields")
    public void deleteToFields() {
        dc.findAndSend("nameinput","19840914449449");
        dc.findAndClick("searchbutton");
        parent.waitUntilLoading();
        dc.findAndClick("deletebutton");
        dc.findAndClick("deletebutton2");

    }
}
