package Visao.Consultar;

import DAO.ClienteDAO;
import DAO.Conexao;
import Modelo.Cliente;
import Visao.Alterar.AlterarCliente;
import Visao.Excluir.Excluir_Cliente;
import Visao.Menu_Principal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Consulta_Cliente extends javax.swing.JFrame {

    public Consulta_Cliente() {
        initComponents();
        
        setTitle("Pet Shop - Clientes cadastrados");
        setSize(930, 670);
        setResizable(false);
        AtualizaTable();
        setLocationRelativeTo( null );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CPF = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jFormattedCPF = new javax.swing.JFormattedTextField();
        jButtonNome = new javax.swing.JButton();
        jButtonCPF = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonVoltar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CPF.setFont(new java.awt.Font("Quicksand Bold", 0, 18)); // NOI18N
        CPF.setText("Pesquisar por CPF:");
        jPanel1.add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 39));

        Nome.setFont(new java.awt.Font("Quicksand Bold", 0, 18)); // NOI18N
        Nome.setText("Pesquisar por nome:");
        jPanel1.add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, 38));

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 210, 30));

        try {
            jFormattedCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 200, 30));

        jButtonNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BG (11) - Copia.png"))); // NOI18N
        jButtonNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNomeActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 44, 30));

        jButtonCPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BG (11) - Copia.png"))); // NOI18N
        jButtonCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCPFActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 44, -1));

        jTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "RG ", "Endreço", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable.setColumnSelectionAllowed(true);
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable);
        jTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 910, 300));

        jButtonVoltar.setBackground(new java.awt.Color(0, 255, 0));
        jButtonVoltar.setFont(new java.awt.Font("Rancho", 0, 36)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(0, 153, 0));
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Dogs PNG (6) - Copia.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 180, 60));

        jButtonAlterar.setBackground(new java.awt.Color(255, 255, 0));
        jButtonAlterar.setFont(new java.awt.Font("Rancho", 0, 36)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(255, 102, 0));
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Dogs PNG (9) - Copia.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 170, 60));

        jButtonExcluir.setBackground(new java.awt.Color(255, 0, 0));
        jButtonExcluir.setFont(new java.awt.Font("Rancho", 0, 36)); // NOI18N
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Dogs PNG (7) - Copia.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 170, 60));

        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Foxes.jpg"))); // NOI18N
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 200));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Edição BG (4).png"))); // NOI18N
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        
        Connection con = Conexao.AbrirConexao();
        ClienteDAO bd = new ClienteDAO(con);
        String nome_cliente = "";
        bd.Perquisar_Nome_Cliente(nome_cliente);
        List<Cliente> lista = new ArrayList<>();
        DefaultTableModel tbm = (DefaultTableModel)jTable.getModel();
        while (tbm.getRowCount() > 0) {            
            tbm.removeRow(0);
        }
        int i = 0;
        for(Cliente tab : lista){
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getNome_cliente(), i, 0);
            jTable.setValueAt(tab.getCpf_cliente(), i, 1);
            jTable.setValueAt(tab.getRg_cliente(), i, 2);
            jTable.setValueAt(tab.getTelefone_cliente(), i, 3);
            i++;
            
        }
        Conexao.FecharConexao(con);
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jButtonCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCPFActionPerformed
        
        Connection con = Conexao.AbrirConexao();
        ClienteDAO bd = new ClienteDAO(con);
        String cpf_cliente="";
        bd.Perquisar_CPF_Cliente(cpf_cliente);
        List<Cliente> lista = new ArrayList<>();
        DefaultTableModel tbm = (DefaultTableModel)jTable.getModel();
        while (tbm.getRowCount() > 0) {            
            tbm.removeRow(0);
        }
        int i = 0;
        for(Cliente tab : lista){
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getNome_cliente(), i, 0);
            jTable.setValueAt(tab.getCpf_cliente(), i, 1);
            jTable.setValueAt(tab.getRg_cliente(), i, 2);
            jTable.setValueAt(tab.getTelefone_cliente(), i, 3);
            i++;
            
        }
        Conexao.FecharConexao(con);
    }//GEN-LAST:event_jButtonCPFActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        Menu_Principal mp = new Menu_Principal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNomeActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        AlterarCliente ac = new AlterarCliente();
        ac.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        Excluir_Cliente ex = new Excluir_Cliente();
        ex.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consulta_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCPF;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNome;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JFormattedTextField jFormattedCPF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTxtNome;
    // End of variables declaration//GEN-END:variables
 
    private void AtualizaTable(){
        
        Connection con = Conexao.AbrirConexao();
        ClienteDAO bd = new ClienteDAO(con);
        List<Cliente> lista = new ArrayList<>();
        DefaultTableModel tbm = (DefaultTableModel)jTable.getModel();
        while (tbm.getRowCount() > 0) {            
            tbm.removeRow(0);
        }
        int i = 0;
        for(Cliente tab : lista){
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getNome_cliente(), i, 0);
            jTable.setValueAt(tab.getCpf_cliente(), i, 1);
            jTable.setValueAt(tab.getRg_cliente(), i, 2);
            jTable.setValueAt(tab.getTelefone_cliente(), i, 3);
            i++;
            
        }
        Conexao.FecharConexao(con);
    }
}
