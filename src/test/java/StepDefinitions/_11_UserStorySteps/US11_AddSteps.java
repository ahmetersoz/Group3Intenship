package StepDefinitions._11_UserStorySteps;

import Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

import java.awt.*;
import java.awt.event.KeyEvent;

public class US11_AddSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    FormContent fm=new FormContent();
    LeftNav ln=new LeftNav();
    @Given("Clicking on the Setup, Parameters, Discounts options from the menu categories")
    public void clickingOnTheSetupParametersDiscountsOptionsFromTheMenuCategories(){

        dc.clickFunction(ln.SetupOne);
        dc.clickFunction(ln.Parameters);
        dc.clickFunction(ln.discounts);
    }

    @When("Add to Discounts")
    public void addToDiscounts() throws AWTException {

        String name = DialogContent.generateRandomString(5);
        StaticString.randomString =name;
        String priority = RandomStringUtils.randomAlphanumeric(3);
        StaticString.randomString=priority;
        dc.clickFunction(dc.createButton);
        dc.sendKeysFunction(fm.getDescription,name);
        dc.sendKeysFunction(fm.getIntegrationCode,name);
        dc.sendKeysFunction(fm.priority,"1234");
        Robot rbt = new Robot();
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);



        dc.clickFunction(dc.saveButton);



    }  }
