package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintOutObjects {

	public static void main(String[] args) {
		
		
		System.out.println("ForEach");
		List<String> appr = Arrays.asList("Anna", "Bia", "Mia", "Nia", "Lia");
		for(String nome: appr) {
			System.out.println(nome);
		}
		
		System.out.println("\nIterator");
		Iterator<String> it = appr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nStream API");
		Stream<String> st = appr.stream();
		st.forEach(System.out::println);
	}
}
