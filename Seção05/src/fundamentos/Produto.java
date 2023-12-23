package fundamentos;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	double precoDescontado() {
		return (preco * (1 - desconto));
	}
}
