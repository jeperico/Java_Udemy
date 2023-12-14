package exercicios;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Seguindo a formula (ax2 + bx + c = 0), informe o valor de a: ");
		double a = input.nextDouble();
		
		System.out.println("Seguindo a formula (ax2 + bx + c = 0), informe o valor de b: ");
		double b = input.nextDouble();
		
		System.out.println("Seguindo a formula (ax2 + bx + c = 0), informe o valor de c: ");
		double c = input.nextDouble();
		
		double delta = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
		System.out.println(delta);
		double resultOne = (-b + delta) / (2 * a);
		double resultTwo = (-b - delta) / (2 * a);
		
		System.out.println("x' = " + resultOne);
		System.out.println("x'' = " + resultTwo);
		
		input.close();
	}
}
