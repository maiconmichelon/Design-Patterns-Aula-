package observer2;

import java.util.Observable;
import java.util.Observer;

public class Assinante implements Observer{

	private String nome;
	
	public Assinante(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		Revista r = (Revista) arg0;
		System.out.println(nome + " recebeu uma nova revista [" + r.getNome() + " - ed. " + r.getEdicao() + "]");
	}
	
}
