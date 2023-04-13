package StepDefinitions.User_Story_6_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_Story_6_AddSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    FormContent fm=new FormContent();
    @Given("Clicking on the Setup, Education, Subject Categories options from the menu categories")
    public void clickingOnTheSetupEducationSubjectCategoriesOptionsFromTheMenuCategories() {
        ln.findAndClick("education");
        ln.findAndClick("setup4");
        ln.findAndClick("subjectCategories");
    }

    @When("Add to Subject Categories")
    public void addToSubjectCategories() {
        dc.findAndClick("createButton");
        fm.findAndSend("nameInput","Tuniskom");
        fm.findAndSend("code","0099880");
        dc.findAndClick("saveButton");

    }
}
