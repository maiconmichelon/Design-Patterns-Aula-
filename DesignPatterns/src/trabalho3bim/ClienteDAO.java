package trabalho3bim;

import java.io.Serializable;

public interface ClienteDAO {

	Cliente salvar(Cliente cliente);
	void remover(Serializable id);
	Cliente get(Serializable id);
	
}
