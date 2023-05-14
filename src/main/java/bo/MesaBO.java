/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import br.com.cafi.barzinhodesktop.modelo.dao.MesaDAO;
import br.com.cafi.barzinhodesktop.modelo.dao.SimpleEntityManager;
import br.com.cafi.barzinhodesktop.modelo.entidade.Comanda;
import java.util.List;

/**
 *
 * @author Jk-Sa
 */
public class MesaBO {

    private MesaDAO dao;

    private SimpleEntityManager simpleEntityManager;

    public MesaBO() {
        this.simpleEntityManager = new SimpleEntityManager("HELDERnomeDoPersistence");
        dao = new MesaDAO(simpleEntityManager.getEntityManager());
    }

    public void save(Comanda obj) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(obj);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    public void delete(Comanda obj) {
        try {
            simpleEntityManager.beginTransaction();
            dao.delete(obj);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Comanda> findAll() {
        return dao.findAll();
    }

    public Comanda getById(long id) {
        return dao.getById(id);
    }

    public void update(Comanda comanda) {
        try {
            simpleEntityManager.beginTransaction();
            dao.update(comanda);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }

    }
}
