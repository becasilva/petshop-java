package Visao;

import Visao.Cadastrar.Cadastro_Cliente;
import Visao.Cadastrar.Cadastro_Servico;
import Visao.Compra.Comprar;
import Visao.Consultar.Consulta_Cliente;
import Visao.Consultar.Consulta_Servico;
import Visao.Consultar.Promocoes;

public class Menu_Principal extends javax.swing.JFrame {

    public Menu_Principal() {
        initComponents();
        setTitle("Pet Shop - Menu Principal");
        setSize(905, 510);
        setResizable(false);
        setLocationRelativeTo( null );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JButtobDeslogar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonPromocoes = new javax.swing.JButton();
        BG = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCliente = new javax.swing.JMenu();
        jMenuCadastrarCliente = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuListarCliente = new javax.swing.JMenuItem();
        jMenuServico = new javax.swing.JMenu();
        jMenuItemCadastrar_Serv = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuVizualizarServico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        JButtobDeslogar.setFont(new java.awt.Font("Tekton Pro Cond", 0, 24)); // NOI18N
        JButtobDeslogar.setText("Deslogar");
        JButtobDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtobDeslogarActionPerformed(evt);
            }
        });
        jPanel1.add(JButtobDeslogar);
        JButtobDeslogar.setBounds(780, 10, 110, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Rancho", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Dogs PNG (10) - Copia.png"))); // NOI18N
        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 100, 230, 60);

        jButtonPromocoes.setBackground(new java.awt.Color(0, 153, 255));
        jButtonPromocoes.setFont(new java.awt.Font("Tekton Pro Cond", 0, 33)); // NOI18N
        jButtonPromocoes.setForeground(new java.awt.Color(0, 102, 204));
        jButtonPromocoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Dogs PNG (8) - Copia.png"))); // NOI18N
        jButtonPromocoes.setText("Promoções");
        jButtonPromocoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPromocoesActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPromocoes);
        jButtonPromocoes.setBounds(200, 170, 230, 60);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BG paw (2)_1.jpg"))); // NOI18N
        jPanel1.add(BG);
        BG.setBounds(0, 0, 900, 450);

        jMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pokemon-go-icons - Copia (2) - Copia.png"))); // NOI18N
        jMenuCliente.setText("Cliente");
        jMenuCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons4 - Copia (2)_1.png"))); // NOI18N
        jMenuCadastrarCliente.setText("Cadastrar");
        jMenuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarClienteActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuCadastrarCliente);
        jMenuCliente.add(jSeparator4);

        jMenuListarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons4 - Copia (6)_1.png"))); // NOI18N
        jMenuListarCliente.setText("Listar");
        jMenuListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListarClienteActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuListarCliente);

        jMenuBar1.add(jMenuCliente);

        jMenuServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pokemonsicosn3 - Copia (3).png"))); // NOI18N
        jMenuServico.setText("Serviços");
        jMenuServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuServico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItemCadastrar_Serv.setText("Cadastrar");
        jMenuItemCadastrar_Serv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrar_ServActionPerformed(evt);
            }
        });
        jMenuServico.add(jMenuItemCadastrar_Serv);
        jMenuServico.add(jSeparator1);

        jMenuVizualizarServico.setText("Visualizar");
        jMenuVizualizarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVizualizarServicoActionPerformed(evt);
            }
        });
        jMenuServico.add(jMenuVizualizarServico);

        jMenuBar1.add(jMenuServico);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarClienteActionPerformed
        Cadastro_Cliente cc = new Cadastro_Cliente();
        cc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuCadastrarClienteActionPerformed

    private void jMenuListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListarClienteActionPerformed
        Consulta_Cliente cc = new Consulta_Cliente();
        cc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuListarClienteActionPerformed

    private void JButtobDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtobDeslogarActionPerformed
        Tela_Login tl = new Tela_Login();
        tl.setVisible(true);
        dispose();
    }//GEN-LAST:event_JButtobDeslogarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Comprar c = new Comprar();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuVizualizarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVizualizarServicoActionPerformed
        Consulta_Servico cs = new Consulta_Servico();
        cs.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuVizualizarServicoActionPerformed

    private void jButtonPromocoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPromocoesActionPerformed
    Promocoes p = new Promocoes();
    p.setVisible(true);
    dispose();
    }//GEN-LAST:event_jButtonPromocoesActionPerformed

    private void jMenuItemCadastrar_ServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrar_ServActionPerformed
        Cadastro_Servico cs = new Cadastro_Servico();
        cs.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemCadastrar_ServActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton JButtobDeslogar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPromocoes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadastrarCliente;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenuItem jMenuItemCadastrar_Serv;
    private javax.swing.JMenuItem jMenuListarCliente;
    private javax.swing.JMenu jMenuServico;
    private javax.swing.JMenuItem jMenuVizualizarServico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
