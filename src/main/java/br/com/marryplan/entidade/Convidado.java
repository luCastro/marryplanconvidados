package br.com.marryplan.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CONVIDADO")
public class Convidado extends Pessoa {
	
	
	@Column(name="CONFIRMACAO")
	private boolean confirmacaoConvidado;
	
	@Column(name="TIPOCONVITE")
	private boolean tipoDeConvite = true;
	
	@Column(name="PADRINHO")
	private boolean ePadrinho;
	
	
	public boolean isConfirmacaoConvidado() {
		return confirmacaoConvidado;
	}
	
	public void setConfirmacaoConvidado(boolean confirmacaoConvidado) {
		this.confirmacaoConvidado = confirmacaoConvidado;
	}
	
	public boolean isTipoDeConvite() {
		return tipoDeConvite;
	}
	
	public void setTipoDeConvite(boolean tipoDeConvite) {
		this.tipoDeConvite = tipoDeConvite;
	}
	
	public boolean isePadrinho() {
		return ePadrinho;
	}
	
	public void setePadrinho(boolean ePadrinho) {
		this.ePadrinho = ePadrinho;
	}
	
	

}
