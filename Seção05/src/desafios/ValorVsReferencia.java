package desafios;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		int a = 2;
		int b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data();
		Data d2 = d1;
		
		d1.dia = 7;
		d2.mes = 2;		
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		returnData(d2);
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
	}
	
	static void returnData(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
