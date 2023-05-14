/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cafi.barzinhodesktop.modelo.dao;

import br.com.cafi.barzinhodesktop.modelo.entidade.Cliente;
import javax.persistence.EntityManager;

/**
 *
 * @author Jk-Sa
 */
public class ClienteDAO extends DAO<Long, Cliente> {
    public ClienteDAO(EntityManager entityManager) {
        super(entityManager);
    }
}