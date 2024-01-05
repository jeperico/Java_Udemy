package poo;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.nomeCliente = "Jorgin do Grau";
		c1.addItens(new Produto("Relógio", 1, 1500.55));
		c1.addItens("Boné", 2, 13.58);
		c1.addItens("Meias", 5, 9.99);
		c1.addItens("Calça", 1, 149.98);
//		System.out.println(c1.itens.get(1));
		
		for(int i = 0; i < c1.itens.size(); i++) {
			System.out.println(c1.itens.get(i));
		}
		System.out.println();
		System.out.println(c1.qtdItensCarrinho());
		System.out.println(c1.precoCompra());
		System.out.println(c1);
	}
}
