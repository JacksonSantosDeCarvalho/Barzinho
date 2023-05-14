/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cafi.barzinhodesktop.modelo.dao;

import br.com.cafi.barzinhodesktop.modelo.entidade.Comanda;
import javax.persistence.EntityManager;

public class MesaDAO extends DAO<Long, Comanda> {
    public MesaDAO (EntityManager entityManager){
        super(entityManager);
    }
    
}
