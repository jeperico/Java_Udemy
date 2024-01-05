package poo.desafios.composicao;

import java.util.ArrayList;

// Lista de itens
public class Compra {

	final ArrayList<Item> items = new ArrayList<>();
	
	void addItem(Item item) {
		this.items.add(item);
	}
	
	int itensPerBuy() {
		int itensBuy = 0;
		for(Item itens: items) {
			itensBuy += itens.quantity;
		}
		
		return itensBuy;
	}
	
	double buyPrice() {
		double finalPrice = 0; 
		for(Item item: items) {
			finalPrice += item.priceItem();
		}
		
		return finalPrice;
	}
}
