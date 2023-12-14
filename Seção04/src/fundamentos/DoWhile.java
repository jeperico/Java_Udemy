package fundamentos;

import java.util.Scanner;

public class DoWhile {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String confirmacao;
		
		do {
			
			System.out.println("Deseja sair?");
			confirmacao = entrada.next();
			
		} while (!confirmacao.equalsIgnoreCase("sair"));
		
		entrada.close();
	}
}
