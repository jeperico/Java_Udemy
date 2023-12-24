package fundamentos;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos alunos deseja informar:");
		int numAlunos = input.nextInt();
		
		System.out.println("Quantas notas deseja informar por aluno:");
		int numNotas = input.nextInt();
		
		double [][] notas = new double[numAlunos][numNotas];
		
		double notasTotais = 0;
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println();
			System.out.println("Aluno " + (i + 1) + ":");
			double totalNotasAluno = 0;
			for(int j = 0; j < notas[i].length; j++) {
				do {
					System.out.println(j + 1 + " - Informe uma nota válida:");
					notas[i][j] = input.nextDouble();				
				} while((notas[i][j] < 0) || (notas[i][j] > 10));
				totalNotasAluno += notas[i][j];
			}
			
			double mediaAluno = totalNotasAluno / notas[i].length;
			System.out.println("A média do aluno " + (i + 1) + " é de " + mediaAluno);
			notasTotais += mediaAluno;
		}
		double mediaTotal = notasTotais / numAlunos;
		
		System.out.println();
		System.out.println("A média de notas da sala é " + mediaTotal);

		input.close();
	}
}
