package br.com.marryplan.controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


import br.com.marryplan.service.TarefasService;
import br.com.marryplan.service.UsuarioService;
import br.com.marryplan.vo.TarefasVO;
import br.com.marryplan.vo.UsuarioVO;

@ManagedBean(name = "usuarioMbean")
@SessionScoped
public class UsuarioController extends AbstractController{
	
	private UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController(UsuarioService usuarioService){
		this.usuarioService = usuarioService;
	}
	
	@PostConstruct
	public void init(){
		super.getConfigSpring();
	}
	
	private UsuarioVO usuario = new UsuarioVO();
	
	
	public String verificarUsuario(){
		String retorno = usuarioService.consultar(usuario.getLogin(), usuario.getSenha());
		String tela = "";
		if(retorno == null){
			tela = "telA";
		}else{
			tela  = "/tarefas/cadastrar.xhtml";
		}
		
		return tela;
	}
	}
