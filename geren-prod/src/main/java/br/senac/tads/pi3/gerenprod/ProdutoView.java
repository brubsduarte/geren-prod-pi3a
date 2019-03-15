/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.gerenprod;

import java.awt.Color;
import java.util.ArrayList;
import javafx.scene.control.CheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class ProdutoView extends javax.swing.JFrame {

    private boolean isModoTelaCriar; //"Criar/Editar"

    /**
     * Creates new form ProdutoView
     */
    public ProdutoView() {
        initComponents();
        isModoTelaCriar = true;
        preencherTabelaProdutos();
    }

    public void preencherTabelaProdutos() {
        ArrayList<String[]> listaProdutos = ProdutoController.listar();

        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto.addColumn("Id");
        tmProduto.addColumn("Data");
        tmProduto.addColumn("Nome");
        tmProduto.addColumn("Descrição");
        tmProduto.addColumn("$ Compra");
        tmProduto.addColumn("$ Venda");
        tmProduto.addColumn("Qtda");
        tmProduto.addColumn("Disponibilidade");
        tmProduto.addColumn("Categorias");

        for (String[] c : listaProdutos) {
            tmProduto.addRow(c);
        }

        tblProdutos.setModel(tmProduto);
  
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(300);
        tblProdutos.getColumnModel().getColumn(4).setPreferredWidth(70);
        tblProdutos.getColumnModel().getColumn(5).setPreferredWidth(70);
        tblProdutos.getColumnModel().getColumn(6).setPreferredWidth(60);
        tblProdutos.getColumnModel().getColumn(7).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(8).setPreferredWidth(300);

        this.pack();
    }

    public void LimparFormulario() {

        txtId.setText("");
        txtNome.setText("");
        txtDescricao.setText("");
        txtPrecoCompra.setText("");
        txtPrecoVenda.setText("");
        txtQuantidade.setText("");
        btnDisponibilidade.setSelected(true);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        grupoCategorias = new javax.swing.ButtonGroup();
        lblId = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblDescricão = new javax.swing.JLabel();
        lblPrecoCompra = new javax.swing.JLabel();
        lblPrecoVenda = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtPrecoCompra = new javax.swing.JTextField();
        txtPrecoVenda = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        btnDisponibilidade = new javax.swing.JToggleButton();
        pnlBotoesFormulario = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        pnlTabela = new javax.swing.JPanel();
        pnlBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();

        jToggleButton1.setText("jToggleButton1");

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblId.setText("ID:");

        lblNome.setText("Nome:");

        lblDescricão.setText("Descrição:");

        lblPrecoCompra.setText("Preço de Compra:");

        lblPrecoVenda.setText("Preço de venda:");

        lblQuantidade.setText("Quantidade:");

        txtId.setEditable(false);

        lblCategoria.setText("Categoria:");

        btnDisponibilidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDisponibilidade.setText("Disponibilidade");
        btnDisponibilidade.setToolTipText("");
        btnDisponibilidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDisponibilidadeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDisponibilidadeMouseReleased(evt);
            }
        });
        btnDisponibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisponibilidadeActionPerformed(evt);
            }
        });

        pnlBotoesFormulario.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesFormularioLayout = new javax.swing.GroupLayout(pnlBotoesFormulario);
        pnlBotoesFormulario.setLayout(pnlBotoesFormularioLayout);
        pnlBotoesFormularioLayout.setHorizontalGroup(
            pnlBotoesFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotoesFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        pnlBotoesFormularioLayout.setVerticalGroup(
            pnlBotoesFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoesFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTabela.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        pnlBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Pç.Compra", "Pç.Venda", "Qtd"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProdutos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tblProdutos);

        javax.swing.GroupLayout pnlTabelaLayout = new javax.swing.GroupLayout(pnlTabela);
        pnlTabela.setLayout(pnlTabelaLayout);
        pnlTabelaLayout.setHorizontalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTabelaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTabelaLayout.setVerticalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addGroup(pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTabelaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        grupoCategorias.add(jCheckBox1);
        jCheckBox1.setText("1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        grupoCategorias.add(jCheckBox2);
        jCheckBox2.setText("2");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        grupoCategorias.add(jCheckBox3);
        jCheckBox3.setText("3");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        grupoCategorias.add(jCheckBox4);
        jCheckBox4.setText("4");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        grupoCategorias.add(jCheckBox5);
        jCheckBox5.setText("5");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecoCompra)
                            .addComponent(lblDescricão, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPrecoVenda, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblQuantidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCategoria, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCheckBox1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jCheckBox3)
                                            .addGap(18, 18, 18)
                                            .addComponent(jCheckBox5))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCheckBox2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jCheckBox4)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlBotoesFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricão)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecoCompra))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecoVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidade))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoria)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCheckBox1)
                                .addComponent(jCheckBox3)
                                .addComponent(jCheckBox5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnDisponibilidade)))
                .addGap(12, 12, 12)
                .addComponent(pnlBotoesFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisponibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisponibilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDisponibilidadeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
   
        if (isModoTelaCriar) {
            
         
       
            if (ProdutoController.Salvar(
                    txtNome.getText(),
                    txtDescricao.getText(),
                    Double.parseDouble(txtPrecoCompra.getText()),
                    Double.parseDouble(txtPrecoVenda.getText()),
                    Integer.parseInt(txtQuantidade.getText()),
                    btnDisponibilidade.isSelected(), 
                    grupoCategorias.toString()
                         
            )) {
                JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");
                LimparFormulario();
                preencherTabelaProdutos();
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao cadastrar produto!");
            }

        } else if (ProdutoController.Atualizar(Integer.parseInt(txtId.getText()),
                txtNome.getText(),
                txtDescricao.getText(),
                Double.parseDouble(txtPrecoCompra.getText()),
                Double.parseDouble(txtPrecoVenda.getText()),
                Integer.parseInt(txtQuantidade.getText()),
                btnDisponibilidade.isSelected(),
                grupoCategorias.toString()
        )) {
            preencherTabelaProdutos();
            JOptionPane.showMessageDialog(this, "Produto Atualizado com sucesso!");
            LimparFormulario();
        } else {
            JOptionPane.showMessageDialog(this, "Falha ao Atualizar produto!");
        }
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        LimparFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        if (tblProdutos.getRowCount() > 0) {
            if (tblProdutos.getSelectedRow() >= 0) {
                isModoTelaCriar = false;
                LimparFormulario();

                txtId.setText(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 0).toString());
                txtNome.setText(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 2).toString());
                txtDescricao.setText(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 3).toString());
                txtPrecoCompra.setText(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 4).toString());
                txtPrecoVenda.setText(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 5).toString());
                txtQuantidade.setText(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 6).toString());
                int tmp = (tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 7).toString().compareTo("SIM"));
                
                btnDisponibilidade.setSelected(tmp == 0);
                if (tmp == 0) {
                    btnDisponibilidade.setBackground(new Color(0, 1.0f, 0));
                } else {
                    btnDisponibilidade.setBackground(new Color(1.0f, 0, 0));
                }

            } else {
                JOptionPane.showMessageDialog(this, "Selecione um produto para editar!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há produtos para editar!");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        isModoTelaCriar = true;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnDisponibilidadeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDisponibilidadeMousePressed
        if (btnDisponibilidade.isSelected()) {
            btnDisponibilidade.setBackground(new Color(0, 1.0f, 0));
        } else {
            btnDisponibilidade.setBackground(new Color(1.0f, 0, 0));
        }
    }//GEN-LAST:event_btnDisponibilidadeMousePressed

    private void btnDisponibilidadeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDisponibilidadeMouseReleased
        if (btnDisponibilidade.isSelected()) {
            btnDisponibilidade.setBackground(new Color(0, 1.0f, 0));
        } else {
            btnDisponibilidade.setBackground(new Color(1.0f, 0, 0));
        }
    }//GEN-LAST:event_btnDisponibilidadeMouseReleased

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblProdutos.getRowCount() >= 0 && tblProdutos.getSelectedRow() >= 0) {
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Excluir", JOptionPane.YES_NO_OPTION);
                if(resposta == JOptionPane.YES_OPTION){
                 int prodoutoId = Integer.parseInt(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 0).toString());
                 
            if (ProdutoController.Excluir(prodoutoId)) {
                this.preencherTabelaProdutos();
                
                JOptionPane.showMessageDialog(this, "Produto excluído da base de dados");
                LimparFormulario();
                
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir o produto!");
            }
        }
        } else {
            JOptionPane.showMessageDialog(this, "Não há produtos para excluir!");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
    if(jCheckBox4.isSelected())
       {
           jCheckBox4.getText();
       }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
 if(jCheckBox1.isSelected())
       {
           jCheckBox1.getText();
       }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
    if(jCheckBox2.isSelected())
       {
           jCheckBox2.getText();
       }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
  if(jCheckBox3.isSelected())
       {
           jCheckBox3.getText();
       }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if(jCheckBox5.isSelected())
       {
           jCheckBox5.getText();
       }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

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
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JToggleButton btnDisponibilidade;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup grupoCategorias;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDescricão;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPrecoCompra;
    private javax.swing.JLabel lblPrecoVenda;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlBotoesFormulario;
    private javax.swing.JPanel pnlTabela;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrecoCompra;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
