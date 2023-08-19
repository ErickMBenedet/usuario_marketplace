package br.com.senai.usuariosmarketplace;

import br.com.senai.usuariosmarketplace.core.service.UsuarioService;

public class InitApp {

	public static void main(String[] args) {
		UsuarioService service = new UsuarioService();
		System.out.println(service.removerAcentoDo("Jacóbrião da Silva"));
		System.out.println(service.fracionar("Jacóbrião da Silva dos Santo Barbosa das Flores do Cu de Andrade e Buteco"));
		System.out.println(service.gerarLoginPor("Josép dos Anjinho"));
		System.out.println(service.gerarHashDa("jose1234"));
	}

}
