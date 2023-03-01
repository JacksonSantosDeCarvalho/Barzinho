package br.com.cafi.barzinhodesktop.modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Hélder
 */
public class DAO <E>{
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> entidade;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("HELDERnomeDoPersistence");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public DAO(Class<E> entidade) {
		this.entidade = entidade;
		em = emf.createEntityManager();
	}
        
        public DAO<E> abrir() {
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fechar() {
		em.getTransaction().commit();
		return this;
	}
        
        public DAO<E> create(E entidade) {
		em.persist(entidade);
		return this;
	}
        
        public E encontrarPeloId(Object id) {
		return em.find(entidade, id);
	}
        
        public DAO<E> delete(int id) {
		DAO<E> dao = new DAO<E>(entidade);
		E obj = dao.encontrarPeloId(id);
		em.remove(em.contains(obj) ? obj : em.merge(obj));
		return this;
	}
        
        public DAO<E> atualizar(E obj) {
		DAO<E> dao = new DAO<E>(entidade);
		dao.abrir();
		em.merge(obj);
		dao.fechar();
		return this;
	}

        

}

