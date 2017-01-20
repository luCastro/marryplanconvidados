package br.com.marryplan.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.marryplan.service.ConvidadoService;
import br.com.marryplan.vo.ConvidadoVO;


@ManagedBean(name = "convidadoMbean")
@SessionScoped
public class ConvidadoController extends AbstractController {
	
	public static String TELA_LISTA_TODOS = "/convidado/listaconvidado.xhtml";
	public static String TELA_CADASTRAR_CONVIDADO = "/convidado/cadconvidado.xhtml";

	@Autowired
	private ConvidadoService convidadoService;
	
	private List<ConvidadoVO> listaConvidadoVO;
	
	@PostConstruct
	private void init() {
		super.getConfigSpring();
		this.listaConvidadoVO = convidadoService.listarConvidado();
	}
	
	private ConvidadoVO convidado = new ConvidadoVO();

	public ConvidadoVO getConvidado() {
		return convidado;
	}

	public void setConvidado(ConvidadoVO convidado) {
		this.convidado = convidado;
	}
	
	
	private void limparCampos() {
		this.getConvidado().setNome(null);
		this.getConvidado().setTelefone(null);
		this.getConvidado().setEmail(null);
	}
	
	public String salvar(){
		convidadoService.salvarConvidado(convidado);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Convidado gravado com sucesso!"));
		this.limparCampos();
		return "";
	}
	
	public void alterar(RowEditEvent event){
		ConvidadoVO convidadoVOAlterado = ((ConvidadoVO) event.getObject());
		convidadoService.alterarConvidado(convidadoVOAlterado);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Convidado alterado com sucesso!"));

	}
	
	public void cancelarEdicao(RowEditEvent event){
		FacesMessage msg = new FacesMessage("Edição Cancelada!", ((ConvidadoVO) event.getObject()).getNome());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public String excluir (ConvidadoVO convidadoVO){
		if(convidadoVO != null && convidadoVO.getId() != 0){
			this.convidadoService.excluirConvidado(convidadoVO.getId());
		}
		this.listaConvidadoVO = convidadoService.listarConvidado();
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Convidado excluido com sucesso!"));
		return "";
	}

	public List<ConvidadoVO> getListaConvidadoVO() {
		return listaConvidadoVO;
	}
	
	public String chamarTelaTodosConvidados(){
		listaConvidadoVO = convidadoService.listarConvidado();
		return TELA_LISTA_TODOS;
	}
	
	public String chamarTelaCadastroConvidado(){
		return TELA_CADASTRAR_CONVIDADO;
	}
	

}
