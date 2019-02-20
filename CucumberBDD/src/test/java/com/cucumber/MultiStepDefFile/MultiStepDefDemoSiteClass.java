package com.cucumber.MultiStepDefFile;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MultiStepDefDemoSiteClass {

	WebDriver driver;
	
	@Given("^User need to be on Demo Site login page$")
	public void user_need_to_be_on_Demo_Site_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thapna\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
	}
	
	@When("^User enters \"([^\"]*)\" in First Name$")
	public void user_enters_in_First_Name(String firstname) {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstname);
		
	}
	
	@Then("^User checks First Name \"([^\"]*)\" is present$")
	public void user_checks_First_Name_is_present(String firstname) {
		String actualText=driver.findElement(By.xpath("//input[@placeholder='First Name']")).getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(firstname, actualText);	
		
	}
	
	@Then("^Close the demo site browser$")
	public void close_the_demo_site_browser() {
		driver.quit();
		driver=null;
		
	}
	
}
	
