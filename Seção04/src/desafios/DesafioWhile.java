package desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String finalizar;
		float aluno = 0.0f;
		double totalNotas = 0;
		
		do {
			System.out.println("Informe a nota do aluno " + (aluno + 1));
			totalNotas += input.nextDouble();
			System.out.println("Tem mais alunos?");
			finalizar = input.next();
			aluno++;
		} while (!finalizar.equalsIgnoreCase("nao"));

		double media = totalNotas / aluno;
		System.out.println(media);

		input.close();
	}
}
