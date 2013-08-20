package abstractFactory;

public class Veloster implements CarroEsportivo{

	@Override
	public String getNome() {
		return "Veloster";
	}

	@Override
	public int getTempoAceleracao() {
		return 14;
	}

}
