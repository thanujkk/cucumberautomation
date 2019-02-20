package com.cucumber.TagsStepDefFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		
		//tags= {"@Important"},
		//tags= {"@Smoke","@Regression"},
		tags= {"@Smoke,@Regression"},
		
		features = { "src/test/resources/com/cucumber/TagsFeatureFile/" }, 
		glue = {"com/cucumber/TagsStepDefFile/" }, 
		plugin = {

						"pretty", "html:target/cucumber-htmlreport10",
						"json:target/cucumber-jsonreport/cucumber-jsonreport10.json",
						"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport10.html"

		})

public class TagsTestRunnerClass {

}
