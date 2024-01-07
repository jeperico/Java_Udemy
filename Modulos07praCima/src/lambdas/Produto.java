package lambdas;

public class Produto extends Object{

	public final String nome;
	public double preco;
	public final double desconto;
	
//	public double getPreco() {
//		return preco;
//	}
//	public void setPreco(Double newPreco) {
//		this.preco = newPreco;
//	}

	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	
}
