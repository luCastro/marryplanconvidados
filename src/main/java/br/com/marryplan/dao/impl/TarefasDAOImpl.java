package br.com.marryplan.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.marryplan.dao.TarefasDAO;
import br.com.marryplan.entidade.Tarefas;



@Repository
public class TarefasDAOImpl extends AbstractDAO implements TarefasDAO{
	
	@Override
	public void salvar(Tarefas tarefas) {
		super.getEntityManager().persist(tarefas);
		
	}

	@Override
	public void excluir(long id) {
		Tarefas tarefa = this.consultarPorId(id);
		this.getEntityManager().remove(tarefa);
		
	}
	
	@Override
	public void alterar(Tarefas tarefas) {
		this.getEntityManager().merge(tarefas);
		
	}
	
	@Override
	public Tarefas consultarPorId(long id) {
		return super.getEntityManager().find(Tarefas.class, id);
	}

	@Override
	public List<Tarefas> consultarTodos() {
		Query query = super.getEntityManager().createQuery("select tar from Tarefas tar");
		List<Tarefas> listarTarefas = query.getResultList();
		getEntityManager().close();
		return listarTarefas;
	}

	
}
