package br.com.marryplan.service;

import java.util.List;

import br.com.marryplan.entidade.Tarefas;
import br.com.marryplan.vo.TarefasVO;




public interface TarefasService {
	
	public void salvar(TarefasVO tarefas);
	public void excluir(long id);
	public Tarefas consultarTarefasPorId(long id);
	public List<TarefasVO> listarTodos();

}
