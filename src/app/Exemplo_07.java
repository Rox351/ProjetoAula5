package app;

import javax.swing.JOptionPane;

public class Exemplo_07 {

	public static void main(String[] args) {
		
		float num, media, soma = 0f;
		int cont;
		
		do {
			num = Float.parseFloat(JOptionPane.showInputDialog("Digite um número ou Zero para sair"));
			soma += num;
			JOptionPane.showMessageDialog(null, "A soma é: " + soma);
		}while(num !=0);
	}

}
