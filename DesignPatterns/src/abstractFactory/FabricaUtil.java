package abstractFactory;

public class FabricaUtil {

	public static Fabrica criaFabricaVolks(){
		return new FabricaVolks();
	}
	
	public static Fabrica criaFabricaChevrolet(){
		return new FabricaChevrolet();
	}
	
}
