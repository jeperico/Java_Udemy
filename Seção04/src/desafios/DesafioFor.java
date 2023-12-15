package desafios;

public class DesafioFor {

	public static void main(String[] args) {
		
//		String valor = "#";
//		for(int i = 0; i < 5; i++) {
//			System.out.println(valor);
//			valor += "#";
//		}
		
		String valorFinal = "########";
		String valorAtual = "#";
		for(; !valorAtual.equals(valorFinal); valorAtual += "#") {
			System.out.println(valorAtual);
		}
	}
}
