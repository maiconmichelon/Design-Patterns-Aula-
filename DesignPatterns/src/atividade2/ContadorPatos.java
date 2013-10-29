package atividade2;

public class ContadorPatos extends PatoAbstract {

	private static int quacks;
	private final Pato pato;

	public ContadorPatos(Pato pato) {
		this.pato = pato;
	}
	
	@Override
	public void quack() {
		this.pato.quack();
		quacks++;
		notificarQuack();
	}
	
	public static int getQuacks() {
		return quacks;
	}

}
