package StepDefinitions._12_UserStorySteps;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class US12_DeleteSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();

    @When("Delete to Nationalities")
    public void deleteToNationalities() {

        dc.sendKeysFunction(dc.searchNameInput,"Cat");
        dc.clickFunction(dc.searchbutton);
        parent.waitUntilLoading();
        dc.clickFunction(dc.deleteButton);
        dc.clickFunction(dc.deleteButton2);


    }
}
