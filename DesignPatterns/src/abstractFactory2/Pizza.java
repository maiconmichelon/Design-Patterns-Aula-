package abstractFactory2;

public class Pizza {

	private String nome;
	
	private Massa massa;
	
	private Molho molho;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Massa getMassa() {
		return massa;
	}

	public void setMassa(Massa massa) {
		this.massa = massa;
	}

	public Molho getMolho() {
		return molho;
	}

	public void setMolho(Molho molho) {
		this.molho = molho;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("Pizza de ");
		sb.append(nome);
		sb.append(" feita com ");
		sb.append(massa.getNome());
		sb.append(" com ");
		sb.append(molho.getNome());
		
		return sb.toString();
	}
	
}
