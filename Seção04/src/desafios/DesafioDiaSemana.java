package desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o dia da semana:");
		String diaSemana = entrada.next();		

		{
			if ("domingo".equalsIgnoreCase(diaSemana)) {
				System.out.println(1);
			} else if ("segunda".equalsIgnoreCase(diaSemana)) {
				System.out.println(2);
			} else if (("terça".equalsIgnoreCase(diaSemana)) || ("terca".equalsIgnoreCase(diaSemana))) {
				System.out.println(3);
			} else if ("quarta".equalsIgnoreCase(diaSemana)) {
				System.out.println(4);
			} else if ("quinta".equalsIgnoreCase(diaSemana)) {
				System.out.println(5);
			} else if ("sexta".equalsIgnoreCase(diaSemana)) {
				System.out.println(6);
			} else if ("sabado".equalsIgnoreCase(diaSemana)) {
				System.out.println(7);
			} else {
				System.out.println("Dia inválido");
			}
		}
		
//		{
//			if ("domingo".equals(diaSemana.toLowerCase())) {
//				System.out.println(1);
//			} else if ("segunda".equals(diaSemana.toLowerCase())) {
//				System.out.println(2);
//			} else if (("terça".equals(diaSemana.toLowerCase())) || ("terca".equals(diaSemana.toLowerCase()))) {
//				System.out.println(3);
//			} else if ("quarta".equals(diaSemana.toLowerCase())) {
//				System.out.println(4);
//			} else if ("quinta".equals(diaSemana.toLowerCase())) {
//				System.out.println(5);
//			} else if ("sexta".equals(diaSemana.toLowerCase())) {
//				System.out.println(6);
//			} else if ("sabado".equals(diaSemana.toLowerCase())) {
//				System.out.println(7);
//			} else {
//				System.out.println("Dia inválido");
//			}
//		}

		entrada.close();
	}
}
