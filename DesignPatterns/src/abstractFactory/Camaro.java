package abstractFactory;

public class Camaro implements CarroEsportivo{

	@Override
	public String getNome() {
		return "Camaro";
	}

	@Override
	public int getTempoAceleracao() {
		return 10;
	}

}
