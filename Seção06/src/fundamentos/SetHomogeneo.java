package fundamentos;

//import java.util.HashSet;
//import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetHomogeneo {

	public static void main(String[] args) {
		
//		Set<String> lista = new HashSet<>();
		SortedSet<String> listaPersonagens = new TreeSet<>();
		listaPersonagens.add("Naruto");
		listaPersonagens.add("Luffy");
		listaPersonagens.add("Goku");
		
		for(String protagonistas: listaPersonagens) {
			System.out.println(protagonistas);
		}
	}
}
