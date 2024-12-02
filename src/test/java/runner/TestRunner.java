package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features", 
		glue = { "stepdefinitions", "hooks" }, 
		plugin = { "pretty",
		"html:target/Cucumber_Report/CucumberReport.html",
		"json:target/Cucumber_Report/CucumberReport.json",
		"junit:target/Cucumber_Report/CucumberReport.junit" },
		tags = "@all", 
		dryRun = false,
		publish=true) // tags = "@smoke and not

																								// @nocredentials"
public class TestRunner extends AbstractTestNGCucumberTests{

}
