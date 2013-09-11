package trabalho3bim;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ClienteDAOJPA implements ClienteDAO {

	@Override
	public void remover(Serializable id) {
		EntityManager em = HibernateUtils.getInstance().getEm();
		
		EntityTransaction trx = em.getTransaction();
		trx.begin();
		em.remove(em.find(Cliente.class, id));
		trx.commit();
	}

	@Override
	public Cliente get(Serializable id) {
		EntityManager em = HibernateUtils.getInstance().getEm();
		return em.find(Cliente.class, id);
	}

	@Override
	public Cliente salvar(Cliente cliente) {
		EntityManager em = HibernateUtils.getInstance().getEm();
		EntityTransaction trx = em.getTransaction();
		trx.begin();
		
		em.persist(cliente);
		
		trx.commit();
		
		return cliente;
	}

}
