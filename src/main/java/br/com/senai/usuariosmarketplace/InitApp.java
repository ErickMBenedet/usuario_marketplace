package br.com.senai.usuariosmarketplace;

import br.com.senai.usuariosmarketplace.core.dao.DaoUsuario;
import br.com.senai.usuariosmarketplace.core.dao.FactoryDao;
import br.com.senai.usuariosmarketplace.core.domain.Usuario;

public class InitApp {

	public static void main(String[] args) {
		DaoUsuario dao = FactoryDao.getInstance().getDaoUsuario();
		Usuario usuario = dao.buscarPor("crocodilo");
		if (usuario == null) {
			System.out.println("Não existe usuário");
		}else {
			System.out.println(usuario.getNomeCompleto());
		}
	}

}
