package com.cucumber.DataDrivenStepDefFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		features = { "src/test/resources/com/cucumber/DataDrivenFeatureFile/" }, 
		glue = {"com/cucumber/DataDrivenStepDefFile/" }, 
		plugin = {

						"pretty", "html:target/cucumber-htmlreport",
						"json:target/cucumber-jsonreport/cucumber-jsonreport2.json",
						"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport2.html"

		})

public class DataDrivenTestRunnerClass {

}
