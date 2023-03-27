/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import br.com.cafi.barzinhodesktop.modelo.dao.PermissaoDAO;
import br.com.cafi.barzinhodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.barzinhodesktop.modelo.entidade.Permissao;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Jk-Sa
 */
public class PermissaoBO {
    
     private PermissaoDAO dao;

    private SimpleEntityManager simpleEntityManager;

    public PermissaoBO() {
        this.simpleEntityManager = new SimpleEntityManager("HELDERnomeDoPersistence");
        dao = new PermissaoDAO(simpleEntityManager.getEntityManager());
    }

    public void save(Permissao usuario) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(usuario);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public void update(Permissao usuario) {
        try {
            simpleEntityManager.beginTransaction();
            dao.update(usuario);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public List<Permissao> findAll() {
        return dao.findAll();
    }

    public void delete(Permissao u) {
        try {
            simpleEntityManager.beginTransaction();
            dao.delete(u);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public Permissao getById(long id) {
        return dao.getById(id);
    }

    public List<Permissao> getListPermissaoOrdenadoNome() {
        Query query = dao.getEntityManager().createQuery(
                "From Permissao order by descricao asc"
        );
        try {
            return  query.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Permissao getPermissaoByDescricao(String descricao){
        Query query = dao.getEntityManager().createQuery(
                "From Permissao where descricao = ?1"
        );
        query.setParameter(1, descricao);
        try {
            return  (Permissao) query.getSingleResult();
        } catch (NoResultException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
