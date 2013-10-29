package atividade2;

public class ContadorPatoFactory implements AbstractPatoFactory {

	@Override
	public Pato criaPatoSelvagem() {
		return adaptPato(new PatoSelvagem());
	}

	@Override
	public Pato criaPatoCabecaVermelha() {
		return adaptPato(new PatoCabecaVermelha());
	}

	@Override
	public Pato criaApitoChamadoPato() {
		return adaptPato(new ApitoChamadoPato());
	}

	@Override
	public Pato criaPatoBorracha() {
		return adaptPato(new PatoBorracha());
	}

	public ContadorPatos adaptPato(Pato pato) {
		return new ContadorPatos(pato);
	}
	
}
