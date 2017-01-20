	package br.com.marryplan.dao;

import java.util.List;


import br.com.marryplan.entidade.Tarefas;




public interface TarefasDAO {
	
	public void salvar(Tarefas tarefas);
	public void excluir(long id);
	public void alterar(Tarefas tarefas);
	public Tarefas consultarPorId(long id);
	public List<Tarefas> consultarTodos();

}
