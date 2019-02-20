package com.cucumber.StepDefinitionFileMulti;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MultiCucumberClass {

	WebDriver driver;
	
	@Given("^User need to be on login page$")
	public void user_need_to_be_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thapna\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	
	@When("^User enters First Name$")
	public void user_enters_First_Name() {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("David");
		
	}
	
	@And("^User enters Last Name$")
	public void user_enters_Last_Name() {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rogers");
		
	}
	
	@Then("^User checks user First Name is present$")
	public void user_checks_user_First_Name_is_present() {
		String actualText=driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals("David", actualText);
		
	}
	
	@And("^User checks user Last Name is present$")
	public void user_checks_user_Last_Name_is_present() {
		String actualText=driver.findElement(By.xpath("//input[@name='lastname']")).getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals("Rogers", actualText);
				
	}
	
	@But("^User mobile field should be blank$")
	public void user_mobile_field_should_be_blank() {
		String actualText=driver.findElement(By.xpath("//input[@name='reg_email__']")).getAttribute("value");
		Assert.assertEquals("", actualText);
		
	}
	
	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
		driver=null;
		
	}
	
}
	
