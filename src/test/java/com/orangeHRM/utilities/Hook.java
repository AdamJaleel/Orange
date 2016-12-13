package com.orangeHRM.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	private static WebDriver driver;
	
	
	@Before
	public void setUp(){
		if(driver == null || ((RemoteWebDriver)driver).getSessionId()==null){
			System.setProperty(TestInputs.CHROME_DRIVER, TestInputs.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		Base.driver = driver;
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}

}
