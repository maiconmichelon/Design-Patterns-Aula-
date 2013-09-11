package trabalho3bim;

public class UsuarioServicoJPA extends UsuarioServico{

	public UsuarioDAO obterDAO(){
		return JPADAOFactory.getInstancia().obterUsuarioDAO();
	}
	
}
