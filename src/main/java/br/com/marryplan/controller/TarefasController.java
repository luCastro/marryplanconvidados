package br.com.marryplan.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.marryplan.service.TarefasService;
import br.com.marryplan.vo.TarefasVO;



@Controller("tarefasMbean")
@Scope("session")
public class TarefasController {
	
	private TarefasService tarefasService;
	private List<TarefasVO> listaTarefasVO;
	
	private TarefasVO tarefas = new TarefasVO();
	
	@Autowired
	public TarefasController(TarefasService tarefasService){
		this.tarefasService = tarefasService;
	}

	public TarefasVO getTarefas() {
		return tarefas;
	}

	public void setTarefas(TarefasVO tarefas) {
		this.tarefas = tarefas;
	}
	
	public String salvar() {
		// Calling Business Service
		tarefasService.salvar(tarefas);;
		// Add message
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("A tarefa "+this.tarefas.getNome()+" foi gravado com sucesso!"));
		this.limparCampos();
		return "";
	}
	
	public void getListaProdutoVO() {
		tarefasService.listarTodos();
	}
	
	private void limparCampos(){
		this.tarefas = tarefas;
	
	}
	

}
