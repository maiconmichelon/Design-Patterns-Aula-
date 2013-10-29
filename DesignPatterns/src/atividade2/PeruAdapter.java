package atividade2;

public class PeruAdapter extends PatoAbstract {

	private final Peru peru;

	public PeruAdapter(Peru peru) {
		this.peru = peru;
	}
	
	@Override
	public void quack() {
		peru.gorgolejar();
		notificarQuack();
	}

}
