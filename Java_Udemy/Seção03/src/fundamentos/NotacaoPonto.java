package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		double a = 2.3;
		String text = "Boa noite Bruno";
		System.out.println(text.toUpperCase());
		
		var t = "Oba"
				.replace("a", "ala")
				.concat(" sim!")
				.toUpperCase()
				.length();
		
		System.out.println(t);
	}
}
