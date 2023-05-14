/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cafi.barzinhodesktop.modelo.dao;

import br.com.cafi.barzinhodesktop.modelo.entidade.Pedido;
import javax.persistence.EntityManager;

/**
 *
 * @author Jk-Sa
 */
public class PedidoDAO extends DAO<Long, Pedido> {
        public PedidoDAO(EntityManager entityManager) {
        super(entityManager);
    }
    
}
