package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
		(
		features= {".//Features/"},
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true, // Console output in readable format
		plugin= {"pretty",
				"html:target/cucumber-report.html",
				"json:target/cucumber.json",
				//"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:test-output/report.html"
				},
		tags= {"@sanity, @regression"}
		)

public class TestRun {

 
}
