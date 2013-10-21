package decoratorAndAdapter;

public class Chocolate extends Condimento {

	public Chocolate(Bebida bebida) {
		super(bebida);
	}

	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", com chocolate";
	}

	@Override
	public float getCusto() {
		return bebida.getCusto() + 0.25f;
	}

}
