package decoratorAndAdapter;

public class Expresso extends Bebida{

	@Override
	public String getDescricao() {
		return "Expresso";
	}
	
	@Override
	public float getCusto() {
		return 0.75f;
	}

}
