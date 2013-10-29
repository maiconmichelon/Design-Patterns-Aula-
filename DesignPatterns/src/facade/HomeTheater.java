package facade;

public class HomeTheater {

	Tv tv = new Tv();
	BluRayPlayer bluray = new BluRayPlayer();
	Luz luz = new Luz();
	Cortinas cortinas = new Cortinas();
	ArCondicionado arCondicionado = new ArCondicionado();
	MaquinaPipoca maquinaPipoca = new MaquinaPipoca();
	
	public void ligar() {
		System.out.println("Iniciando filme...");
		
		tv.ligar();
		bluray.ligar();
		luz.ligar(50);
		cortinas.fechar();
		arCondicionado.ligar();
		maquinaPipoca.ligar();
		bluray.play();
	}
	
	public void desligar() {
		System.out.println("Filme terminou");
		
		maquinaPipoca.desligar();
		arCondicionado.desligar();
		cortinas.abrir();
		luz.ligar(100);
		bluray.desligar();
		tv.desligar();
	}
	
}
