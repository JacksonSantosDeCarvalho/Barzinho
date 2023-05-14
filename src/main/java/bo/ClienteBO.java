/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import br.com.cafi.barzinhodesktop.modelo.dao.ClienteDAO;
import br.com.cafi.barzinhodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.barzinhodesktop.modelo.entidade.Cliente;
import java.util.List;

/**
 *
 * @author Jk-Sa
 */
public class ClienteBO {
    private ClienteDAO dao;
    
    private final SimpleEntityManager simpleEntityManager;
     
     
    public ClienteBO(){
        this.simpleEntityManager = new SimpleEntityManager("HELDERnomeDoPersistence");
        dao = new ClienteDAO(simpleEntityManager.getEntityManager());
    }
     
    public Cliente save(Cliente cliente){
        try{
            simpleEntityManager.beginTransaction();
            dao.save(cliente);
            simpleEntityManager.commit();
            return cliente;
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
            return null;
        }
    }
     
    public List<Cliente> findAll(){
        return dao.findAll();
    }
    
      public void update(Cliente cliente){
        try{
            simpleEntityManager.beginTransaction();
            dao.update(cliente);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    public void delete (Cliente u){
        try{
            simpleEntityManager.beginTransaction();
            dao.delete(u);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
      public Cliente getById(long id){
        return dao.getById(id);
    }
      
    
}
