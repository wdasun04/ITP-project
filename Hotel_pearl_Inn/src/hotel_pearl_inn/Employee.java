/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_pearl_inn;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chathu_PC
 */
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new object form Employee
     */
    Employee_class emp = new Employee_class(); 
    public Employee() {
        initComponents();
     
        //populate the jtable
        emp.fillEmployeeJTable(jTable1);
        
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
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jTextFieldname = new javax.swing.JTextField();
        jTextFieldaddress = new javax.swing.JTextField();
        jTextFieldemail = new javax.swing.JTextField();
        jTextFieldempid = new javax.swing.JTextField();
        jTextFieldexde = new javax.swing.JTextField();
        jTextFielddes = new javax.swing.JTextField();
        jTextFielddep = new javax.swing.JTextField();
        jTextFieldbasicsal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldtele = new javax.swing.JTextField();
        jButtonrefresh = new javax.swing.JButton();
        jButtonadd = new javax.swing.JButton();
        jButtonedit = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel69.setText("Name");

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel70.setText("Employee Management");

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel73.setText("Address");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel74.setText("Email");

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel75.setText("Telephone");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel77.setText("Employee ID");

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel79.setText("Experiance/Description");

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel80.setText("Designation");

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel81.setText("Department");

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel82.setText("Basic Salary");

        jLabel84.setFont(new java.awt.Font("Sitka Small", 3, 18)); // NOI18N
        jLabel84.setText("Personal Infomation");

        jLabel85.setFont(new java.awt.Font("Sitka Small", 3, 18)); // NOI18N
        jLabel85.setText("Company Information");

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp_ID", "Name", "Address", "Email", "Telephone", "Experience", "Designation", "Department", "Basic Salary"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jButtonrefresh.setBackground(new java.awt.Color(102, 102, 255));
    jButtonrefresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButtonrefresh.setText("Refresh");
    jButtonrefresh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonrefreshActionPerformed(evt);
        }
    });

    jButtonadd.setBackground(new java.awt.Color(102, 102, 255));
    jButtonadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButtonadd.setText("Add");
    jButtonadd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonaddActionPerformed(evt);
        }
    });

    jButtonedit.setBackground(new java.awt.Color(102, 102, 255));
    jButtonedit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButtonedit.setText("Update");
    jButtonedit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtoneditActionPerformed(evt);
        }
    });

    jButtondelete.setBackground(new java.awt.Color(102, 102, 255));
    jButtondelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButtondelete.setText("Delete");
    jButtondelete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtondeleteActionPerformed(evt);
        }
    });

    jButtonclear.setBackground(new java.awt.Color(102, 102, 255));
    jButtonclear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButtonclear.setText("Clear Fields");
    jButtonclear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonclearActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel82)
                        .addComponent(jLabel81)
                        .addComponent(jLabel80)
                        .addComponent(jLabel79))
                    .addGap(54, 54, 54)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldexde, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                        .addComponent(jTextFielddes)
                        .addComponent(jTextFielddep)
                        .addComponent(jTextFieldbasicsal)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel85)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel76)
                            .addGap(48, 48, 48)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel69)
                                .addComponent(jLabel73)
                                .addComponent(jLabel74)
                                .addComponent(jLabel75)
                                .addComponent(jLabel77))
                            .addGap(89, 89, 89)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldempid, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldname, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                    .addComponent(jTextFieldemail)
                                    .addComponent(jTextFieldaddress)
                                    .addComponent(jTextFieldtele))))
                        .addComponent(jLabel84)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jButtonedit, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jButtondelete, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
                .addComponent(jButtonrefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(28, 28, 28))
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(551, 551, 551)
            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(jLabel84)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jTextFieldempid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel77)
                            .addGap(13, 13, 13)
                            .addComponent(jLabel69)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel73)
                                .addComponent(jTextFieldaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel74)
                                .addComponent(jTextFieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(17, 17, 17)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel75)
                                .addComponent(jTextFieldtele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(54, 54, 54)
                    .addComponent(jLabel85)
                    .addGap(60, 60, 60)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel79)
                        .addComponent(jTextFieldexde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel80)
                        .addComponent(jTextFielddes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel81)
                        .addComponent(jTextFielddep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel82)
                        .addComponent(jTextFieldbasicsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(72, 72, 72)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonedit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtondelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(21, 21, 21)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButtonclear, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jButtonrefresh, javax.swing.GroupLayout.Alignment.TRAILING))
            .addContainerGap(46, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
        //get data from the fields
        String name= jTextFieldname.getText();
        String Address= jTextFieldaddress.getText();
        String email= jTextFieldemail.getText();
        String Tele= jTextFieldtele.getText();
        String exp= jTextFieldexde.getText();
        String Desg= jTextFielddes.getText();
        String Dep= jTextFielddep.getText();
        String Basicsal= jTextFieldbasicsal.getText();

        if(name.trim().equals("")|| Address.trim().equals("")|| email.trim().equals("")|| Tele.trim().equals("") || exp.trim().equals("")|| Desg.trim().equals("")|| Basicsal.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Required Fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }else{
            if(emp.addEmployee(name, Address, email, Tele, exp, Desg, Dep, Basicsal)){
            JOptionPane.showMessageDialog(rootPane, "New Employee Added Successfully", "Add Employee", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Employee not Added", "Add Employee Error", JOptionPane.ERROR_MESSAGE);
            
        }
        }
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jButtoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneditActionPerformed
       //get data from the fields
        int empid = 0;
        String name= jTextFieldname.getText();
        String Address= jTextFieldaddress.getText();
        String email= jTextFieldemail.getText();
        String Tele= jTextFieldtele.getText();
        String exp= jTextFieldexde.getText();
        String Desg= jTextFielddes.getText();
        String Dep= jTextFielddep.getText();
        String Basicsal= jTextFieldbasicsal.getText();
        
        if(name.trim().equals("")|| Address.trim().equals("")|| email.trim().equals("")|| Tele.trim().equals("") || exp.trim().equals("")|| Desg.trim().equals("")|| Basicsal.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "All Fields are Required", "Empty Fields", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                empid = Integer.valueOf(jTextFieldempid.getText()); 
            }catch(NumberFormatException ex ){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"- Enter the Employee ID(number)","Employee ID Error ", JOptionPane.WARNING_MESSAGE);
            }
        }
            if(emp.editEmployee(empid, name, Address, email, Tele, exp, Desg, Dep, Basicsal)){
            JOptionPane.showMessageDialog(rootPane, "Employee Updateded Successfully", "Updateded Employee", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Employee not Updateded", "Updateded Employee Error", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_jButtoneditActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       //get the jtable model
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        //get the selected raw indexes
        int rIndex = jTable1.getSelectedRow();
        
        //display data
        jTextFieldempid.setText(model.getValueAt(rIndex, 0).toString());
        jTextFieldname.setText(model.getValueAt(rIndex, 1).toString());
        jTextFieldaddress.setText(model.getValueAt(rIndex, 2).toString());
        jTextFieldemail.setText(model.getValueAt(rIndex, 3).toString());
        jTextFieldtele.setText(model.getValueAt(rIndex, 4).toString());
         jTextFieldexde.setText(model.getValueAt(rIndex, 5).toString());
        jTextFielddes.setText(model.getValueAt(rIndex, 6).toString());
        jTextFielddep.setText(model.getValueAt(rIndex, 7).toString());
        jTextFieldbasicsal.setText(model.getValueAt(rIndex, 8).toString());
      

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
      // remove text from all the jtextboxes
        jTextFieldempid.setText("");
        jTextFieldname.setText("");
        jTextFieldaddress.setText("");
        jTextFieldemail.setText("");        
        jTextFieldtele.setText("");   
        jTextFieldexde.setText("");
        jTextFielddes.setText("");
        jTextFielddep.setText("");
        jTextFieldbasicsal.setText("");
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
         // delete the selected client
        try{
               int id = Integer.valueOf(jTextFieldempid.getText()); 
               
               if(emp.removeEmployee(id)){
                    JOptionPane.showMessageDialog(rootPane, "Employee Removed Successfully", "Remove Employee", JOptionPane.INFORMATION_MESSAGE);
               }else{
                    JOptionPane.showMessageDialog(rootPane, "Employee not Remved", "Removed Employee Error", JOptionPane.ERROR_MESSAGE);
            
        }
            }catch(NumberFormatException ex ){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"- Enter the Employee ID(number)","Employee ID Error ", JOptionPane.WARNING_MESSAGE);
            }
       
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void jButtonrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonrefreshActionPerformed
          //clear the jtable first
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"empid", "name", "Address", "email", "Tele", "exp", "Desg", "Dep", "Basicsal"} ));

        //populate the jtable
        emp.fillEmployeeJTable(jTable1);
    }//GEN-LAST:event_jButtonrefreshActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtonedit;
    private javax.swing.JButton jButtonrefresh;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldaddress;
    private javax.swing.JTextField jTextFieldbasicsal;
    private javax.swing.JTextField jTextFielddep;
    private javax.swing.JTextField jTextFielddes;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldempid;
    private javax.swing.JTextField jTextFieldexde;
    private javax.swing.JTextField jTextFieldname;
    private javax.swing.JTextField jTextFieldtele;
    // End of variables declaration//GEN-END:variables
}
