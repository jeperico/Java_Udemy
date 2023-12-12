package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Alutia");
		System.out.print(" Sasa\n");
		
		System.out.println("Sueeee");
		System.out.println("Susu");
		
		System.out.printf("Soreteiado: %d %d %d %d %d %d %n", 
				12, 63, 456, 456, 234, 0);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String name = input.nextLine();
		System.out.print("Digite seu sobrenome: ");
		String lastname = input.nextLine();
		System.out.printf("Your name is %s %s? Good name bro!", name, lastname);
	}
}
