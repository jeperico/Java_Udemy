package fundamentos;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

	public static void main(String[] args) {
		
		Deque<String> pia = new ArrayDeque<>();
		
		System.out.println(pia.add("Livreto"));
		
//		pia.add("Livreto");		// Returns boolean value
		pia.push("Libreta");	// Returns a exeption
		pia.add("Livretinha");
		pia.push("Libro");
		
		for(String livro: pia) {
			System.out.println("Nome: " + livro + ".");
		}
		
		System.out.println();
		
		System.out.println(pia.peek());		// If the stack is empty, it returns Null
		System.out.println(pia.element());	// If the stack is empty, it returns a exception
		
		System.out.println();
		
		System.out.println(pia.pop());		// Same thing of the others. If the stack is empty, it returns a exeption
		System.out.println(pia.poll());		// If the stack is empty, it returns Null
		System.out.println(pia.remove());	// If the stack is empty, it returns a exeption
		
//		pia.size();
//		pia.clear();
//		pia.contains();
//		pia.isEmpty();
		
	}
}
