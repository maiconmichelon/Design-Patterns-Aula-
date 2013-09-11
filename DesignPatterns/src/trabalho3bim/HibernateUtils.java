package trabalho3bim;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtils {

	private static HibernateUtils hibernateUtils;
	private EntityManager em;
	
	private HibernateUtils() {
		initializeEntityManagerFactory();
	}

	private void initializeEntityManagerFactory() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploJPA");
		em = emf.createEntityManager();
	}

	public static HibernateUtils getInstance(){
		if(hibernateUtils == null)
			hibernateUtils = new HibernateUtils();
		return hibernateUtils;
	}
	
	public EntityManager getEm() {
		return em;
	}
	
}
