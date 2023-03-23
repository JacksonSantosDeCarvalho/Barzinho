/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.cafi.barzinhodesktop.visao;

import bo.UsuarioBO;
import br.com.cafi.barzinhodesktop.modelo.entidade.Usuario;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jk-Sa
 */
public class ListarUsuario extends javax.swing.JPanel {

    /**
     * Creates new form ListarUsuario
     */
    private TelaInicial telaInicial;
    JInternalFrame jif;
    public ListarUsuario(TelaInicial telainicial, JInternalFrame jif) {
        initComponents();
        carregarTabela();
        this.telaInicial = telainicial;
        this.jif = jif;
    }

    private List<Usuario> lista;

    private void carregarTabela(){
        limparTabela();
         UsuarioBO bo = new UsuarioBO();
        lista = bo.findAll();
        DefaultTableModel model
                = (DefaultTableModel) jTable1.getModel();
        for (Usuario obj : lista) {
            model.addRow(new Object[]{obj.getId(), obj.getLogin(),
                obj.getNome()});
        }
    }
    
    private void limparTabela(){
         DefaultTableModel model
                = (DefaultTableModel) jTable1.getModel();
         for (int i =0; i<model.getRowCount();i++){
             model.removeRow(0);
         }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deletarButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Login"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        deletarButton.setText("Deletar");
        deletarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarButtonActionPerformed(evt);
            }
        });

        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(editarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deletarButton)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletarButton)
                    .addComponent(editarButton))
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deletarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarButtonActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja remover?");
        if (opcao == JOptionPane.YES_OPTION) {
        DefaultTableModel model
                = (DefaultTableModel) jTable1.getModel();
        long id = (long)model.getValueAt(jTable1.getSelectedRow(), 0);
        UsuarioBO bo = new UsuarioBO();
        Usuario u = bo.getById(id);
        System.out.println("Tentando apagar o usuário "+u.getNome());
        bo.delete(u);
        
        carregarTabela();
       }
    }//GEN-LAST:event_deletarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        DefaultTableModel model
                = (DefaultTableModel) jTable1.getModel();
        long id = (Long)model.getValueAt(jTable1.getSelectedRow(), 0);
        UsuarioBO bo = new UsuarioBO();
        Usuario u = bo.getById(id);
        //abrir novo internalframe, devido isso, precisamos do desktoppanel da 
        //tela inicial
        JInternalFrame jif = new JInternalFrame("Editar Usuário");
        jif.setBounds(0, 0, 400, 600);
        jif.setVisible(true);
        jif.setClosable(true);
        CadastrarUsuario cp = new CadastrarUsuario(jif,u);
        jif.add(cp);
        this.telaInicial.getDesktopPane().add(jif);
        this.jif.dispose();
    }//GEN-LAST:event_editarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletarButton;
    private javax.swing.JButton editarButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}