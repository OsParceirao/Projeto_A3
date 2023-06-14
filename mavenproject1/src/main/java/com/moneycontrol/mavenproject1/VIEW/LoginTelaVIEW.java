package com.moneycontrol.mavenproject1.VIEW;

import com.moneycontrol.mavenproject1.VIEW.USUARIO.MoneyControlUSERVIEW;
import com.moneycontrol.mavenproject1.VIEW.ADMIN.MoneyControlADMINVIEW;
import com.moneycontrol.mavenproject1.DAO.AdminDAO;
import com.moneycontrol.mavenproject1.DTO.AdminDTO;
import com.moneycontrol.mavenproject1.DTO.UsuarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginTelaVIEW extends javax.swing.JFrame {

    /**
     * Creates new form LoginTela
     */
    public LoginTelaVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        senhaTextField = new javax.swing.JPasswordField();
        loginTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        btnSair.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setSelected(true);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(440, 500, 76, 28);

        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLogin.setText("Entrar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(640, 500, 76, 28);

        senhaTextField.setBackground(new java.awt.Color(153, 153, 153));
        senhaTextField.setBorder(null);
        getContentPane().add(senhaTextField);
        senhaTextField.setBounds(400, 430, 348, 42);

        loginTextField.setBackground(new java.awt.Color(153, 153, 153));
        loginTextField.setBorder(null);
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(loginTextField);
        loginTextField.setBounds(400, 350, 348, 39);

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("MONEY CONTROL");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 220, 440, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 320, 50, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SENHA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 410, 60, 17);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\olliv\\OneDrive\\Imagens\\Imagens money control\\ImagenLogin.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, -10, 1200, 650);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\olliv\\OneDrive\\Imagens\\Imagens money control\\FundoPreto.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1200, 640);

        setSize(new java.awt.Dimension(1210, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //BOTAO ENTRAR
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        //pegando o texto dos imputs
        try
        {

            String nome_usuario;
            String senha_usuario;

            nome_usuario = loginTextField.getText();
            senha_usuario = senhaTextField.getText();

            AdminDTO adminDTO = new AdminDTO();
            adminDTO.setUsuarioAdmin(nome_usuario);
            adminDTO.setSenhaAdmin(senha_usuario);

            AdminDAO adminDAO = new AdminDAO();
            ResultSet rsadminDAO = adminDAO.autentificacaoAdmin(adminDTO);

            if (rsadminDAO.next())
            {
                this.dispose();
                MoneyControlADMINVIEW moneycontroladminVIEW = new MoneyControlADMINVIEW();
                moneycontroladminVIEW.setVisible(true);
            } else
            {
                //instanciando novo DTO
                UsuarioDTO userDTO = new UsuarioDTO();

                userDTO.setNome_usuario(nome_usuario);
                userDTO.setSenha_usuario(senha_usuario);

                //instanciando usuario DAO
                AdminDAO usuarioDAO = new AdminDAO();

                //chamando a função que vai fazer a verificação 
                //adicionando objetos
                ResultSet rsusuarioDAO = usuarioDAO.autentificacaoUsuario(userDTO);
                //if de verificação, se o banco retornar algo para a função ele redireciona para a outra pagina, se ele nao retornar ele da uma mensagem de erro
                if (rsusuarioDAO.next())
                {

                    //direcionamento de pagina
                    MoneyControlUSERVIEW moneycontroluserVIEW = new MoneyControlUSERVIEW();
                    moneycontroluserVIEW.setVisible(true);

                    //depois que logarmos, fechamos a tela de login
                    dispose();

                } else
                {
                    //enviar mensagem dizendo que a senha ou o usuario esta incorreto   
                    JOptionPane.showMessageDialog(null, "Senha ou usuario incorretos");
                }
            }

        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "loginVIEW " + erro);
        }


    }//GEN-LAST:event_btnLoginActionPerformed

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldActionPerformed

    //BOTAO SAIR
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JPasswordField senhaTextField;
    // End of variables declaration//GEN-END:variables
}
