package br.com.cafi.barzinhodesktop.modelo.dao;

import br.com.cafi.barzinhodesktop.modelo.entidade.InsumoProduto;
import javax.persistence.EntityManager;

public class InsumoProdutoDAO extends DAO<Long, InsumoProduto> {
    public InsumoProdutoDAO(EntityManager entityManager) {
        super(entityManager);
    }

    public InsumoProduto getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
