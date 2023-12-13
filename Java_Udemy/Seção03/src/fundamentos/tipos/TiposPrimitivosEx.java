package fundamentos.tipos;

public class TiposPrimitivosEx {

	public static void main(String[] args) {
		// Informações do funcionário
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 567_899; // Dá para separar um número com _ para melhor vizualização
		long pontosAcumulados = 9_123_745_456L; // L ou l após um número que excede a capacidade dos inteiros
		
		float salario = 13_325.23F; // F ou f
		double vendasAcumuladas = 2_123_563_723.12;
		
		
		boolean estaDeFerias = false;
		char status = 'A';		
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// Condição
		System.out.println("Usuário de ID: " + id + " recebe R$" + salario + " por mês.");
		
		
		if (estaDeFerias) {
			System.out.println("Usuário de ID: " + id + "está sobre status " + status + " e está férias");
		} else {
			System.out.println("Usuário de ID: " + id + "está sobre status " + status + " e não está férias");			
		}
		
	}
}
