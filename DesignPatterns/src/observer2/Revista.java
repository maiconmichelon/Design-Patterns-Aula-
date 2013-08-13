package observer2;

import java.util.Observable;

public class Revista extends Observable{

	private static Revista revista;
	
	private String nome;
	private int edicao;

	private Revista() {
	}
	
	public static Revista getInstance(){
		if(revista == null){
			revista = new Revista();
			revista.nome = "Revista Lance";
		}
		return revista;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEdicao() {
		return edicao;
	}
	
	public void novaEdicao() {
		edicao++;
		
		setChanged();
		notifyObservers();
	}

}
