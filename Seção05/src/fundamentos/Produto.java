package fundamentos;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	Produto() {
	;	
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	double precoDescontado() {
		return (preco * (1 - desconto));
	}
}
