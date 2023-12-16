package fundamentos;

public class BreakRotulado {

	public static void main(String[] args) {
		
		externo: for (int i = 0; i < 10; i++) {
			interno: for (int j = 0; j < 10; j++) {
				
				if(i == 1) break externo;
				
				if(i == 2) break interno;
			}
		}
	}
}
