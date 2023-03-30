package app;

import javax.swing.JOptionPane;

public class Exemplo_05 {
	
	public static void main(String[] args){
		
		
		float salario, bonus;
		int tempo;
		
		salario = Float.parseFloat(JOptionPane.showInputDialog(
				"Salário do professor Vitor: "));
		
		tempo = Integer.parseInt(JOptionPane.showInputDialog(
				"Tempo na Uniritter: "));
				
		if(tempo >= 5) {
			bonus = salario * 0.20f;
		}else {
			bonus = salario * 0.10f;
		}
		JOptionPane.showMessageDialog(null, 
				"Valor do seu bonus R$: " + bonus);
	}
}
