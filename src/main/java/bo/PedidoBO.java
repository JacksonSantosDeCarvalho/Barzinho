/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import br.com.cafi.barzinhodesktop.modelo.dao.PedidoDAO;
import br.com.cafi.barzinhodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.barzinhodesktop.modelo.entidade.Pedido;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Jk-Sa
 */
public class PedidoBO {
    private PedidoDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public PedidoBO(){
        this.simpleEntityManager = new SimpleEntityManager("HELDERnomeDoPersistence");
        dao = new PedidoDAO(simpleEntityManager.getEntityManager());
    }
     
    public void save(Pedido obj){
        try{
            simpleEntityManager.beginTransaction();
            dao.save(obj);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
      public void delete(Pedido obj){
        try{
            simpleEntityManager.beginTransaction();
            dao.delete(obj);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
      
      public void update(Pedido pedido) {
        try {
            simpleEntityManager.beginTransaction();
            dao.update(pedido);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }

    }
     
    public List<Pedido> findAll(){
        return dao.findAll();
    }
    
    
    public List<Pedido> findWhere(Long id){
        Query query = dao.getEntityManager().createQuery(
                "From Pedido where comanda_id = ?1 order by id desc"
        );
        query.setParameter(1, id);
        try {
            return query.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
      public Pedido getById(long id){
        return dao.getById(id);
    }
}
