package main.java.view;

import java.awt.Button;

import javax.swing.JOptionPane;

import main.java.controller.JogoController;
import main.java.util.enums.TipoPrato;
import main.java.view.evento.EventoBotaoOk;

public class JogoView {

	public static final Object[][] OPCOES = {{"Sim", "Não"}, {"Ok"}};
	
	private JogoController jogo;
	
	public JogoView() {
		this.jogo = new JogoController();
	}
	
	public void iniciar() {
		jogo.addPrato("Bolo de Chocolate", null, TipoPrato.NAO_EHMASSA);
	    jogo.addPrato("Lasanha", null, TipoPrato.EH_MASSA);
	    
		Button b = new Button("Ok");
	    b.addActionListener(new EventoBotaoOk(this.jogo));
		Button[] opcoes = {b};
	    
	    JOptionPane.showOptionDialog(null, "Pense em um prato que gosta", "Jogo Gourmet",
	               JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
	}
	
	public static int perguntaSimENao(String texto) {
		return JOptionPane.showOptionDialog(null, "O prato que você pensou é " + texto + "?", "Confirm",
	               		  JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, OPCOES[0], OPCOES[0][0]);
	}
	
	public static void mensagemAcertei() {
		JOptionPane.showOptionDialog(null, "Acertei de novo!", "Jogo Gourmet",
	               JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, OPCOES[1], OPCOES[0][1]);
	}
	
	public static String mensagemDesisto() {
		return JOptionPane.showInputDialog(null, "Qual prato você pensou?", "Desisto", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static String mensagemComplete(String nomePrato, String nomePratoNovo) {
		return JOptionPane.showInputDialog(null, nomePratoNovo + "  é ______ mas " + nomePrato + " não.", "Complete", JOptionPane.INFORMATION_MESSAGE);
	}
	
}