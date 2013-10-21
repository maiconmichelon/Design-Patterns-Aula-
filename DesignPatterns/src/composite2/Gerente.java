package composite2;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empregado{

	private List<Empregado> empregados = new ArrayList<Empregado>();
	
	public Gerente(String nome, float salario) {
		setCargo("Gerente");
		setNome(nome);
		setSalario(salario);
	}
	
	@Override
	public float custo() {
		float vt = getSalario();
		
		for (Empregado e : empregados) {
			vt+=e.getSalario();
		}
		
		return vt;
	}

	@Override
	public void listar() {
		System.out.println(toString());
		for(Empregado e : empregados)
			System.out.println(e.toString());
	}

	@Override
	public void add(Empregado emp) {
		empregados.add(emp);
	}

}
