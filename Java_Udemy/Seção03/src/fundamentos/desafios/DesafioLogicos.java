package fundamentos.desafios;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		// && TV 50 polegadas
		// ^  TV 32 polegadas
		// || Sorvete Shopping
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Sobre o trabalho de terça, deu certo?");
		boolean trabalhoTerca = entrada.nextBoolean();
		
		System.out.println("E sobre o trabalho de quinta, deu certo?");
		boolean trabalhoQuinta = entrada.nextBoolean();
		
//		System.out.println(trabalhoTerca);
//		System.out.println(trabalhoQuinta);
		
		if (trabalhoTerca && trabalhoQuinta) {
			System.out.println("Foram ao shopping e compraram um TV de 50\".");
		} else if (trabalhoTerca ^ trabalhoQuinta) {
			System.out.println("Foram ao shopping e compraram um TV de 32\".");			
		} else {
			System.out.println("Não foram ao shopping e não compraram nada.");
		}
		
		if (trabalhoTerca || trabalhoQuinta) {
			System.out.println("Também tomaram sorvete.");
		} else {
			System.out.println("Não tomaram sorvete.");			
		}
		
		entrada.close();
	}
}
