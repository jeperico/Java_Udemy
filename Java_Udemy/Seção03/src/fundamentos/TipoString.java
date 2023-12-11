package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		String s = "Boa tarde";
//		s = "as";
		System.out.println("Ola pessoal".charAt(2));
		System.out.println(s);
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		String nome = "Pedrinho";
		String sobrenome = "do Grau";
		int idade = 13;
		float salario = 12341.1235423F;
		System.out.printf("Meu mano %s %s tem %d anos e ganha %.2f .", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nMeu mano %s %s tem %d anos e ganha %.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}
