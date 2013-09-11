package trabalho3bim;

public class JPADAOFactory implements AbstractDAOFactory{

	private JPADAOFactory() {}
	
	private static JPADAOFactory instancia;
	
	public static JPADAOFactory getInstancia() {
		if(instancia == null)
			instancia = new JPADAOFactory();
		return instancia;
	}

	@Override
	public ClienteDAO obterClienteDAO() {
		return new ClienteDAOJPA();
	}

	@Override
	public UsuarioDAO obterUsuarioDAO() {
		return new UsuarioDAOJPA();
	}
	
}
