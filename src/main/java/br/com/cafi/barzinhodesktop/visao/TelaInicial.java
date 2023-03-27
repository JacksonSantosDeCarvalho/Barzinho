/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.cafi.barzinhodesktop.visao;

import bo.PermissaoUsuarioBO;
import br.com.cafi.barzinhodesktop.modelo.entidade.Usuario;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jk-Sa
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial(Usuario usuario) {
        initComponents();
        this.usuarioLogado=usuario;
        verificarPermissao();
    }
    
     private void verificarPermissao() {
        PermissaoUsuarioBO bo = new PermissaoUsuarioBO();
        cadastrarProdutoMenuItem.setEnabled(bo.usuarioPossuiPermissao(usuarioLogado, "Cadastrar Produto"));
        cadastrarPermissaoMenuItem.setEnabled(bo.usuarioPossuiPermissao(usuarioLogado, "Cadastrar Permissão"));
        cadastrarUsuarioMenuItem.setEnabled(bo.usuarioPossuiPermissao(usuarioLogado, "Cadastrar Usuário"));
        cadastrarComandaMenuItem.setEnabled(bo.usuarioPossuiPermissao(usuarioLogado, "Cadastrar Comanda"));
        listarProdutoMenuItem.setEnabled(bo.usuarioPossuiPermissao(usuarioLogado, "Listar Produto"));
        listarUsuarioMenuItem.setEnabled(bo.usuarioPossuiPermissao(usuarioLogado, "Listar Usuário"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        cadastrarComandaMenuItem = new javax.swing.JMenuItem();
        cadastrarProdutoMenuItem = new javax.swing.JMenuItem();
        cadastrarUsuarioMenuItem = new javax.swing.JMenuItem();
        cadastrarPermissaoMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        listarProdutoMenuItem = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        listarUsuarioMenuItem = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        sairMenuItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem14.setText("jMenuItem14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        jMenu2.setText("Principal");

        jMenuItem3.setText("Mesas / Comandas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Pedidos Delivery");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Pedido no Caixa");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Cadastrar");

        cadastrarComandaMenuItem.setText("Cadastrar Comanda");
        cadastrarComandaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarComandaMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrarComandaMenuItem);

        cadastrarProdutoMenuItem.setText("Cadastrar Produto");
        cadastrarProdutoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdutoMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrarProdutoMenuItem);

        cadastrarUsuarioMenuItem.setText("Cadastrar Usuario");
        cadastrarUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarUsuarioMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrarUsuarioMenuItem);

        cadastrarPermissaoMenuItem.setText("Cadastrar Permissão");
        cadastrarPermissaoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarPermissaoMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrarPermissaoMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Produtos");

        listarProdutoMenuItem.setText("Listar Produtos");
        listarProdutoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarProdutoMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(listarProdutoMenuItem);

        jMenuItem8.setText("Reposição");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Financeiro");

        jMenuItem9.setText("Fluxo de Caixa");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Contas a Pagar");
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Capital de Giro");
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("Nota Fiscal");
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Administrativo");

        listarUsuarioMenuItem.setText("Listar Usuario");
        listarUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarUsuarioMenuItemActionPerformed(evt);
            }
        });
        jMenu5.add(listarUsuarioMenuItem);

        jMenuBar1.add(jMenu5);

        jMenu8.setText("Configurações");

        sairMenuItem.setText("Sair");
        sairMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairMenuItemActionPerformed(evt);
            }
        });
        jMenu8.add(sairMenuItem);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void cadastrarProdutoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdutoMenuItemActionPerformed
        JInternalFrame jif = new JInternalFrame("Cadastrar Produtos");
        this.getDesktopPane().add(jif);
        jif.setVisible(true);
        jif.setBounds(0,0,450,250);
        jif.setClosable(true);
        jif.setResizable(true);
        jif.add(new CadastrarProduto (jif));
    }//GEN-LAST:event_cadastrarProdutoMenuItemActionPerformed

    private void cadastrarComandaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarComandaMenuItemActionPerformed
        JInternalFrame jif = new JInternalFrame("Cadastrar Comandas");
        jif.setVisible(true);
        jif.setBounds(0,0,450,250);
        jif.setClosable(true);
        jif.setResizable(true);
        CadastrarComanda cc = new CadastrarComanda(jif);
        jif.add(cc);
        getDesktopPane().add(jif);
    }//GEN-LAST:event_cadastrarComandaMenuItemActionPerformed

    private void listarProdutoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProdutoMenuItemActionPerformed
        JInternalFrame jif = new JInternalFrame("Listar Produto");
        jif.setBounds(0, 0, 400, 600);
        jif.setVisible(true);
        jif.setClosable(true);
        jif.setResizable(true);
        ListarProduto obj = new ListarProduto();
        jif.add(obj);
        getDesktopPane().add(jif);  
    }//GEN-LAST:event_listarProdutoMenuItemActionPerformed

    private void cadastrarUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuarioMenuItemActionPerformed
        JInternalFrame jif = new JInternalFrame("Cadastrar Usuario");
        this.getDesktopPane().add(jif);
        jif.setVisible(true);
        jif.setBounds(0,0,450,250);
        jif.setClosable(true);
        jif.setResizable(true);
        jif.add(new CadastrarUsuario (jif));
    }//GEN-LAST:event_cadastrarUsuarioMenuItemActionPerformed

    private void listarUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarUsuarioMenuItemActionPerformed
        JInternalFrame jif = new JInternalFrame("Listar Usuario");
        jif.setBounds(0, 0, 400, 600);
        jif.setVisible(true);
        jif.setClosable(true);
        jif.setResizable(true);
        ListarUsuario obj = new ListarUsuario(this, jif);
        jif.add(obj);
        getDesktopPane().add(jif);  
    }//GEN-LAST:event_listarUsuarioMenuItemActionPerformed

    private void sairMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairMenuItemActionPerformed
        int op = JOptionPane.showConfirmDialog(null, usuarioLogado.getNome()+" deseja sair?");
        if (op==JOptionPane.YES_OPTION){
            new TelaLogin().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_sairMenuItemActionPerformed

    private void cadastrarPermissaoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarPermissaoMenuItemActionPerformed
        JInternalFrame jif = new JInternalFrame("Cadastrar Permissão");
        this.getDesktopPane().add(jif);
        jif.setVisible(true);
        jif.setBounds(0,0,450,250);
        jif.setClosable(true);
        jif.setResizable(true);
        jif.add(new CadastrarPermissao (jif));
    }//GEN-LAST:event_cadastrarPermissaoMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial(null).setVisible(true);
            }
        });
    }
    
      public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public void setDesktopPane(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
    }

    private Usuario usuarioLogado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastrarComandaMenuItem;
    private javax.swing.JMenuItem cadastrarPermissaoMenuItem;
    private javax.swing.JMenuItem cadastrarProdutoMenuItem;
    private javax.swing.JMenuItem cadastrarUsuarioMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem listarProdutoMenuItem;
    private javax.swing.JMenuItem listarUsuarioMenuItem;
    private javax.swing.JMenuItem sairMenuItem;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the desktopPane
     */
}
