package com.cucumber.DataTableStepDefFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		features = { "src/test/resources/com/cucumber/DataTableFeatureFile/" }, 
		glue = {"com/cucumber/DataTableStepDefFile/" }, 
		plugin = {

						"pretty", "html:target/cucumber-htmlreport",
						"json:target/cucumber-jsonreport/cucumber-jsonreport3.json",
						"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"

		})

public class DataTableTestRunnerClass {

}
