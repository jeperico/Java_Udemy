package fundamentos;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Celular", 4567.23);
		var p2 = new Produto();
		
		p2.nome = "Note";
		p2.preco = 8765.43;
		
		System.out.println(p1);
		System.out.println(p1.nome.toUpperCase());
		System.out.println(p2.preco);
		System.out.println(p2.precoDescontado());
		System.out.println(p2.preco * (1 - Produto.desconto));
	}
}
