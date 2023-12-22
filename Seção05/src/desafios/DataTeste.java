package desafios;

public class DataTeste {

	public static void main(String[] args) {
		
		var data01 = new Data();
		var data02 = new Data();
		var data03 = new Data();
		
		data01.dia = 22;
		data01.mes = 12;
		data01.ano = 2023;
		
		data02.dia = 01;
		data02.mes = 01;
		data02.ano = 2001;
		
		data03.dia = 12;
		data03.mes = 12;
		data03.ano = 2012;
		
		System.out.printf("Data atual: %d/%d/%d.\n", data01.dia, data01.mes, data01.ano);
		System.out.printf("0%d/0%d/%d.\n", data02.dia, data02.mes, data02.ano);
		System.out.printf("%d/%d/%d.\n", data03.dia, data03.mes, data03.ano);		
	}
}
