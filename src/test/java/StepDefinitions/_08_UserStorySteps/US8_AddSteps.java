package StepDefinitions._08_UserStorySteps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.StaticString;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class US8_AddSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    FormContent fm=new FormContent();
    @When("Navigate to Departments page")
    public void navigateToDepartmentsPage() {
        dc.clickFunction(ln.setupLocation);
        dc.clickFunction(ln.SchoolSetup);
        dc.clickFunction(ln.departments);

    }

    @Then("Add new Department account page")
    public void addNewDepartmentAccountPage() {


        String name = DialogContent.generateRandomString(5);
        StaticString.randomString =name;
        String shortName = RandomStringUtils.randomAlphanumeric(3);

        dc.clickFunction(dc.createButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(fm.codeInput,shortName);
        dc.clickFunction(dc.toggleBar);
        dc.clickFunction(dc.saveButton);



        //  String name = "Damir7";
        // String code = "1611";

        // dc.clickFunction(dc.createButton);
        // dc.sendKeysFunction(dc.nameInput,name);
        // dc.sendKeysFunction(fm.code2,code);
        // dc.clickFunction(dc.toggleBar);
        //  dc.clickFunction(dc.saveButton);
    }
}
