package fundamentos;

public class ContinueRotulado {

	public static void main(String[] args) {

		externo: for (int i = 0; i < 10; i++) {
			interno: for (int j = 0; j < 10; j++) {

				if (i == 1)
					continue externo;

				if (i == 5)
					break interno;
				
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();
		}

	}
}
