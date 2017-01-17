package br.com.marryplan.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.marryplan.dao.ConvidadoDAO;
import br.com.marryplan.entidade.Convidado;

@Repository
public class ConvidadoDAOImpl extends AbstractDAO implements ConvidadoDAO {

	@Override
	public void salvarConvidado(Convidado convidado) {
		this.getEntityManager().persist(convidado);
		
	}

	@Override
	public List<Convidado> listarConvidado() {
		Query query = super.getEntityManager().createQuery("select c from Convidado c");
		List<Convidado> listaConvidado = query.getResultList();
		getEntityManager().close();
		return listaConvidado;
	}

	@Override
	public void excluirConvidado(long id) {
		Convidado convidado = this.getEntityManager().find(Convidado.class, id);
		this.getEntityManager().remove(convidado);
		
	}

	@Override
	public void alterarConvidado(Convidado convidado) {
		this.getEntityManager().merge(convidado);
		
	}

	@Override
	public Convidado consultarConvidadoPorId(long id) {
		Query query = super.getEntityManager().createQuery("select c from Cliente c where c.id = : id");
		query.setParameter("id", id);
		Convidado convidadoConsultado = (Convidado) query.getSingleResult();
		getEntityManager().close();
		return convidadoConsultado;
	}

}
