package decoratorAndAdapter;

public class Cafeteria {

	public static void main(String[] args) {
		Bebida b1 = new Expresso();
		System.out.println("Bebida " + b1.getDescricao() + ", custo R$ " + b1.getCusto());
		
		b1 = new Canela(b1);
		b1 = new Creme(b1);
		System.out.println("Bebida " + b1.getDescricao() + ", custo R$ " + b1.getCusto());
		
		Comida c1 = new Pastel();
		Bebida adapter = new ComidaToBebidaAdapter(c1);
		adapter = new Chocolate(adapter);
		System.out.println("Comida " + adapter.getDescricao() + ", preço R$ " + adapter.getCusto());
		
	}
	
}
