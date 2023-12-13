package fundamentos.tipos;

public class ConversaoTipos {

	public static void main(String[] args) {
		
		double a = 1;				// Implícita
		System.out.println(a);
		
		float b = (float) 1.0;		// Explícita (CAST)
		System.out.println(b);

		int c = 4;					// Explícita (CAST)
		byte d = (byte) c;
		
		double e = 1.9999999999;	// Explícita (CAST)
		int f = (int) e;
		System.out.println(d + f);
	}
}
