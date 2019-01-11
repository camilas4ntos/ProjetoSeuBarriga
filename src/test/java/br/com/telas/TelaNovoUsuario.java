package br.com.telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaNovoUsuario {
	
	public WebElement clicarNovoUsuario(WebDriver driver) {
		return driver.findElement(By.xpath("//a[contains(text(),'Novo usuário?')]"));
	}

	public WebElement clicarLogin(WebDriver driver) {
		return driver.findElement(By.linkText("Login"));
	}
	
	
	public WebElement nome(WebDriver driver) {
		return driver.findElement(By.id("nome"));
	}
	
	public WebElement email(WebDriver driver) {
		return driver.findElement(By.id("email"));
	}
	
	public WebElement senha(WebDriver driver) {
		return driver.findElement(By.id("senha"));
	}
	
	public WebElement botaoCadastrar(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@value='Cadastrar']"));
	}
	
}
