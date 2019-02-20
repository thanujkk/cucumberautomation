package com.cucumber.SharedDataStepDefFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		features = { "src/test/resources/com/cucumber/SharedDataFeatureFile/" }, 
		glue = {"com/cucumber/SharedDataStepDefFile/" }, 
		plugin = {

						"pretty", "html:target/cucumber-htmlreport",
						"json:target/cucumber-jsonreport/cucumber-jsonreport7.json",
						"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html"

		})

public class SharedDataTestRunnerClass {

}
