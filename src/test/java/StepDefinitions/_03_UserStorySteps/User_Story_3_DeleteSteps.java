package StepDefinitions._03_UserStorySteps;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_3_DeleteSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    @When("Delete to Document Types")
    public void deleteToDocumentTypes() {


        dc.waitUntilVisible(dc.deleteButton);
        dc.clickFunction(dc.deleteButton);
        dc.clickFunction(dc.deleteButton2);


    }
}
