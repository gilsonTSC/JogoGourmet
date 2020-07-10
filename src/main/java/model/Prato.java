package main.java.model;

public class Prato {

	private String nome;
	private String descricao;
	private Boolean massa;
	
	public Prato() {
		this.nome = new String();
		this.descricao = new String();
		this.massa = null;
	}
	
	public Prato(String nome, String descricao, Boolean massa) {
		this.nome = nome;
		this.massa = massa;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getMassa() {
		return massa;
	}

	public void setMassa(Boolean massa) {
		this.massa = massa;
	}
	
}