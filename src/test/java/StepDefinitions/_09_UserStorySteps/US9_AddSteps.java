package StepDefinitions._09_UserStorySteps;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.StaticString;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.Select;

public class US9_AddSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln= new LeftNav();
    @When("Navigate to Bank Account Page")
    public void navigateToBankAccountPage() {
        dc.clickFunction(ln.SetupOne);
        dc.clickFunction(ln.Parameters);
        dc.clickFunction(ln.bankAccounts);
    }

    @Then("Add new Bank Account and click the toggle")
    public void addNewBankAccountAndClickTheToggle() {
        String name = DialogContent.generateRandomString(5);
        StaticString.randomString =name;
        String iban =RandomStringUtils.randomAlphabetic(2) + RandomStringUtils.randomNumeric(11);

        dc.clickFunction(dc.createButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.iban,iban);
        dc.clickFunction(dc.currency);
        dc.clickFunction(dc.currencyTRY);
        dc.clickFunction(dc.toggleBar);
        dc.clickFunction(dc.saveButton);

    }
}
