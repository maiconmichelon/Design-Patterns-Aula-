package abstractFactory2;

public class Teste {

	public static void main(String[] args) {
		Pizza p = criar(new FabricaToledo(), "Calabresa");
		System.out.println(p);
	}
	
	private static Pizza criar(Fabrica f, String nome){
		Pizza p = new Pizza();
		
		p.setNome(nome);
		p.setMassa(f.getMassa());
		p.setMolho(f.getMolho());
		
		return p;
	}
	
}
