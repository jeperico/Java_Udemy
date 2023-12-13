package fundamentos;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 2.6;
		String resultadoParcial = media >= 5.0 ? "Recuperação" : "Reprovado";
		String resultado = media >= 7.0 ? "Aprovado" : resultadoParcial;
		System.out.println(resultado);
	}
}
