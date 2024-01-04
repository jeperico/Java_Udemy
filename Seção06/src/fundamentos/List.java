package fundamentos;

import java.util.ArrayList;

public class List {

	//	Pode ser heterogêneo	(Ruim)
	//	Pode ser homogêneo	(Boa Prática)
	//	Aceita dados duplicados
	//	É ordenada
	//	É indexada
	
	public static void main(String[] args) {
		
		java.util.List<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Jonathan"));
		lista.add(new Usuario("Rosangela"));
		lista.add(new Usuario("Hercilio"));
		lista.add(new Usuario("Hercilio2"));
		lista.add(new Usuario("Karen"));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
		System.out.println();
		
		for(int i = lista.size() - 1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}

		System.out.println();
		
		lista.remove(1);
		lista.remove(new Usuario("Rosangela"));
		lista.contains(new Usuario("Rosangela"));
	}
}
