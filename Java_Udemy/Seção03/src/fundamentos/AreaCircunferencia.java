package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		int raio = 3;
		final double PI = 3.141596; // final define constante / Constantes usam letras maiúsculas por boas práticas;
		
		raio = 4;
		
		double area = PI * (raio * raio);
		
		System.out.println("Área: " + area + " m².");
	}
}
