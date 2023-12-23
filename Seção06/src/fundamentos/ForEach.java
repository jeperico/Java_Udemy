package fundamentos;

public class ForEach {

	public static void main(String[] args) {
		
		int [] notas = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10};
		
		for(int nota: notas) {
			System.out.println(nota);
		}
	}
}
