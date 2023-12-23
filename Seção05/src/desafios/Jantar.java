package desafios;

public class Jantar {

	public static void main(String[] args) {
		
		Comida arroz = new Comida("Arroz", 0.15);
		Comida feijao = new Comida("Feijão", 0.3);
		Comida frango = new Comida("Frango", 0.2);
		
		Pessoa alicia = new Pessoa("Alicia", 60.85);
		
		System.out.println("Peso inicial da Alícia: " + alicia.peso + "kg.");
		
		alicia.comer(feijao);
		alicia.comer(arroz);
		alicia.comer(frango);		
		
		System.out.println("Peso final da Alícia: " + alicia.peso + "kg.");
	}
}
