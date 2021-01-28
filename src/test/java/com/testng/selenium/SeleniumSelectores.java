package com.testng.selenium;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumSelectores {
	private WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void selectorById() {
		fail("No implementado");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}