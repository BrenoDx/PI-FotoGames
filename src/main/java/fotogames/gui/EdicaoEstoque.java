/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fotogames.gui;

import fotogames.persistencia.entidades.Estoque;
import fotogames.persistencia.DAO.EstoqueDAO;
import fotogames.persistencia.entidades.Produto;
import fotogames.persistencia.DAO.ProdutoDAO;

import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */

/**
 * Classe responsável pela interface gráfica de alteração de produtos.
 */
public class EdicaoEstoque extends javax.swing.JFrame {

    EstoqueDAO eDAO = new EstoqueDAO(); // Objeto para acessar métodos de persistência e consutla do estoque no banco de dados.
    String categoria; // variável categoria.
    ProdutoDAO pDAO = new ProdutoDAO(); // Objeto para acessar métodos de persistência e consulta de produtos no banco de dados.
    int id;

    /**
     * Método construtor
     */
    public EdicaoEstoque(int id) {
        initComponents();
        this.id = id;
        preencherCampos();
        
    }

    /*
    * Método contrutor vazio.
    */
    public EdicaoEstoque() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LbTitulo = new javax.swing.JLabel();
        CbJogos = new javax.swing.JCheckBox();
        CbAcessorios = new javax.swing.JCheckBox();
        CbHardware = new javax.swing.JCheckBox();
        TxProduto = new javax.swing.JTextField();
        LbProduto = new javax.swing.JLabel();
        TxFabricante = new javax.swing.JTextField();
        LbFabricante = new javax.swing.JLabel();
        TxQuantidade = new javax.swing.JTextField();
        LbQuantidade = new javax.swing.JLabel();
        LbGarantia = new javax.swing.JLabel();
        TxGarantia = new javax.swing.JTextField();
        TxValor = new javax.swing.JTextField();
        LbValor = new javax.swing.JLabel();
        TxCor = new javax.swing.JTextField();
        LbPlataforma = new javax.swing.JLabel();
        LbCor = new javax.swing.JLabel();
        TxPlataforma = new javax.swing.JTextField();
        BtEditar = new javax.swing.JButton();
        BtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LbTitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LbTitulo.setForeground(new java.awt.Color(0, 0, 0));
        LbTitulo.setText("Edição de Produtos");

        buttonGroup1.add(CbJogos);
        CbJogos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CbJogos.setText("Jogos");
        CbJogos.setToolTipText("Opção jogo");
        CbJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbJogosActionPerformed(evt);
            }
        });

        buttonGroup1.add(CbAcessorios);
        CbAcessorios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CbAcessorios.setText("Acessórios");
        CbAcessorios.setToolTipText("Opção Acessórios");
        CbAcessorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbAcessoriosActionPerformed(evt);
            }
        });

        buttonGroup1.add(CbHardware);
        CbHardware.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CbHardware.setText("Hardware");
        CbHardware.setToolTipText("Opção Hardware");
        CbHardware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbHardwareActionPerformed(evt);
            }
        });

        TxProduto.setToolTipText("Campo Produto");

        LbProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LbProduto.setForeground(new java.awt.Color(0, 0, 0));
        LbProduto.setText("Produto:");

        TxFabricante.setToolTipText("Campo Fabricante");

        LbFabricante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LbFabricante.setForeground(new java.awt.Color(0, 0, 0));
        LbFabricante.setText("Fabricante:");

        TxQuantidade.setToolTipText("Campo Quantidade");

        LbQuantidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LbQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        LbQuantidade.setText("Quantidade:");

        LbGarantia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LbGarantia.setForeground(new java.awt.Color(0, 0, 0));
        LbGarantia.setText("Garantia:");

        TxGarantia.setToolTipText("Campo Garantia");

        TxValor.setToolTipText("Campo Valor");

        LbValor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LbValor.setForeground(new java.awt.Color(0, 0, 0));
        LbValor.setText("Valor:");

        TxCor.setToolTipText("Campo Cor");

        LbPlataforma.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LbPlataforma.setForeground(new java.awt.Color(0, 0, 0));
        LbPlataforma.setText("Plataforma:");

        LbCor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LbCor.setForeground(new java.awt.Color(0, 0, 0));
        LbCor.setText("Cor:");

        TxPlataforma.setToolTipText("Campo Plataforma");

        BtEditar.setText("Editar");
        BtEditar.setToolTipText("Botão Cadastrar");
        BtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEditarActionPerformed(evt);
            }
        });

        BtVoltar.setText("Voltar");
        BtVoltar.setToolTipText("Botão Voltar");
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LbPlataforma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbProduto)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LbGarantia)
                                        .addComponent(LbFabricante, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxGarantia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LbCor)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LbValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxCor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(LbQuantidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203)))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CbHardware)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CbAcessorios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CbJogos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(LbTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbJogos)
                            .addComponent(CbHardware)
                            .addComponent(CbAcessorios)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LbTitulo)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbProduto)
                    .addComponent(TxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbFabricante)
                    .addComponent(TxValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbGarantia)
                    .addComponent(TxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbCor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbPlataforma))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtVoltar)
                    .addComponent(BtEditar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    *Ação do CBAcessorios
     */
    private void CbAcessoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbAcessoriosActionPerformed
        boolean selecionado = CbAcessorios.isSelected();
        if (selecionado) {
            TxCor.setEnabled(true);
            TxPlataforma.setEnabled(false);

            categoria = CbAcessorios.getText();
        }
    }//GEN-LAST:event_CbAcessoriosActionPerformed

    /*
    *Ação do botão editar.
     */
    private void BtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditarActionPerformed
        ProdutoDAO pDAO = new ProdutoDAO();
        EstoqueDAO eDAO = new EstoqueDAO();
        Produto p = new Produto();
        if (!emptyFields() && validation() == true) {
            int qntd = Integer.parseInt(TxQuantidade.getText());
            double valor = Double.parseDouble(TxValor.getText().replace(",", "."));
            int garantia = Integer.parseInt(TxGarantia.getText());

            eDAO.alterarEstoque(id, qntd);
            pDAO.editarProduto(id, TxProduto.getText(), TxFabricante.getText(), categoria, TxPlataforma.getText(), TxCor.getText(), garantia, valor);
            clear();
        }
    }//GEN-LAST:event_BtEditarActionPerformed

    /*
    *Ação do botão voltar.
     */
    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
        dispose();
        ListagemEstoque tela = new ListagemEstoque();
        tela.setVisible(true);
    }//GEN-LAST:event_BtVoltarActionPerformed

    /*
    *Ação do CBJogos.
     */
    private void CbJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbJogosActionPerformed
        boolean selecionado = CbJogos.isSelected();
        if (selecionado) {
            TxPlataforma.setEnabled(true);
            TxCor.setEnabled(false);
            categoria = CbJogos.getText();
        }
    }//GEN-LAST:event_CbJogosActionPerformed

    /*
    *Ação do CBHardware
     */
    private void CbHardwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbHardwareActionPerformed
        boolean selecionado = CbHardware.isSelected();
        if (selecionado) {
            TxCor.setEnabled(false);
            TxPlataforma.setEnabled(false);
            categoria = CbHardware.getText();
        }
    }//GEN-LAST:event_CbHardwareActionPerformed

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
            java.util.logging.Logger.getLogger(EdicaoEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdicaoEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdicaoEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicaoEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EdicaoEstoque().setVisible(true);
            }
        });
    }

    /*
    *Método para verificar campos vazios.
     */
    public boolean emptyFields() {
        boolean empty = true;
        if (TxProduto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenche campo Produto!");
        } else if (TxFabricante.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenche campo Fabricante!");
        } else if (TxQuantidade.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenche quantidade no estoque!");
        } else if (TxGarantia.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenche o campo Garantia!");
        } else if (TxValor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenche o campo Valor!");
        } else if (buttonGroup1.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Selecione a categoria do produto!");
        } else {
            empty = false;
        }
        return empty;
    }

    /*
    *Método para validar os campos.
     */
    public boolean validation() {
        boolean validation = false;
        try {
            int qntd = Integer.valueOf(TxQuantidade.getText());
            int garantia = Integer.valueOf(TxGarantia.getText());
            Double valor = Double.valueOf(TxValor.getText());
            validation = true;
            return validation;
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Campo(s) númerico(s) inválido(s)");
        }
        return validation;
    }

    /*
    *Método para limpar os campos.
     */
    public void clear() {
        TxProduto.setText("");
        TxGarantia.setText("");
        TxCor.setText("");
        TxFabricante.setText("");
        TxQuantidade.setText("");
        TxValor.setText("");
        TxPlataforma.setText("");
        buttonGroup1.clearSelection();
    }

    /*
    * Método para preencher os campos.
    */
    public void preencherCampos() {
        Produto editar = pDAO.getProdutoID(id);
        Estoque editarEstoque = eDAO.getEstoque(id);

        TxProduto.setText(editar.getNomeProduto());
        TxFabricante.setText(editar.getFabricante());
        TxCor.setText(editar.getCor());
        TxPlataforma.setText(editar.getPlataforma());
        TxValor.setText(String.valueOf(editar.getValor()));
        TxGarantia.setText(String.valueOf(editar.getGarantia()));
        TxQuantidade.setText(String.valueOf(editarEstoque.getQuantidade()));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtEditar;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JCheckBox CbAcessorios;
    private javax.swing.JCheckBox CbHardware;
    private javax.swing.JCheckBox CbJogos;
    private javax.swing.JLabel LbCor;
    private javax.swing.JLabel LbFabricante;
    private javax.swing.JLabel LbGarantia;
    private javax.swing.JLabel LbPlataforma;
    private javax.swing.JLabel LbProduto;
    private javax.swing.JLabel LbQuantidade;
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JLabel LbValor;
    private javax.swing.JTextField TxCor;
    private javax.swing.JTextField TxFabricante;
    private javax.swing.JTextField TxGarantia;
    private javax.swing.JTextField TxPlataforma;
    private javax.swing.JTextField TxProduto;
    private javax.swing.JTextField TxQuantidade;
    private javax.swing.JTextField TxValor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
