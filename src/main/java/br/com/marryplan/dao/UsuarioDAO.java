package br.com.marryplan.dao;

import br.com.marryplan.entidade.Usuario;

public interface UsuarioDAO{
	
	
	public boolean consultar (String login, String senha);
}
