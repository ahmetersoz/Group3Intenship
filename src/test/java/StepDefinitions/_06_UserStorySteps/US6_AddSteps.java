package StepDefinitions._06_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class US6_AddSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    FormContent fm=new FormContent();
    @Given("Clicking on the Setup, Education, Subject Categories options from the menu categories")
    public void clickingOnTheSetupEducationSubjectCategoriesOptionsFromTheMenuCategories() {
//        l;
        dc.clickFunction(ln.education);
        dc.clickFunction(ln.setup4);
        dc.clickFunction(ln.subjectCategories);

    }

    @When("Add to Subject Categories")
    public void addToSubjectCategories() {
//
        dc.clickFunction(dc.createButton);
        dc.sendKeysFunction(dc.nameInput,"Enes004329");
        dc.sendKeysFunction(fm.code1,"55");
        dc.clickFunction(dc.saveButton);

    }
}
