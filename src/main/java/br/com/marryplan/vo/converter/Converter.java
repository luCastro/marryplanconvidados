package br.com.marryplan.vo.converter;

import java.util.ArrayList;
import java.util.List;

import br.com.marryplan.entidade.Convidado;
import br.com.marryplan.entidade.Tarefas;
import br.com.marryplan.entidade.Usuario;
import br.com.marryplan.vo.ConvidadoVO;
import br.com.marryplan.vo.TarefasVO;
import br.com.marryplan.vo.UsuarioVO;

public class Converter {

	public static Tarefas converterVoParaTarefas(TarefasVO tarefasVO){
		Tarefas tarefas = new Tarefas();
		tarefas.setId(tarefasVO.getId());
		tarefas.setNome(tarefasVO.getNome());
		tarefas.setStatus(tarefasVO.getStatus());

		return tarefas;
	}

	public static TarefasVO converterTarefasParaVO(Tarefas tarefas){
		TarefasVO tarefasVO = new TarefasVO();
		
		tarefasVO.setId(tarefas.getId());
		tarefasVO.setNome(tarefas.getNome());
		tarefasVO.setStatus(tarefas.isStatus());
		
		return tarefasVO;
	}

	public static List<TarefasVO> converterListaTarefasParaListaVo(List<Tarefas> listaEntidade){
		
		List<TarefasVO> listTarefasVO = new ArrayList<TarefasVO>();
		if(listaEntidade != null && !listaEntidade.isEmpty()){
			for(Tarefas tarefas : listaEntidade){
				TarefasVO tarefasVO = converterTarefasParaVO(tarefas);
				listTarefasVO.add(tarefasVO);
			}
		}
		return listTarefasVO;
	}	
	
	public static UsuarioVO converterusuarioparavo (Usuario usuario){
		UsuarioVO usuarioVO = new UsuarioVO();
		
		usuarioVO.setId(usuario.getId());
		usuarioVO.setLogin(usuario.getLogin());
		usuarioVO.setSenha(usuario.getSenha());
		
		return usuarioVO;
	}
	
	public static Usuario convertervoparausuario (UsuarioVO usuarioVO){
		Usuario usuario = new Usuario();
		
		usuario.setId(usuarioVO.getId());
		usuario.setLogin(usuarioVO.getLogin());
		usuario.setSenha(usuarioVO.getSenha());
		
		return usuario;
	}
	
	
	public static Convidado converterVOParaConvidado(ConvidadoVO convidadoVO){
		Convidado convidado = new Convidado();
		
		convidado.setNomePessoa(convidadoVO.getNome());
		convidado.setTelefonePessoa(convidadoVO.getTelefone());
		convidado.setEmail(convidadoVO.getEmail());
		convidado.setConfirmacaoConvidado(convidadoVO.isConfirmacaoConvidado());
		convidado.setTipoDeConvite(convidadoVO.isTipoDeConvite());
		convidado.setePadrinho(convidadoVO.isePadrinho());
		return convidado;	
	}
	
	public static ConvidadoVO converterConvidadoParaVO(Convidado convidado){
		ConvidadoVO convidadoVO = new ConvidadoVO();
		
		convidadoVO.setId(convidado.getId());
		convidadoVO.setNome(convidado.getNomePessoa());
		convidadoVO.setTelefone(convidado.getTelefonePessoa());
		convidadoVO.setEmail(convidado.getEmail());
		convidadoVO.setConfirmacaoConvidado(convidado.isConfirmacaoConvidado());
		convidadoVO.setTipoDeConvite(convidado.isTipoDeConvite());
		convidadoVO.setePadrinho(convidado.isePadrinho());

		return convidadoVO;		
	}
	
	public static List<ConvidadoVO> converterListaConvidadoParaListaVO (List<Convidado> listaEntidade){
		
		List<ConvidadoVO> listConvidadoVO = new ArrayList<ConvidadoVO>();
		if(listaEntidade != null && !listaEntidade.isEmpty()){
			for(Convidado convidado : listaEntidade){
				ConvidadoVO convidadoVO = converterConvidadoParaVO(convidado);
				listConvidadoVO.add(convidadoVO);
			}
		}
		return listConvidadoVO;
			
	}
	
	
}
