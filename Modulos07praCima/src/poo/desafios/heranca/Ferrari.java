package poo.desafios.heranca;

public class Ferrari extends Carro {

	public int aceleracao = 35;
	
	public Ferrari(String name) {
		super(name, 420);
	}
	
	@Override
	public void acelerar() {
		this.ms += aceleracao;
		super.acelerar();
	}
}
