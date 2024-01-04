package fundamentos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> idade = new HashMap<>();
		
		idade.put("Jorge", 10);
		idade.put("Jorge", 9);
		idade.put("Matheus", 20);
		idade.put("André", 30);
		idade.put("Paulo", 80);
		idade.put("Gustavo", 13);
		idade.put("Caique", 23);
		idade.put("Leandro", 19);
		
		idade.remove("Leandro");
		idade.remove("André", 30);
		
		System.out.println(idade);
		
		System.out.println(idade.keySet());		// Returns the key of all components
		System.out.println(idade.values()); 	// Returns the value of all components
		System.out.println(idade.entrySet());	// Returns the full component
		
		System.out.println(idade.containsKey("Paulinho"));	// Same things of default contains, but searches only of key attribute
		System.out.println(idade.containsValue(13));		// Same things of default contains, but searches only of value attribute
		
		System.out.println(idade.get("Paulo"));
		System.out.println(idade.get("Caique"));
		System.out.println(idade.get("Aragao"));
		System.out.println(idade.get("Andre"));
		
		for(String nome: idade.keySet()) {
			System.out.println("O usuario " + nome +" tem " + idade.get(nome) +" anos.");				
		}
		for(int idades: idade.values()) {
			System.out.println(idades);
		}
		
		System.out.println();
		
		for(Entry<String, Integer> registro: idade.entrySet()) {
			System.out.println(registro.getKey() + " " + registro.getValue());
		}
	}
}
