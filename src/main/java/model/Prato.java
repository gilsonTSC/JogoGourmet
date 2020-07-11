package main.java.model;

import main.java.util.enums.TipoPrato;

public class Prato {

	private String nome;
	private String descricao;
	private TipoPrato tipo;
	
	public Prato() {
		this.nome = new String();
		this.descricao = new String();
		this.tipo = TipoPrato.NAO_EHMASSA;
	}
	
	public Prato(String nome, String descricao, TipoPrato tipo) {
		this.nome = nome;
		this.tipo = tipo;
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

	public TipoPrato getTipo() {
		return tipo;
	}

	public void setTipo(TipoPrato tipo) {
		this.tipo = tipo;
	}
	
}