package trabalho3bim;

import java.io.Serializable;

public interface UsuarioDAO {

	Usuario salvar(Usuario user);
	void remover(Serializable id);
	Usuario get(Serializable id);
	
}
