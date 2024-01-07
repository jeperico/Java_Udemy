package poo.desafios.heranca;

class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari(String name) {
		super(name, 420);
		setDelta(35);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 50;
		} else if (ligarTurbo && ligarAr) {
			return 45;			
		} else if (!ligarTurbo && !ligarAr) {
			return 40;			
		} else {
			return 35;			
		}
	}

}
