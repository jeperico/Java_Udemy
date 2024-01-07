package poo.desafios.heranca;

public class Corrida {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari("Ferrari");
		Civic civic = new Civic("Civic");
		System.out.println("Segundo 0.0");
		System.out.println(ferrari.toString());
		System.out.println(civic.toString());
		System.out.println();
		
		ferrari.acelerar();
		civic.acelerar();
		System.out.println("Segundo 1.0");
		System.out.println(ferrari.toString());
		System.out.println(civic.toString());
		System.out.println();
		
		ferrari.acelerar();
		civic.acelerar();
		System.out.println("Segundo 2.0");
		System.out.println(ferrari.toString());
		System.out.println(civic.toString());
		System.out.println();
		
		ferrari.acelerar();
		civic.nitro(4);
		System.out.println("Segundo 3.0");
		System.out.println(ferrari.toString());
		System.out.println(civic.toString());
		System.out.println();
		
		ferrari.acelerar();
		civic.nitro(3);
		System.out.println("Segundo 4.0");
		System.out.println(ferrari.toString());
		System.out.println(civic.toString());
		System.out.println();
		
		ferrari.acelerar();
		civic.nitro(2);
		System.out.println("Segundo 5.0");
		System.out.println(ferrari.toString());
		System.out.println(civic.toString());
		System.out.println();
		
	}
}
