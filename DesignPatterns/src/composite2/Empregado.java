package composite2;

public abstract class Empregado {

private String nome;
	
	private String cargo;
	
	private float salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public abstract float custo();
	
	public abstract void listar();
	
	public abstract void add(Empregado emp);
	
	@Override
	public String toString() {
		return String.format("%s %s, salário %s", getCargo(), getNome(), getSalario());
	}

}
