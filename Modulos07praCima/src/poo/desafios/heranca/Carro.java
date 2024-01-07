package poo.desafios.heranca;

public class Carro {

	public double ms = 0;
	public double distanciaPercorrida = 0;
	public String name;
	
	public Carro(String name) {
		this.name = name;
	}
	
	public void acelerar() {
		this.distanciaPercorrida += ms;
	}
	
	public void frear() {
		if(this.ms >= 0) this.ms -= 10;
		this.distanciaPercorrida += ms;
	}
	
	public String toString() {
		return "Distância percorrida => [" + this.distanciaPercorrida + "m] <=====> [" + this.ms + "ms];";
	}
	
}
