/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cafi.barzinhodesktop.modelo.dao;

import br.com.cafi.barzinhodesktop.modelo.entidade.Permissao;
import javax.persistence.EntityManager;

/**
 *
 * @author Jk-Sa
 */
public class PermissaoDAO extends DAO<Long, Permissao> {

    public PermissaoDAO(EntityManager entityManager) {
        super(entityManager);
    }

    public Permissao getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
