package StepDefinitions.User_Story_11_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.event.KeyEvent;

public class User_Story_11_AddSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    FormContent fm=new FormContent();
    LeftNav ln=new LeftNav();
    @Given("Clicking on the Setup, Parameters, Discounts options from the menu categories")
    public void clickingOnTheSetupParametersDiscountsOptionsFromTheMenuCategories(){
        ln.findAndClick("SetupOne");
        ln.findAndClick("Parameters");
        ln.findAndClick("discounts");
    }

    @When("Add to Discounts")
    public void addToDiscounts() throws AWTException {
        parent.waitEditButtonVerify();
        dc.findAndClick("createButton");
        fm.findAndSend("getDescription","Emmos");
        fm.findAndSend("getIntegrationCode","Ersz");
        fm.findAndSend("priority","15");
        Robot rbt = new Robot();
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        dc.findAndClick("saveButton");

    }
}
