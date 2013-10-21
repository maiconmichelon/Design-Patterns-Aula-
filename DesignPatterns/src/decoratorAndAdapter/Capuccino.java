package decoratorAndAdapter;

public class Capuccino extends Bebida{

	@Override
	public String getDescricao() {
		return "Capuccino";
	}
	
	@Override
	public float getCusto() {
		return 1f;
	}

}
