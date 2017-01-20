package br.com.marryplan.vo;

import java.util.Date;

public class TarefasVO {
	
	private long id;
	private String nome;
	private boolean status;
	private String realizado;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public void setRealizado(String realizado) {
		this.realizado = realizado;
	}
	
	public String getRealizado() {
		String label;
		if(this.getStatus()){
			label = "Realizado";
		}else{
			label = "Não Realizado";
		}
		return label;
	}

}
