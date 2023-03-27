/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.cafi.barzinhodesktop.visao;

import bo.PermissaoBO;
import bo.UsuarioBO;
import bo.PermissaoUsuarioBO;
import br.com.cafi.barzinhodesktop.modelo.entidade.Permissao;
import br.com.cafi.barzinhodesktop.modelo.entidade.Usuario;
import br.com.cafi.barzinhodesktop.modelo.entidade.PermissaoUsuario;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class CadastrarUsuario extends javax.swing.JPanel {

    /**
     * Creates new form CadastrarProduto
     */
    private Usuario usuario;
    private ArrayList<JCheckBox> listaCheckbox;
    private ArrayList<Permissao> listaPermissoesSelecionadas;
    
    public CadastrarUsuario(JInternalFrame jif) {
        initComponents();
        usuario = new Usuario();
        listaCheckbox= new ArrayList<>();
        listaPermissoesSelecionadas= new ArrayList<>();
        carregarPermissoes();
    }
    private void carregarPermissoes(){
        PermissaoBO bo = new PermissaoBO();
        List<Permissao> lista = bo.getListPermissaoOrdenadoNome();
        System.out.println("O tamanho da lista de permissao é "+lista.size());
        persmissoesPanel.setLayout(null);
        int y = 20;
        for (Permissao permissao : lista){
            System.out.println(permissao.getDescricao());
            JCheckBox j = new JCheckBox(permissao.getDescricao());
            listaCheckbox.add(j);
            persmissoesPanel.add(j);
            j.setVisible(true);
            j.setBounds(0, y,200,50);
            y+=30;
        }
    }
    
    private void pegarListaDeCheckboxSelecionadoEAddNaListaPermissao(){
        PermissaoBO bo = new PermissaoBO();
        for (JCheckBox item : listaCheckbox){
          if (item.isSelected())
          {
              Permissao p = bo.getPermissaoByDescricao(item.getText());
              listaPermissoesSelecionadas.add(p);
          }
      }
    }
    
    private void salvarUsuarioPermissao(){
        pegarListaDeCheckboxSelecionadoEAddNaListaPermissao();
        PermissaoUsuarioBO bo = new PermissaoUsuarioBO();
        for (Permissao p :listaPermissoesSelecionadas)
        {
            PermissaoUsuario up = new PermissaoUsuario();
            up.setPermissao(p);
            up.setUsuario(usuario);
            bo.save(up);
        }
    }
    
    public CadastrarUsuario(JInternalFrame jif, Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        carregarDados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        salvarButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        senhaPasswordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        confirmarSenhaPasswordField = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        persmissoesPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Nome");

        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        jLabel2.setText("Login");

        jLabel3.setText("Senha");

        jLabel4.setText("Confirmar Senha");

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout persmissoesPanelLayout = new javax.swing.GroupLayout(persmissoesPanel);
        persmissoesPanel.setLayout(persmissoesPanelLayout);
        persmissoesPanelLayout.setHorizontalGroup(
            persmissoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );
        persmissoesPanelLayout.setVerticalGroup(
            persmissoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(persmissoesPanel);

        jButton1.setText("selecionou?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salvarButton)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(25, 25, 25)
                                    .addComponent(confirmarSenhaPasswordField))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(80, 80, 80)
                                            .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(confirmarSenhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarButton)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        if (!loginTextField.getText().equals("")
                && !(new String(senhaPasswordField.getPassword()).trim().equals(""))) {
            if (new String(confirmarSenhaPasswordField.getPassword()).equals(new String(senhaPasswordField.getPassword()))) {
                usuario.setLogin(loginTextField.getText());
                usuario.setNome(nomeTextField.getText());
                usuario.setSenha(new String(senhaPasswordField.getPassword()));

                UsuarioBO bo = new UsuarioBO();
                if (usuario.getId() == null) {
                    bo.save(usuario);
                    salvarUsuarioPermissao();
                } else {
                    bo.update(usuario);
                }
                JOptionPane.showMessageDialog(null, "Usuario Salvo com sucesso");
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Senhas diferentes");
            }
        } else {
            JOptionPane.showMessageDialog(null, "campos em branco");
        }
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
    }//GEN-LAST:event_jButton1ActionPerformed

    public JTextField getDescricaoTextField() {
        return nomeTextField;
    }

    public JButton getSalvarButton() {
        return salvarButton;
    }

    private void limparCampos() {
        loginTextField.setText("");
        nomeTextField.setText("");
        senhaPasswordField.setText("");
        confirmarSenhaPasswordField.setText("");
    }

    private void carregarDados() {
        loginTextField.setText(usuario.getLogin());
        nomeTextField.setText(usuario.getNome());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmarSenhaPasswordField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JPanel persmissoesPanel;
    private javax.swing.JButton salvarButton;
    private javax.swing.JPasswordField senhaPasswordField;
    // End of variables declaration//GEN-END:variables
}
