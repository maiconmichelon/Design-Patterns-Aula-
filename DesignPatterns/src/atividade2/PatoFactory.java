package atividade2;

public class PatoFactory implements AbstractPatoFactory{

	@Override
	public Pato criaPatoSelvagem() {
		return new PatoSelvagem();
	}

	@Override
	public Pato criaPatoCabecaVermelha() {
		return new PatoCabecaVermelha();
	}

	@Override
	public Pato criaApitoChamadoPato() {
		return new ApitoChamadoPato();
	}

	@Override
	public Pato criaPatoBorracha() {
		return new PatoBorracha();
	}

}
