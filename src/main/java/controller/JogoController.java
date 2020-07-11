package main.java.controller;

import java.util.ArrayList;
import java.util.List;

import main.java.model.Prato;
import main.java.util.enums.TipoPrato;

public class JogoController {

	private List<Prato> pratosMassa;
	private List<Prato> pratosNaoMassa;
	
	public JogoController() {
		this.pratosMassa = new ArrayList<>();
		this.pratosNaoMassa = new ArrayList<>();
	}
	
	public void addPrato(String nome, String descricao, TipoPrato tipo) {
		Prato p = new Prato(nome, descricao, tipo);
		
		if(tipo.equals(TipoPrato.EH_MASSA)) {
			this.pratosMassa.add(0, p);
		}else {
			this.pratosNaoMassa.add(0, p);
		}
	}
	
	public List<Prato> todosPratos(TipoPrato tipo){
		if(tipo.equals(TipoPrato.EH_MASSA)) {
			return this.pratosMassa;
		}else {
			return this.pratosNaoMassa;
		}
	}
	
	public boolean ehPratoInicial(Prato prato, TipoPrato tipo) {
		return prato.equals(this.ultimoPrato(tipo));
	}
	
	public Prato ultimoPrato(TipoPrato tipo) {
		if(tipo.equals(TipoPrato.EH_MASSA)) {
			int ultimo = this.pratosMassa.size() - 1;
			return this.pratosMassa.get(ultimo);
		}else {
			int ultimo = this.pratosNaoMassa.size() - 1;
			return this.pratosNaoMassa.get(ultimo);
		}
	}
	
}