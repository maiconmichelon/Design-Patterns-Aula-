package composite2;

public class Desenvolvedor extends Empregado{

	public Desenvolvedor(String nome, float valor) {
		setSalario(valor);
		setNome(nome);
		setCargo("Desenvolvedor");
	}
	
	@Override
	public float custo() {
		return getSalario();
	}

	@Override
	public void listar() {
		System.out.println(toString());
	}

	@Override
	public void add(Empregado emp) {
		throw new UnsupportedOperationException("Não é possivel adicionar empregados ao desenvolvedor.");
	}

}
