package Visao.Alterar;

import Visao.Consultar.Consulta_Cliente;

public class AlterarCliente extends javax.swing.JFrame {

    public AlterarCliente() {
        initComponents();
        setTitle("Pet Shop - Cliente - Alterar informações");
        setSize(540, 460);
        setResizable(false);
        setLocationRelativeTo( null );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Tel = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        Rua = new javax.swing.JLabel();
        Bairro = new javax.swing.JLabel();
        Cidade = new javax.swing.JLabel();
        CEP = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        jTxtNome_cli = new javax.swing.JTextField();
        jFormattedTxtTel_cli = new javax.swing.JFormattedTextField();
        jTxtEmail_cli = new javax.swing.JTextField();
        jTxtEnd_cli = new javax.swing.JTextField();
        jTxtBairro_cli = new javax.swing.JTextField();
        jTxtCidade_cli = new javax.swing.JTextField();
        jFormattedTxtCep_cli = new javax.swing.JFormattedTextField();
        jTxtN_cli = new javax.swing.JTextField();
        jButtonLimpar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Borda = new javax.swing.JLabel();
        BordaEnd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 0, 48)); // NOI18N
        jLabel1.setText("Alterar Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 64));

        Nome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Nome.setText("Nome completo:*");
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 150, -1));

        Tel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Tel.setText("Telefone:*");
        getContentPane().add(Tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, -1));

        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email.setText("email:");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        Rua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Rua.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Rua.setText("Endereço:*");
        getContentPane().add(Rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 120, -1));

        Bairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bairro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Bairro.setText("Bairro:*");
        getContentPane().add(Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 110, -1));

        Cidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Cidade.setText("Cidade:*");
        getContentPane().add(Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 20));

        CEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CEP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CEP.setText("CEP:");
        getContentPane().add(CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 70, -1));

        N.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        N.setText("Nº:*");
        getContentPane().add(N, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 40, -1));
        getContentPane().add(jTxtNome_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 330, -1));

        try {
            jFormattedTxtTel_cli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTxtTel_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 190, -1));
        getContentPane().add(jTxtEmail_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 330, -1));
        getContentPane().add(jTxtEnd_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 320, -1));
        getContentPane().add(jTxtBairro_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 320, -1));
        getContentPane().add(jTxtCidade_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 320, -1));

        try {
            jFormattedTxtCep_cli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTxtCep_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 140, -1));
        getContentPane().add(jTxtN_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 90, -1));

        jButtonLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 100, 30));

        jButtonAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAlterar.setText("Alterar");
        getContentPane().add(jButtonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 100, 30));

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 100, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 70, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("COD:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        Borda.setFont(new java.awt.Font("Tekton Pro Cond", 0, 10)); // NOI18N
        Borda.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Pessoais"));
        getContentPane().add(Borda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 520, 150));

        BordaEnd.setFont(new java.awt.Font("Tekton Pro", 0, 11)); // NOI18N
        BordaEnd.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        getContentPane().add(BordaEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 520, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        Consulta_Cliente cc = new Consulta_Cliente();
        cc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro;
    private javax.swing.JLabel Borda;
    private javax.swing.JLabel BordaEnd;
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel N;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Rua;
    private javax.swing.JLabel Tel;
    private javax.swing.JLabel email;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JFormattedTextField jFormattedTxtCep_cli;
    private javax.swing.JFormattedTextField jFormattedTxtTel_cli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTxtBairro_cli;
    private javax.swing.JTextField jTxtCidade_cli;
    private javax.swing.JTextField jTxtEmail_cli;
    private javax.swing.JTextField jTxtEnd_cli;
    private javax.swing.JTextField jTxtN_cli;
    private javax.swing.JTextField jTxtNome_cli;
    // End of variables declaration//GEN-END:variables


    private void Limpar() {
        jTxtNome_cli.setText("");
        jFormattedTxtTel_cli.setText("");
        jTxtEnd_cli.setText("");
        jTxtBairro_cli.setText("");
        jTxtCidade_cli.setText("");
        jFormattedTxtCep_cli.setText("");
        jTxtN_cli.setText("");
        jTxtEmail_cli.setText("");
        
    }

}
