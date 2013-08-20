package abstractFactory;

public class FabricaVolks implements Fabrica{

	@Override
	public CarroPopular criarCarroPopular() {
		return new Gol();
	
	}

	@Override
	public CarroEsportivo criarCarroEsportivo() {
		return new EOS();
	}

}
