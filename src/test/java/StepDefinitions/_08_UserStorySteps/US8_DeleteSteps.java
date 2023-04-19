package StepDefinitions._08_UserStorySteps;

import Pages.DialogContent;
import Pages.StaticString;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US8_DeleteSteps {
    DialogContent dc = new DialogContent();

    @Then("Click to delete button  and confirm the delete confirmation message")
    public void clickToDeleteButtonAndConfirmTheDeleteConfirmationMessage() {

        dc.waitUntilVisible(dc.deleteButton);

        dc.clickFunction(dc.select1);
        dc.clickFunction(dc.select2);

        dc.waitUntilVisible(dc.editButton);


        List<WebElement> items = GWD.getDriver().findElements(By.xpath("//td[@role='cell']"));
        int forStep = 1;

        for (int i = 1; i < items.size(); i = i + 5) {
            if (items.get(i).getText().equals(StaticString.randomString))
               {
                    String forStepStr = Integer.toString(forStep) + "]";
                    WebElement dynamicDelete = GWD.getDriver().findElement(By.xpath("(//ms-delete-button[@class='ng-star-inserted']//button)[" + forStepStr));
                    dc.clickFunction(dynamicDelete);
                } else {
                    System.out.println("Delete failed");

                }
                forStep++;
            }
        dc.scrollToElement(dc.deleteButton2);
          dc.clickFunction(dc.deleteButton2);

        }

    }




