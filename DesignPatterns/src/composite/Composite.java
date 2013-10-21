package composite;

public class Composite {

	public static void main(String[] args) {
		
		SistemaArquivos arq1 = new Arquivo("Arquivo 1", 10);
		SistemaArquivos arq2 = new Arquivo("Arquivo 2", 25);

		SistemaArquivos pasta1 = new Pasta("Pasta 1");
		pasta1.add(arq1);
		pasta1.add(arq2);

		displayName(arq1);
		displayName(arq2);
		displayName(pasta1);
		
		SistemaArquivos pasta2 = new Pasta("Pasta 2");
		
		SistemaArquivos arq3 = new Arquivo("Arquivo 3", 26);
		
		pasta2.add(pasta1);
		pasta2.add(arq3);
		
		displayName(pasta2);
		
		System.out.println(pasta2.listar());
		System.out.println(pasta1.listar());
		
	}
	
	public static void displayName(SistemaArquivos sa){
		System.out.println(new StringBuffer().append(sa.getNome()).append(" - ").append(sa.getTamanho()));
	}
	
}
