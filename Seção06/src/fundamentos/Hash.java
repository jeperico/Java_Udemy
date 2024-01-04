package fundamentos;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Anna"));
		usuarios.add(new Usuario("Amanda"));
		usuarios.add(new Usuario("Aline"));
		usuarios.add(new Usuario("Angélica"));
		
		boolean resultado = usuarios.contains(new Usuario("Anna"));
		System.out.println(resultado);
		
	}
}
