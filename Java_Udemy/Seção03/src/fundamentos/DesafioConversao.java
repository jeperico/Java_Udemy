package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salário:");
		String salario01 = input.nextLine().replace(",", ".");
		Double sal1 = Double.parseDouble(salario01);
		
		System.out.println("Informe o segundo salário:");
		String salario02 = input.nextLine().replace(",", ".");
		Double sal2 = Double.parseDouble(salario02);
		
		System.out.println("Informe o terceiro salário:");
		String salario03 = input.nextLine().replace(",", ".");
		Double sal3 = Double.parseDouble(salario03);
		
		var media = (sal1 + sal2 + sal3) / 3;
		
		
		String maiorNum;
		String menorNum;		
		
		if (sal1 >= sal2 && sal1 >= sal3) {
			maiorNum = salario01;
			
			if (sal2 >= sal3) {
				menorNum = salario03;
			} else {
				menorNum = salario02;
			}
		} else if (sal2 >= sal3) {
			maiorNum = salario02;
			
			if (sal1 >= sal3) {
				menorNum = salario03;
			} else {
				menorNum = salario01;
			}
		} else {
			maiorNum = salario03;
			
			if (sal1 >= sal2) {
				menorNum = salario02;
			} else {
				menorNum = salario01;
			}
		}
		
		System.out.printf("Dentre os três salário apresentado, o maior sendo de R$%s e o menor de R$%s, tivemos uma média de R$%.2f mensais.", maiorNum, menorNum, media);
		
		
		input.close();
	}

}
