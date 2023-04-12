package StepDefinations.StepDefinations_6_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class case6AddSteps {
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();
    LeftNav ln = new LeftNav();

    @Given("by clicking Settings, Parameters, Degree Levels in the menu categories.")
    public void byClickingSettingsParametersDegreeLevelsInTheMenuCategories() {
        ln.findAndClick("education");
        ln.findAndClick("setup4");
        ln.findAndClick("subjectCategories");

    }

    @When("Added to Grade Levels")
    public void addedToGradeLevels() {

        dc.findAndClick("createButton");
        fc.findAndSend("nameInput","EROL");
        fc.findAndSend("code","7");
        dc.findAndClick("saveButton");

    }


    }

