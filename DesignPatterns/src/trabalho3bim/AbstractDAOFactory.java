package trabalho3bim;

public interface AbstractDAOFactory {

	ClienteDAO obterClienteDAO();
	UsuarioDAO obterUsuarioDAO();
	
}
