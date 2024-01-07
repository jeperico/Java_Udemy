package lambdas;

import java.util.function.BinaryOperator;

public class CalculoMain3 {

	public static void main(String[] args) {
		
	BinaryOperator<Double> operacao = (x, y) ->  x * y;
	System.out.println(operacao.apply(3.7, 6.3));
	
	operacao = (x, y) -> x + y;
	System.out.println(operacao.apply(3.7, 6.3));
	
	BinaryOperator<String> operacao2 = (x, y) ->  x + y;
	System.out.println(operacao2.apply("Você é ", "lindo!"));
	
	BinaryOperator<Integer> operacao3 = (x, y) ->  x * y;
	System.out.println(operacao3.apply(3, 6));
	
	operacao3 = (x, y) -> x + y;
	System.out.println(operacao3.apply(3, 6));
	
	}
}
