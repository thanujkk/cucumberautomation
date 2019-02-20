package com.cucumber.HooksStepDefFile;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HooksStepDefClass {

	WebDriver driver;
	
	@Before
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thapna\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	
	@When("^User enters \"([^\"]*)\" First Name$")
	public void user_enters_First_Name(String firstname) {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		
	}
	
	@And("^User enters \"([^\"]*)\" Last Name$")
	public void user_enters_Last_Name(String lastname) {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		
	}
	
	@Then("^User checks user First Name \"([^\"]*)\" is present$")
	public void user_checks_user_First_Name_is_present(String firstname) {
		String actualText=driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(firstname, actualText);
		
	}
	
	@And("^User checks user Last Name \"([^\"]*)\" is present$")
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
	
	@After
	public void closeBrowser() {
		driver.quit();
		driver=null;
		
	}
	
}
	
