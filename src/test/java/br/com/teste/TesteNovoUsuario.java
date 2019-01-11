package br.com.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import br.com.funcionalidades.NovoUsuario;

public class TesteNovoUsuario {

	NovoUsuario novoUsuario = new NovoUsuario();

	@After
	public void acessar() {
		
	}

	@Test
	public void testNovoUsuario() throws InterruptedException {
		novoUsuario.acessarUrl();
		novoUsuario.clicarNovoUsuario();
		novoUsuario.preencherNome();
		novoUsuario.preencherEmail();
		novoUsuario.preencherSenha();
		novoUsuario.clicarCadastrar();

	}

	@Before
	public void fechar() {
		
	}
}
