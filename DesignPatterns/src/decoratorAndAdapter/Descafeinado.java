package decoratorAndAdapter;

public class Descafeinado extends Bebida{

	@Override
	public String getDescricao() {
		return "Descafeinado ";
	}
	
	@Override
	public float getCusto() {
		return 0.59f;
	}

}
