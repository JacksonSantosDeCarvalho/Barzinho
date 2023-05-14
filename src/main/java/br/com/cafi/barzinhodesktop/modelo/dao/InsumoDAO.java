package br.com.cafi.barzinhodesktop.modelo.dao;

import br.com.cafi.barzinhodesktop.modelo.entidade.Insumo;
import javax.persistence.EntityManager;

public class InsumoDAO extends DAO<Long, Insumo> {
    public InsumoDAO(EntityManager entityManager) {
        super(entityManager);
    }

   
}
