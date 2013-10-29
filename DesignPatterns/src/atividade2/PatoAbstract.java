package atividade2;

import java.util.ArrayList;
import java.util.List;

public abstract class PatoAbstract implements Pato {

	protected List<ObservadorPatos> observadores = new ArrayList<ObservadorPatos>();

	public void registrarObservador(ObservadorPatos obs) {
		observadores.add(obs);
	}
	
	public void notificarQuack() {
		for (ObservadorPatos obs : observadores) {
			obs.fezQuack(this);
		}
	}
	
}
