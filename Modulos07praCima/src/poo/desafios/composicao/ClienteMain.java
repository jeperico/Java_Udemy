package poo.desafios.composicao;

public class ClienteMain {
	
	public static void main(String[] args) {
		
		// 2 Clientes -> 2 compras -> 2 itens -> produto
		
		Produto p1 = new Produto(8.08, "Café");
		Produto p2 = new Produto(13.00, "Nescau");
		Produto p3 = new Produto(20.00, "Ovo");
		Produto p4 = new Produto(18.99, "Melância");
		Produto p5 = new Produto(1.98, "Pão");
		Produto p6 = new Produto(5.57, "Leite");
		Produto p7 = new Produto(2.50, "Chocolate");
		Produto p8 = new Produto(3.85, "Lápis");
		
		Item i1 = new Item(2, p1);
		Item i2 = new Item(1, p2);
		Item i3 = new Item(2, p3);
		Item i4 = new Item(3, p4);
		Item i5 = new Item(12, p5);
		Item i6 = new Item(5, p6);
		Item i7 = new Item(10, p7);
		Item i8 = new Item(4, p8);
		
		Compra com1 = new Compra();
		com1.addItem(i1);
		com1.addItem(i2);
		
		Compra com2 = new Compra();
		com2.addItem(i3);
		com2.addItem(i4);
		
		Compra com3 = new Compra();
		com3.addItem(i5);
		com3.addItem(i6);
		
		Compra com4 = new Compra();	
		com4.addItem(i7);
		com4.addItem(i8);
		
		
		Cliente c1 = new Cliente("Josias");
		c1.buyList.add(com1);
		c1.buyList.add(com2);
		Cliente c2 = new Cliente("Josue");
		c2.buyList.add(com3);
		c2.buyList.add(com4);
		
		
		System.out.println(c1.clientTotalSpent());
		System.out.println(c2.clientTotalSpent());
		
		System.out.println();
		
		System.out.println(c1);
		System.out.println(c2);
		
	}

	
}
