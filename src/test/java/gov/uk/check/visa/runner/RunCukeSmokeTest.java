package gov.uk.check.visa.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "gov/uk/check/visa/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html", //default cucumber plug in
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",  // extent report plug in
                "json:target/cucumber-reports/cucumber.json"},
        tags = "@smoke"
        //dryRun = true
)

public class RunCukeSmokeTest extends AbstractTestNGCucumberTests {

}