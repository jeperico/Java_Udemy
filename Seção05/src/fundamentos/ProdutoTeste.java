package fundamentos;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		var p2 = new Produto();
		
		p1.nome = "Celular";
		p1.preco = 4567.23;
		p1.desconto = 0.2;
		
		p2.nome = "Note";
		p2.preco = 8765.43;
		p2.desconto = 0.15;
		
		System.out.println(p1);
		System.out.println(p1.nome.toUpperCase());
		System.out.println(p2.preco);
		System.out.println(p2.preco * (1 - p2.desconto));
	}
}
