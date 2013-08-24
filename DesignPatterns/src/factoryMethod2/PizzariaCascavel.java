package factoryMethod2;

public class PizzariaCascavel extends Pizzaria{

	@Override
	public Pizza criarPizza() {
		return new PizzaCascavel();
	}

}
