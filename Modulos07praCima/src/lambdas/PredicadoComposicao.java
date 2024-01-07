package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> paridade = num -> num % 2 == 0;
		Predicate<Integer> tresDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(paridade.test(42323));
		System.out.println(tresDigitos.test(422));
		System.out.println(paridade.and(tresDigitos).negate().test(4223));
	}
}
