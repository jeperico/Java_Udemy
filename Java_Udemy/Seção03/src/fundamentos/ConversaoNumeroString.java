package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = 100000;
		System.out.println(num1.toString().length());
		
		var num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		
		var num3 = 1000;
		System.out.println(("" + num3).length());
	}
}
