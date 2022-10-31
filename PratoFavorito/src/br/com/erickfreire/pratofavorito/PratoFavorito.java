package br.com.erickfreire.pratofavorito;

import javax.swing.JOptionPane;

public class PratoFavorito {

	public static void main(String[] args) {
		
		String prato = JOptionPane.showInputDialog("Qual o seu prato favorito?");
		
		String mensagem = String.format("Saindo um(a) %s ...", prato);
		
		JOptionPane.showMessageDialog(null, mensagem);

	}

}
