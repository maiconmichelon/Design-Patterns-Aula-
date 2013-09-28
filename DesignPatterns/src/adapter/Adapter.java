package adapter;

public class Adapter {

	public static void main(String[] args) {
		TomadaTresPinos tomada = new TomadaTresPinos();
		
		tomada.ligar(new PlugueTresPinos());
		
		tomada.ligar(new Adaptador(new PlugueDoisPinos()));
		
	}
	
}
