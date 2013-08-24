package factoryMethod2;

public class PizzariaToledo extends Pizzaria{

	@Override
	public Pizza criarPizza() {
		return new PizzaToledo();
	}

}
