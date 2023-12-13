package fundamentos.tipos;

import java.util.Scanner;

public class TipoStringsEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
	
		Scanner input = new Scanner(System.in);
		
		String ss = input.nextLine(); // next = tira os espaços em branco; // nextLine = não tira;
		System.out.println("2".equals(ss.trim()));
		
		input.close();
	}
}
