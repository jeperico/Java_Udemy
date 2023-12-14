package exercicios;

import javax.swing.JOptionPane;

public class Second {

	public static void main(String[] args) {
		
		String fahrenheit = JOptionPane.showInputDialog("Digitea temperatura em Fahrenheit:");
		
		double temp = Double.parseDouble(fahrenheit);
		double constant = 5.0/9.0;
		double celsius = (temp - 32) * constant;
		
		System.out.printf("%.1f Fº são %.2f Cº.", temp, celsius);
		
		
	}
}
//String txt1 = JOptionPane.showInputDialog("Digite o first number:");
//String txt2 = JOptionPane.showInputDialog("Digite o second number:");
//String txt3 = JOptionPane.showInputDialog("Digite o third number:");
