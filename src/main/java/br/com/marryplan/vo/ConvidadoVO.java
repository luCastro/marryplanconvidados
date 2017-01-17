package br.com.marryplan.vo;

import java.io.Serializable;


@SuppressWarnings("serial")
public class ConvidadoVO implements Serializable{
	
	private long id;
	private String nome;
	private String telefone;
	private String email;
	private boolean confirmacaoConvidado;
	private boolean tipoDeConvite;
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

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
