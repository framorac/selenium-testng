package com.testng.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BusquedaGoogle {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/driver/")
		driver = new FirefoxDriver()
	}
	
	@Test
	public void buscarEnGoogle() {
		
	}
	
	@AfterClass
	public void tearDown() {
		
	}
}
