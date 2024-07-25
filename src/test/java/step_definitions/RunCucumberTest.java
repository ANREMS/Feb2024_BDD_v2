package step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
//    tags = "@Registration",
//    features = {"src/test/resources/features/aregistration.feature"},
                features = {"src/test/resources/features"},
                glue = {"step_definitions"},
//        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
                plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                        "timeline:test-output-thread/"}
        )

public class RunCucumberTest  extends AbstractTestNGCucumberTests {

}
