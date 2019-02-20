package com.cucumber.SharedDataStepDefFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SharedDataStepDefClass {

	WebDriver driver;

	public SharedDataStepDefClass(SharedDataClass shareDriver) {
		
		driver=shareDriver.setup();
	}
	
	@Given("^User need to be on login page$")
	public void user_need_to_be_on_login_page() {
		
		driver.get("https://www.facebook.com/");
		
	}
	@When("^User enters \"([^\"]*)\" First Name$")
	public void user_enters_First_Name(String firstname) {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		
	}
	
	@Then("^User checks user First Name \"([^\"]*)\" is present$")
	public void user_checks_user_First_Name_is_present(String firstname) {
		String actualText=driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(firstname, actualText);
		
	}
		
}
	
