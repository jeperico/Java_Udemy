package poo;

public class Jogador {

	public int vida = 100;
	public int x;
	public int y;
	
	public boolean atacarCaC(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean andar(Direcao direcao) {
			switch(direcao) {
			case NORTE:
				y++;
				return true;
			case SUL:
				y--;
				return true;
			case LESTE:
				x++;
				return true;
			case OESTE:
				x--;
				return true;
			default:
				return false;
			}
	}
}
