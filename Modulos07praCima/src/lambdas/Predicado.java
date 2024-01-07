package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

    	Predicate<Produto> isExpensive = prod -> (prod.preco * (1 - prod.desconto)) >= 1000;
        
        Produto produto = new Produto("Notebook", 5893.89, 0.5);
        System.out.println(isExpensive.test(produto));
        System.out.println();
        
        List<Double> lista = new ArrayList<>();
        lista.add(2.0);
        lista.add(20.0);
        lista.add(200.0);
        lista.add(2000.0);
        lista.add(20000.0);
        lista.add(19234.0);
        lista.add(276.0);
        lista.add(9768.0);
        Predicate<Double> isCaro = num -> num >= 1000;
        
        lista.forEach(num -> {
        	if(isCaro.test(num)) {
        		System.out.println("[" + num + "]");
        }
		});


    }
}
