package poo.desafios.heranca;

public class Civic extends Carro {
	
	public int aceleracao = 10;
	
	public Civic(String name) {
		super(name);
	}
	
	@Override
	public void acelerar() {
		this.ms += aceleracao;
		super.acelerar();
	}

	public void nitro(int nivel) {
		this.ms += 25 * nivel;
		super.acelerar();
	}
	
	public String toString() {
		return super.toString();
	}
}
