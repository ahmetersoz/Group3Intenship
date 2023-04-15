package StepDefinitions._06_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class US6_EditSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    @When("Edit to Subject Categories")
    public void editToSubjectCategories() {
//        dc.findAndSend("NAMEINPUT","sude");
//        dc.findAndClick("searchbutton");
//        dc.findAndClick("EDİTBUTTON");
//        fm.findAndSend("nameInput","enesff");
//        fm.findAndSend("code","009988");
//        dc.findAndClick("saveButton");
        dc.sendKeysFunction(dc.searchNameInput,"Enes0042");
        dc.clickFunction(dc.searchbutton);
        dc.clickFunction(dc.editButton);
        dc.sendKeysFunction(dc.nameInput,"Enes004207");
        dc.sendKeysFunction(fm.code1,"9087" );
        dc.clickFunction(dc.saveButton);


    }
}
