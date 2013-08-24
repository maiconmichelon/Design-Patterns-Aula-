package factoryMethod2;

public class PizzaToledo extends Pizza {

	@Override
	public void preparar() {
		System.out.println("Preparando na pizzaria Toledo");
	}

	@Override
	public void assar() {
		System.out.println("Assando na pizzaria Toledo");
	}

	@Override
	public void cortar() {
		System.out.println("Cortando na pizzaria Toledo");
	}

}
