package com.cucumber.ParameterizedStepDefFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		features = { "src/test/resources/com/cucumber/ParameterizedFeatureFile/" }, 
		glue = {"com/cucumber/ParameterizedStepDefFile/" }, 
		plugin = {

						"pretty", "html:target/cucumber-htmlreport",
						"json:target/cucumber-jsonreport/cucumber-jsonreport6.json",
						"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport6.html"

		})

public class ParameterizedTestRunnerClass {

}
