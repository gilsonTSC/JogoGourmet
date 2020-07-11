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
	
	public List<Prato> todoPreatosMassa(){
		return this.pratosMassa;
	}
	
	public List<Prato> todoPreatosNaoMassa(){
		return this.pratosNaoMassa;
	}
	
}