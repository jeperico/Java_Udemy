package fundamentos;

import java.util.HashSet;

public class Set {

	//	Pode ser heterogêneo	(Ruim)
	//	Pode ser homogêneo	(Boa Prática)
	//	Não aceita dados duplicados
	//	Pode ser duplicado
	//	Não é indexado
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
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
		
		java.util.Set num = new HashSet();
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
		
		conjunto.add("alabasta");
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}
