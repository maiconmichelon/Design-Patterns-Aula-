package decoratorAndAdapter;

public class ComidaToBebidaAdapter extends Bebida{

	private final Comida comida;

	public ComidaToBebidaAdapter(Comida comida){
		this.comida = comida;
	}
	
	@Override
	public float getCusto() {
		return comida.getPreco();
	}

	@Override
	public String getDescricao() {
		return comida.getDescricao();
	}
	
}
