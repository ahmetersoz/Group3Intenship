package StepDefinitions._11_UserStorySteps;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class US11_DeleteSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();

    @When("Delete to Discounts")
    public void deleteToDiscounts() {
//
        dc.sendKeysFunction(dc.descriptionInput,"22");
        dc.clickFunction(dc.searchbutton);
        parent.waitUntilLoading();
        dc.clickFunction(dc.deleteButton);
        dc.clickFunction(dc.deleteButton2);

    }
}
