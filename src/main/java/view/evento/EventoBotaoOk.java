package main.java.view.evento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import main.java.controller.JogoController;
import main.java.model.Prato;
import main.java.util.enums.TipoPrato;
import main.java.view.JogoView;

public class EventoBotaoOk implements ActionListener{
	
	private JogoController jogo;
	
	public EventoBotaoOk(JogoController jogo) {
		this.jogo = jogo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {	    
		TipoPrato tipo;
		boolean naoAcertou = true;
		
        int resposta = JOptionPane.showOptionDialog(null, "O prato que você pensou é massa?", "Confirm",
	               JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, JogoView.OPCOES[0], JogoView.OPCOES[0][0]);
        
        tipo = resposta == JOptionPane.YES_OPTION ? TipoPrato.EH_MASSA : TipoPrato.NAO_EHMASSA;
    	
    	for(Prato p : jogo.todosPratos(tipo)) {
	    	if(jogo.ehPratoInicial(p, tipo)) {
	    		resposta = JogoView.perguntaSimENao(p.getNome());
	    	}else {
	    		resposta = JogoView.perguntaSimENao(p.getDescricao());
	    		
	    		if(resposta == JOptionPane.YES_OPTION) {
	    			resposta = JogoView.perguntaSimENao(p.getNome());
	    			if(resposta == JOptionPane.NO_OPTION) {
	    				naoAcertou = true;
    		    		break;
	    			}
	    		}
	    	}
	    	if (resposta == JOptionPane.YES_OPTION) {
	    		JogoView.mensagemAcertei();
	    		naoAcertou = false;
	    		break;
	    	}
    	}
    	if(naoAcertou) {
    		String nome = JogoView.mensagemDesisto();
    		String descricao = JogoView.mensagemComplete(jogo.ultimoPrato(tipo).getNome(), nome);
    		
    		jogo.addPrato(nome, descricao, tipo);
    	}
	}

}