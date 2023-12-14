package exercicios;

import javax.swing.JOptionPane;

public class Fifth {

	public static void main(String[] args) {
		
		String baseTxt = JOptionPane.showInputDialog("Informe a base do triangulo em cm:");
		String alturaTxt = JOptionPane.showInputDialog("Agora informe a altura do triangulo em cm:");
		
		double base = Double.parseDouble(baseTxt);
		double altura = Double.parseDouble(alturaTxt);
		
		double areaTrangulo = (base * altura) / 2.0;
		
		System.out.println("Obtivemos o seguinte triangulo: \n\nBase: " + base + "\nAltura: " + altura + "\nArea: " + areaTrangulo);
	}
}
