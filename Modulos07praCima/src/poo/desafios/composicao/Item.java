package poo.desafios.composicao;

// Qtd
// Produto
public class Item {
	
	int quantity;
	final Produto product;
	
	Item(int quantity, Produto product) {
		this.quantity = quantity;
		this.product = product;
	}

	double priceItem() {
		return this.quantity * this.product.price;
	}
}
