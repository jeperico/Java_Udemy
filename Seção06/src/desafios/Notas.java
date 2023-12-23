package desafios;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Quantas notas deseja informar:");
		int numNotas = input.nextInt();
		
		double [] notas = new double[numNotas];
		
		for(int i = 0; i < notas.length; i++) {
			do {
				System.out.println(i + 1 + " - Informe uma nota válida:");
				notas[i] = input.nextDouble();				
			} while((notas[i] <= 0) || (notas[i] >= 10));
		}
		
		double totalNotas = 0;
		for(double nota: notas) {
			totalNotas += nota;
		}
		double media = totalNotas / notas.length;
		
		System.out.println("Média final é " + media);

		input.close();
	}
}
