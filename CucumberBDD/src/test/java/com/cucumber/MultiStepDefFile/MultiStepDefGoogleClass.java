package com.cucumber.MultiStepDefFile;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MultiStepDefGoogleClass {

	WebDriver driver;
	
	@Given("^User need to be on Google Search page$")
	public void user_need_to_beon_Google_Search_pagee() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thapna\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		
	}
	
	@When("^User enters \"([^\"]*)\" in Search field$")
	public void user_enters_in_Search_field(String searchstring) {
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(searchstring);
		
	}
	
	@Then("^User checks Search string \"([^\"]*)\" is present$")
	public void user_checks_Search_string_is_present(String searchstring) {
		String actualText=driver.findElement(By.xpath("//input[@title='Search']")).getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(searchstring, actualText);
		
	}
	
	@Then("^Close the google browser$")
	public void close_the_google_browser() {
		driver.quit();
		driver=null;
		
	}
	
}
	
