package StepDefinitions._01_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class US1_DeleteSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    @When("Delete to position category")
    public void deleteToPositionCategory() {
       dc.sendKeysFunction(dc.searchNameInput,"Utniy");
      dc.clickFunction(dc.searchbutton);
       parent.waitUntilLoading();
     dc.clickFunction(dc.deleteButton);
       dc.clickFunction(dc.deleteButton2);
    }
}
