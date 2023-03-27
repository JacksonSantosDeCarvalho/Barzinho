/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cafi.barzinhodesktop.modelo.dao;

import br.com.cafi.barzinhodesktop.modelo.entidade.PermissaoUsuario;
import javax.persistence.EntityManager;

/**
 *
 * @author Jk-Sa
 */
public class PermissaoUsuarioDAO extends DAO<Long, PermissaoUsuario> {
    public PermissaoUsuarioDAO(EntityManager entityManager) {
        super( entityManager);
    }
}
