package StepDefinations;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

    DialogContent dc = new DialogContent();
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.findAndSend("username","turkeyts");
        dc.findAndSend("password","TechnoStudy123");
        dc.findAndClick("loginButton");

    }

    @Then("User should login succesfully")
    public void userShouldLoginSuccesfully() {
        dc.verifyText("Dashboard","Dashboard");
    }
}
