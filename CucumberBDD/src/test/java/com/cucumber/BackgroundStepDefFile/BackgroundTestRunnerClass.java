package com.cucumber.BackgroundStepDefFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		features = { "src/test/resources/com/cucumber/BackgroundFeatureFile/" }, 
		glue = {"com/cucumber/BackgroundStepDefFile/" }, 
		plugin = {

						"pretty", "html:target/cucumber-htmlreport1",
						"json:target/cucumber-jsonreport/cucumber-jsonreport1.json",
						"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"

		})

public class BackgroundTestRunnerClass {

}
