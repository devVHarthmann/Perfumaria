/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.entity.Base;
import java.awt.Color;

/**
 *
 * @author vdasi
 */
public class FRperfumaria extends javax.swing.JFrame {

    /**
     * Creates new form FRperfumaria
     */
    public FRperfumaria() {
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

        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAdd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAlt = new javax.swing.JTextField();
        txtRemove = new javax.swing.JTextField();
        btmAdicionar = new javax.swing.JButton();
        btmAlterar = new javax.swing.JButton();
        btmRemover = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLista1 = new javax.swing.JTextArea();
        btmOrdenar = new javax.swing.JButton();
        btmListar = new javax.swing.JButton();
        txtNovoNome = new javax.swing.JTextField();
        btmLimpar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtPesquisar = new javax.swing.JTextField();
        btmPesquisar = new javax.swing.JButton();
        btmQuantidade = new javax.swing.JButton();

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Perfumaria do Xiru");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Adicionar perfume");

        txtAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAdd.setForeground(new java.awt.Color(204, 204, 204));
        txtAdd.setText(" Insira o produto");
        txtAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddFocusLost(evt);
            }
        });
        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Remover perfume");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Alterar perfume");

        txtAlt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAlt.setForeground(new java.awt.Color(204, 204, 204));
        txtAlt.setText(" Insira o código");
        txtAlt.setToolTipText("Insira o código");
        txtAlt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAltFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAltFocusLost(evt);
            }
        });
        txtAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAltActionPerformed(evt);
            }
        });

        txtRemove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRemove.setForeground(new java.awt.Color(204, 204, 204));
        txtRemove.setText(" Insira o código");
        txtRemove.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRemoveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRemoveFocusLost(evt);
            }
        });
        txtRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemoveActionPerformed(evt);
            }
        });

        btmAdicionar.setText("Adicionar");
        btmAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmAdicionarActionPerformed(evt);
            }
        });

        btmAlterar.setText("Alterar");
        btmAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmAlterarActionPerformed(evt);
            }
        });

        btmRemover.setText("Remover");
        btmRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmRemoverActionPerformed(evt);
            }
        });

        txtLista1.setColumns(20);
        txtLista1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtLista1.setRows(5);
        jScrollPane2.setViewportView(txtLista1);

        btmOrdenar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btmOrdenar.setText("Ordenar");
        btmOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmOrdenarActionPerformed(evt);
            }
        });

        btmListar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btmListar.setText("Listar");
        btmListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmListarActionPerformed(evt);
            }
        });

        txtNovoNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNovoNome.setForeground(new java.awt.Color(204, 204, 204));
        txtNovoNome.setText(" Insira o novo nome");
        txtNovoNome.setToolTipText("Insira o novo nome");
        txtNovoNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNovoNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNovoNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNovoNomeFocusLost(evt);
            }
        });
        txtNovoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNovoNomeActionPerformed(evt);
            }
        });

        btmLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btmLimpar.setText("Limpar");
        btmLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmLimparActionPerformed(evt);
            }
        });

        txtPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btmPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btmPesquisar.setText("Pesquisar");
        btmPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmPesquisarActionPerformed(evt);
            }
        });

        btmQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btmQuantidade.setText("Quantidade");
        btmQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmQuantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNovoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btmAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btmQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btmOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btmLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btmListar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btmPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtNovoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btmAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btmAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(btmRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btmQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btmLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmListar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Base listaPerfumes = new Base();
    Base listaSecundaria = new Base();

    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddActionPerformed

    private void txtAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAltActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txtRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemoveActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btmAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmAdicionarActionPerformed
        listaPerfumes.salvarPerfume(txtAdd.getText());
        txtLista1.setText(listaPerfumes.listar());
        txtAdd.setText("");
    }//GEN-LAST:event_btmAdicionarActionPerformed

    private void btmAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmAlterarActionPerformed
        listaPerfumes.alterar((Integer.parseInt(txtAlt.getText())), txtNovoNome.getText());
        txtLista1.setText(listaPerfumes.listar());
        txtAlt.setText(null);
        txtNovoNome.setText("");
    }//GEN-LAST:event_btmAlterarActionPerformed

    private void btmRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmRemoverActionPerformed
        listaPerfumes.excluir(Integer.parseInt(txtRemove.getText()));
        txtLista1.setText(listaPerfumes.listar());
    }//GEN-LAST:event_btmRemoverActionPerformed

    private void btmListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmListarActionPerformed
        txtLista1.setText(listaPerfumes.listar());
    }//GEN-LAST:event_btmListarActionPerformed

    private void btmOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmOrdenarActionPerformed
        listaPerfumes.ordenarPerfumes();
        txtLista1.setText(listaPerfumes.listar());
        listaPerfumes = listaSecundaria;
    }//GEN-LAST:event_btmOrdenarActionPerformed

    private void txtNovoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNovoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNovoNomeActionPerformed

    private void btmLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmLimparActionPerformed
        listaPerfumes.limpar();
        txtLista1.setText("");
        

    }//GEN-LAST:event_btmLimparActionPerformed

    private void txtAddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddFocusGained
        if (txtAdd.getText().equals(" Insira o produto")) {
            txtAdd.setForeground(Color.BLACK);
            txtAdd.setText("");
        } else {
            
            txtAdd.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtAddFocusGained

    private void txtAddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddFocusLost
        if (!txtAdd.getText().equals("")) {
            txtAdd.setForeground(Color.BLACK);
        } else {
            txtAdd.setText(" Insira o produto");
            txtAdd.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtAddFocusLost

    private void txtAltFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAltFocusGained
        if (txtAlt.getText().equals(" Insira o código")) {
            txtAlt.setText("");
            txtAlt.setForeground(Color.BLACK);
            
        } else {
            
            txtAlt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtAltFocusGained

    private void txtAltFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAltFocusLost
        if (!txtAlt.getText().equals("")) {
            txtAlt.setForeground(Color.BLACK);
        } else {
            txtAlt.setText(" Insira o código");
            txtAlt.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtAltFocusLost

    private void txtNovoNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNovoNomeFocusGained
        if (txtNovoNome.getText().equals(" Insira o novo nome")) {
            txtNovoNome.setForeground(Color.BLACK);
            txtNovoNome.setText("");
        } else {
            
            txtNovoNome.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNovoNomeFocusGained

    private void txtNovoNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNovoNomeFocusLost
         if (!txtNovoNome.getText().equals("")) {
            txtNovoNome.setForeground(Color.BLACK);
        } else {
            txtNovoNome.setText(" Insira o novo nome");
            txtNovoNome.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtNovoNomeFocusLost

    private void txtRemoveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRemoveFocusGained
        if (txtRemove.getText().equals(" Insira o código")) {
            txtRemove.setForeground(Color.BLACK);
            txtRemove.setText("");
        } else {
            
            txtRemove.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtRemoveFocusGained

    private void txtRemoveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRemoveFocusLost
         if (!txtRemove.getText().equals("")) {
            txtRemove.setForeground(Color.BLACK);
        } else {
            txtRemove.setText(" Insira o código");
            txtRemove.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtRemoveFocusLost

    private void btmPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmPesquisarActionPerformed
        listaPerfumes.pesquisar(txtPesquisar.getText());
    }//GEN-LAST:event_btmPesquisarActionPerformed

    private void btmQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmQuantidadeActionPerformed
        listaPerfumes.exibirTamanho();
    }//GEN-LAST:event_btmQuantidadeActionPerformed

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
            java.util.logging.Logger.getLogger(FRperfumaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRperfumaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRperfumaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRperfumaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRperfumaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmAdicionar;
    private javax.swing.JButton btmAlterar;
    private javax.swing.JButton btmLimpar;
    private javax.swing.JButton btmListar;
    private javax.swing.JButton btmOrdenar;
    private javax.swing.JButton btmPesquisar;
    private javax.swing.JButton btmQuantidade;
    private javax.swing.JButton btmRemover;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtAlt;
    private javax.swing.JTextArea txtLista1;
    private javax.swing.JTextField txtNovoNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtRemove;
    // End of variables declaration//GEN-END:variables
}
