package Visao;

import DAO.ADMDAO;
import DAO.Conexao;
import DAO.SecretarioDAO;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 * @author eeep Vittor, Rebeca e Davi
 */

public class Tela_Login extends javax.swing.JFrame {

    public Tela_Login() {
        initComponents();
        setTitle("Pet Shop - Login");
        setSize(960, 628);
        setResizable(false);
        setLocationRelativeTo( null );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonSair = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        Tittle = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        Tipo_User = new javax.swing.JLabel();
        jTxtLogin = new javax.swing.JTextField();
        jPassSenha = new javax.swing.JPasswordField();
        jComboBoxTipo_User = new javax.swing.JComboBox<>();
        Linha = new javax.swing.JLabel();
        jPanelLogin = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 80, -1));

        jButtonLogin.setText("Log In");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 80, -1));

        Tittle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Edição Seja Bem-Vindo PNG.png"))); // NOI18N
        jPanel1.add(Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 300, 50));

        Login.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18)); // NOI18N
        Login.setText("Login:");
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        Senha.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18)); // NOI18N
        Senha.setText("Senha:");
        jPanel1.add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        Tipo_User.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18)); // NOI18N
        Tipo_User.setText("Tipo de Usuário:");
        jPanel1.add(Tipo_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        jPanel1.add(jTxtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 190, -1));
        jPanel1.add(jPassSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 190, -1));

        jComboBoxTipo_User.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - - -", "01 - Administrador", "02 - Secretário" }));
        jComboBoxTipo_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipo_UserActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxTipo_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 140, -1));

        Linha.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 51), null));
        jPanel1.add(Linha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 360, 260));

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 360, 260));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Edição LOGO PNG.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 310, 210));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cachorros (14).jpg"))); // NOI18N
        BG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipo_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipo_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipo_UserActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        Connection con = Conexao.AbrirConexao();  
        ADMDAO sql = new ADMDAO(con);
        SecretarioDAO sql2 = new SecretarioDAO(con);
        String login = jTxtLogin.getText();
        String senha = jPassSenha.getText();
        String tipo = jComboBoxTipo_User.getSelectedItem().toString();
        
        if(login.equals("") || senha.equals("") || tipo.equals("- - - -")){
            JOptionPane.showMessageDialog(null, "Campos não podem estar vazios");
            jTxtLogin.setText("");
            jPassSenha.setText("");
        }
        else{
            if(tipo.equals("02 - Secretário")&&(sql2.Logar(login, senha, tipo) == true)){
                Menu_Principal menu = new Menu_Principal();
                menu.setVisible(true);
                dispose();
            }
            else if (tipo.equals("01 - Administrador")&&(sql.Logar(login, senha, tipo) == true)){
                    Setor_Adm sdm = new Setor_Adm();
                    sdm.setVisible(true);
                    dispose();
  
            }
            else{
                    JOptionPane.showMessageDialog(null, "Usuário ou Senha Invalidos", "PetShop", JOptionPane.ERROR_MESSAGE);
                    jTxtLogin.setText("");
                    jPassSenha.setText("");
                }
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        setDefaultCloseOperation(Tela_Login.EXIT_ON_CLOSE);
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Linha;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Tipo_User;
    private javax.swing.JLabel Tittle;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxTipo_User;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPassSenha;
    private javax.swing.JTextField jTxtLogin;
    // End of variables declaration//GEN-END:variables
}
