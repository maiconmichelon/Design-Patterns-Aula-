package atividade2;

public class PatoCabecaVermelha extends PatoAbstract {

	@Override
	public void quack() {
		System.out.println("Cabe�a Vermelha - quack !");
		notificarQuack();
	}

}
