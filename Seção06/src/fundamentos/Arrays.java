package fundamentos;

public class Arrays {

	public static void main(String[] args) {
		
		int [] a = new int[6];
		a[2] = 100;
		a[0] = 9;
		
		System.out.println(java.util.Arrays.toString(a));
		
//		double[][] arrayArray = new double[3][3];
		
		for(int i = 0; i < a.length; i++) {
			System
			.
			out
			.
			println
			(a[i])
			;
		}
		System.out.println();

		double [] notas = {5.7, 8.9, 3.7, 10, 9.8 };
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);			
		}
	}
}
