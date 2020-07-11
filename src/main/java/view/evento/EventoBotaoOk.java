package main.java.view.evento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import main.java.controller.JogoController;
import main.java.model.Prato;
import main.java.util.enums.TipoPrato;

public class EventoBotaoOk implements ActionListener{
	
	private JogoController jogo;
	
	public EventoBotaoOk(JogoController jogo) {
		this.jogo = jogo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {	    
	    Object[][] options = {{"Sim", "Não"}, {"Ok"}};
		 
        int resposta = JOptionPane.showOptionDialog(null, "O prato que você pensou é massa?",
	               "Confirm",
	               JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options[0], options[0][0]);
        
        if (resposta == JOptionPane.YES_OPTION) {
        	
        	for(Prato p : jogo.todoPreatosMassa()) {
    	    	    	    	
    		    if (resposta == JOptionPane.YES_OPTION) {
    		    	resposta = JOptionPane.showOptionDialog(null, "O prato que você pensou é " + p.getNome() + "?",
    			               "Confirm",
    			               JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options[0], options[0][0]);
    		    	if (resposta == JOptionPane.YES_OPTION) {
    		    		JOptionPane.showOptionDialog(null, "Acertei de novo!",
    				               "Jogo Gourmet",
    				               JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options[1], options[0][1]);
    		    		break;
    		    	}else {		    		
    		    		String nome = JOptionPane.showInputDialog(null, "Qual prato você pensou?",
    		                    	  "Desisto", JOptionPane.INFORMATION_MESSAGE);
    		    		
    		    		String descricao = JOptionPane.showInputDialog(null, nome + "  é ______ mas " + p.getNome() + " não.",
    		                    	  	   "Complete", JOptionPane.INFORMATION_MESSAGE);
    		    		
    		    		jogo.addPrato(nome, descricao, TipoPrato.EH_MASSA);
    		    		break;
    		    	}
    		    }
        	}
        	
        }else {
        	for(Prato p : jogo.todoPreatosNaoMassa()) {
    	    	    	    	
    		    if (resposta == JOptionPane.YES_OPTION) {
    		    	resposta = JOptionPane.showOptionDialog(null, "O prato que você pensou é " + p.getNome() + "?",
    			               "Confirm",
    			               JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options[0], options[0][0]);
    		    	if (resposta == JOptionPane.YES_OPTION) {
    		    		JOptionPane.showOptionDialog(null, "Acertei de novo!",
    				               "Jogo Gourmet",
    				               JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options[1], options[0][1]);
    		    		break;
    		    	}else {		    		
    		    		String nome = JOptionPane.showInputDialog(null, "Qual prato você pensou?",
    		                    	  "Desisto", JOptionPane.INFORMATION_MESSAGE);
    		    		
    		    		String descricao = JOptionPane.showInputDialog(null, nome + "  é ______ mas " + p.getNome() + " não.",
    		                    	  	   "Complete", JOptionPane.INFORMATION_MESSAGE);
    		    		
    		    		jogo.addPrato(nome, descricao, TipoPrato.NAO_EHMASSA);
    		    		break;
    		    	}
    		    }
    		}
        }
	}

}