package exercicios;

import javax.swing.JOptionPane;

public class Third {

	public static void main(String[] args) {
		
		String pesoTxt = JOptionPane.showInputDialog("Informe seu peso em kg:");
		String alturaTxt = JOptionPane.showInputDialog("Informe sua altura em cm:");
		
		float peso = Float.parseFloat(pesoTxt);
		int altura = Integer.parseInt(alturaTxt);
		
		float indiceMassaCorporal = (float) (peso / (Math.pow((altura / 100.0), 2)));
		
		System.out.printf("Um indivíduo com %dcm e %.1fkg possúi um IMC de %.2f", altura, peso, indiceMassaCorporal);
	}
}
