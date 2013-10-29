package atividade2;

public class PatoEcologista implements ObservadorPatos{

	@Override
	public void fezQuack(Pato pato) {
		String nameClazz = pato.getClass().getSimpleName();
		System.out.println(String.format("Pato ecologista - %s fez quack!", nameClazz));
	}

}
