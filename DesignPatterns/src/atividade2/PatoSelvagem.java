package atividade2;

public class PatoSelvagem extends PatoAbstract {

	@Override
	public void quack() {
		System.out.println("Pato Selvagem - quack!");
		notificarQuack();
	}

}
