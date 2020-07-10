package main.java.model;

public class Questao {

	private String pratoEh;
	
	public Questao() {
		this.pratoEh = new String();
	}
	
	public Questao(String pratoEh) {
		this.pratoEh = pratoEh;
	}

	public String pratoEh(String descricao) {
		return this.pratoEh + " " + descricao + " ?";
	}

	public void setPratoEh(String pratoEh) {
		this.pratoEh = pratoEh;
	}
	
}