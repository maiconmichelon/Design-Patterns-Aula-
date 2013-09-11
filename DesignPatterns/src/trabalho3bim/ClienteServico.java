package trabalho3bim;

public abstract class ClienteServico {

	public Cliente salvar(Cliente cliente){
		return obterDAO().salvar(cliente);
	}
	
	public void remover(Cliente cliente){
		obterDAO().remover(cliente.getId());
	}
	
	public abstract ClienteDAO obterDAO();
	
}
