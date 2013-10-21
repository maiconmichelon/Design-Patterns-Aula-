package decoratorAndAdapter;

public class Leite extends Condimento {

	public Leite(Bebida bebida) {
		super(bebida);
	}

	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", com leite";
	}

	@Override
	public float getCusto() {
		return bebida.getCusto() + 0.15f;
	}

}
