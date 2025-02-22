/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Viwes;

import Controllers.ComandaController;
import Controllers.ProdutoController;
import Controllers.ProdutosComandaController;
import Models.Comandas;
import Models.Produtos;
import Models.TableModel;
import Modules.Time;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author andre
 */
public class ComandaFechadaProdutos extends javax.swing.JFrame {

    private ProdutoController ProdutoControl = new ProdutoController();
    private ProdutosComandaController ProdComandaControl = new ProdutosComandaController();
    private static List<Produtos> listaDeProdutos = new ArrayList<>();
    private static ComandaController ComandaController = new ComandaController();
   
    private static TableModel modelo;
    int id;
    String NomeClienteComanda;
    String DataAbertura;
    private ComandaController Control = new ComandaController();
    private ProdutosComandaController ProdutoComandacontroller = new ProdutosComandaController();

    /**
     * Creates new form EditarComanda
     */
    public ComandaFechadaProdutos(int ComandaId, String NomeComanda, String DataAbertura) {
        System.out.println(ComandaId);
        this.listaDeProdutos = ProdutoControl.FindProdutosComanda(ComandaId);
     
        this.id = ComandaId;
        this.NomeClienteComanda = NomeComanda;
        this.DataAbertura = DataAbertura;
        modelo = new TableModel(listaDeProdutos);
        initComponents();
        NomeCliente.setText(NomeComanda);
        tabelaProdutosComandaFechada.setModel(modelo);
        tabelaProdutosComandaFechada.setFont(new Font("Arial", Font.PLAIN, 18));
        tabelaProdutosComandaFechada.setShowVerticalLines(true);
        tabelaProdutosComandaFechada.setShowHorizontalLines(true);
        tabelaProdutosComandaFechada.setGridColor(Color.gray);
        //Adicione a tabela a um JScrollPane (opcional)
        jScrollPane1.setViewportView(tabelaProdutosComandaFechada);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutosComandaFechada = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        NomeCliente = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Items comanda");
        setResizable(false);

        TituloLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TituloLabel.setText("Comanda Fechada");

        tabelaProdutosComandaFechada.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaProdutosComandaFechada);

        jLabel1.setFont(new java.awt.Font("Alef", 0, 18)); // NOI18N
        jLabel1.setText("Comanda:");

        NomeCliente.setFont(new java.awt.Font("Alef", 0, 18)); // NOI18N
        NomeCliente.setForeground(new java.awt.Color(255, 204, 0));
        NomeCliente.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NomeCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(TituloLabel)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(TituloLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NomeCliente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
         /* */
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
            java.util.logging.Logger.getLogger(ComandaFechadaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComandaFechadaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComandaFechadaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComandaFechadaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new EditarComanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomeCliente;
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tabelaProdutosComandaFechada;
    // End of variables declaration//GEN-END:variables
}
