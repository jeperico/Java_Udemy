package fundamentos;

import java.util.HashSet;

public class Set {

	//	Pode ser heterogêneo	(Ruim)
	//	Pode ser homogêneo	(Boa Prática)
	//	Não aceita dados duplicados
	//	Pode ser duplicado
	//	Não é indexado
	
	public static void main(String[] args) {
		
		HashSet<E> conjunto = new HashSet<E>();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true);
		conjunto.add("Texte");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println(conjunto.size());
		System.out.println(conjunto.remove(true));
		System.out.println(conjunto.size());
		System.out.println(conjunto.contains(1.2));
		System.out.println(conjunto.contains(1.3));
		
		java.util.Set<E> num = new HashSet<E>();
		num.add(1);
		num.add(2);
		num.add(3);
		System.out.println(num);
		System.out.println(conjunto);
		
		conjunto.addAll(num);
		System.out.println(num);
		System.out.println(conjunto);
		
		conjunto.retainAll(num);
		System.out.println(conjunto);
		
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}
