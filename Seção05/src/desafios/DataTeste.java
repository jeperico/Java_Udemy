package desafios;

public class DataTeste {

	public static void main(String[] args) {
		
		var data01 = new Data();
		var data02 = new Data();
		var data03 = new Data();
		
		data01.dia = 22;
		data01.mes = 12;
		data01.ano = 2023;
		
		data02.dia = 1;
		data02.mes = 1;
		data02.ano = 2001;
		
		data03.dia = 12;
		data03.mes = 12;
		data03.ano = 2012;
		
		System.out.printf("Data atual: %s.\n", data01.dataFormatada());
		System.out.println(data02.dataFormatada());
		System.out.println(data03.dataFormatada());		
	}
}
