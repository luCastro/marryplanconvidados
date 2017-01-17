package br.com.marryplan.dao;

import java.util.List;

import br.com.marryplan.entidade.Convidado;

public interface ConvidadoDAO {
	
	public void salvarConvidado(Convidado convidado);
	public List<Convidado> listarConvidado();
	public void excluirConvidado(long id);
	public void alterarConvidado (Convidado convidado);
	public Convidado consultarConvidadoPorId(long id);
}
