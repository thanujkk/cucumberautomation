package com.cucumber.SharedDataStepDefFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class SharedDataClass {

	WebDriver driver=null;
	
	@Before
	public WebDriver setup() {
		
		if(driver==null) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thapna\\eclipse-workspace\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
		
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
		driver=null;
		
	}
	
}
	
