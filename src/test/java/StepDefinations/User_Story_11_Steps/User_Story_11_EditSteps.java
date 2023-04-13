package StepDefinations.User_Story_11_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.event.KeyEvent;

public class User_Story_11_EditSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    FormContent fm=new FormContent();

    @When("Edit to Discounts")
    public void editToDiscounts() throws AWTException {
        parent.waitEditButtonVerify();
        dc.findAndSend("descriptionInput","Joaquin");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("getDescription","Toni");
        fm.findAndSend("getIntegrationCode","LATO");
        fm.findAndSend("priority","20");
        Robot rbt = new Robot();
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        dc.findAndClick("saveButton");

    }
}
