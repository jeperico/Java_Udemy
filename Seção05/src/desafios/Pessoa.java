package desafios;

public class Pessoa {

	String name;
	double peso;
	
	Pessoa(String name, double peso) {
		this.name = name;
		this.peso = peso;
	}
	
	void comer(Comida com) {
		double newPeso = this.peso + com.peso;
		this.peso = newPeso;
	}
}
