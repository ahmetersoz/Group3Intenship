package StepDefinitions._08_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.StaticString;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class US8_EditSteps {

    FormContent fc = new FormContent();
    DialogContent dc = new DialogContent();



    @And("Verify that the correct record found to department")
    public void verifyThatTheCorrectRecordFoundToDepartment() {

//        dc.waitUntilVisible(dc.editButton);
//
//        dc.clickFunction(dc.select1);
//        dc.clickFunction(dc.select2);
//
//        dc.waitUntilVisible(dc.editButton);


        List<WebElement> items = GWD.getDriver().findElements(By.xpath("//td[@role='cell']"));
        for (int i = 0; i < items.size(); i++) {

            if (items.get(i).getText().equals(StaticString.randomString)) {

                Assert.assertEquals(StaticString.randomString, items.get(i).getText(), "test fail");
            }
        }
    }


        @Then("Click to edit button and change the  then click to save")
        public void clickToEditButtonAndChangeTheThenClickToSave () {

            dc.waitUntilVisible(dc.editButton);

            List<WebElement> items = GWD.getDriver().findElements(By.xpath("//td[@role='cell']"));
            for (int i = 0; i < items.size(); i++) {

                if (items.get(i).getText().equals(StaticString.randomString)) {

                    dc.clickFunction(items.get(i));
                }
            }


            String name =  "0" + DialogContent.generateRandomString(5);
            StaticString.randomString =name;
            dc.sendKeysFunction(fc.nameInput, name);
            dc.clickFunction(dc.saveButton);
        }
    }

