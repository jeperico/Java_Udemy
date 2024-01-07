package poo;

public class Perdi {

	public static void main(String[] args) {
		
		Jogador j1 = new Jogador();
		j1.x = 10;
		j1.y = 10;
		
		Heroi j2 = new Heroi();
		j2.x = 10;
		j2.y = 12;
		
		j1.andar(Direcao.NORTE);
		j1.atacarCaC(j2);
		j1.atacarCaC(j2);
		j1.atacarCaC(j2);
		j1.atacarCaC(j2);
		j1.atacarCaC(j2);
		j1.atacarCaC(j2);
		j1.atacarCaC(j2);
		
		System.out.println(j2.vida);
		System.out.println(j1.andar(Direcao.LESTE));
		
	}
}
