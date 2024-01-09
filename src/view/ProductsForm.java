/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Products;
import service.ProductService;

/**
 *
 * @author GANZA
 */
public class ProductsForm extends javax.swing.JFrame {

    /**
     * Creates new form ProductsForm
     */
    public ProductsForm() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        pnameTxt = new javax.swing.JTextField();
        quantityTxt = new javax.swing.JTextField();
        ddateTxt = new com.toedter.calendar.JDateChooser();
        edateTxt = new com.toedter.calendar.JDateChooser();
        cpTxt = new javax.swing.JTextField();
        spTxt = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        pidTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Products Form");

        jLabel2.setText("Product Name");

        jLabel3.setText("Quantity");

        jLabel4.setText("Delivery Date");

        jLabel5.setText("Expiry Date");

        jLabel6.setText("Cost Price");

        jLabel7.setText("Selling Price");

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jButton3.setText("Search");

        jButton4.setText("Select All");

        jLabel8.setText("Product ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ddateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(edateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(quantityTxt)
                                        .addComponent(cpTxt)
                                        .addComponent(spTxt))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(46, 46, 46)
                                .addComponent(pidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerBtn)
                                .addGap(29, 29, 29)
                                .addComponent(updateBtn)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBtn)))
                        .addGap(32, 32, 32)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(pnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(ddateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(edateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // Validations
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dDate = sdf.format(ddateTxt.getDate());
      String eDate = sdf.format(edateTxt.getDate());
        try{
            Registry theRegistry=LocateRegistry.getRegistry("127.0.0.1",5000);
            ProductService service=(ProductService) theRegistry.lookup("product");
            Products theproduct =new Products();
            theproduct.setpName(pnameTxt.getText());
              theproduct.setQuantity(Integer.valueOf(quantityTxt.getText()));
              theproduct.setdDate(dDate);
               theproduct.seteDate(eDate);
                theproduct.setCp(Integer.valueOf(cpTxt.getText()));
                theproduct.setSp(Integer.valueOf(spTxt.getText()));
                Products productObj=service.registerProduct(theproduct);
                if(productObj!=null){
                    JOptionPane.showMessageDialog(this, "Data Saved!");
                }else{
                    JOptionPane.showMessageDialog(this, "Data not saved!");
                }
          //  theproduct.setQuantity(quantityTxt.getText());
        }catch(Exception ex){
           ex.printStackTrace();
        }
        
    }//GEN-LAST:event_registerBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
              SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dDate = sdf.format(ddateTxt.getDate());
      String eDate = sdf.format(edateTxt.getDate());
        try{
            Registry theRegistry=LocateRegistry.getRegistry("127.0.0.1",5000);
            ProductService service=(ProductService) theRegistry.lookup("product");
            Products theproduct =new Products();
            theproduct.setpName(pnameTxt.getText());
              theproduct.setQuantity(Integer.valueOf(quantityTxt.getText()));
              theproduct.setdDate(dDate);
               theproduct.seteDate(eDate);
                theproduct.setCp(Integer.valueOf(cpTxt.getText()));
                theproduct.setSp(Integer.valueOf(spTxt.getText()));
                theproduct.setpId(Integer.valueOf(pidTxt.getText()));
                Products productObj=service.updateProducts(theproduct);
                if(productObj!=null){
                    JOptionPane.showMessageDialog(this, "Data Updated!");
                }else{
                    JOptionPane.showMessageDialog(this, "Data not Updates!");
                }
          //  theproduct.setQuantity(quantityTxt.getText());
        }catch(Exception ex){
           ex.printStackTrace();
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
//                      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//    String dDate = sdf.format(ddateTxt.getDate());
//      String eDate = sdf.format(edateTxt.getDate());
        try{
            Registry theRegistry=LocateRegistry.getRegistry("127.0.0.1",5000);
            ProductService service=(ProductService) theRegistry.lookup("product");
            Products theproduct =new Products();
//            theproduct.setpName(pnameTxt.getText());
//              theproduct.setQuantity(Integer.valueOf(quantityTxt.getText()));
//              theproduct.setdDate(dDate);
//               theproduct.seteDate(eDate);
//                theproduct.setCp(Integer.valueOf(cpTxt.getText()));
//                theproduct.setSp(Integer.valueOf(spTxt.getText()));
                theproduct.setpId(Integer.valueOf(pidTxt.getText()));
                Products productObj=service.deleteProducts(theproduct);
                if(productObj!=null){
                    JOptionPane.showMessageDialog(this, "Data delted Successfully!");
                }else{
                    JOptionPane.showMessageDialog(this, "Data not deleted!");
                }
          //  theproduct.setQuantity(quantityTxt.getText());
        }catch(Exception ex){
           ex.printStackTrace();
        }
        
    }//GEN-LAST:event_deleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ProductsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpTxt;
    private com.toedter.calendar.JDateChooser ddateTxt;
    private javax.swing.JButton deleteBtn;
    private com.toedter.calendar.JDateChooser edateTxt;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField pidTxt;
    private javax.swing.JTextField pnameTxt;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField spTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
