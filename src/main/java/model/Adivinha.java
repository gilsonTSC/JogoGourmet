package main.java.model;

public class Adivinha {

	private Prato prato;
	private Questao questao;
	
	public Adivinha() {
		this.prato = new Prato();
		this.questao = new Questao();
	}

	public Adivinha(Prato prato, Questao questao) {
		this.prato = prato;
		this.questao = questao;
	}


	public Prato getPrato() {
		return prato;
	}

	public Questao getQuestao() {
		return questao;
	}
	
	public String perguntaDescricaoPrato() {
		return this.questao.pratoEh(this.prato.getDescricao());
	}

	
}