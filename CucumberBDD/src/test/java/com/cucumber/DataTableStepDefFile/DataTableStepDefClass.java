package com.cucumber.DataTableStepDefFile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DataTableStepDefClass {

	WebDriver driver;
	
	@Given("^User need to be on login page$")
	public void user_need_to_be_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thapna\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	
	@When("^Enter the following data$")
	public void Enter_the_following_data(DataTable table) throws InterruptedException {
		
		List<List<String>> values=table.raw();
		
//		String values1 = values.get(0).get(0);
//		String values2 = values.get(0).get(1);
//		String values3 = values.get(0).get(2);
		
		String values4 = values.get(1).get(0);
		String values5 = values.get(1).get(1);
		String values6 = values.get(1).get(2);
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(values4);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(values5);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(values6);
		Thread.sleep(3000);
	}
	
	
	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
		driver=null;
		
	}
	
}
	
