/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_pearl_inn;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Guest extends javax.swing.JFrame {

    /**
     * Creates new form Guest
     */
    Guest_class gst = new Guest_class(); 
    public Guest() {
        initComponents();
        
        gst.fillGuestJTable(jTable1);
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
        jTextFieldGname = new javax.swing.JTextField();
        jTextFieldGphone = new javax.swing.JTextField();
        jTextFieldGemail = new javax.swing.JTextField();
        jTextFieldgid = new javax.swing.JTextField();
        jTextFieldNic = new javax.swing.JTextField();
        jTextFieldPass = new javax.swing.JTextField();
        jTextFieldType = new javax.swing.JTextField();
        jTextFieldLoyalty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldDOB = new javax.swing.JTextField();
        jButtonrefresh = new javax.swing.JButton();
        jButtonadd = new javax.swing.JButton();
        jButtonedit = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jTextFieldDescription = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel69.setText("Name");

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Guest Registration");

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel73.setText("Phone");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel74.setText("Email");

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel75.setText("DOB");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel77.setText("Guest ID");

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel79.setText("NIC");

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel80.setText("Passport");

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel81.setText("Type");

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel82.setText("Loyalty");

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel84.setText("Guest Infomation");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel85.setText("Identity Information");

        jTextFieldGname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldGname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGnameActionPerformed(evt);
            }
        });

        jTextFieldGphone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldGemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldgid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldNic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldLoyalty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "guestID", "name", "phone", "email", "dob", "loyalty", "description", "nic", "passport", "type"
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

    jTextFieldDOB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    jButtonrefresh.setBackground(new java.awt.Color(204, 255, 204));
    jButtonrefresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonrefresh.setText("Refresh");
    jButtonrefresh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonrefreshActionPerformed(evt);
        }
    });

    jButtonadd.setBackground(new java.awt.Color(0, 153, 255));
    jButtonadd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonadd.setText("Add");
    jButtonadd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonaddActionPerformed(evt);
        }
    });

    jButtonedit.setBackground(new java.awt.Color(0, 153, 255));
    jButtonedit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonedit.setText("Edit");
    jButtonedit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtoneditActionPerformed(evt);
        }
    });

    jButtondelete.setBackground(new java.awt.Color(0, 153, 255));
    jButtondelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtondelete.setText("Delete");
    jButtondelete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtondeleteActionPerformed(evt);
        }
    });

    jButtonclear.setBackground(new java.awt.Color(255, 153, 153));
    jButtonclear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonclear.setText("Clear Fields");
    jButtonclear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonclearActionPerformed(evt);
        }
    });

    jTextFieldDescription.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    jLabel83.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel83.setText("Description");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(322, 322, 322)
                            .addComponent(jButtondelete, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(jButtonedit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButtonclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel84)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel76)
                                    .addGap(50, 50, 50)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel69)
                                        .addComponent(jLabel73)
                                        .addComponent(jLabel74)
                                        .addComponent(jLabel75)
                                        .addComponent(jLabel77)
                                        .addComponent(jLabel82)
                                        .addComponent(jLabel83)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel80)
                                        .addComponent(jLabel81)
                                        .addComponent(jLabel79))))
                            .addGap(68, 68, 68)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldgid, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldGname, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                .addComponent(jTextFieldGemail)
                                .addComponent(jTextFieldGphone)
                                .addComponent(jTextFieldDOB)
                                .addComponent(jTextFieldNic, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldType, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldDescription)
                                .addComponent(jTextFieldLoyalty)))
                        .addComponent(jLabel85))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jScrollPane1)
                    .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 28, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(537, 537, 537))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jButtonrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53))))))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jLabel84)
                    .addGap(22, 22, 22)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jTextFieldgid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldGname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel77)
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel69)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel73)
                                        .addComponent(jTextFieldGphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel74)
                                        .addComponent(jTextFieldGemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(17, 17, 17)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel75)
                                        .addComponent(jTextFieldDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jTextFieldLoyalty, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel83)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel82)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGap(16, 16, 16)
                            .addComponent(jLabel85)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldNic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel79))
                            .addGap(32, 32, 32)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel80))
                            .addGap(35, 35, 35)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel81))
                            .addGap(111, 111, 111)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonedit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtondelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(1, 1, 1))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jButtonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(jButtonrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43))))
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
            .addGap(0, 32, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //get the jtable model
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        //get the selected raw indexes
        int rIndex = jTable1.getSelectedRow();

        //display data
        jTextFieldgid.setText(model.getValueAt(rIndex, 0).toString());
        jTextFieldGname.setText(model.getValueAt(rIndex, 1).toString());
        jTextFieldGphone.setText(model.getValueAt(rIndex, 2).toString());
        jTextFieldGemail.setText(model.getValueAt(rIndex, 3).toString());
        jTextFieldDOB.setText(model.getValueAt(rIndex, 4).toString());
        jTextFieldLoyalty.setText(model.getValueAt(rIndex, 5).toString());
        jTextFieldDescription.setText(model.getValueAt(rIndex, 6).toString());
        jTextFieldNic.setText(model.getValueAt(rIndex, 7).toString());
        jTextFieldPass.setText(model.getValueAt(rIndex, 8).toString());
        jTextFieldType.setText(model.getValueAt(rIndex, 9).toString());
        

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonrefreshActionPerformed
        //clear the jtable first
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"guestID", "name", "phone", "email", "dob", "loyalty", "Description", "nic", "passport", "type"} ));

        //populate the jtable
        gst.fillGuestJTable(jTable1);
    }//GEN-LAST:event_jButtonrefreshActionPerformed

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
        //get data from the fields
        String name= jTextFieldGname.getText();
        String phone= jTextFieldGphone.getText();
        String email= jTextFieldGemail.getText();
        String dob= jTextFieldDOB.getText();
        String loyalty= jTextFieldLoyalty.getText();
        String description= jTextFieldDescription.getText();
        String nic= jTextFieldNic.getText();
        String passport= jTextFieldPass.getText();
        String type = jTextFieldType.getText();

        if(name.trim().equals("")|| phone.trim().equals("")|| email.trim().equals("")|| dob.trim().equals("") || loyalty.trim().equals("")|| description.trim().equals("")|| nic.trim().equals("")|| passport.trim().equals("")|| type.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Required Fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }else{
            if(gst.addGuest(name,phone,email,dob ,loyalty,description,nic,passport,type)){
                JOptionPane.showMessageDialog(rootPane, "New Guest Added Successfully", "Add Guest", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Guest not Added", "Add Guest Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jButtoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneditActionPerformed
        //get data from the fields
        int guestID = 0;
        String name= jTextFieldGname.getText();
        String phone= jTextFieldGphone.getText();
        String email= jTextFieldGemail.getText();
        String dob= jTextFieldDOB.getText();
        String loyalty= jTextFieldLoyalty.getText();
        String description= jTextFieldDescription.getText();
        String nic= jTextFieldNic.getText();
        String passport= jTextFieldPass.getText();
        String type = jTextFieldType.getText();

        if(name.trim().equals("")|| phone.trim().equals("")|| email.trim().equals("")|| dob.trim().equals("") || loyalty.trim().equals("")|| description.trim().equals("")|| nic.trim().equals("")|| passport.trim().equals("")|| type.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "All Fields are Required", "Empty Fields", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                guestID = Integer.valueOf(jTextFieldgid.getText());
            }catch(NumberFormatException ex ){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"- Enter the Guest ID(number)","Employee ID Error ", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(gst.editGuest(guestID, name, phone, email, dob, loyalty, description, nic, passport ,type)){
            JOptionPane.showMessageDialog(rootPane, "GuestUpdateded Successfully", "Updateded Guest", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Guest not Updateded", "Updateded Guest Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtoneditActionPerformed

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        // delete the selected client
        try{
            int id = Integer.valueOf(jTextFieldgid.getText());

            if(gst.removeGuest(id)){
                JOptionPane.showMessageDialog(rootPane, "Guest Removed Successfully", "Remove Guest", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Guest not Removed", "Removed Guest Error", JOptionPane.ERROR_MESSAGE);

            }
        }catch(NumberFormatException ex ){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"- Enter the Guest ID(number)","Guest ID Error ", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        // remove text from all the jtextboxes
        jTextFieldgid.setText("");
        jTextFieldGname.setText("");
        jTextFieldGphone.setText("");
        jTextFieldGemail.setText("");
        jTextFieldDOB.setText("");
        jTextFieldLoyalty.setText("");
        jTextFieldNic.setText("");
        jTextFieldPass.setText("");
        jTextFieldType.setText("");
        
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jTextFieldGnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGnameActionPerformed

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
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guest().setVisible(true);
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
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldDOB;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldGemail;
    private javax.swing.JTextField jTextFieldGname;
    private javax.swing.JTextField jTextFieldGphone;
    private javax.swing.JTextField jTextFieldLoyalty;
    private javax.swing.JTextField jTextFieldNic;
    private javax.swing.JTextField jTextFieldPass;
    private javax.swing.JTextField jTextFieldType;
    private javax.swing.JTextField jTextFieldgid;
    // End of variables declaration//GEN-END:variables
}
