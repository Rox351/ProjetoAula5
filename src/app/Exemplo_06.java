package app;

import javax.swing.JOptionPane;

public class Exemplo_06 {

	public static void main(String[] args) {

		float num, media, soma;
		int cont;

		cont = 0;
		soma = 0f;

		while (cont < 5) {
			num = Float.parseFloat(JOptionPane.showInputDialog("Digite o número"));
			soma = soma + num;
			cont = cont +1;
		}
		media = soma / cont;
		JOptionPane.showMessageDialog(null, "A média é: " + media);
	}

}
