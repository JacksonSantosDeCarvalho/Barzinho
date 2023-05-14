/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cafi.barzinhodesktop.modelo.dao;

import br.com.cafi.barzinhodesktop.modelo.entidade.ItemPedido;
import javax.persistence.EntityManager;

/**
 *
 * @author Jk-Sa
 */
public class ItemPedidoDAO extends DAO<Long, ItemPedido> {
    public ItemPedidoDAO (EntityManager entityManager){
        super(entityManager);
    }
}
