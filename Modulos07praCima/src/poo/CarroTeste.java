package poo;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.ligar();
		
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();

		System.out.println(carro.motor.giros());
		
		carro.desligar();
		System.out.println(carro.estaLigado());
	}
}
