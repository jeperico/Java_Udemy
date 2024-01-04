package fundamentos;

import java.util.LinkedList;

public class Queue {

	// 
	public static void main(String[] args) {
		
		java.util.Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");	// Returns a exception (error)
		fila.offer("Bia");	// Returns true or false case have restriction
		fila.offer("Cia");
		fila.offer("Dia");
		fila.offer("Eia");
		fila.offer("Fia");
		
		System.out.println(fila.peek());	// If the queue is empty, this returns Null
		System.out.println(fila.peek());	// Returns the first element but doesn't remove it
		System.out.println(fila.element());	// If the queue is empty, this returns a exception
		System.out.println(fila.element());	// Returns the first element but doesn't remove it
		
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains("Eia");
		
		
		System.out.println("Remove too: " + fila.poll()); // Returns the first element and removes it
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // Does the same work of poll, but if the queue is empty, it returns a exeption
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());	// If the queue is empty, this returns Null
		System.out.println(fila.remove());
	}
}
