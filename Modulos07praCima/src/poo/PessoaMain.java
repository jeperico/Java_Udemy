package poo;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setAge(30);; // setter
		System.out.println(p1.getAge()); // getter
		System.out.println(p1); // toString
	}
}
