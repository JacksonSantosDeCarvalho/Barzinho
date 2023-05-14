/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import br.com.cafi.barzinhodesktop.modelo.dao.PermissaoUsuarioDAO;
import br.com.cafi.barzinhodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.barzinhodesktop.modelo.entidade.PermissaoUsuario;
import br.com.cafi.barzinhodesktop.modelo.entidade.Usuario;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Jk-Sa
 */
public class PermissaoUsuarioBO {
    private PermissaoUsuarioDAO dao;
     
    private SimpleEntityManager simpleEntityManager= new SimpleEntityManager("HELDERnomeDoPersistence");
     
    public PermissaoUsuarioBO(){        
         this.simpleEntityManager = new SimpleEntityManager("HELDERnomeDoPersistence");
        dao = new PermissaoUsuarioDAO(simpleEntityManager.getEntityManager());
    }
     
    public void save(PermissaoUsuario obj){
        try{
            simpleEntityManager.beginTransaction();
            dao.save(obj);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void delete(PermissaoUsuario obj){
        try{
            simpleEntityManager.beginTransaction();
            dao.delete(obj);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     
    public List<PermissaoUsuario> findAll(){
        return dao.findAll();
    }

    public boolean usuarioPossuiPermissao(Usuario usuarioLogado, String permissao) {
    Query query = dao.getEntityManager().createQuery(
                "From PermissaoUsuario where permissao_id "
                + "in (select id from Permissao where descricao = ?1) "
                + "and usuario_id = ?2"
        );
        query.setParameter(1, permissao);
        query.setParameter(2, usuarioLogado.getId());
        System.out.println(query.toString());
        try {
            PermissaoUsuario up = (PermissaoUsuario) query.getSingleResult();
            return up!=null;
        } catch (NoResultException e) {
            e.printStackTrace();
            return false;
        }
    }
}
