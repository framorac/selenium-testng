package com.testng.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/*
 * Debes registrar un usuario previamente en https://demoqa.com/register
 * */
public class LoginPagina {
	final WebDriver driver;
	
	@FindBy(id="userName")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;

	@FindBy(id="login")
	WebElement btnLogin;
	
	public LoginPagina(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginAction(String userName, String pwd) {
		username.sendKeys(userName);
		password.sendKeys(pwd);
		btnLogin.click();
	}
}