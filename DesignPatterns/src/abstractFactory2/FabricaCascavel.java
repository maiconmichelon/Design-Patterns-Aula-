package abstractFactory2;

public class FabricaCascavel implements Fabrica{

	@Override
	public Massa getMassa() {
		return new MassaGrossa();
	}

	@Override
	public Molho getMolho() {
		return new MolhoVermelho();
	}

}
