package br.com.marryplan.service.impl;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;


import br.com.marryplan.dao.UsuarioDAO;
import br.com.marryplan.service.UsuarioService;
import br.com.marryplan.vo.UsuarioVO;
import br.com.marryplan.vo.converter.Converter;

public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired(required=true)
	private UsuarioDAO dao;

	@Override
	public String consultar(String login, String senha) {
		
		return null;
	}

}
