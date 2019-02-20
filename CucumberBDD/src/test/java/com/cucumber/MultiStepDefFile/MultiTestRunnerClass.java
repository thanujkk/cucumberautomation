package com.cucumber.MultiStepDefFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		features = { "src/test/resources/com/cucumber/MultiFeatureFile/" }, 
		glue = {"com/cucumber/MultiStepDefFile/" }, 
		plugin = {

						"pretty", "html:target/cucumber-htmlreport5",
						"json:target/cucumber-jsonreport/cucumber-jsonreport5.json",
						"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"

		})

public class MultiTestRunnerClass {

}
