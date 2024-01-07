package poo.desafios.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(90);
		
		Comida arroz = new Arroz(0.2);
		Comida feijao = new Feijao(0.3);
		Comida sorvete = new Sorvete(0.1);
		
		p1.comer(arroz);
		System.out.println(p1.getPeso());
		p1.comer(feijao);
		System.out.println(p1.getPeso());
		p1.comer(sorvete);
		System.out.println(p1.getPeso());
	}
}
