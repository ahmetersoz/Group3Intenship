package StepDefinations.User_Story_11_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_11_EditSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    FormContent fm=new FormContent();

    @When("Edit to Discounts")
    public void editToDiscounts() {
        parent.waitEditButtonVerify();
        dc.findAndSend("descriptionInput","Joaquin");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("getDescription","Toni");
        fm.findAndSend("getIntegrationCode","LATO");
        fm.findAndSend("priority","20");
        dc.findAndClick("saveButton");

    }
}
