package trabalho3bim;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UsuarioDAOJPA implements UsuarioDAO {

	@Override
	public void remover(Serializable id) {
		EntityManager em = HibernateUtils.getInstance().getEm();
		
		EntityTransaction trx = em.getTransaction();
		trx.begin();
		em.remove(em.find(Usuario.class, id));
		trx.commit();
	}

	@Override
	public Usuario get(Serializable id) {
		EntityManager em = HibernateUtils.getInstance().getEm();
		return em.find(Usuario.class, id);
	}

	@Override
	public Usuario salvar(Usuario user) {
		EntityManager em = HibernateUtils.getInstance().getEm();
		EntityTransaction trx = em.getTransaction();
		trx.begin();
		
		em.persist(user);
		
		trx.commit();
		
		return user;
	}

}
