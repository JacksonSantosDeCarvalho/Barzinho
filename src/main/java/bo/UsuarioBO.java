/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import br.com.cafi.barzinhodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.barzinhodesktop.modelo.dao.UsuarioDAO;
import br.com.cafi.barzinhodesktop.modelo.entidade.Usuario;
import java.util.List;

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
     
    public void save(Usuario usuario){
        try{
            simpleEntityManager.beginTransaction();
            dao.save(usuario);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
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
}
