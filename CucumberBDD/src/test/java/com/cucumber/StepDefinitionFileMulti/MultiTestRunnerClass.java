package com.cucumber.StepDefinitionFileMulti;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		features = { "src/test/resources/com/cucumber/FeatureFileMulti/" }, 
		glue = {"com/cucumber/StepDefinitionFileMulti/" }, 
		plugin = {

						"pretty", "html:target/cucumber-htmlreport8",
						"json:target/cucumber-jsonreport/cucumber-jsonreport8.json",
						"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html"

		})

public class MultiTestRunnerClass {

}
