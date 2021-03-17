package com.testng.basico;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BusquedaGoogle {
	private WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/geckodriver_linux_29");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@Test(priority = 1)
	public void buscarEnGoogle() {
		WebElement cajaBusqueda = driver.findElement(By.name("q"));
		cajaBusqueda.clear();
		cajaBusqueda.sendKeys("selenium", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("selenium - Buscar con Google", driver.getTitle());
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
