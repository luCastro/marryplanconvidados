package br.com.marryplan.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


import br.com.marryplan.service.TarefasService;
import br.com.marryplan.vo.TarefasVO;


@ManagedBean(name = "tarefasMbean")
@SessionScoped
public class TarefasController extends AbstractController{
	
	

	@Autowired
	private TarefasService tarefasService;
	private List<TarefasVO> listaTarefasVO;
	
	@PostConstruct
	public void init(){
		super.getConfigSpring();
		listaTarefasVO = tarefasService.listarTodos();
	}

	private TarefasVO tarefas = new TarefasVO();
	
	public TarefasVO getTarefas() {
		return tarefas;
	}

	public void setTarefas(TarefasVO tarefas) {;
		this.tarefas = tarefas;
	}
	
	public String salvar() {
		// Calling Business Service
		tarefasService.salvar(tarefas);;
		// Add message
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("A tarefa "+this.tarefas.getNome()+" foi gravado com sucesso!"));
		listaTarefasVO = tarefasService.listarTodos();
		return "";
	}
	
	public void alterar(RowEditEvent event) {

		TarefasVO tarefasVOAlterado = ((TarefasVO) event.getObject());
		tarefasService.alterar(tarefasVOAlterado);

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Tarefa alterada com sucesso!"));

	}

	public List<TarefasVO> getListaTarefasVO() {
		return listaTarefasVO;
	}

	public void setListaTarefasVO(List<TarefasVO> listaTarefasVO) {
		this.listaTarefasVO = listaTarefasVO;
	}
	
	public String excluir(TarefasVO tarefasVO) {
		if (tarefasVO != null && tarefasVO.getId() != 0) {
			this.tarefasService.excluir(tarefasVO.getId());
		}
		this.listaTarefasVO = tarefasService.listarTodos();
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Tarefa excluida com sucesso!"));
		return "";
	}
	
}
