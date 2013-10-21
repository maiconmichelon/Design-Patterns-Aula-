package decoratorAndAdapter;

public abstract class Condimento extends Bebida {

	protected final Bebida bebida;

	public Condimento(Bebida bebida) {
		this.bebida = bebida;
	}
	
	public abstract String getDescricao();

}
