package trabalho3bim;

public abstract class UsuarioServico {

	public Usuario salvar(Usuario user){
		return obterDAO().salvar(user);
	}
	
	public void remover(Usuario user){
		obterDAO().remover(user.getLogin());
	}
	
	public abstract UsuarioDAO obterDAO();
	
}
