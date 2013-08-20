package abstractFactory;

public class FabricaHyundai implements Fabrica{

	@Override
	public CarroPopular criarCarroPopular() {
		return new HB20();
	}

	@Override
	public CarroEsportivo criarCarroEsportivo() {
		return new Veloster();
	}

}
