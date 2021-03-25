
package Visao.Cadastrar;

import DAO.ClienteDAO;
import DAO.Conexao;
import Modelo.Cliente;
import Visao.Menu_Principal;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Cadastro_Cliente extends javax.swing.JFrame {

    public Cadastro_Cliente() {
        initComponents();
        setTitle("Pet Shop - Cadastrar Cliente");
        setSize(860, 450);
        setResizable(false);
        setLocationRelativeTo( null );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        Nome = new javax.swing.JLabel();
        RG = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        Tel = new javax.swing.JLabel();
        Rua = new javax.swing.JLabel();
        Bairro = new javax.swing.JLabel();
        Cidade = new javax.swing.JLabel();
        CEP = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        jTxtNome_Cli = new javax.swing.JTextField();
        jTxtRG_Cli = new javax.swing.JTextField();
        jTxtNum_cli = new javax.swing.JTextField();
        jFormattedCPF = new javax.swing.JFormattedTextField();
        jFormattedTextTel = new javax.swing.JFormattedTextField();
        jFormattedTextCEP_Cli = new javax.swing.JFormattedTextField();
        jTxtRua_Cli = new javax.swing.JTextField();
        jTxtBairro_Cli = new javax.swing.JTextField();
        jTxtCidade_Cli = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtEmail_cli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Borda = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Amatic SC", 0, 60)); // NOI18N
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fish PNG - Copia.png"))); // NOI18N
        Titulo.setText("Cadastro de Clientes");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 690, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 120));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(10);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("* Preenchimento\nobrigatório");
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 140, 120));

        jButtonCadastrar.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 140, 40));

        jButtonCancelar.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 140, 40));

        jButtonLimpar.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 140, 40));

        Nome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Nome.setText("Nome completo:*");
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, -1));

        RG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RG.setText("RG:*");
        getContentPane().add(RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 50, -1));

        CPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CPF.setText("CPF:*");
        getContentPane().add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 60, -1));

        Tel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Tel.setText("Telefone:*");
        getContentPane().add(Tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, -1));

        Rua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Rua.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Rua.setText("Endereço:*");
        getContentPane().add(Rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, -1));

        Bairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bairro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Bairro.setText("Bairro:*");
        getContentPane().add(Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 150, -1));

        Cidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Cidade.setText("Cidade:*");
        getContentPane().add(Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 150, 20));

        CEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CEP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CEP.setText("CEP:");
        getContentPane().add(CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 150, -1));

        N.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        N.setText("Nº:*");
        getContentPane().add(N, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 40, -1));
        getContentPane().add(jTxtNome_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 490, 20));
        getContentPane().add(jTxtRG_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 220, -1));
        getContentPane().add(jTxtNum_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 90, -1));

        try {
            jFormattedCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedCPFActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 210, -1));

        try {
            jFormattedTextTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 210, -1));

        try {
            jFormattedTextCEP_Cli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextCEP_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 130, -1));
        getContentPane().add(jTxtRua_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 480, -1));
        getContentPane().add(jTxtBairro_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 320, -1));
        getContentPane().add(jTxtCidade_Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 320, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("email:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));
        getContentPane().add(jTxtEmail_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 490, -1));

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 0, 11)); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 680, 150));

        Borda.setFont(new java.awt.Font("Tekton Pro Cond", 0, 10)); // NOI18N
        Borda.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Pessoais"));
        getContentPane().add(Borda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 680, 150));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Edição BG (4).png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 860, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        Menu_Principal mp = new Menu_Principal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        String nome_cliente = jTxtNome_Cli.getText();
        String cpf_cliente = jFormattedCPF.getText();
        String rg_cliente = jTxtRG_Cli.getText();
        String telefone_cliente = jFormattedTextTel.getText();
        String email_cliente = jTxtEmail_cli.getText();
        String rua_cliente = jTxtRua_Cli.getText();
        String numero_cliente = jTxtNum_cli.getText();
        String bairro_cliente = jTxtBairro_Cli.getText();
        String cidade_cliente = jTxtCidade_Cli.getText();
        String cep_cliente = jFormattedTextCEP_Cli.getText();
        if(nome_cliente.equals("") || cpf_cliente.equals("") || rg_cliente.equals("") || telefone_cliente.equals("")
                || rua_cliente.equals("") || numero_cliente.equals("") || bairro_cliente.equals("") || cidade_cliente.equals("")){
            JOptionPane.showMessageDialog(null, "Existem campos vazios", "Pet Shop", JOptionPane.WARNING_MESSAGE);
        }else{
            Connection con  = Conexao.AbrirConexao();
            ClienteDAO sql = new ClienteDAO(con);
            int n = Integer.parseInt(numero_cliente);
            Cliente a = new Cliente();
            
            a.setNome_cliente(nome_cliente);
            a.setCpf_cliente(cpf_cliente);
            a.setRg_cliente(rg_cliente);
            a.setTelefone_cliente(telefone_cliente);
            a.setRua_cliente(rua_cliente);
            a.setNumero_cliente(n);
            a.setBairro_cliente(bairro_cliente);
            a.setCidade_cliente(cidade_cliente);
            a.setCep_cliente(cep_cliente);
            a.setEmail_cliente(email_cliente);
            
            sql.Inserir_Cliente(a);
            Conexao.FecharConexao(con);
            
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Pet Shop", JOptionPane.INFORMATION_MESSAGE);
            Limpar();
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jFormattedCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedCPFActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Bairro;
    private javax.swing.JLabel Borda;
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel N;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel RG;
    private javax.swing.JLabel Rua;
    private javax.swing.JLabel Tel;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JFormattedTextField jFormattedCPF;
    private javax.swing.JFormattedTextField jFormattedTextCEP_Cli;
    private javax.swing.JFormattedTextField jFormattedTextTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTxtBairro_Cli;
    private javax.swing.JTextField jTxtCidade_Cli;
    private javax.swing.JTextField jTxtEmail_cli;
    private javax.swing.JTextField jTxtNome_Cli;
    private javax.swing.JTextField jTxtNum_cli;
    private javax.swing.JTextField jTxtRG_Cli;
    private javax.swing.JTextField jTxtRua_Cli;
    // End of variables declaration//GEN-END:variables

    private void Limpar() {
        jTxtNome_Cli.setText("");
        jTxtRG_Cli.setText("");
        jFormattedCPF.setText("");
        jFormattedTextTel.setText("");
        jTxtEmail_cli.setText("");
        jTxtRua_Cli.setText("");
        jTxtNum_cli.setText("");
        jTxtBairro_Cli.setText("");
        jTxtCidade_Cli.setText("");
        jFormattedTextCEP_Cli.setText("");
    }
}
