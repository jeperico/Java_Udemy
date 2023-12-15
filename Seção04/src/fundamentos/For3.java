package fundamentos;

public class For3 {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 9; i++) {
			for(int j = 0; j <= 9; j++) {
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();
		}
	}
}
