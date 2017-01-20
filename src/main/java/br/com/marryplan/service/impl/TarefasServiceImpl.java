package br.com.marryplan.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.marryplan.dao.TarefasDAO;
import br.com.marryplan.entidade.Tarefas;
import br.com.marryplan.service.TarefasService;
import br.com.marryplan.vo.TarefasVO;
import br.com.marryplan.vo.converter.Converter;


@Service
public class TarefasServiceImpl implements TarefasService{
	
	
	@Autowired(required=true)
	private TarefasDAO dao;


	@Override
	@Transactional
	public void salvar(TarefasVO tarefasVO) {
		dao.salvar(Converter.converterVoParaTarefas(tarefasVO));
		
	}

	@Override
	@Transactional
	public void excluir(long id) {
		dao.excluir(id);
		
	}
	
	@Override
	@Transactional
	public void alterar(TarefasVO tarefasVO) {
		Tarefas tarefas = Converter.converterVoParaTarefas(tarefasVO);
		dao.alterar(tarefas);
		
	}

	@Override
	public List<TarefasVO> listarTodos() {
		List<Tarefas> listaTarefas  = dao.consultarTodos();
		return Converter.converterListaTarefasParaListaVo(listaTarefas);
	}
	
	
	@Override
	public Tarefas consultarTarefasPorId(long id) {
		
		return null;
	}


}
