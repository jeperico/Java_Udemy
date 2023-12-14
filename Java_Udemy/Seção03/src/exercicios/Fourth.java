package exercicios;

import javax.swing.JOptionPane;

public class Fourth {

	public static void main(String[] args) {
		
		String numberTxt = JOptionPane.showInputDialog("Informe um número:");
		
		double number = Double.parseDouble(numberTxt);
		
		System.out.printf("O número informado ao quadrado é %.2f", Math.pow(number, 2));
		System.out.printf("O número informado ao cubo é %.2f", Math.pow(number, 3));
	}
}
