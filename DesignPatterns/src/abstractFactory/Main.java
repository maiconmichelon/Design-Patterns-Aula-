package abstractFactory;

public class Main {

	public static void main(String[] args) {
		Fabrica fabrica = FabricaUtil.criaFabricaChevrolet();
		
		CarroPopular carroPopular = fabrica.criarCarroPopular();
		
		System.out.println("Carro popular: " + carroPopular.getNome());
		
		CarroEsportivo carroEsportivo = fabrica.criarCarroEsportivo();
		
		System.out.println("Carro esportivo: " + carroEsportivo.getNome() + ", acelera de 0 a 100 km/h em "+ carroEsportivo.getTempoAceleracao());
		
	}
	
}
