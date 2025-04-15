/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fotogames.gui;

import fotogames.persistencia.DAO.ClienteDAO;
import fotogames.persistencia.DAO.OrcamentoDAO;
import fotogames.persistencia.DAO.ProdutoDAO;
import fotogames.persistencia.entidades.Cliente;
import fotogames.persistencia.entidades.Orcamento;
import fotogames.persistencia.entidades.Orcamento_Produto;
import fotogames.persistencia.DAO.Orcamento_ProdutoDAO;
import fotogames.persistencia.entidades.Produto;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */

/**
 * Classe responsável pela interface gráfica da tela de orçamentos
 */
public class TelaOrcamento extends javax.swing.JFrame {

    ProdutoDAO pDAO = new ProdutoDAO(); // Objeto para acessar métodos de persistência e consulta de produtos no banco de dados.
    ClienteDAO cDAO = new ClienteDAO(); // Objeto para acesssar métodos de persistência e consulta de clientes no banco de dados.
    OrcamentoDAO oDAO = new OrcamentoDAO(); // Objeto para acessar métodos de persistência e consulta de orçamentos no banco de dados.
    Orcamento_ProdutoDAO opDAO = new Orcamento_ProdutoDAO(); // Objeto para acessar métodos de persistência e consulta de orçamentos e produtos no banco de dados.
    Cliente clienteEncontrado = null; // Representa um cliente já cadastrado.
    List<Produto> produtoSelecionado = new ArrayList<Produto>(); // Uma lista do tipo Produto.
    double soma = 0; // Soma do valor do orcament.

    /**
     * Método construtor TelaOrcamento
     */
    public TelaOrcamento() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        LbNome = new javax.swing.JLabel();
        LbTelefone = new javax.swing.JLabel();
        LbEmail = new javax.swing.JLabel();
        LbCpf = new javax.swing.JLabel();
        LbTitulo = new javax.swing.JLabel();
        TxNome = new javax.swing.JTextField();
        TxEmail = new javax.swing.JTextField();
        TxTelefone = new javax.swing.JFormattedTextField();
        TxCpf = new javax.swing.JFormattedTextField();
        LbPagamento = new javax.swing.JLabel();
        CbPagamento = new javax.swing.JComboBox<>();
        BtHistorico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxData = new javax.swing.JFormattedTextField();
        BtClientes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TxId = new javax.swing.JTextField();
        BtPesquisar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxProduto = new javax.swing.JTextField();
        BtAdicionar = new javax.swing.JButton();
        LbValor = new javax.swing.JLabel();
        LbValorTotal = new javax.swing.JLabel();
        BtRegistrar = new javax.swing.JButton();
        BtLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LbNome.setForeground(new java.awt.Color(0, 0, 0));
        LbNome.setText("Nome:");
        jPanel2.add(LbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        LbTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LbTelefone.setForeground(new java.awt.Color(0, 0, 0));
        LbTelefone.setText("Telefone:");
        jPanel2.add(LbTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        LbEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LbEmail.setForeground(new java.awt.Color(0, 0, 0));
        LbEmail.setText("Email:");
        jPanel2.add(LbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        LbCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LbCpf.setForeground(new java.awt.Color(0, 0, 0));
        LbCpf.setText("CPF:");
        jPanel2.add(LbCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        LbTitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LbTitulo.setForeground(new java.awt.Color(0, 0, 0));
        LbTitulo.setText("Central de Orçamentos");
        jPanel2.add(LbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 6, -1, -1));

        TxNome.setToolTipText("Campo Nome");
        jPanel2.add(TxNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 168, -1));

        TxEmail.setToolTipText("Campo Email");
        jPanel2.add(TxEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 170, -1));

        TxTelefone.setToolTipText("Campo Telefone");
        jPanel2.add(TxTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 168, -1));

        TxCpf.setToolTipText("Campo CPF");
        jPanel2.add(TxCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 168, -1));

        LbPagamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LbPagamento.setForeground(new java.awt.Color(0, 0, 0));
        LbPagamento.setText("Forma de Pagamento:");
        jPanel2.add(LbPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        CbPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Débito", "Crédito" }));
        CbPagamento.setToolTipText("Opções de Pagamento");
        jPanel2.add(CbPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 203, 124, -1));

        BtHistorico.setText("Historico");
        BtHistorico.setToolTipText("Tela Histórico");
        BtHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtHistoricoActionPerformed(evt);
            }
        });
        jPanel2.add(BtHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Data:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        TxData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jPanel2.add(TxData, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 168, -1));

        BtClientes.setText("Clientes");
        BtClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClientesActionPerformed(evt);
            }
        });
        jPanel2.add(BtClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID do Cliente:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanel2.add(TxId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 40, -1));

        BtPesquisar.setText("Pesquisar");
        BtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(BtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Produto");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        TxProduto.setToolTipText("Campo Produto");
        jPanel3.add(TxProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, -1));

        BtAdicionar.setText("Adicionar");
        BtAdicionar.setToolTipText("Botão Adicionar");
        BtAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAdicionarActionPerformed(evt);
            }
        });
        jPanel3.add(BtAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        LbValor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LbValor.setForeground(new java.awt.Color(0, 0, 0));
        LbValor.setText("Valor:");
        jPanel3.add(LbValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        LbValorTotal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel3.add(LbValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 80, 20));

        BtRegistrar.setText("Registrar");
        BtRegistrar.setToolTipText("Botão registrar Orçamento");
        BtRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRegistrarActionPerformed(evt);
            }
        });
        jPanel3.add(BtRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 90, -1));

        BtLimpar.setText("Limpar");
        BtLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimparActionPerformed(evt);
            }
        });
        jPanel3.add(BtLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    *Ação do botão adicionar.
    */
    private void BtAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAdicionarActionPerformed
        boolean produtoEncontrado = false;
        List<Produto> lista = pDAO.listar();

        for (Produto pAtual : lista) {
            if (pAtual.getNomeProduto().equalsIgnoreCase(TxProduto.getText())) {
                soma += pAtual.getValor();
                produtoSelecionado.add(pAtual);
                produtoEncontrado = true;

            }
}
            if (produtoEncontrado) {
                JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");
                LbValorTotal.setText(String.format("%.2f", soma));
                TxProduto.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encotrado!");
            }
        

    }//GEN-LAST:event_BtAdicionarActionPerformed

    /*
    * Ação do botão historico.
    */
    private void BtHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtHistoricoActionPerformed
        ListagemOrcamento tela = new ListagemOrcamento();
        tela.setVisible(true);
    }//GEN-LAST:event_BtHistoricoActionPerformed

    /*
    *Ação do botão registrar.
    */
    private void BtRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRegistrarActionPerformed
        cadastrarOrcamento();
        clear();
    }//GEN-LAST:event_BtRegistrarActionPerformed

    /*
    *Ação do botão clientes.
    */
    private void BtClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClientesActionPerformed
        ListagemCliente tela = new ListagemCliente();
        tela.setVisible(true);
    }//GEN-LAST:event_BtClientesActionPerformed

    /*
    *Ação do botão pesquisar.
    */
    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed
        try {
            if (!TxId.getText().trim().isEmpty()) {
                int id = Integer.parseInt(TxId.getText());
                clienteEncontrado = cDAO.getCliente(id);
                TxNome.setText(clienteEncontrado.getNome());
                TxEmail.setText(clienteEncontrado.getEmail());
                TxCpf.setText(clienteEncontrado.getCpf());
                TxTelefone.setText(clienteEncontrado.getTelefone());

                TxNome.setEnabled(false);
                TxEmail.setEnabled(false);
                TxCpf.setEnabled(false);
                TxTelefone.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(null, "Campo ID vazio!");
            }

        } catch (NumberFormatException | NullPointerException exp) {
            JOptionPane.showMessageDialog(null, "ID cliente inexistente!");
        };
    }//GEN-LAST:event_BtPesquisarActionPerformed

    private void BtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimparActionPerformed
        clear();
    }//GEN-LAST:event_BtLimparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOrcamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAdicionar;
    private javax.swing.JButton BtClientes;
    private javax.swing.JButton BtHistorico;
    private javax.swing.JButton BtLimpar;
    private javax.swing.JButton BtPesquisar;
    private javax.swing.JButton BtRegistrar;
    private javax.swing.JComboBox<String> CbPagamento;
    private javax.swing.JLabel LbCpf;
    private javax.swing.JLabel LbEmail;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbPagamento;
    private javax.swing.JLabel LbTelefone;
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JLabel LbValor;
    private javax.swing.JLabel LbValorTotal;
    private javax.swing.JFormattedTextField TxCpf;
    private javax.swing.JFormattedTextField TxData;
    private javax.swing.JTextField TxEmail;
    private javax.swing.JTextField TxId;
    private javax.swing.JTextField TxNome;
    private javax.swing.JTextField TxProduto;
    private javax.swing.JFormattedTextField TxTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    /*
    *Método cadastrar orçamentos
    */
    public void cadastrarOrcamento() {
        if (!emptyFields() && validationFields()) {
            String textoData = TxData.getText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(textoData, formatter);
            Date sqlData = Date.valueOf(localDate);

            if (clienteEncontrado != null) {
                Orcamento orcamento = new Orcamento();
                orcamento.setData(sqlData);
                orcamento.setCliente(clienteEncontrado);
                oDAO.cadastrar(orcamento);

                for (int i = 0; i < produtoSelecionado.size(); i++) {
                    Produto pAtual = produtoSelecionado.get(i);
                    Orcamento_Produto op = new Orcamento_Produto();
                    op.setValorTotal(soma);
                    op.setOrcamento(orcamento);
                    op.setProduto(pAtual);

                    opDAO.cadastrar(op);
                    
                }
            } else {
                Orcamento orcamento = new Orcamento();
                orcamento.setData(sqlData);
                orcamento.setCliente(cadastrarCliente());
                oDAO.cadastrar(orcamento);

                for (int i = 0; i < produtoSelecionado.size(); i++) {
                    Produto pAtual = produtoSelecionado.get(i);
                    Orcamento_Produto op = new Orcamento_Produto();
                    op.setValorTotal(soma);
                    op.setOrcamento(orcamento);
                    op.setProduto(pAtual);

                    opDAO.cadastrar(op);
                    
                }

            }

        }
    }

    /*
    * Método campo vazio.
    */
    public boolean emptyFields() {
        boolean empty = true;
        if (TxNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenche campo Nome!");
        } else if (TxCpf.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenche campo CPF!");
        } else if (TxEmail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenche o campo Email!");
        } else if (TxTelefone.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenche o campo Telefone!");
        } else if (TxData.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenche o campo Data!");
        } else if (CbPagamento.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione a forma de pagamento!");
        } else if (produtoSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Nenhum produto adicionado!");
        } else {
            empty = false;
        }
        return empty;
    }

    /*
    * Método de limpar.
    */
    public void clear() {
        TxNome.setText("");
        TxCpf.setText("");
        TxEmail.setText("");
        TxTelefone.setText("");
        CbPagamento.setSelectedIndex(0);
        TxData.setText("");
        LbValorTotal.setText("");

        TxNome.setEnabled(true);
        TxCpf.setEnabled(true);
        TxEmail.setEnabled(true);
        TxTelefone.setEnabled(true);

        produtoSelecionado.isEmpty();
    }

    /*
    * Método para cadastrar cliente.
    */
    public Cliente cadastrarCliente() {
        Cliente clienteNovo = new Cliente();
        clienteNovo.setNome(TxNome.getText());
        clienteNovo.setCpf(TxCpf.getText());
        clienteNovo.setEmail(TxEmail.getText());
        clienteNovo.setTelefone(TxTelefone.getText());

        cDAO.cadastrar(clienteNovo);
        
        return clienteNovo;
    }
    
    /**
     * Método para validar campos. 
     */
      public boolean validationFields(){
        boolean validation = true;
        if(!TxCpf.getText().matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}")){
            JOptionPane.showMessageDialog(rootPane, "Campo CPF Inválido: xxx.xxx.xxx-xx");
            return validation = false;
        }else if(!TxEmail.getText().matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")){
            JOptionPane.showMessageDialog(rootPane, "Formato de E-mail inválido!");
            return validation = false;
        }else if(!TxTelefone.getText().matches("[0-9]{11}")){
            JOptionPane.showMessageDialog(rootPane, "Campo Telefone Inválido: DDDxxxxxxxxx");
            return validation = false;
        }else{
            return validation;
        }
    }
}
