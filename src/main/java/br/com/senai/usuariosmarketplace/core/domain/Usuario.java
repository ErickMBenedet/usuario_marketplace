package br.com.senai.usuariosmarketplace.core.domain;

public class Usuario {

	private String login;
	private String senha;
	private String nomeCompleto;
	
	public Usuario(String login, String senha, String nomeCompleto) {
		this.login = login;
		this.senha = senha;
		this.nomeCompleto = nomeCompleto;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	
}
