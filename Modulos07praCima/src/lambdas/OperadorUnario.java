package lambdas;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> plus2 = num -> num +2;
		UnaryOperator<Integer> plus4 = num -> num +4;
		UnaryOperator<Integer> minus2 = num -> num -2;
		UnaryOperator<Integer> minus4 = num -> num -4;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Informe um número inteiro:");
		Integer numEscolhido = 0;
		try {
			numEscolhido = input.nextInt();			
			Integer num = plus2.andThen(plus4).andThen(minus2).andThen(minus4).apply(numEscolhido);
			System.out.println("Irei adivinhar o número que você escolheu... Eu creio que... " + numEscolhido);
			
			if(numEscolhido == num) {
				System.out.println("Eu sabia, eu nunca perco!");
			} else {
				System.out.println("Parabens, você me venceu.");
			}
		} catch (Exception e) {
			System.out.println("Informe um número inteiro válido da próxima vez...");
		}
		

		input.close();
		
		
	}
}
