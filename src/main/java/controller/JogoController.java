package main.java.controller;

import java.util.ArrayList;
import java.util.List;

import main.java.model.Prato;

public class JogoController {

	private List<Prato> pratos;
	
	public JogoController() {
		this.pratos = new ArrayList<>();
	}
	
	public void addPrato(String nome, String descricao, Boolean massa) {
		this.pratos.add(0, new Prato(nome, descricao, massa));
	}
	
	public List<Prato> findAll(){
		return this.pratos;
	}
	
}