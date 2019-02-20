package com.cucumber.SharedDataStepDefFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;


public class SharedDataStepDefClass2 {

	WebDriver driver;

	public SharedDataStepDefClass2(SharedDataClass shareDriver) {
		
		driver=shareDriver.setup();
	}
	
	@And("^User enters \"([^\"]*)\" Last Name$")
	public void user_enters_Last_Name(String lastname) {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		
	}
	
	
	@Then("^User checks user Last Name \"([^\"]*)\" is present$")
	public void user_checks_user_Last_Name_is_present(String lastname) {
		String actualText=driver.findElement(By.xpath("//input[@name='lastname']")).getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(lastname, actualText);
				
	}
	
	@But("^User mobile field should be blank$")
	public void user_mobile_field_should_be_blank() {
		String actualText=driver.findElement(By.xpath("//input[@name='reg_email__']")).getAttribute("value");
		Assert.assertEquals("", actualText);
		
	}

	
}
	
