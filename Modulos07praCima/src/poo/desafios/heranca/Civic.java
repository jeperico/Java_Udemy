package poo.desafios.heranca;

class Civic extends Carro {
		
	public Civic(String name) {
		super(name, 300);
		delta = 10;
	}

	public void nitro(int nivel) {
		this.ms += 25 * nivel;
		super.acelerar();
	}
	
	public String toString() {
		return super.toString();
	}
}
