
package Visao;

import Visao.Cadastrar.Tela_Cadastro;
import Visao.Consultar.Relatorios;

/**
 * @author Rebeca
 */
public class Setor_Adm extends javax.swing.JFrame {

    public Setor_Adm() {
        initComponents();
        setTitle("Pet Shop - Setor administrativo");
        setSize(865, 523);
        setResizable(false);
        setLocationRelativeTo( null );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonDeslogar = new javax.swing.JButton();
        IMG = new javax.swing.JLabel();
        Título = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonPromocoes = new javax.swing.JButton();
        jButtonCompras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        Clientes = new javax.swing.JMenu();
        jMenuItemVisualizarCliente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemAlterarCliente = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuExcluirCliente = new javax.swing.JMenuItem();
        Gerar = new javax.swing.JMenu();
        jManuItemRelatorios = new javax.swing.JMenuItem();
        Servicos = new javax.swing.JMenu();
        jMenuPromocao = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemVisualizarServico = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadastrarServico = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItemAlterarServico = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExcluirServico = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonDeslogar.setText("Deslogar");
        jButtonDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeslogarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDeslogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 92, -1));

        IMG.setBackground(new java.awt.Color(255, 255, 255));
        IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/All PNG.png"))); // NOI18N
        IMG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(IMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 480, 270));

        Título.setFont(new java.awt.Font("Birch Std", 0, 65)); // NOI18N
        Título.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Título.setText("Área \nadministrativa");
        jPanel2.add(Título, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 450, 170));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCadastrar.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 181, 60));

        jButtonPromocoes.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jButtonPromocoes.setText("Promoções");
        jButtonPromocoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPromocoesActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPromocoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, 60));

        jButtonCompras.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jButtonCompras.setText("Compras");
        jPanel1.add(jButtonCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, 60));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\tBem-vindo administrador!\n\n Aqui, nesta tela, você tem a reunião de todas as telas\n de acesso do sistema, para navegar por elas livremente\n e irrestritamente.\n\n Sinta-se a vontade para fazer cadastros, visualizar as\n informações gerais já cadastradas pelos funcionários ou\n administradores, alterar ou excluir tais informações, \n gerar relatórios,colocar ou tirar serviços da promoção,\n etc.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 460, 260));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 860, 290));

        Clientes.setText("Clientes");
        Clientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItemVisualizarCliente.setText("Visualizar");
        jMenuItemVisualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarClienteActionPerformed(evt);
            }
        });
        Clientes.add(jMenuItemVisualizarCliente);
        Clientes.add(jSeparator1);

        jMenuItemAlterarCliente.setText("Alterar");
        jMenuItemAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlterarClienteActionPerformed(evt);
            }
        });
        Clientes.add(jMenuItemAlterarCliente);
        Clientes.add(jSeparator2);

        jMenuExcluirCliente.setText("Excluir");
        jMenuExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExcluirClienteActionPerformed(evt);
            }
        });
        Clientes.add(jMenuExcluirCliente);

        jMenuBar1.add(Clientes);

        Gerar.setText("Gerar");
        Gerar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jManuItemRelatorios.setText("Relatórios");
        jManuItemRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManuItemRelatoriosActionPerformed(evt);
            }
        });
        Gerar.add(jManuItemRelatorios);

        jMenuBar1.add(Gerar);

        Servicos.setText("Serviços");
        Servicos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuPromocao.setText("Colocar em promação");
        Servicos.add(jMenuPromocao);
        Servicos.add(jSeparator3);

        jMenuItemVisualizarServico.setText("Visualizar");
        jMenuItemVisualizarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarServicoActionPerformed(evt);
            }
        });
        Servicos.add(jMenuItemVisualizarServico);
        Servicos.add(jSeparator4);

        jMenuItemCadastrarServico.setText("Cadastrar");
        jMenuItemCadastrarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarServicoActionPerformed(evt);
            }
        });
        Servicos.add(jMenuItemCadastrarServico);
        Servicos.add(jSeparator5);

        jMenuItemAlterarServico.setText("Alterar");
        Servicos.add(jMenuItemAlterarServico);
        Servicos.add(jSeparator6);

        jMenuItemExcluirServico.setText("Excluir");
        Servicos.add(jMenuItemExcluirServico);

        jMenuBar1.add(Servicos);

        jMenu1.setText("Produtos");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeslogarActionPerformed
        Tela_Login tl = new Tela_Login();
        tl.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonDeslogarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        Tela_Cadastro tc = new Tela_Cadastro();
        tc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jMenuItemVisualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarClienteActionPerformed

    }//GEN-LAST:event_jMenuItemVisualizarClienteActionPerformed

    private void jMenuItemCadastrarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarServicoActionPerformed

    }//GEN-LAST:event_jMenuItemCadastrarServicoActionPerformed

    private void jManuItemRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManuItemRelatoriosActionPerformed
        Relatorios r = new Relatorios();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_jManuItemRelatoriosActionPerformed

    private void jMenuItemAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlterarClienteActionPerformed

    }//GEN-LAST:event_jMenuItemAlterarClienteActionPerformed

    private void jMenuExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExcluirClienteActionPerformed

    }//GEN-LAST:event_jMenuExcluirClienteActionPerformed

    private void jMenuItemVisualizarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarServicoActionPerformed

    }//GEN-LAST:event_jMenuItemVisualizarServicoActionPerformed

    private void jButtonPromocoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPromocoesActionPerformed
        
    }//GEN-LAST:event_jButtonPromocoesActionPerformed

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
            java.util.logging.Logger.getLogger(Setor_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setor_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setor_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setor_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setor_Adm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Clientes;
    private javax.swing.JMenu Gerar;
    private javax.swing.JLabel IMG;
    private javax.swing.JMenu Servicos;
    private javax.swing.JLabel Título;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCompras;
    private javax.swing.JButton jButtonDeslogar;
    private javax.swing.JButton jButtonPromocoes;
    private javax.swing.JMenuItem jManuItemRelatorios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuExcluirCliente;
    private javax.swing.JMenuItem jMenuItemAlterarCliente;
    private javax.swing.JMenuItem jMenuItemAlterarServico;
    private javax.swing.JMenuItem jMenuItemCadastrarServico;
    private javax.swing.JMenuItem jMenuItemExcluirServico;
    private javax.swing.JMenuItem jMenuItemVisualizarCliente;
    private javax.swing.JMenuItem jMenuItemVisualizarServico;
    private javax.swing.JMenuItem jMenuPromocao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
