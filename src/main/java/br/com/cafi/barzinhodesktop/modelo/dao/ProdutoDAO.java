package br.com.cafi.barzinhodesktop.modelo.dao;

import br.com.cafi.barzinhodesktop.modelo.entidade.Produto;
import javax.persistence.EntityManager;

public class ProdutoDAO extends DAO<Long, Produto> {
    public ProdutoDAO(EntityManager entityManager) {
        super(entityManager);
    }
    
}
