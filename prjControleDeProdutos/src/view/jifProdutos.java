/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import dao.produtoDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.produto;

/**
 *
 * @author wslou
 */
public class jifProdutos extends javax.swing.JInternalFrame {
    public void Listar(){
        try{
            produtoDAO dao = new produtoDAO();
            List<produto> listadeprodutos = dao.listar();
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setNumRows(0);
            for(produto v:listadeprodutos){
                modelo.addRow(new Object[]{
                    v.getId(),
                    v.getNome(),
                    v.getQuantidade(),
                    v.getPreco()
                });                
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    /**
     * Creates new form jifProdutos
     */
    public jifProdutos() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jLabel1.setText("NOME:");

        jLabel2.setText("QUANTIDADE:");

        jLabel3.setText("PREÇO:");

        jLabel4.setText("ID:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EXCLUIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ALTERAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("LIMPAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("SAIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(55, 55, 55)
                        .addComponent(jButton2)
                        .addGap(45, 45, 45)
                        .addComponent(jButton3)
                        .addGap(188, 188, 188)
                        .addComponent(jButton5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if((!jTextField1.getText().isEmpty()) && (!jTextField2.getText().isEmpty()) && (jTextField3.getText().isEmpty())){
            if(jTextField2.getText().matches("[0-9]*") && jTextField3.getText().matches("[0.0-9]*")){
                produto p = new produto();
                p.setNome(jTextField1.getText());
                p.setQuantidade(Integer.parseInt(jTextField2.getText()));
                p.setPreco(Double.parseDouble(jTextField3.getText()));
                
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                produtoDAO dao = null;
                try{
                    dao = new produtoDAO();
                    
                } catch (ClassNotFoundException ex){
                    Logger.getLogger(jifProdutos.class.getName()).log(Level.SEVERE,null,ex);
                    
                } catch(InstantiationException ex) {
                    Logger.getLogger(jifProdutos.class.getName()).log(Level.SEVERE,null,ex);
                    
                } catch(IllegalAccessException ex) {
                    Logger.getLogger(jifProdutos.class.getName()).log(Level.SEVERE,null,ex);
                }
                dao.adiciona(p);
                JOptionPane.showMessageDialog(null,"Produto "+jTextField1.getText()+" inserido com sucesso! ");
                
            } else{
                JOptionPane.showMessageDialog(null,"Os campos 2 e 3 devem ser numericos!");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Preencha todos os campos!");
        }
        Listar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() != -1){
            produto p = new produto();
            p.setId(Integer.parseInt(jTextField4.getText()));
            produtoDAO dao = null;
            try{
                dao = new produtoDAO();
            } catch(ClassNotFoundException ex){
                Logger.getLogger(jifProdutos.class.getName()).log(Level.SEVERE,null,ex);               
            } catch(InstantiationException ex) {
                    Logger.getLogger(jifProdutos.class.getName()).log(Level.SEVERE,null,ex);        
            } catch(IllegalAccessException ex) {
            Logger.getLogger(jifProdutos.class.getName()).log(Level.SEVERE,null,ex);
            }
            dao.deleta(p);
            
        }else{
            JOptionPane.showMessageDialog(null,"CLique em alguma linha para excluir");
        }
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        Listar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(!jTextField1.getText().isEmpty() && !jTextField2.getText().isEmpty() && jTextField3.getText().isEmpty()){
            produto p = new produto();
            
            p.setId(Integer.parseInt(jTextField4.getText()));
            p.setNome(jTextField1.getText());
            p.setQuantidade(Integer.parseInt(jTextField2.getText()));
            p.setPreco(Double.parseDouble(jTextField3.getText()));
            p.setId(Integer.parseInt(jTextField4.getText()));
            produtoDAO dao = null;
          try{
              dao = new produtoDAO();
          }  catch(ClassNotFoundException ex){
                Logger.getLogger(jifProdutos.class.getName()).log(Level.SEVERE,null,ex);               
            } catch(InstantiationException ex) {
                    Logger.getLogger(jifProdutos.class.getName()).log(Level.SEVERE,null,ex);        
            } catch(IllegalAccessException ex) {
            Logger.getLogger(jifProdutos.class.getName()).log(Level.SEVERE,null,ex);
            }
          dao.atualizar(p);
          Listar();
          
        } else{
            JOptionPane.showMessageDialog(null,"Preencha os campos, clique no valor e em atualizar!");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel produtos = (DefaultTableModel) jTable1.getModel();
        int a = produtos.getRowCount();
        while(a>0){
            produtos.removeRow(0);
            a--;
        }
        produtoDAO dao = null;
        try{
              dao = new produtoDAO();
          }  catch(ClassNotFoundException ex){
                Logger.getLogger(jifProdutos.class.getName()).log(Level.SEVERE,null,ex);               
            } catch(InstantiationException ex) {
                    Logger.getLogger(jifProdutos.class.getName()).log(Level.SEVERE,null,ex);        
            } catch(IllegalAccessException ex) {
            Logger.getLogger(jifProdutos.class.getName()).log(Level.SEVERE,null,ex);
            }
        dao.limpar();
        Listar();    
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() != -1){
            jTextField1.setText(jTable1.getValueAt(jTable1.getSelectedRow(),1).toString());
            jTextField2.setText(jTable1.getValueAt(jTable1.getSelectedRow(),2).toString());
            jTextField3.setText(jTable1.getValueAt(jTable1.getSelectedRow(),3).toString());
            jTextField4.setText(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}