package Visao.Alterar;

import Visao.Consultar.Consulta_Servico;

public class AlterarServico extends javax.swing.JFrame {

    public AlterarServico() {
        initComponents();
        setTitle("Pet Shop - Serviços - Alterar");
        setSize(566, 318);
        setLocationRelativeTo( null );
        setResizable(false);
        setLocationRelativeTo( null );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelCod = new javax.swing.JLabel();
        jTxtCod_Serv = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTxtNome_Serv = new javax.swing.JTextField();
        jLabelPreco = new javax.swing.JLabel();
        jTxtPreco_Serv = new javax.swing.JTextField();
        jLabelDesconto = new javax.swing.JLabel();
        jTxtDesc_Serv = new javax.swing.JTextField();
        jLabelDispo = new javax.swing.JLabel();
        jComboBoxDispon_Serv = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jButtonLimpar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Trajan Pro", 0, 36)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("alterar Serviço");
        jPanel3.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 561, 67));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCod.setText("Código:");
        jPanel1.add(jLabelCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTxtCod_Serv.setEnabled(false);
        jPanel1.add(jTxtCod_Serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 20, 150, -1));

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNome.setText("Nome:");
        jPanel1.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jTxtNome_Serv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNome_ServActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtNome_Serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 210, -1));

        jLabelPreco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPreco.setText("Preço:");
        jPanel1.add(jLabelPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel1.add(jTxtPreco_Serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 60, 150, -1));

        jLabelDesconto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDesconto.setText("Desconto:");
        jPanel1.add(jLabelDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));
        jPanel1.add(jTxtDesc_Serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 170, -1));

        jLabelDispo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDispo.setText("Disponibilidade:");
        jPanel1.add(jLabelDispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jComboBoxDispon_Serv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponível", "Indisponível" }));
        jComboBoxDispon_Serv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDispon_ServActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxDispon_Serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 107, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 561, 160));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonLimpar.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        jButtonAlterar.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        jButtonAlterar.setText("Cadastrar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 190, 50));

        jButtonCancelar.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 160, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 561, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNome_ServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNome_ServActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNome_ServActionPerformed

    private void jComboBoxDispon_ServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDispon_ServActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDispon_ServActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        String cod_serv = jTxtCod_Serv.getText();
        String nome_serv = jTxtNome_Serv.getText();
        String preco_serv = jTxtPreco_Serv.getText();
        String desc_serv = jTxtDesc_Serv.getText();
        String disp_serv = jComboBoxDispon_Serv.getActionCommand();

    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        Consulta_Servico cs = new Consulta_Servico();
        cs.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JComboBox<String> jComboBoxDispon_Serv;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelDesconto;
    private javax.swing.JLabel jLabelDispo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTxtCod_Serv;
    private javax.swing.JTextField jTxtDesc_Serv;
    private javax.swing.JTextField jTxtNome_Serv;
    private javax.swing.JTextField jTxtPreco_Serv;
    // End of variables declaration//GEN-END:variables

    private void Limpar(){
    jTxtCod_Serv.setText("");
    jTxtNome_Serv.setText("");
    jTxtPreco_Serv.setText("");
    jTxtDesc_Serv.setText("");
    }


}
