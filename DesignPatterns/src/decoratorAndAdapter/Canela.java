package decoratorAndAdapter;

public class Canela extends Condimento {


	public Canela(Bebida bebida) {
		super(bebida);
	}

	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", com canela";
	}

	@Override
	public float getCusto() {
		return bebida.getCusto() + 0.15f;
	}

}
