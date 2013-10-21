package composite2;

public class Main {

	public static void main(String[] args) {
		
		Empregado e1 = new Desenvolvedor("João", 3000);
		Empregado e2 = new Desenvolvedor("Maria", 3500);
		Empregado e3 = new Gerente("Paulo", 10000);
		
		e3.add(e1);
		e3.add(e2);
		
		e3.listar();
		
		System.out.println(e3.custo());
		
		e1.add(e2);
		
	}
	
}
