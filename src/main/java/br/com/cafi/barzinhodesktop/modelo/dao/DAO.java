package br.com.cafi.barzinhodesktop.modelo.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * @author Hélder
 */
public class DAO<PK, T> {

    /**
     * @return the entityManager
     */
    private EntityManager entityManager;

    public DAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public T getById(PK pk) {
        return (T) entityManager.find(getTypeClass(), pk);
    }

    public T save(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    public void update(T entity) {

        entityManager.merge(entity);
    }

    public void delete(T entity) {
        entityManager.remove(entity);
    }

    public List<T> findAll() {
        return entityManager.createQuery(("FROM " + getTypeClass().getName()))
                .getResultList();
    }

    public List<T> findWhere(String sql, String[] parametros) {
        Query q = entityManager.createQuery(("FROM " + getTypeClass().getName() + " where " + sql));
        for (int i = 0; i < parametros.length; i++) {
            q.setParameter(i + 1, parametros[i]);
        }

        return q.getResultList();
    }

    private Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass()).getActualTypeArguments()[1];
        return clazz;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

}
