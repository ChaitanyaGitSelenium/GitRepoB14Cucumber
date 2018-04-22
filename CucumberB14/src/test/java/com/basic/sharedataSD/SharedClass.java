package com.basic.sharedataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	WebDriver driver;

	//pico container: used for dependency mgt. for all step definition. it create dependent object first and provide it to step definition
	
	@Before
	public WebDriver setup(){
		if(driver==null){
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Resources\\Radical\\chromedriver_win32-v2.37\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
		
	}
	
	
	@After
	public void tearDown(){
		driver.quit();
		driver =null;
	}
	
	

}
