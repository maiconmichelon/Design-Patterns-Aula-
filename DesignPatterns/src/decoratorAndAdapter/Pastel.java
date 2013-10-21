package decoratorAndAdapter;

public class Pastel extends Comida{

	@Override
	public String getDescricao() {
		return "Pastel ";
	}

	@Override
	public float getPreco() {
		return 1.25f;
	}

}
