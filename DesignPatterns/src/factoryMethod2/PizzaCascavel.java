package factoryMethod2;

public class PizzaCascavel extends Pizza {

	@Override
	public void preparar() {
		System.out.println("Preparando na pizzaria Cascavel");
	}

	@Override
	public void assar() {
		System.out.println("Assando na pizzaria Cascavel");
	}

	@Override
	public void cortar() {
		System.out.println("Cortando na pizzaria Cascavel");
	}

}
