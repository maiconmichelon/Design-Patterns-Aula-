package abstractFactory;

public class FabricaChevrolet implements Fabrica {

	@Override
	public CarroPopular criarCarroPopular() {
		return new Corsa();
	}

	@Override
	public CarroEsportivo criarCarroEsportivo() {
		return new Camaro();
	}

}
