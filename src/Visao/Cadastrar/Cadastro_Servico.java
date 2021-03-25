package Visao.Cadastrar;

import Visao.Menu_Principal;

public class Cadastro_Servico extends javax.swing.JFrame {

    public Cadastro_Servico() {
        initComponents();
        setTitle("Pet Shop - Cadastrar Serviço");
        setSize(599, 400);
        setResizable(false);
        setLocationRelativeTo( null );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelCod = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelPreco = new javax.swing.JLabel();
        jLabelDesconto = new javax.swing.JLabel();
        jLabelIndica = new javax.swing.JLabel();
        jLabelDispo = new javax.swing.JLabel();
        jTxtCod_Serv = new javax.swing.JTextField();
        jTxtNome_Serv = new javax.swing.JTextField();
        jTxtPreco_Serv = new javax.swing.JTextField();
        jTxtDesc_Serv = new javax.swing.JTextField();
        jComboBoxDispon_Serv = new javax.swing.JComboBox<>();
        jCheckBoxCachorro = new javax.swing.JCheckBox();
        jCheckBoxGatos = new javax.swing.JCheckBox();
        jCheckBoxPassaros = new javax.swing.JCheckBox();
        jCheckBoxPeixes = new javax.swing.JCheckBox();
        jCheckBoxRoedores = new javax.swing.JCheckBox();
        jCheckBoxTartarugas = new javax.swing.JCheckBox();
        jCheckBoxCoelhos = new javax.swing.JCheckBox();
        jCheckBoxOutros = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Trajan Pro", 0, 36)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Cadastro de Serviços");
        jPanel1.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCod.setText("Código:");
        jPanel2.add(jLabelCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 13, -1, -1));

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNome.setText("Nome:");
        jPanel2.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 13, -1, -1));

        jLabelPreco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPreco.setText("Preço:");
        jPanel2.add(jLabelPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 55, -1, -1));

        jLabelDesconto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDesconto.setText("Desconto:");
        jPanel2.add(jLabelDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 97, -1, -1));

        jLabelIndica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelIndica.setText("Indicação:");
        jPanel2.add(jLabelIndica, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 55, -1, -1));

        jLabelDispo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDispo.setText("Disponibilidade:");
        jPanel2.add(jLabelDispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 139, -1, -1));
        jPanel2.add(jTxtCod_Serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 17, 106, -1));

        jTxtNome_Serv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNome_ServActionPerformed(evt);
            }
        });
        jPanel2.add(jTxtNome_Serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 17, 180, -1));
        jPanel2.add(jTxtPreco_Serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 59, 106, -1));
        jPanel2.add(jTxtDesc_Serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 101, 106, -1));

        jComboBoxDispon_Serv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponível", "Indisponível" }));
        jPanel2.add(jComboBoxDispon_Serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 143, 107, -1));

        jCheckBoxCachorro.setText("Cachorros");
        jPanel2.add(jCheckBoxCachorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 80, -1));

        jCheckBoxGatos.setText("Gatos");
        jPanel2.add(jCheckBoxGatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 80, -1));

        jCheckBoxPassaros.setText("Pássaros");
        jPanel2.add(jCheckBoxPassaros, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 80, -1));

        jCheckBoxPeixes.setText("Peixes");
        jPanel2.add(jCheckBoxPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 80, -1));

        jCheckBoxRoedores.setText("Roedores");
        jPanel2.add(jCheckBoxRoedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 90, -1));

        jCheckBoxTartarugas.setText("Tartarugas");
        jPanel2.add(jCheckBoxTartarugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 90, -1));

        jCheckBoxCoelhos.setText("Coelhos");
        jPanel2.add(jCheckBoxCoelhos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 90, -1));

        jCheckBoxOutros.setText("Outros");
        jPanel2.add(jCheckBoxOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 90, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonLimpar.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 50));

        jButtonCadastrar.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 190, 50));

        jButtonCancelar.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNome_ServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNome_ServActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNome_ServActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        Menu_Principal mp = new Menu_Principal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
    String cod_serv = jTxtCod_Serv.getText();
    String nome_serv = jTxtNome_Serv.getText();
    String preco_serv = jTxtPreco_Serv.getText();
    String desc_serv = jTxtDesc_Serv.getText();
    String disp_serv = jComboBoxDispon_Serv.getActionCommand();
    String indic_dog = jCheckBoxCachorro.getActionCommand();
    String indic_cat = jCheckBoxGatos.getActionCommand();
    String indic_roe = jCheckBoxRoedores.getActionCommand();
    String indic_coe = jCheckBoxCoelhos.getActionCommand();
    String indic_fish = jCheckBoxPeixes.getActionCommand();
    String indic_outros = jCheckBoxOutros.getActionCommand();
    String indic_bird = jCheckBoxPassaros.getActionCommand();
    String indic_turtle = jCheckBoxTartarugas.getActionCommand();
    
    
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Servico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JCheckBox jCheckBoxCachorro;
    private javax.swing.JCheckBox jCheckBoxCoelhos;
    private javax.swing.JCheckBox jCheckBoxGatos;
    private javax.swing.JCheckBox jCheckBoxOutros;
    private javax.swing.JCheckBox jCheckBoxPassaros;
    private javax.swing.JCheckBox jCheckBoxPeixes;
    private javax.swing.JCheckBox jCheckBoxRoedores;
    private javax.swing.JCheckBox jCheckBoxTartarugas;
    private javax.swing.JComboBox<String> jComboBoxDispon_Serv;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelDesconto;
    private javax.swing.JLabel jLabelDispo;
    private javax.swing.JLabel jLabelIndica;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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

