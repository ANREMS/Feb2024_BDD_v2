package step_definitions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
        (

                features = {"src/test/resources/features"},
                glue = {"step_definitions"},
                plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        )

public class RunCucuTest extends AbstractTestNGCucumberTests {


}
