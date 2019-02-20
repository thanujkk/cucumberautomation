package com.cucumber.StepDefinitionFileSingle;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		features = { "src/test/resources/com/cucumber/FeatureFileSingle/" }, 
		glue = {"com/cucumber/StepDefinitionFileSingle/" }, 
		plugin = {

						"pretty", "html:target/cucumber-htmlreport9",
						"json:target/cucumber-jsonreport/cucumber-jsonreport9.json",
						"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport9.html"

		})

public class TestRunnerClass {

}
