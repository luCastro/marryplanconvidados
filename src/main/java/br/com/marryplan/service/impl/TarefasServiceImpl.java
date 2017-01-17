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
	public void excluir(long id) {
		dao.excluir(id);
		
	}

	@Override
	public List<TarefasVO> listarTodos() {
		return Converter.converterListaTarefasParaListaVo(
				dao.consultarTodos());
	}
	
	@Override
	public Tarefas consultarTarefasPorId(long id) {
		
		return null;
	}


}
