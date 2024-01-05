package poo;

public class Produto {

	String nome;
	int qtd;
	double preco;
	Compra compra;
	
	Produto(String nome, int qtd, double preco) {
		this.nome = nome;
		this.qtd = qtd;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return this.qtd + " " + this.nome + ", R$" + this.preco + " cada, R$" + this.precoProduto() + " total.";
	}
	
	double precoProduto() {
		return this.preco * this.qtd;
	}
}
