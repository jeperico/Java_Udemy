package exercicios;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe uma temperatura em celsius e converteremos ela em fahrenheit:");
		
		double celsius = input.nextDouble();
		double constant = 9.0/5.0;
		double fahrenheit = (celsius * constant) + 32;
		
		System.out.printf("%.1f Cº são %.1f Fº.", celsius, fahrenheit);
		
		input.close();
	}
}
