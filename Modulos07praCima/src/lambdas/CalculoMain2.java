package lambdas;

public class CalculoMain2 {

	public static void main(String[] args) {
		
		Calculo calculo = (x, y) -> { return x + y; };
		System.out.println(calculo.executar(2, 4));
		
		calculo = (x, y) -> x * y;
		System.out.println(calculo.executar(2, 4));
		
		System.out.println(calculo.functiona());
		System.out.println(Calculo.funcionaTambem());
	}
}
