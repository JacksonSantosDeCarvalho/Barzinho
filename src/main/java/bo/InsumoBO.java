/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import br.com.cafi.barzinhodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.barzinhodesktop.modelo.dao.InsumoDAO;
import br.com.cafi.barzinhodesktop.modelo.entidade.Insumo;
import br.com.cafi.barzinhodesktop.modelo.entidade.Produto;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class InsumoBO {
    private InsumoDAO dao;
    
    private final SimpleEntityManager simpleEntityManager;
     
     
    public InsumoBO(){
        this.simpleEntityManager = new SimpleEntityManager("HELDERnomeDoPersistence");
        dao = new InsumoDAO(simpleEntityManager.getEntityManager());
    }
     
     public void save(Insumo i){
        try{
            simpleEntityManager.beginTransaction();
            dao.save(i);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
     public void update(Insumo i) {
        try {
            simpleEntityManager.beginTransaction();
            dao.update(i);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
      public void delete(Insumo i){
        try{
            simpleEntityManager.beginTransaction();
            dao.delete(i);
            simpleEntityManager.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     
    public List<Insumo> findAll(){
        return dao.findAll();
    }
    
    
      public Insumo getById(long id){
        return dao.getById(id);
    }
}
