package com.testng.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BusquedaGoogle {
	private WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void buscarEnGoogle() {
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
