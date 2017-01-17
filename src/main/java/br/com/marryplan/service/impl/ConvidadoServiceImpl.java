package br.com.marryplan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.marryplan.dao.ConvidadoDAO;
import br.com.marryplan.entidade.Convidado;
import br.com.marryplan.service.ConvidadoService;
import br.com.marryplan.vo.ConvidadoVO;
import br.com.marryplan.vo.converter.Converter;

@Service
public class ConvidadoServiceImpl implements ConvidadoService {
	
	@Autowired(required=true)
	private ConvidadoDAO dao;
	
	
	@Override
	@Transactional
	public void salvarConvidado(ConvidadoVO convidadoVO) {
		Convidado convidado = Converter.converterVOParaConvidado(convidadoVO);
		dao.salvarConvidado(convidado);
		
	}

	@Override
	public List<ConvidadoVO> listarConvidado() {
		List<Convidado> listaConvidado = dao.listarConvidado();
		return Converter.converterListaConvidadoParaListaVO(listaConvidado);
		
	}

	@Override
	@Transactional
	public void excluirConvidado(long id) {
		dao.excluirConvidado(id);
		
	}

	@Override
	@Transactional
	public void alterarConvidado(ConvidadoVO convidadoVO) {
		Convidado convidado = Converter.converterVOParaConvidado(convidadoVO);
		dao.alterarConvidado(convidado);
		
	}

	@Override
	public ConvidadoVO consultarConvidadoPorId(long id) {
		Convidado convidado = dao.consultarConvidadoPorId(id);
		return Converter.converterConvidadoParaVO(convidado);
	}

}
