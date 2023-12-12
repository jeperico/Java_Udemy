package fundamentos;

// import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String txt1 = JOptionPane.showInputDialog("Digite o first number:");
		String txt2 = JOptionPane.showInputDialog("Digite o second number:");
		String txt3 = JOptionPane.showInputDialog("Digite o third number:");
		
		double num1 = Double.parseDouble(txt1);
		double num2 = Double.parseDouble(txt2);
		double num3 = Double.parseDouble(txt3);
		
		float soma = (float) (num1 + num2 + num3);
		
		System.out.println(soma);
		
		
		// BigDecimal
		// Muito mais preciso
	}
}
