package singleton;

public class Singleton {

	private Singleton(){
	}

	private static Singleton singleton;
	
	private String dado;
	
	public static Singleton getInstance(){
		if(singleton == null)
			singleton = new Singleton();
		return singleton;
	}
	
	public String getDado() {
		return dado;
	}
	
	public void setDado(String dado) {
		this.dado = dado;
	}
	
}
