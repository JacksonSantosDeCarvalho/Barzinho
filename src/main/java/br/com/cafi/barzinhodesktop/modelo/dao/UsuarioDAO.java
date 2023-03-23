package br.com.cafi.barzinhodesktop.modelo.dao;

import br.com.cafi.barzinhodesktop.modelo.entidade.Usuario;
import javax.persistence.EntityManager;

public class UsuarioDAO extends DAO<Long, Usuario> {
    public UsuarioDAO(EntityManager entityManager) {
        super(entityManager);
    }

    public Usuario getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
