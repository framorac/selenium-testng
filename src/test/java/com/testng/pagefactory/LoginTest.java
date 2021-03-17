package com.testng.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/geckodriver_linux_29");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
	}
	
	@Test
	public void login() {
		LoginPagina loginPage = PageFactory.initElements(driver, LoginPagina.class);
		PerfilPagina perfilPage = PageFactory.initElements(driver, PerfilPagina.class);
		
		loginPage.loginAction("admin", "admin");
		perfilPage.verificarUsuario("admin");
		perfilPage.logoutAction();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}