package abstractFactory;

public class EOS implements CarroEsportivo{

	@Override
	public String getNome() {
		return "EOS";
	}

	@Override
	public int getTempoAceleracao() {
		return 12;
	}

}
