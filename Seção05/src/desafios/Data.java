package desafios;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data () {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data (int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String dataFormatada() {
		
		String diaFormatado;
		String mesFormatado;
		
		if (dia < 10) diaFormatado = "0" + dia;			
		else diaFormatado = "" + dia;	
		
		if (mes < 10) mesFormatado = "0" + mes;			
		else mesFormatado = "" + mes;	
		
		String data = diaFormatado + "/" + mesFormatado + "/" + ano;
		return data;
	}
}
