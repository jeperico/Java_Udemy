package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Pia", "Mia");
		
		System.out.println("Método tradicional:   ");
		for(String nome: aprovados) {
			System.out.println("-[" + nome + "]-");
		}
		
		System.out.println("\nLambda #01:");
		aprovados.forEach(nome -> System.out.println("-[" + nome + "]-"));
		
		System.out.println("\nMethod Reference #01");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02:");
		aprovados.forEach(nome -> myPrintOut(nome));

		System.out.println("\nMethod Reference #02");
		aprovados.forEach(ForEach::myPrintOut);
		
	}
	
	static void myPrintOut(String name) {
		System.out.println("[ForEach] Name: <" + name + "> - APPROVED");
	}
}
