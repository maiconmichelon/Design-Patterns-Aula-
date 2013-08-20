package abstractFactory2;

public class FabricaToledo implements Fabrica{

	@Override
	public Massa getMassa() {
		return new MassaFina();
	}

	@Override
	public Molho getMolho() {
		return new MolhoBranco();
	}

}
