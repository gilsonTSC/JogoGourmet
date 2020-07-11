package main.java.view;

import java.awt.Button;

import javax.swing.JOptionPane;

import main.java.controller.JogoController;
import main.java.util.enums.TipoPrato;
import main.java.view.evento.EventoBotaoOk;

public class JogoView {

	private JogoController jogo;
	
	public JogoView() {
		this.jogo = new JogoController();
	}
	
	public void start() {
		jogo.addPrato("Bolo de Chocolate", null, TipoPrato.NAO_EHMASSA);
	    jogo.addPrato("Lasanha", null, TipoPrato.EH_MASSA);
	    
		Button b = new Button("Ok");
	    b.addActionListener(new EventoBotaoOk(this.jogo));
		Button[] options = {b};
	    
	    JOptionPane.showOptionDialog(null, "Pense em um prato que gosta",
	               "Jogo Gourmet",
	               JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
	}
	
}