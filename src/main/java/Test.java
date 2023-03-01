
import br.com.cafi.barzinhodesktop.modelo.dao.DAO;
import br.com.cafi.barzinhodesktop.modelo.entidade.Usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jk-Sa
 */
public class Test {
    
    public static void main(String[] args) {
        DAO<Usuario> dao = new DAO<>(Usuario.class);
        Usuario u = new Usuario();
        u.setLogin("jackson");
        u.setNome("Jackson");
        u.setSenha("123");
        dao.abrir().create(u).fechar();
    }
}
