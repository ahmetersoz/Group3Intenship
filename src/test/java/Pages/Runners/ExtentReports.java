package Pages.Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@ParallelTest",
            features = {"src/test/java/FeatureFiles"},
            glue = {"StepDefinitions"}

)

public class ExtentReports extends AbstractTestNGCucumberTests {



        }




