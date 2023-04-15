package StepDefinitions._11_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.event.KeyEvent;

public class US11_EditSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    FormContent fm=new FormContent();

    @When("Edit to Discounts")
    public void editToDiscounts() throws AWTException {
//        parent.waitEditButtonVerify();
//        dc.findAndSend("descriptionInput","ff");
//        dc.findAndClick("searcbutton");
//        parent.waitUntilLoading();
//        dc.findAndClick("EDİTBUTTON");
//        fm.findAndSend("getDescription","Yunus1");
//        fm.findAndSend("getIntegrationCode","Ilkis");
//        fm.findAndSend("priority","054");
//        Robot rbt = new Robot();
//        rbt.keyPress(KeyEvent.VK_TAB);
//        rbt.keyRelease(KeyEvent.VK_TAB);
//        dc.findAndClick("saveButton");
        dc.sendKeysFunction(dc.descriptionInput,"Teacher");
        dc.clickFunction(dc.searchbutton);
        parent.waitUntilLoading();
        dc.clickFunction(dc.editButton);
        dc.sendKeysFunction(fm.getDescription,"Techno1");
        dc.sendKeysFunction(fm.getIntegrationCode,"123456");
        dc.sendKeysFunction(fm.priority,"111111");
        Robot rbt = new Robot();
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        dc.clickFunction(dc.saveButton);

    }
}
