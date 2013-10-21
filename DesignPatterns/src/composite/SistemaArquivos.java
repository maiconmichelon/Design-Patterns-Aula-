package composite;

public abstract class SistemaArquivos {

	private String nome;
	
	private int tamanho;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public abstract void add(SistemaArquivos sa);

	public abstract String listar();
	
}
