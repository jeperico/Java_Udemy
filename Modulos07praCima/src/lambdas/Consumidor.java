package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<String> printOut = valor -> System.out.println("[" + valor + "]");
		printOut.accept("Chipi");
		printOut.accept("Chipi");
		printOut.accept("Chapa");
		printOut.accept("Chapa");
		printOut.accept("Dubi");
		printOut.accept("Dubi");
		printOut.accept("Daba");
		printOut.accept("Daba");
		printOut.accept("Magic");
		printOut.accept("Ponei");
		printOut.accept("Dubi");
		printOut.accept("Dubi");
		printOut.accept("Boom");
		printOut.accept("Boom");
		printOut.accept("Boom");
		
		System.out.println();
		
		List<String> musica = Arrays.asList("Chipi", "Chipi", "Chapa", "Chapa", "Dubi", "Dubi", "Daba", "Daba", "Magic", "Ponei", "Dubi", "Dubi", "Boom", "Boom", "Boom");
		musica.forEach(printOut);
	}
}
