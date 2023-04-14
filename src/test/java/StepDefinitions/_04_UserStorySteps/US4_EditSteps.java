package StepDefinitions._04_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import Pages.StaticString;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class US4_EditSteps {
    DialogContent dc = new DialogContent();
    FormContent fm = new FormContent();
    Parent parent = new Parent();

    @When("Edit to Fields")
    public void editToFields() {






        dc.sendKeysFunction(dc.searchNameInput,"9.0");
        dc.clickFunction(dc.searchbutton);
        dc.waitUntilVisible(dc.editButton);
        dc.clickFunction(dc.editButton);
        dc.sendKeysFunction(dc.nameInput,"Tunnabab");

        dc.sendKeysFunction(fm.code1,"1111");
        dc.clickFunction(fm.textSelect);
        dc.clickFunction(fm.logical);
        dc.clickFunction(dc.saveButton);






    }






//        dc.findAndSend("NAMEINPUT", "Ramazan");
//        dc.findAndClick("searchbutton");
//        parent.waitUntilLoading();
//        dc.findAndClick("EDİTBUTTON");
//        fm.findAndSend("nameInput", "Salih");
//        fm.findAndSend("code", "1987");
//        dc.findAndClick("saveButton");
    }
