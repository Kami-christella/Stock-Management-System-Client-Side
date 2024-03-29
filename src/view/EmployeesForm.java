/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Admin;
import model.Employees;
import model.Products;
import service.AdminService;
import service.EmployeeService;
import service.ProductService;

/**
 *
 * @author GANZA
 */
public class EmployeesForm extends javax.swing.JFrame {

    private DefaultListModel<Products> listModel=new DefaultListModel();
    
    
    /**
     * Creates new form EmployeesForm
     */
    public EmployeesForm() {
        initComponents();
        addItemCombo();
        addProductItemList();
    }
//  private void addItemCombo(){
//    try{
//        Registry theRegistry =LocateRegistry.getRegistry("127.0.0.1",5000);
//        AdminService service=(AdminService) theRegistry.lookup("admin");
//        List<Admin> theAdmins=service.allAdmin();
//        for (Admin admin :theAdmins ){
//            admincombo.addItem(admin);
//        }
//    }catch(Exception ex){
//        ex.printStackTrace();
//    }
//}
    
    private void addItemCombo() {
    try {
        Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 5000);
        AdminService service = (AdminService) theRegistry.lookup("admin");
        List<Admin> theAdmins = service.allAdmin();

        admincombo.removeAllItems(); // Clear existing items

        if (theAdmins != null && !theAdmins.isEmpty()) {
            for (Admin admin : theAdmins) {
                admincombo.addItem(admin);
            }
        } else {
            // Handle the case where theAdmins is null or empty
            System.out.println("No admin data available.");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

  private void addProductItemList(){
      try{
          Registry theRegistry=LocateRegistry.getRegistry("127.0.0.1",5000);
          ProductService service=(ProductService) theRegistry.lookup("product");
          List<Products> products=service.allProducts();
            for(Products theProduct : products){
              listModel.addElement(theProduct);
               
            }
            productListItem.setModel(listModel);
      }catch(Exception ex){
         ex.printStackTrace();
      }
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
        jLabel8 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        admincombo = new javax.swing.JComboBox<Admin>();
        fnameTxt = new javax.swing.JTextField();
        lnameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        dutyTxt = new javax.swing.JTextField();
        salaryTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        productListItem = new javax.swing.JList<Products>();
        updateBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        searchidTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Employee Form");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Duty");

        jLabel5.setText("Salary");

        jLabel6.setText("Password");

        jLabel7.setText("Admin");

        jLabel8.setText("Product ID");

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(productListItem);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Search");

        jButton3.setText("Read All");

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Employee ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dutyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(489, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(admincombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(87, 87, 87))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registerBtn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9)))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(updateBtn)
                                        .addGap(45, 45, 45)
                                        .addComponent(deleteBtn)
                                        .addGap(45, 45, 45)
                                        .addComponent(jButton3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(searchidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jButton2)))))
                        .addContainerGap(184, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(dutyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(admincombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(jButton3))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(searchidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
         //Validations
        
        try{
           Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",5000);
           EmployeeService service=(EmployeeService) theRegistry.lookup("employee");
           Employees theemployee=new Employees(); 
           theemployee.setEfName(fnameTxt.getText());
           theemployee.setElName(lnameTxt.getText());
           theemployee.setDuty(dutyTxt.getText());
          //  sObj.setCp(Integer.valueOf(cpTxt.getText()));
            theemployee.setSalary(Integer.valueOf(salaryTxt.getText()));
           theemployee.setPassword(passwordTxt.getText());
           Admin theAdmin=(Admin) admincombo.getSelectedItem();
           Set<Products> productSet=new HashSet<>();
           List<Products> productsList=productListItem.getSelectedValuesList();
            for(Products theProduct : productsList){
                productSet.add(theProduct);
            }
            
           theemployee.setAdmin(theAdmin);
           theemployee.setProducts(productSet);
           Employees emplObj=service.registerEmployee(theemployee);
           if(emplObj!=null){
               JOptionPane.showMessageDialog(this, "Data Saved");
           }else{
                JOptionPane.showMessageDialog(this, "Data not Saved");
           }
           //put products configuration
        }catch(Exception ex){
           ex.printStackTrace();
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // 
           try{
           Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",5000);
           EmployeeService service=(EmployeeService) theRegistry.lookup("employee");
           Employees theemployee=new Employees(); 
           theemployee.setEfName(fnameTxt.getText());
           theemployee.setElName(lnameTxt.getText());
           theemployee.setDuty(dutyTxt.getText());
           theemployee.setEid(Integer.valueOf(searchidTxt.getText()));
          //  sObj.setCp(Integer.valueOf(cpTxt.getText()));
            theemployee.setSalary(Integer.valueOf(salaryTxt.getText()));
           theemployee.setPassword(passwordTxt.getText());
           Admin theAdmin=(Admin) admincombo.getSelectedItem();
           Set<Products> productSet=new HashSet<>();
           List<Products> productsList=productListItem.getSelectedValuesList();
            for(Products theProduct : productsList){
                productSet.add(theProduct);
            }
            
           theemployee.setAdmin(theAdmin);
           theemployee.setProducts(productSet);
           Employees emplObj=service.updateEmployees(theemployee);
           if(emplObj!=null){
               JOptionPane.showMessageDialog(this, "Data Updated");
           }else{
                JOptionPane.showMessageDialog(this, "Data not Updated");
           }
           //put products configuration
        }catch(Exception ex){
           ex.printStackTrace();
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
           try{
           Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1",5000);
           EmployeeService service=(EmployeeService) theRegistry.lookup("employee");
           Employees theemployee=new Employees(); 

           theemployee.setEid(Integer.valueOf(searchidTxt.getText()));
  
           Employees emplObj=service.deleteEmployees(theemployee);
           if(emplObj!=null){
               JOptionPane.showMessageDialog(this, "Data delete");
           }else{
                JOptionPane.showMessageDialog(this, "Data not delete please enter a valid ID");
           }
           //put products configuration
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
            java.util.logging.Logger.getLogger(EmployeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Admin> admincombo;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField dutyTxt;
    private javax.swing.JTextField fnameTxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnameTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JList<Products> productListItem;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField salaryTxt;
    private javax.swing.JTextField searchidTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
