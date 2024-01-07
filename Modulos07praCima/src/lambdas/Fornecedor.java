package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		Supplier<List<String>> lista = 
				() -> Arrays.asList("Anna", "Bia", "Lia", "Mia", "Nia");
				
		System.out.println(lista.get());
	}
}
