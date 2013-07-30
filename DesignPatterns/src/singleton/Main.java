package singleton;

public class Main {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		
		System.out.println("s " + s);
		
		s.setDado("Dado 1");
		
		Singleton s2 = Singleton.getInstance();
		System.out.println("s " + s2);
		
		System.out.println("dado: " + s2.getDado());
		
		Sessao sessao = Sessao.getInstance();
		sessao.set("usuario", "Jão");
		
		System.out.println("Usuário logado: " + sessao.get("usuario"));
		
	}
	
}
