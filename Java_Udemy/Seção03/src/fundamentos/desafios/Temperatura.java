package fundamentos.desafios;

public class Temperatura {

	public static void main(String[] args) {
		double f = 120.0;
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		double c = (f - AJUSTE) * FATOR;
		System.out.println(f + " convertidos para " + c);
	}
}
