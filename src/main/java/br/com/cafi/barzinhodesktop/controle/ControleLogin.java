/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cafi.barzinhodesktop.controle;

import br.com.cafi.barzinhodesktop.visao.TelaInicial;
import br.com.cafi.barzinhodesktop.visao.TelaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Jk-Sa
 */
public class ControleLogin implements ActionListener{
    
    private TelaLogin telalogin;
    
    public ControleLogin(TelaLogin telaLogin){
        this.telalogin=telaLogin;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==telalogin.getFecharButton()){
        System.exit(0);
    }else if(e.getSource() == telalogin.getEntrarButton()){
            
            if(telalogin.getLoginTextField().getText().equals("maria") && new String (telalogin.getSenhaPasswordField().getPassword()).equals("123")){
                TelaInicial telaInicial = new TelaInicial();
                telaInicial.setVisible(true);
                telalogin.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Senha ou Login Incorreta");
                telalogin.getLoginTextField().setText("");
                telalogin.getSenhaPasswordField().setText("");
;            }
    }
    }
    
}
