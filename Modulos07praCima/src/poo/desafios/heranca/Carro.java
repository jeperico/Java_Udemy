package poo.desafios.heranca;

public class Carro {

	public double ms = 0;
	public double distanciaPercorrida = 0;
	public String name;
	public int delta;
	final int VELOCIDADE_MAXIMA;
	
	public Carro(String name, int velocidadeMaxima) {
		this.name = name;
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		this.ms += delta;
		this.distanciaPercorrida += ms;
	}
	
	public void frear() {
		if(this.ms >= 0) this.ms -= 10;
		this.distanciaPercorrida += ms;
	}
	
	public String toString() {
		return "Distância percorrida por " + this.name + " => [" + this.distanciaPercorrida + "m] <=====> [" + this.ms + "ms];";
	}
	
}
