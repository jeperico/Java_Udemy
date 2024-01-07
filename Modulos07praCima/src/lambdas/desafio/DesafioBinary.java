package lambdas.desafio;

import java.text.DecimalFormat;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.Produto;

public class DesafioBinary {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoDescontado = produto -> {
			return (produto.preco * (1 - produto.desconto));
		};
		UnaryOperator<Double> impostoMunicipal = precoAtual -> precoAtual >= 2500 ? (precoAtual * 1.085) : precoAtual;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		DecimalFormat formato = new DecimalFormat("R$#.00");
		Function<Double, String> formatarPreco = precote -> formato.format(precote);

		String valorFinal = precoDescontado
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(formatarPreco)
				.apply(p);
		
		System.out.println(valorFinal);
	}
}

/* Preco com desconto
 * ImpostoMunicipal >= 2500 (8,5%) / < 2500 (Isento)
 * Frete >= 3000 (100) / < 3000 (50
 * Arredordar com duas casas decimais
 * Formatar: R$1234,56
 */