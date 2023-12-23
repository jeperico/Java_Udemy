package desafios;

public class DataTeste {

	public static void main(String[] args) {
		
		var data01 = new Data(22, 12, 2023);
		var data02 = new Data();
		var data03 = new Data(12, 12, 2012);
		var data04 = new Data(7, 3, 2012);
		
		System.out.printf("Data atual: %s.\n", data01.dataFormatada());
		System.out.println(data02.dataFormatada());
		System.out.println(data03.dataFormatada());		
		System.out.println(data04.dataFormatada());		
	}
}
