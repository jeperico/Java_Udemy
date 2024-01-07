package poo;

public class Heroi extends Jogador{

	public boolean atacarCaC(Jogador oponente) {
		boolean atk1 = super.atacarCaC(oponente);
		boolean atk2 = super.atacarCaC(oponente);
		return atk1 || atk2;
	}
}
