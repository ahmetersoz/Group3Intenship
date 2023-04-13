package StepDefinitions.StepDefinitions_6_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class case6DeleteSteps {

    DialogContent dc = new DialogContent();
    FormContent fm = new FormContent();
    Parent parent = new Parent();

    @When("Delete to Subject Categories")
    public void deleteToSubjectCategories() {
        {
            dc.findAndSend("NAMEINPUT", "sude");
            dc.findAndClick("SEARCHBUTTON");
            parent.waitUntilLoading();
            dc.findAndClick("DELETEBUTTON");
            dc.findAndClick("DELETEBUTTON2");


        }
    }
}