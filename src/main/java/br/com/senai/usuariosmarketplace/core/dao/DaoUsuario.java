package br.com.senai.usuariosmarketplace.core.dao;

import br.com.senai.usuariosmarketplace.core.domain.Usuario;

public interface DaoUsuario {

	public void inserirUsuario(Usuario usuario);
	
	public void alterarUsuario(Usuario usuario);
	
	public Usuario buscarPor(String login);
}
