package fundamentos;

public class DesafiosOperadores {

	public static void main(String[] args) {
		
		int a = 2;
		int b = (int) Math.pow(a, 5); // Elevado **
		
		System.out.println(b);
		
		// Super conta
		
		double conta = Math.pow( ( ( ( Math.pow((6*(3+2)), 2) ) / (3*2) )  -  Math.pow( ( ( (1-5)*(2-7) ) /2), 2) ), 3) / Math.pow(10, 3);
		
		System.out.println(conta);
		
		// Método mais eficaz
		
		int soma = 3 + 2;
		int multiplicacao01 = (int) Math.pow((6 * soma), 2);
		int bloco01 = multiplicacao01 / (3 * 2);
		
		int subtracao01 = 1 - 5;
		int subtracao02 = 2 - 7;
		int bloco02 = (int) Math.pow(((subtracao01 * subtracao02) / 2), 2);
		
		int cima = (int) Math.pow((bloco01 - bloco02), 3);
		int baixo = (int) Math.pow(10, 3);
		int resultadoFinal = (cima / baixo);
		
		System.out.println(resultadoFinal);
		
	}
}
