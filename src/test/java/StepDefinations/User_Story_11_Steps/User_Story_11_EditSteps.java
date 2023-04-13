package StepDefinations.User_Story_11_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class User_Story_11_EditSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    FormContent fm=new FormContent();

    @When("Edit to Discounts")
    public void editToDiscounts() throws AWTException {
        parent.waitEditButtonVerify();
        dc.findAndSend("descriptionInput","6");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("getDescription","Tuna");
        fm.findAndSend("getIntegrationCode","ERs");
        fm.findAndSend("priority","12");

        Robot rbt = new Robot();
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        dc.findAndClick("saveButton");

    }
}
