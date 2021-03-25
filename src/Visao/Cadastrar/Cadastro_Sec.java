package Visao.Cadastrar;

import DAO.SecretarioDAO;
import DAO.Conexao;
import Modelo.Secretario;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Cadastro_Sec extends javax.swing.JFrame {

    public Cadastro_Sec() {
        initComponents();
        setTitle("Pet Shop - Cadastrar Secretário");
        setSize(929, 610);
        setResizable(false);
        setLocationRelativeTo( null );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Nome = new javax.swing.JLabel();
        RG = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        Tel = new javax.swing.JLabel();
        jTxtNome_sec = new javax.swing.JTextField();
        jTxtRG_sec = new javax.swing.JTextField();
        jFormattedTextCPF_sec = new javax.swing.JFormattedTextField();
        jFormattedTextTel_Sec = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Rua = new javax.swing.JLabel();
        Bairro = new javax.swing.JLabel();
        Cidade = new javax.swing.JLabel();
        CEP = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        jTxtRua_Sec = new javax.swing.JTextField();
        jTxtBairro_Sec = new javax.swing.JTextField();
        jTxtCidade_Sec = new javax.swing.JTextField();
        jTxtNum = new javax.swing.JTextField();
        jFormattedTextCEP_Sec = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtUser_sec = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPassSenha_sec2 = new javax.swing.JPasswordField();
        jPassSenha_sec = new javax.swing.JPasswordField();
        jTxtemail_sec = new javax.swing.JTextField();
        jRadioTipo = new javax.swing.JRadioButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tekton Pro", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Nome.setText("Nome completo:*");
        jPanel3.add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        RG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RG.setText("RG:*");
        jPanel3.add(RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, -1));

        CPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CPF.setText("CPF:*");
        jPanel3.add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, -1));

        Tel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Tel.setText("Telefone:*");
        jPanel3.add(Tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, -1));
        jPanel3.add(jTxtNome_sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 477, -1));

        jTxtRG_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtRG_secActionPerformed(evt);
            }
        });
        jPanel3.add(jTxtRG_sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 260, -1));

        try {
            jFormattedTextCPF_sec.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextCPF_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextCPF_secActionPerformed(evt);
            }
        });
        jPanel3.add(jFormattedTextCPF_sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 260, -1));

        try {
            jFormattedTextTel_Sec.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(jFormattedTextTel_Sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 260, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 670, 160));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cats PNG - Copia.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tekton Pro", 0, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Rua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Rua.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Rua.setText("Rua:*");
        jPanel4.add(Rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, -1));

        Bairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bairro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Bairro.setText("Bairro:*");
        jPanel4.add(Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, -1));

        Cidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Cidade.setText("Cidade:*");
        jPanel4.add(Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 20));

        CEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CEP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CEP.setText("CEP:");
        jPanel4.add(CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, -1));

        N.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        N.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        N.setText("Nº:*");
        jPanel4.add(N, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 40, -1));
        jPanel4.add(jTxtRua_Sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 480, -1));
        jPanel4.add(jTxtBairro_Sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 310, -1));
        jPanel4.add(jTxtCidade_Sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 310, -1));
        jPanel4.add(jTxtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 120, -1));

        try {
            jFormattedTextCEP_Sec.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel4.add(jFormattedTextCEP_Sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 130, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 670, 160));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tekton Pro", 0, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("email:*");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Usuário:*");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Repita a senha:*");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, -1));
        jPanel5.add(jTxtUser_sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 180, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Senha:*");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, -1));
        jPanel5.add(jPassSenha_sec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 180, -1));

        jPassSenha_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassSenha_secActionPerformed(evt);
            }
        });
        jPanel5.add(jPassSenha_sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 180, -1));
        jPanel5.add(jTxtemail_sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 470, -1));

        jRadioTipo.setBackground(new java.awt.Color(255, 255, 255));
        jRadioTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioTipo.setSelected(true);
        jRadioTipo.setText("02 - Secretário");
        jPanel5.add(jRadioTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 670, 160));

        jButtonCancelar.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 210, 40));

        jButtonCadastrar.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 210, 40));

        jButtonLimpar.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 210, 40));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("*Campos obrigatório ao \n     preenchimento\n");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 210, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 920, 490));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 0, 50)); // NOI18N
        jLabel1.setText("Cadastro de Secretários");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextCPF_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextCPF_secActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextCPF_secActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        String nome_sec = jTxtNome_sec.getText();
        String cpf_sec = jFormattedTextCPF_sec.getText();
        String rg_sec = jTxtRG_sec.getText();
        String telefone_sec = jFormattedTextTel_Sec.getText();
        String rua_sec = jTxtRua_Sec.getText();
        String bairro_sec = jTxtBairro_Sec.getText();
        String cidade_sec = jTxtCidade_Sec.getText();
        String cep_sec = jFormattedTextCEP_Sec.getText();
        String numero_sec = jTxtNum.getText();
        String user_sec = jTxtUser_sec.getText();
        String email_sec = jTxtemail_sec.getText();
        String senha_sec = jPassSenha_sec.getText();
        String senha_sec2 = jPassSenha_sec2.getText();
        String tipo_sec = jRadioTipo.getActionCommand();

        if(nome_sec.equals("") || cpf_sec.equals("") || rg_sec.equals("") || telefone_sec.equals("")
                || rua_sec.equals("") || numero_sec.equals("") || bairro_sec.equals("") || cidade_sec.equals("")
                || user_sec.equals("") ||email_sec.equals("") || senha_sec.equals("") || senha_sec2.equals("")
                || tipo_sec.equals("")){
            JOptionPane.showMessageDialog(null, "Existem campos vazios", "Pet Shop", JOptionPane.WARNING_MESSAGE);
        }else{
            Connection con  = Conexao.AbrirConexao();
            SecretarioDAO sql = new SecretarioDAO(con);
            int n = Integer.parseInt(numero_sec);
            Secretario s = new Secretario();
            
            s.setNome_sec(nome_sec);
            s.setCpf_sec(cpf_sec);
            s.setRg_sec(rg_sec);
            s.setTelefone_sec(telefone_sec);
            s.setRua_sec(rua_sec);
            s.setNumero_sec(n);
            s.setBairro_sec(bairro_sec);
            s.setCidade_sec(cidade_sec);
            s.setCep_sec(cep_sec);
            s.setEmail_sec(email_sec);
            s.setLogin_sec(user_sec);
            s.setSenha_sec(senha_sec);
            s.setTipo_sec(tipo_sec);
            
            sql.Inserir_Secretario(s);
            Conexao.FecharConexao(con);
            
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Pet Shop", JOptionPane.INFORMATION_MESSAGE);
            Limpar();
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        Tela_Cadastro tc = new Tela_Cadastro();
        tc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTxtRG_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtRG_secActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtRG_secActionPerformed

    private void jPassSenha_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassSenha_secActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassSenha_secActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Sec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Sec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Sec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Sec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Sec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro;
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel N;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel RG;
    private javax.swing.JLabel Rua;
    private javax.swing.JLabel Tel;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JFormattedTextField jFormattedTextCEP_Sec;
    private javax.swing.JFormattedTextField jFormattedTextCPF_sec;
    private javax.swing.JFormattedTextField jFormattedTextTel_Sec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPassSenha_sec;
    private javax.swing.JPasswordField jPassSenha_sec2;
    private javax.swing.JRadioButton jRadioTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTxtBairro_Sec;
    private javax.swing.JTextField jTxtCidade_Sec;
    private javax.swing.JTextField jTxtNome_sec;
    private javax.swing.JTextField jTxtNum;
    private javax.swing.JTextField jTxtRG_sec;
    private javax.swing.JTextField jTxtRua_Sec;
    private javax.swing.JTextField jTxtUser_sec;
    private javax.swing.JTextField jTxtemail_sec;
    // End of variables declaration//GEN-END:variables

    private void Limpar() {
        jTxtNome_sec.setText("");
        jTxtRG_sec.setText("");
        jFormattedTextCPF_sec.setText("");
        jFormattedTextTel_Sec.setText("");
        jTxtRua_Sec.setText("");
        jTxtBairro_Sec.setText("");
        jTxtCidade_Sec.setText("");
        jFormattedTextCEP_Sec.setText("");
        jTxtNum.setText("");
        jTxtemail_sec.setText("");
        jTxtUser_sec.setText("");
        jPassSenha_sec.setText("");
        jPassSenha_sec2.setText("");
        
    }
}
