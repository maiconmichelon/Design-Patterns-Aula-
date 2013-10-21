package composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends SistemaArquivos{

	private List<SistemaArquivos> arqs = new ArrayList<SistemaArquivos>();
	
	public Pasta() {
	}
	
	public Pasta(String nome) {
		setNome(nome);
	}
	
	public List<SistemaArquivos> getArqs() {
		return arqs;
	}
	
	@Override
	public void add(SistemaArquivos sa) {
		arqs.add(sa);
	}
	
	@Override
	public int getTamanho() {
		int total = 0;
		for(SistemaArquivos sa : arqs)
			total += sa.getTamanho();
		return total;
	}

	@Override
	public String listar() {
		StringBuffer nome = new StringBuffer(getNome()).append("(");
		for (SistemaArquivos arq : arqs) {
			nome.append(arq.listar()).append(", ");
		}
		return nome.replace(nome.length() - 2, nome.length(), ")").toString();
	}
	
}
