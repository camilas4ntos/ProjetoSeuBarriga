package br.com.funcionalidades;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.telas.TelaNovoUsuario;

public class NovoUsuario {
	

	WebDriver driver = new ChromeDriver();
	TelaNovoUsuario telaNovoUsuario = new TelaNovoUsuario();
	String nome = "Testenome";
	String senha = "123456";
	String email = "email2@email.com.br";

	public void acessarUrl() {

		driver.manage().window().maximize();
		driver.get("https://srbarriga.herokuapp.com/login");
	}

	public void clicarNovoUsuario() {
		telaNovoUsuario.clicarNovoUsuario(driver).click();
	}

	public void preencherNome() {
		telaNovoUsuario.nome(driver).sendKeys(nome);
	}
	
	public void preencherEmail() {
		telaNovoUsuario.email(driver).sendKeys(email);
	}
	
	public void preencherSenha() {
		telaNovoUsuario.senha(driver).sendKeys(senha);
	}
	
	public void clicarCadastrar() {
		telaNovoUsuario.botaoCadastrar(driver).click();
	}
	
	public void fecharJanela() {
		driver.quit();
	}
}
