package main.java;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import main.java.controller.JogoController;
import main.java.model.Prato;

public class JogoGourmetApplication {

	public static void main(String[] args) {
				
		// Cria um JFrame
	    JFrame frame = new JFrame("JOptionPane exemplo");
	    JogoController jogo = new JogoController();
	    
	    //Add valores iniciais 
	    jogo.addPrato("Bolo de Chocolate", null, false);
	    jogo.addPrato("Lasanha", null, true);
	    
	    do {
		    JOptionPane.showMessageDialog(null, "Pense em um prato que gosta");
		    
		    for(Prato p : jogo.findAll()) {
		    	int resposta = JOptionPane.showConfirmDialog(frame,
															 "O prato que você pensou é massa?", 
															 "Confirm", 
															 JOptionPane.YES_NO_OPTION);
		    	
			    if (resposta == JOptionPane.YES_OPTION) {
			    	resposta = JOptionPane.showConfirmDialog(frame,
			    											 "O prato que você pensou é " + p.getNome() + " ?", 
															 "Confirm", 
															 JOptionPane.YES_NO_OPTION);
			    	if (resposta == JOptionPane.YES_OPTION) {
			    		JOptionPane.showMessageDialog(null, "Acertei de novo!");
			    		break;
			    	}else {
			    		String nome = JOptionPane.showInputDialog("Qual prato você pensou ?");
			    		String descricao = JOptionPane.showInputDialog(nome + "  é ______ mas " + p.getNome() + " não.");
			    		jogo.addPrato(nome, descricao, true);
			    		break;
			    	}
			    }else {
			       JOptionPane.showMessageDialog(null, "Adeus");
			       System.exit(0);
			    }
		    }
	    }while(true);
	    
	    
		
	}

}