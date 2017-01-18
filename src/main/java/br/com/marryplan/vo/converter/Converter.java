package br.com.marryplan.vo.converter;

import java.util.ArrayList;
import java.util.List;

import br.com.marryplan.entidade.Convidado;
import br.com.marryplan.vo.ConvidadoVO;

public class Converter {


	
	
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
