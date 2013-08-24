package factoryMethod2;

public abstract class Pizzaria {

	protected String nome;
	
	public Pizza pedirPizza(){
		Pizza p = criarPizza();
		p.preparar();
		p.assar();
		p.cortar();
		
		return p;
	}
	
	public abstract Pizza criarPizza();
	
}
