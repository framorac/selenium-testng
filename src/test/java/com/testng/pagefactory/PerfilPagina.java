package com.testng.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PerfilPagina {
	final WebDriver driver;
	@FindBy(id="userName-value")
	WebElement usuario;
	
	@FindBy(id="submit")
	WebElement btnLogout;
		
	public PerfilPagina(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean verificarUsuario(String username) {
		boolean isValido = false;
		if (usuario.getText().equalsIgnoreCase(username)) {
			System.out.println("Usuario: " + usuario.getText());
			isValido = true;
		} else {
			System.out.println("Usuario: " + usuario.getText());
			isValido = false;
		}
		
		return isValido;
	}
	
	public void logoutAction() {
		System.out.println("-- Saliendo --");
		btnLogout.click();
	}
}