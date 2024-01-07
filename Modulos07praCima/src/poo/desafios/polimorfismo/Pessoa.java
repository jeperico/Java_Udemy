package poo.desafios.polimorfismo;

public class Pessoa {

	private double peso;
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	
	public Pessoa(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
}
