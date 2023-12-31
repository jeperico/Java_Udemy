package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %

		System.out.println("Bem vindo a calculadora");

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o primeiro número");
		double num01 = entrada.nextDouble();

		System.out.println("Informe o segundo número");
		double num02 = entrada.nextDouble();

		System.out.println("Agora informe a operação desejada (+, -, *, / ou %)");
		String operacao = entrada.next();

//		double operadorDivisão = "/".equals(operacao) ? num01 / num02 : num01 % num02;
//		double operadorVezes = "*".equals(operacao) ? num01 * num02 : operadorDivisão;
//		double operadorMenos = "-".equals(operacao) ? num01 - num02 : operadorVezes;
//		double operacaoFinal = "+".equals(operacao) ? num01 + num02 : operadorMenos;

		double resultado = "+".equals(operacao) ? num01 + num02 : 0;
		resultado = "-".equals(operacao) ? num01 - num02 : resultado;
		resultado = "*".equals(operacao) ? num01 * num02 : resultado;
		resultado = "/".equals(operacao) ? num01 / num02 : resultado;
		resultado = "%".equals(operacao) ? num01 % num02 : resultado;

		System.out.printf("O resultado final da operação é %f", resultado);

		entrada.close();
	}
}
