package fundamentos;

import java.util.Scanner;

public class SwitchNotas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int nota = input.nextInt();
		String conceito;

		switch (nota) {

		case 10:
		case 9:
			conceito = "A";
			break;
		case 8:
		case 7:
			conceito = "B";
			break;
		case 6:
		case 5:
			conceito = "C";
			break;
		case 4:
		case 3:
			conceito = "D";
			break;
		case 2:
		case 1:
		case 0:
			conceito = "E";
			break;
		default:
			conceito = "não encontrado";
			break;
		}
		
		System.out.println("Conceito final " + conceito);

		input.close();
	}
}
