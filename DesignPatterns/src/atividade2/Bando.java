package atividade2;

import java.util.ArrayList;
import java.util.List;

public class Bando extends PatoAbstract {

	private List<Pato> patos = new ArrayList<Pato>();

	public Bando() {
	}
	
	public void add(Pato pato) {
		patos.add(pato);
	}
	
	@Override
	public void quack() {
		for (Pato pato : patos) {
			pato.quack();
		}
	}
	
	@Override
	public void registrarObservador(ObservadorPatos obs) {
		for (Pato pato : patos) {
			pato.registrarObservador(obs);
		}
	}
	
}
