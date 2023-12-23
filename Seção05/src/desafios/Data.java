package desafios;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data () {
		this(1, 1, 1970); // Referencia outro construtor
	}
	
	Data (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
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
