/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import br.com.cafi.barzinhodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.barzinhodesktop.modelo.dao.UsuarioDAO;
import br.com.cafi.barzinhodesktop.modelo.entidade.Usuario;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Aluno
 */
public class UsuarioBO {
    private UsuarioDAO dao;
    
    private final SimpleEntityManager simpleEntityManager;
     
     
    public UsuarioBO(){
        this.simpleEntityManager = new SimpleEntityManager("HELDERnomeDoPersistence");
        dao = new UsuarioDAO(simpleEntityManager.getEntityManager());
    }
     
    public Usuario save(Usuario usuario){
        try{
            simpleEntityManager.beginTransaction();
            dao.save(usuario);
            simpleEntityManager.commit();
            return usuario;
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
            return null;
        }
    }
     
    public List<Usuario> findAll(){
        return dao.findAll();
    }
    
      public void update(Usuario usuario){
        try{
            simpleEntityManager.beginTransaction();
            dao.update(usuario);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void delete (Usuario u){
        try{
            simpleEntityManager.beginTransaction();
            dao.delete(u);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
      public Usuario getById(long id){
        return dao.getById(id);
    }
      
    public Usuario getUsuarioByLoginSenha(String login, String senha) {
        Query query = dao.getEntityManager().createQuery(
                "From Usuario where login = ?1 and senha = ?2"
        );
        query.setParameter(1, login);
        query.setParameter(2, senha);
        try {
            return (Usuario) query.getSingleResult();
        } catch (NoResultException e) {
            e.printStackTrace();
            return null;
        }
    }
}
