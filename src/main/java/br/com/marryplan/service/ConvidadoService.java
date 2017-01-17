package br.com.marryplan.service;

import java.util.List;

import br.com.marryplan.vo.ConvidadoVO;

public interface ConvidadoService {
	
	public void salvarConvidado(ConvidadoVO convidadoVO);
	public List<ConvidadoVO> listarConvidado();
	public void excluirConvidado(long id);
	public void alterarConvidado (ConvidadoVO convidadoVO);
	public ConvidadoVO consultarConvidadoPorId(long id);

}
