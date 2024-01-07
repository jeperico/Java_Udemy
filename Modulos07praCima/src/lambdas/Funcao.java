package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> paridade = num -> num % 2 == 0 ? "Par" : "Impar";
		
		System.out.println(paridade.apply(25435435));
		
		Function<String, String> resultIs = 
				valor -> "[Função] Paridade: <" + valor.toUpperCase() + ">";
				
		Function<String, String> exited = valor -> valor + " !!!!!!!!!!";
				
//		System.out.println(resultIs.apply(paridade.apply(3)));
		System.out.println(paridade
				.andThen(resultIs)
				.andThen(exited)
				.apply(10));
		
	}

}
