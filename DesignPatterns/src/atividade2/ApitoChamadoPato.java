package atividade2;

public class ApitoChamadoPato extends PatoAbstract {

	@Override
	public void quack() {
		System.out.println("Apito - Quack !");
		notificarQuack();
	}

}
