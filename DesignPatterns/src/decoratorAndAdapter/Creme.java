package decoratorAndAdapter;

public class Creme extends Condimento {

	public Creme(Bebida bebida) {
		super(bebida);
	}

	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", com Creme";
	}

	@Override
	public float getCusto() {
		return bebida.getCusto() + 0.35f;
	}

}
