package fundamentos;

public class ValorNull {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		try {
			;
			String s1 = null;
			System.out.println(s1.concat("!!!!!!"));
			System.out.println("Bala");
			
		} catch (Exception e) {
			System.out.println("Deu erro kkkk.");
			System.out.println(e);
		}
	}
}
