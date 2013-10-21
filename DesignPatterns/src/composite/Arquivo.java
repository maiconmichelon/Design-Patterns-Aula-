package composite;

public class Arquivo extends SistemaArquivos{

	public Arquivo() {
	}

	public Arquivo(String nome, int tamanho) {
		setNome(nome);
		setTamanho(tamanho);
	}

	@Override
	public void add(SistemaArquivos sa) {}

	@Override
	public String listar() {
		return getNome();
	}
	
}
