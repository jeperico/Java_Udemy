package poo.desafios.composicao;

import java.util.ArrayList;

// Nome
// Lista de Compras
//obterValorFinal
public class Cliente {
	
	final String name;
	final ArrayList<Compra> buyList = new ArrayList<>();
	
	double clientTotalSpent() {
		double all = 0.0;
		for(Compra buys: buyList) {
			all += buys.buyPrice();
		}
		
		return all;
	}
	
	int itemsPerClient() {
		int itemsClient = 0;
		for(Compra itens: buyList) {
			itemsClient += itens.itensPerBuy();
		}
		
		return itemsClient;
	}
	
	public String toString() {
		return "O gasto total do cliente " + this.name + " foi de R$" + this.clientTotalSpent() + ", em um total de " + this.itemsPerClient() + " itens.";
	}
	
	Cliente(String name) {
		this.name = name;
	}

}
