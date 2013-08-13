package observer;

import java.util.Observable;

public class Cotacao extends Observable{

	private float valor;
	private String nome;
	
	public Cotacao() {
	}

	public Cotacao(String nome, float valor){
		this.valor = valor;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
		System.out.println("Valor: " + this.valor);
		
		setChanged();
		notifyObservers();
		
	}
	
}
