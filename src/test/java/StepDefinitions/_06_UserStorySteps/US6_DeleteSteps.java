package StepDefinitions._06_UserStorySteps;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class US6_DeleteSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    @When("Delete to Subject Categories")
    public void deleteToSubjectCategories() {

        dc.sendKeysFunction(dc.searchNameInput,"Enes00420711");
        dc.clickFunction(dc.searchbutton);
        parent.waitUntilLoading();
        dc.clickFunction(dc.deleteButton);
        dc.clickFunction(dc.deleteButton2);




    }
}
