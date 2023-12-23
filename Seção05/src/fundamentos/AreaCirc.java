package fundamentos;

public class AreaCirc {

	static final double PI = 3.1415;
	double raio;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
}
