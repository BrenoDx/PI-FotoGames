/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fotogames.gui;

import fotogames.persistencia.entidades.Cliente;
import fotogames.persistencia.DAO.ClienteDAO;
import fotogames.persistencia.DAO.EstoqueDAO;
import fotogames.persistencia.DAO.OrcamentoDAO;
import fotogames.persistencia.entidades.Funcionario;
import fotogames.persistencia.entidades.Produto;
import fotogames.persistencia.DAO.ProdutoDAO;
import fotogames.persistencia.entidades.Venda;
import fotogames.persistencia.DAO.VendaDAO;
import fotogames.persistencia.entidades.Estoque;
import fotogames.persistencia.entidades.Orcamento;
import fotogames.persistencia.entidades.Orcamento_Produto;
import fotogames.persistencia.DAO.Orcamento_ProdutoDAO;
import fotogames.persistencia.entidades.Venda_Produto;
import fotogames.persistencia.DAO.Venda_ProdutoDAO;
import java.awt.Cursor;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.lang.NullPointerException;

/**
 *
 * @author breno
 */

/**
 *
 * Classe responsável pela interface gráfica de vendas.
 */
public class TelaVenda extends javax.swing.JFrame {

    Cliente clienteCadastrado = null; // Armazena o cliente que foi encontrado no banco de dados.
    double valorTotal = 0; // Acumula o valor total da venda somando os preços dos produtos selecionados.
    Funcionario funcionario; // Representa o funcionário que está realizando o acesso.
    ProdutoDAO pDAO = new ProdutoDAO(); // Objeto para acessar métodos de persistência e consulta de produtos no banco de dados.
    ClienteDAO cDAO = new ClienteDAO(); // Objeto para acessar métodos de persistência e consulta de clientes no banco de dados .
    VendaDAO vDAO = new VendaDAO(); // Objeto para acessar métodos de persistência e consulta de vendas no banco de dados.
    Venda_ProdutoDAO vpDAO = new Venda_ProdutoDAO(); // Objeto para acessar métodos de persistência e consulta de itens vendidos na venda atual.
    List<Produto> produtosSelecionados = new ArrayList<>(); // Lista de produtos selecionados na venda atual.
    EstoqueDAO eDAO = new EstoqueDAO(); // Objeto para acessar métodos de persistência e consulta de estoque no banco de dados.
    Orcamento_ProdutoDAO opDAO = new Orcamento_ProdutoDAO(); // Obejto para acessar métodos de persistência e consulta de orçamentos e produtos no banco de dados.
    OrcamentoDAO oDAO = new OrcamentoDAO(); // Objeto para acessar métodos de persistência e consulta de orçamentos no  banco de dados.
    

    /**
     * Método construtor TelaVenda.
     */
    public TelaVenda(Funcionario func) {
        initComponents();
        this.funcionario = func;
    }

    /**
     * Método construtor TelaVenda vazio.
     */
    public TelaVenda() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpCabecalho = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LbProdutos = new javax.swing.JLabel();
        LbOrcamento = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        LbVenda = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LbTitulo = new javax.swing.JLabel();
        BtHistorico = new javax.swing.JButton();
        LbNome = new javax.swing.JLabel();
        LbEmail = new javax.swing.JLabel();
        LbCpf = new javax.swing.JLabel();
        LbTelefone = new javax.swing.JLabel();
        TxNome = new javax.swing.JTextField();
        TxEmail = new javax.swing.JTextField();
        TxTelefone = new javax.swing.JTextField();
        LbProduto = new javax.swing.JLabel();
        LbPagamento = new javax.swing.JLabel();
        TxProduto = new javax.swing.JTextField();
        BtAdicionar = new javax.swing.JButton();
        BtEfetuar = new javax.swing.JButton();
        LbValorTotal = new javax.swing.JLabel();
        CbPagamento = new javax.swing.JComboBox<>();
        LbTotal = new javax.swing.JLabel();
        TxClientes = new javax.swing.JButton();
        TxId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxData = new javax.swing.JFormattedTextField();
        TxCpf = new javax.swing.JTextField();
        BtPesquisar = new javax.swing.JButton();
        BtLimpar = new javax.swing.JButton();
        BtOrcamento = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TxIdOrcamento = new javax.swing.JTextField();
        BtPesOrcamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JpCabecalho.setBackground(new java.awt.Color(0, 102, 153));
        JpCabecalho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Foto");
        JpCabecalho.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Games");
        JpCabecalho.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 20));
        JpCabecalho.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 640, -1));

        LbProdutos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LbProdutos.setForeground(new java.awt.Color(0, 0, 0));
        LbProdutos.setText("Produtos");
        LbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbProdutosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbProdutosMouseEntered(evt);
            }
        });
        JpCabecalho.add(LbProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        LbOrcamento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LbOrcamento.setForeground(new java.awt.Color(0, 0, 0));
        LbOrcamento.setText("Orçamento");
        LbOrcamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbOrcamentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbOrcamentoMouseEntered(evt);
            }
        });
        JpCabecalho.add(LbOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        JpCabecalho.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 61, 60, 30));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        JpCabecalho.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 61, 60, 30));

        LbVenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LbVenda.setForeground(new java.awt.Color(0, 0, 0));
        LbVenda.setText("Venda");
        JpCabecalho.add(LbVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        LbTitulo.setForeground(new java.awt.Color(0, 0, 0));
        LbTitulo.setText("Centra de Vendas");
        jPanel1.add(LbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        BtHistorico.setText("Historico");
        BtHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtHistoricoActionPerformed(evt);
            }
        });
        jPanel1.add(BtHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        LbNome.setText("Nome:");
        jPanel1.add(LbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        LbEmail.setText("Email:");
        jPanel1.add(LbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        LbCpf.setText("CPF:");
        jPanel1.add(LbCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        LbTelefone.setText("Telefone:");
        jPanel1.add(LbTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));
        jPanel1.add(TxNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 131, -1));
        jPanel1.add(TxEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 131, -1));
        jPanel1.add(TxTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 131, -1));

        LbProduto.setText("Produto");
        LbProduto.setMaximumSize(new java.awt.Dimension(50, 17));
        LbProduto.setMinimumSize(new java.awt.Dimension(50, 17));
        LbProduto.setPreferredSize(new java.awt.Dimension(50, 17));
        jPanel1.add(LbProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        LbPagamento.setText("Forma de Pagamento:");
        LbPagamento.setMaximumSize(new java.awt.Dimension(141, 17));
        LbPagamento.setMinimumSize(new java.awt.Dimension(141, 17));
        LbPagamento.setPreferredSize(new java.awt.Dimension(141, 17));
        jPanel1.add(LbPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 150, -1));
        jPanel1.add(TxProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, -1));

        BtAdicionar.setText("Adicionar");
        BtAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(BtAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 90, 30));

        BtEfetuar.setText("Efetuar");
        BtEfetuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEfetuarActionPerformed(evt);
            }
        });
        jPanel1.add(BtEfetuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 79, -1));

        LbValorTotal.setText("Valor Total:");
        LbValorTotal.setMaximumSize(new java.awt.Dimension(73, 17));
        LbValorTotal.setMinimumSize(new java.awt.Dimension(73, 17));
        LbValorTotal.setPreferredSize(new java.awt.Dimension(73, 17));
        jPanel1.add(LbValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 80, -1));

        CbPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Débito", "Crédito" }));
        jPanel1.add(CbPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 140, -1));
        jPanel1.add(LbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 70, 20));

        TxClientes.setText("Clientes");
        TxClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxClientesActionPerformed(evt);
            }
        });
        jPanel1.add(TxClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        jPanel1.add(TxId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 40, -1));

        jLabel3.setText("ID do Cliente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setText("Data:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        TxData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jPanel1.add(TxData, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 130, -1));
        jPanel1.add(TxCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 130, -1));

        BtPesquisar.setText("Pesquisa");
        BtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(BtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        BtLimpar.setText("Limpar");
        BtLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimparActionPerformed(evt);
            }
        });
        jPanel1.add(BtLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        BtOrcamento.setText("Orçamento");
        BtOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtOrcamentoActionPerformed(evt);
            }
        });
        jPanel1.add(BtOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel5.setText("Id Orçamento:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));
        jPanel1.add(TxIdOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 40, -1));

        BtPesOrcamento.setText("Pesquisa");
        BtPesOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesOrcamentoActionPerformed(evt);
            }
        });
        jPanel1.add(BtPesOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    *Ação de clicar no label produtos
     */
    private void LbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbProdutosMouseClicked
        if (funcionario.getCargo().equalsIgnoreCase("gerente")) {
            TelaEstoque tela = new TelaEstoque();
            tela.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erro, acesso negado!");
        }
    }//GEN-LAST:event_LbProdutosMouseClicked

    /*
    *Ação do mouse
     */
    private void LbProdutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbProdutosMouseEntered
        LbProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_LbProdutosMouseEntered

    /*
    *Ação de clicar no label Orçamento
     */
    private void LbOrcamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbOrcamentoMouseClicked
        TelaOrcamento tela = new TelaOrcamento();
        tela.setVisible(true);
    }//GEN-LAST:event_LbOrcamentoMouseClicked

    /*
    *Ação do mouse
     */
    private void LbOrcamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbOrcamentoMouseEntered
        LbOrcamento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_LbOrcamentoMouseEntered

    /*
    *Ação do botão adicionar os produtos a venda.
     */
    private void BtAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAdicionarActionPerformed
        boolean produtoEncontrado = false;
        List<Produto> lista = pDAO.listar();
        
        
        for (Produto p : lista) {
            boolean status = eDAO.statusEstoque(p.getId());
            if(status){
            if (p.getNomeProduto().equalsIgnoreCase(TxProduto.getText())) {
                
                valorTotal += p.getValor();
                produtoEncontrado = true;
                produtosSelecionados.add(p);
                break;
            }
            }else{
                JOptionPane.showMessageDialog(null, "Não tem o produto no estoque!");
            }
        }
        if (produtoEncontrado) {
            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");
            LbTotal.setText(String.format("%.2f", valorTotal));
            TxProduto.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encotrado!");
        }

    }//GEN-LAST:event_BtAdicionarActionPerformed

    /*
    *Ação do botão Historico venda.
     */
    private void BtHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtHistoricoActionPerformed
        ListagemVenda tela = new ListagemVenda();
        tela.setVisible(true);
    }//GEN-LAST:event_BtHistoricoActionPerformed

    /*
    *Ação do botão efetuar venda.
     */
    private void BtEfetuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEfetuarActionPerformed
        if (!produtosSelecionados.isEmpty()) {
            efetuarVenda();

        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produto adicionado na venda!");
        }

    }//GEN-LAST:event_BtEfetuarActionPerformed

    /*
    *Ação do botão pesquisar id do cliente.
     */
    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed
        try {
            if (!TxId.getText().trim().isEmpty()) {
                int id = Integer.parseInt(TxId.getText());
                clienteCadastrado = cDAO.getCliente(id);
                TxNome.setText(clienteCadastrado.getNome());
                TxEmail.setText(clienteCadastrado.getEmail());
                TxCpf.setText(clienteCadastrado.getCpf());
                TxTelefone.setText(clienteCadastrado.getTelefone());

                TxNome.setEnabled(false);
                TxEmail.setEnabled(false);
                TxCpf.setEnabled(false);
                TxTelefone.setEnabled(false);
                BtPesOrcamento.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(null, "Campo ID vazio!");
            }

        } catch (NumberFormatException | NullPointerException exp) {
            JOptionPane.showMessageDialog(null, "ID cliente inexistente!");
        };
    }//GEN-LAST:event_BtPesquisarActionPerformed

    /*
    *Ação do botão clientes cadastrado.
     */
    private void TxClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxClientesActionPerformed
        ListagemCliente tela = new ListagemCliente();
        tela.setVisible(true);
    }//GEN-LAST:event_TxClientesActionPerformed

    /*
    *Ação do botão limpar os campos
     */
    private void BtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimparActionPerformed
        clear();
    }//GEN-LAST:event_BtLimparActionPerformed

    private void BtOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtOrcamentoActionPerformed
        ListagemOrcamento tela = new ListagemOrcamento();
        tela.setVisible(true);
    }//GEN-LAST:event_BtOrcamentoActionPerformed

    private void BtPesOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesOrcamentoActionPerformed
        try {
            if (!TxIdOrcamento.getText().trim().isEmpty()) {
                int id = Integer.parseInt(TxIdOrcamento.getText());
                Orcamento orcamento = oDAO.getOrcamento(id);
                TxNome.setText(orcamento.getCliente().getNome());
                TxEmail.setText(orcamento.getCliente().getEmail());
                TxCpf.setText(orcamento.getCliente().getCpf());
                TxTelefone.setText(orcamento.getCliente().getTelefone());
                clienteCadastrado = orcamento.getCliente();

                String dataBd = String.valueOf(orcamento.getData());
                LocalDate data = LocalDate.parse(dataBd);
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/y");
                
                TxData.setText(data.format(formato));

                Orcamento_Produto op = opDAO.getOP(id);
                LbTotal.setText(String.format("%.2f", op.getValorTotal()));
                produtosSelecionados.add(op.getProduto());
                valorTotal += op.getProduto().getValor();

                TxNome.setEnabled(false);
                TxEmail.setEnabled(false);
                TxCpf.setEnabled(false);
                TxTelefone.setEnabled(false);
                TxData.setEnabled(false);
                BtPesquisar.setEnabled(false);
                

            } else {
                JOptionPane.showMessageDialog(null, "Campo ID Orçamento vazio!");
            }

        } catch (NumberFormatException | NullPointerException exp) {
            JOptionPane.showMessageDialog(null, "ID orçamento inexistente!");
        };

    }//GEN-LAST:event_BtPesOrcamentoActionPerformed

    /*
    *Método para efetuar venda
     */
    public void efetuarVenda() {

        if (!emptyFields() && validationFields()) {
            String textoData = TxData.getText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(textoData, formatter);

            Date sqlData = Date.valueOf(localDate);

            if (clienteCadastrado != null ) {
                Venda venda = new Venda();

                venda.setFormPagamento(CbPagamento.getSelectedItem().toString());
                venda.setCliente(clienteCadastrado);
                venda.setData(sqlData);
                vDAO.cadastrar(venda);

                for (int i = 0; i < produtosSelecionados.size(); i++) {
                    Produto p = produtosSelecionados.get(i);

                    Venda_Produto vendaProduto = new Venda_Produto();
                    vendaProduto.setValorTotal(Double.parseDouble(LbTotal.getText().replace(",", ".")));
                    eDAO.vendaEfetuada(p.getId(), 1);

                    vendaProduto.setQuantidade(1);
                    vendaProduto.setProduto(p);
                    vendaProduto.setVenda(venda);
                    vpDAO.cadastrar(vendaProduto);

                }

                clear();
                JOptionPane.showMessageDialog(null, "Venda efetuada com sucesso!");

            } else {
                clienteCadastrado = cadastrarCliente();
                cDAO.cadastrar(clienteCadastrado);
                Venda venda = new Venda();

                venda.setFormPagamento(CbPagamento.getSelectedItem().toString());
                venda.setCliente(clienteCadastrado);
                venda.setData(sqlData);
                vDAO.cadastrar(venda);

                for (int i = 0; i < produtosSelecionados.size(); i++) {
                    Produto p = produtosSelecionados.get(i);
                    Venda_Produto vendaProduto = new Venda_Produto();

                    eDAO.vendaEfetuada(p.getId(), 1);
                    vendaProduto.setQuantidade(1);
                    vendaProduto.setProduto(p);
                    vendaProduto.setVenda(venda);
                    vendaProduto.setValorTotal(Double.parseDouble(LbTotal.getText().replace(",", ".")));
                    vpDAO.cadastrar(vendaProduto);

                }

                clear();
                JOptionPane.showMessageDialog(null, "Cadastro do cliente e a Venda\n concluida com sucesso!");

            }

        }
    }

    /*
    *Método para cadastrar cliente.
     */
    public Cliente cadastrarCliente() {
        Cliente c = new Cliente();
        c.setNome(TxNome.getText());
        c.setCpf(TxCpf.getText());
        c.setEmail(TxEmail.getText());
        c.setTelefone(TxTelefone.getText());

        return c;
    }

    /*
    *Método para verificar campos vazios.
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
        } else if (produtosSelecionados == null) {
            JOptionPane.showMessageDialog(null, "");
        } else {
            empty = false;
        }
        return empty;
    }

    /*
    *Método para limpar os campos.
     */
    public void clear() {
        TxNome.setText("");
        TxCpf.setText("");
        TxEmail.setText("");
        TxTelefone.setText("");
        CbPagamento.setSelectedIndex(0);
        TxData.setText("");
        LbTotal.setText("");
        TxId.setText("");
        TxIdOrcamento.setText("");

        TxNome.setEnabled(true);
        TxEmail.setEnabled(true);
        TxCpf.setEnabled(true);
        TxData.setEnabled(true);
        TxTelefone.setEnabled(true);
        BtPesquisar.setEnabled(true);
        BtPesOrcamento.setEnabled(true);
        valorTotal = 0;

        produtosSelecionados.isEmpty();

    }
    /**
     * Método para validar campos 
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
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAdicionar;
    private javax.swing.JButton BtEfetuar;
    private javax.swing.JButton BtHistorico;
    private javax.swing.JButton BtLimpar;
    private javax.swing.JButton BtOrcamento;
    private javax.swing.JButton BtPesOrcamento;
    private javax.swing.JButton BtPesquisar;
    private javax.swing.JComboBox<String> CbPagamento;
    private javax.swing.JPanel JpCabecalho;
    private javax.swing.JLabel LbCpf;
    private javax.swing.JLabel LbEmail;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbOrcamento;
    private javax.swing.JLabel LbPagamento;
    private javax.swing.JLabel LbProduto;
    private javax.swing.JLabel LbProdutos;
    private javax.swing.JLabel LbTelefone;
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JLabel LbTotal;
    private javax.swing.JLabel LbValorTotal;
    private javax.swing.JLabel LbVenda;
    private javax.swing.JButton TxClientes;
    private javax.swing.JTextField TxCpf;
    private javax.swing.JFormattedTextField TxData;
    private javax.swing.JTextField TxEmail;
    private javax.swing.JTextField TxId;
    private javax.swing.JTextField TxIdOrcamento;
    private javax.swing.JTextField TxNome;
    private javax.swing.JTextField TxProduto;
    private javax.swing.JTextField TxTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
