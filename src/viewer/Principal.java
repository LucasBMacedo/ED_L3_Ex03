package viewer;

import javax.swing.JOptionPane;

import controller.StringInvertida;

public class Principal {

	public static void main(String[] args) {
		StringInvertida si = new StringInvertida();
		String palavra = JOptionPane.showInputDialog("Digite uma palavra.");
		JOptionPane.showMessageDialog(null, "A inversao da palavra " + palavra +
				" resulta em: " + si.stringInv(palavra) + ".");
	}
}