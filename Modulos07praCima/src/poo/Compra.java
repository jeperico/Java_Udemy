package poo;

import java.util.ArrayList;

public class Compra {

	String nomeCliente;
	ArrayList<Produto> itens = new ArrayList<>();
	
	
	double precoCompra() {
		double precoFinal = 0;
		
		for(Produto item: itens) {
			precoFinal += item.precoProduto();
		}
//		for(int i = 0; i < itens.size(); i++) {
//			precoFinal += itens.get(i).precoProduto();
//		}
		return precoFinal;
	}
	
	int qtdItensCarrinho() {
		int qtdItens = 0;
		for(Produto item: itens) {
			qtdItens += item.qtd;
		}
//		for(int i = 0; i < itens.size(); i++) {
//			precoFinal += itens.get(i).qtd;
//		}
		return qtdItens;
	}
	
	@Override
	public String toString() {
		return "O preço final da sua compra é de R$" + this.precoCompra() + "!";
	}
	
	void addItens(Produto produto) {
		itens.add(produto);
		produto.compra = this;
	}
	
	void addItens(String nome, int qtd, double preco) {
		this.addItens(new Produto(nome, qtd, preco));
	}
}
