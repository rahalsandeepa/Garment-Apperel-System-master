
package view;

import Code.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class leave extends javax.swing.JFrame {

    Connection con2 = null;
    PreparedStatement pst = null;
    ResultSet res = null;
    private Object JOpptionPane;
   
    public leave() {
        initComponents();
        
        //connect to db
        con2 = DBconnection.connect();
        
        //load table
        tableload();
    }
    
    public void tableload(){
        
        try{
            String sql = "SELECT LeaveID,No_of_Days,Type,RequestDate,StartDate,EndDate,Approval,EmpID,Reason FROM leaves";
            pst = con2.prepareStatement(sql);
            res = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(res));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        reasonbox = new javax.swing.JTextField();
        approvalbox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        lidbox = new javax.swing.JTextField();
        nodaysbox = new javax.swing.JTextField();
        typebox = new javax.swing.JTextField();
        empidbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        reqdatebox = new com.github.lgooddatepicker.components.DatePicker();
        startbox = new com.github.lgooddatepicker.components.DatePicker();
        endbox = new com.github.lgooddatepicker.components.DatePicker();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        approvalbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YES", "NO" }));
        approvalbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvalboxActionPerformed(evt);
            }
        });

        jLabel9.setText("Start Date         :");
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        lidbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lidboxActionPerformed(evt);
            }
        });

        empidbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empidboxActionPerformed(evt);
            }
        });

        jLabel1.setText("Leave ID    :");
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel2.setText("No of Days :");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel3.setText("Type         :");
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel4.setText("Approval      :");
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel5.setText("Reason        :");
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel6.setText("Employee ID         :");
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel7.setText("Requested Date :");
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel8.setText("End Date          :");
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jButton1.setText("Insert");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Refresh");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton8.setText("Demo");
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reasonbox)
                        .addGap(104, 104, 104))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(approvalbox, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(nodaysbox, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(typebox)))))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(empidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton8)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel8))
                                            .addComponent(jLabel7))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(reqdatebox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(startbox, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(endbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGap(104, 104, 104)))))
                .addGap(9, 9, 9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton8)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lidbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(reqdatebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nodaysbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(startbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(endbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(approvalbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(empidbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(reasonbox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("   Leaves    ", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton6.setText("Report");
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setText("Search");
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Refresh");
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(585, 585, 585))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(jButton3))
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButton6)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("   Report   ", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int r =  jTable1.getSelectedRow();
        
       
        String leaveID = jTable1.getValueAt(r,0).toString();
        String nodays = jTable1.getValueAt(r,1).toString();
        String type = jTable1.getValueAt(r,2).toString();
 
        String reqdate = reqdatebox.getDateStringOrEmptyString();
        
        String startdate = startbox.getDateStringOrEmptyString();
        
        String enddate = endbox.getDateStringOrEmptyString();
            
        String approval = jTable1.getValueAt(r,6).toString();
        String empid = jTable1.getValueAt(r,7).toString();
        String reason = jTable1.getValueAt(r,8).toString();
        
        
      
        
        lidbox.setText(leaveID);
        nodaysbox.setText(nodays);
        typebox.setText(type);
        reqdatebox.setText(reqdate);
        startbox.setText(startdate);
        endbox.setText(enddate);
        approvalbox.setSelectedItem(approval);
        empidbox.setText(empid);
        reasonbox.setText(reason);
        
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String search = searchbox.getText();
        
        String sql = "Select LeaveID,No_of_Days,Type,RequestDate,StartDate,EndDate,Approval,EmpID,Reason from leaves where LeaveID LIKE '%"+search+"%' ";
        
        
        try{
            pst = con2.prepareStatement(sql);
            res = pst.executeQuery();
        
            jTable1.setModel(DbUtils.resultSetToTableModel(res));
        
     
        }
        
            catch (Exception e){
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
            jTable1.print();
        }
        catch (Exception e){
            
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        lidbox.setText("");
        nodaysbox.setText("");
        typebox.setText("");

        reasonbox.setText("");
        empidbox.setText("");
        reqdatebox.setText("");
        startbox.setText("");
        endbox.setText("");

        searchbox.setText("");

        tableload();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String leaveID = lidbox.getText();

        if(leaveID.equals("")){
            JOptionPane.showMessageDialog(null, "Leave ID is required");
        }

        else{
            int x = JOptionPane.showConfirmDialog(null, "Do you really want to delete?");

            if(x==0){

                String sql = "DELETE from leaves where LeaveID = '"+leaveID+"' ";

                try{
                    pst = con2.prepareStatement(sql);
                    pst.execute();

                    tableload();
                }
                catch (Exception e){

                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String leaveID = lidbox.getText();
        String nodays = nodaysbox.getText();
        String type = typebox.getText();

        String reqdate = reqdatebox.getDateStringOrEmptyString();

        String startdate = reqdatebox.getDateStringOrEmptyString();

        String enddate = reqdatebox.getDateStringOrEmptyString();

        String approval = approvalbox.getSelectedItem().toString();
        String empid = empidbox.getText();
        String reason = reasonbox.getText();

        if(leaveID.equals("")){
            JOptionPane.showMessageDialog(null, "Leave ID is required");
        }
        else if(nodays.equals("")){
            JOptionPane.showMessageDialog(null, "No of Days is required");
        }
        else if(type.equals("")){
            JOptionPane.showMessageDialog(null, "Type is required");
        }
        else if(reqdate.equals("")){
            JOptionPane.showMessageDialog(null, "Request date is required");
        }
        else if(startdate.equals("")){
            JOptionPane.showMessageDialog(null, "Start date is required");
        }
        else if(enddate.equals("")){
            JOptionPane.showMessageDialog(null, "End date is required");
        }
        else if(approval.equals("")){
            JOptionPane.showMessageDialog(null, "Approval is required");
        }
        else if(empid.equals("")){
            JOptionPane.showMessageDialog(null, "Employee ID is required");
        }
        else if(reason.equals("")){
            JOptionPane.showMessageDialog(null, "Reason is required");
        }
        else if (!(Pattern.matches("^[E]{1}+[0-9]{3}+$", empidbox.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid Employee ID", "Error", JOptionPane.ERROR_MESSAGE);
        }

        else{

            int x = JOptionPane.showConfirmDialog(null, "Do you really want to update?");

            if(x==0){

                String sq = "UPDATE leaves SET LeaveID = '"+leaveID+"',No_of_Days = '"+nodays+"',Type = '"+type+"',RequestDate = '"+reqdate+"',StartDate = '"+startdate+"',EndDate = '"+enddate+"',Approval = '"+approval+"',EmpID = '"+empid+"',Reason = '"+reason+"' where LeaveID = '"+leaveID+"'";

                try{
                    pst = con2.prepareStatement(sq);
                    pst.execute();

                    tableload();
                }
                catch (Exception e){

                }
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String leaveID = lidbox.getText();
        String nodays = nodaysbox.getText();
        String type = typebox.getText();

        String reqdate = reqdatebox.getDateStringOrEmptyString();

        String startdate = reqdatebox.getDateStringOrEmptyString();

        String enddate = reqdatebox.getDateStringOrEmptyString();

        String approval = approvalbox.getSelectedItem().toString();
        String empid = empidbox.getText();
        String reason = reasonbox.getText();

        if(leaveID.equals("")){
            JOptionPane.showMessageDialog(null, "Leave ID is required");
        }
        else if(nodays.equals("")){
            JOptionPane.showMessageDialog(null, "No of Days is required");
        }
        else if(type.equals("")){
            JOptionPane.showMessageDialog(null, "Type is required");
        }
        else if(reqdate.equals("")){
            JOptionPane.showMessageDialog(null, "Request date is required");
        }
        else if(startdate.equals("")){
            JOptionPane.showMessageDialog(null, "Start date is required");
        }
        else if(enddate.equals("")){
            JOptionPane.showMessageDialog(null, "End date is required");
        }
        else if(approval.equals("")){
            JOptionPane.showMessageDialog(null, "Approval is required");
        }
        else if(empid.equals("")){
            JOptionPane.showMessageDialog(null, "Employee ID is required");
        }
        else if(reason.equals("")){
            JOptionPane.showMessageDialog(null, "Reason is required");
        }
        else if (!(Pattern.matches("^[E]{1}+[0-9]{3}+$", empidbox.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid Employee ID", "Error", JOptionPane.ERROR_MESSAGE);
        }

        else{
            try{
                String em = "INSERT INTO leaves(LeaveID,No_of_Days,Type,RequestDate,StartDate,EndDate,Approval,EmpID,Reason) values('"+leaveID+"','"+nodays+"','"+type+"','"+reqdate+"','"+startdate+"','"+enddate+"','"+approval+"','"+empid+"','"+reason+"')";
                pst = con2.prepareStatement(em);
                pst.execute();
                tableload();
            }
            catch (Exception e){
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void empidboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empidboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empidboxActionPerformed

    private void approvalboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvalboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_approvalboxActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        lidbox.setText("");
        nodaysbox.setText("");
        typebox.setText("");

        reasonbox.setText("");
        empidbox.setText("");
        reqdatebox.setText("");
        startbox.setText("");
        endbox.setText("");

        searchbox.setText("");

        tableload();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void lidboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lidboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lidboxActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        lidbox.setText("000");
        nodaysbox.setText("5");
        typebox.setText("Official");

        reasonbox.setText("Fever");
        empidbox.setText("E000");
        reqdatebox.setText("September 1, 2019");
        startbox.setText("September 2, 2019");
        endbox.setText("September 3, 2019");
    }//GEN-LAST:event_jButton8ActionPerformed

   
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
            java.util.logging.Logger.getLogger(leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new leave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox approvalbox;
    private javax.swing.JTextField empidbox;
    private com.github.lgooddatepicker.components.DatePicker endbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lidbox;
    private javax.swing.JTextField nodaysbox;
    private javax.swing.JTextField reasonbox;
    private com.github.lgooddatepicker.components.DatePicker reqdatebox;
    private javax.swing.JTextField searchbox;
    private com.github.lgooddatepicker.components.DatePicker startbox;
    private javax.swing.JTextField typebox;
    // End of variables declaration//GEN-END:variables
}
