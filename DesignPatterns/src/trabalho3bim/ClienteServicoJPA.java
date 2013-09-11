package trabalho3bim;

public class ClienteServicoJPA extends ClienteServico{

	public ClienteDAO obterDAO(){
		return JPADAOFactory.getInstancia().obterClienteDAO();
	}
	
}
