package com.testng.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
/**
 * <h1>Clase Selenium</h1>
 * Clase ejemplo de uso de selectores en Selenium y TestNG
 * @author Francisco Mora
 */
public class SeleniumSelectores {
	private WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}