package Visao.Compra;

import Visao.Consultar.Consulta_Servico;

public class Comprar extends javax.swing.JFrame {

    public Comprar() {
        initComponents();
        setTitle("Pet Shop - Comprar");
        setSize(1007, 586);
        setResizable(false);
        setLocationRelativeTo( null );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButtonTipo = new javax.swing.JButton();
        jButtonNome = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bradley Hand ITC", 0, 48)); // NOI18N
        jLabel2.setText("Comprar por:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jButtonTipo.setBackground(new java.awt.Color(255, 0, 0));
        jButtonTipo.setFont(new java.awt.Font("Amatic SC", 0, 36)); // NOI18N
        jButtonTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pokemonsicosn3 - Copia.png"))); // NOI18N
        jButtonTipo.setText("Tipo de animal");
        jButtonTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTipoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 320, 120));

        jButtonNome.setBackground(new java.awt.Color(255, 255, 0));
        jButtonNome.setFont(new java.awt.Font("Amatic SC", 0, 36)); // NOI18N
        jButtonNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pikachuicon.png"))); // NOI18N
        jButtonNome.setText("Nome do Serviço");
        jButtonNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 320, 120));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gatos (2).jpg"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTipoActionPerformed
        
    }//GEN-LAST:event_jButtonTipoActionPerformed

    private void jButtonNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNomeActionPerformed
        Consulta_Servico cs = new Consulta_Servico();
        cs.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonNomeActionPerformed

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
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comprar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton jButtonNome;
    private javax.swing.JButton jButtonTipo;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
