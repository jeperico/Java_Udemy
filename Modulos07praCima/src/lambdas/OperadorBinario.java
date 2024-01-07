package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = 
				(num1, num2) -> (num1 + num2) / 2;
		Function<Double ,String> appr = num -> num >= 7.0 ? "APROVADO" : "REPROVADO";
		
		BiFunction<Double, Double, String> result = (n1, n2) -> {
			double nota = (n1 + n2) / 2;
			return nota >=7 ? "APROVADO" : "REPROVADO";
		};
		
		System.out.println(media.andThen(appr).apply(8.8, 5.0));
		System.out.println(result.apply(7.0, 3.7));
	}
}
