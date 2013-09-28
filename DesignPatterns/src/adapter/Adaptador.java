package adapter;

public class Adaptador extends PlugueTresPinos{

	private final PlugueDoisPinos plugueDoisPinos;

	public Adaptador(PlugueDoisPinos plugueDoisPinos) {
		this.plugueDoisPinos = plugueDoisPinos;
	}
	
	@Override
	public void plugar() {
		plugueDoisPinos.conectar();
	}
	
	
}
