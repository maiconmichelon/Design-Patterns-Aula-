package atividade2;

public class PatoBorracha extends PatoAbstract {

	@Override
	public void quack() {
		System.out.println("Pato de Borracha - Quack");
		notificarQuack();
	}

}
