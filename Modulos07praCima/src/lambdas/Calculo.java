package lambdas;

@FunctionalInterface
public interface Calculo {
	
	double executar(double a, double b);
	
	default String functiona() {
		return "If you put a default method in the Functional Interface, that's fine!";
	}
	static String funcionaTambem() {
		return "Static methods also works!";
	}
}
