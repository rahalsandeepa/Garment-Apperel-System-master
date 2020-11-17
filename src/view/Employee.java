

package view;

import Code.AutoGenerator;
import Code.DBconnection;
import com.sun.glass.events.KeyEvent;
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


public class Employee extends javax.swing.JFrame {

    Connection con1 = null;
    PreparedStatement pst = null;
    ResultSet res = null;
    private Object JOpptionPane;
    
    public Employee() {
        initComponents();
        
        //connect to db
        con1 = DBconnection.connect();
        
        //load table
        tableload();
        
        //AutoGenerator
        GenerateSupplierID();
    }
    
    public void tableload(){
        
        try{
            String sql = "SELECT EmpID,FirstName,LastName,Gender,Nationality,DeptID,Date_of_Birth,NIC,MobileNo,Address,Email FROM employee";
            pst = con1.prepareStatement(sql);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        mailbox = new javax.swing.JTextField();
        lnamebox = new javax.swing.JTextField();
        genderbox = new javax.swing.JComboBox();
        deptidbox = new javax.swing.JComboBox();
        nationbox = new javax.swing.JComboBox();
        addressbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        empidbox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fnamebox = new javax.swing.JTextField();
        nicbox = new javax.swing.JTextField();
        mobilebox = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        dobbox = new com.github.lgooddatepicker.components.DatePicker();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        genderbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        genderbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderboxActionPerformed(evt);
            }
        });

        deptidbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "D401", "D402", "D403", "D404", "D405", "D406", "D407" }));

        nationbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sinhala", "Tamil", "Muslim" }));

        jLabel1.setText("Employee Id");
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jButton1.setText("Insert");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jButton2.setText("Update");
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Last Name");
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel4.setText("NIC");
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jButton4.setText("Refresh");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Mobile NO   ");
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel6.setText("Address");
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel7.setText("E-mail");
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel8.setText("Gender");
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel9.setText("Nationality");
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel10.setText("Dep ID");
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel11.setText("DOB");
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        mobilebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobileboxKeyPressed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(255, 255, 255))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mailbox)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nicbox, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mobilebox, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addressbox))
                .addGap(211, 211, 211))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(genderbox, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(nationbox, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(deptidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(dobbox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGap(113, 113, 113))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(420, 420, 420))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButton8)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(empidbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(genderbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptidbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nationbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nicbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobilebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(addressbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1390, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("   Employee   ", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(428, 428, 428)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 201, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(572, 572, 572)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton7)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton6)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("   Report   ", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r =  jTable1.getSelectedRow();
        
       
        String empid = jTable1.getValueAt(r,0).toString();
        String fname = jTable1.getValueAt(r,1).toString();
        String lname = jTable1.getValueAt(r,2).toString();
        String gender = jTable1.getValueAt(r,3).toString();
        String nation = jTable1.getValueAt(r,4).toString();
        String deptid = jTable1.getValueAt(r,5).toString();
        
        String date = jTable1.getValueAt(r, 6).toString();
            
        String nic = jTable1.getValueAt(r,7).toString();
        String mobile = jTable1.getValueAt(r,8).toString();
        String address = jTable1.getValueAt(r,9).toString();
        String mail = jTable1.getValueAt(r,10).toString();
        
        
        empidbox.setText(empid);
        fnamebox.setText(fname);
        lnamebox.setText(lname);
        genderbox.setSelectedItem(gender);
        nationbox.setSelectedItem(nation);
        deptidbox.setSelectedItem(deptid);
        dobbox.setText(date);
        nicbox.setText(nic);
        mobilebox.setText(mobile);
        addressbox.setText(address);
        mailbox.setText(mail);
    }//GEN-LAST:event_jTable1MouseClicked

    private void mobileboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileboxKeyPressed

        String mobilenum = mobilebox.getText();

        int length = mobilenum.length();

        char c = evt.getKeyChar();

        if(evt.getKeyChar()>= '0' && evt.getKeyChar()<= '9'){
            if(length < 12){
                mobilebox.setEditable(true);
            }
            else{
                mobilebox.setEditable(false);
            }

        }
        else{
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                mobilebox.setEditable(true);
            }
            else{
                mobilebox.setEditable(false);
            }
        }

    }//GEN-LAST:event_mobileboxKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
            jTable1.print();
        }
        catch (Exception e){

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String search = searchbox.getText();

        String sql = "Select EmpID,FirstName,LastName,Gender,Nationality,DeptID,Date_of_Birth,NIC,MobileNo,Address,Email from employee where EmpID LIKE '%"+search+"%' ";

        try{
            pst = con1.prepareStatement(sql);
            res = pst.executeQuery();

            jTable1.setModel(DbUtils.resultSetToTableModel(res));

        }

        catch (Exception e){

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        empidbox.setText("");
        fnamebox.setText("");
        lnamebox.setText("");
        dobbox.setDate(null);
        nicbox.setText("");
        mobilebox.setText("");
        addressbox.setText("");
        mailbox.setText("");
        searchbox.setText("");

        tableload();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String empid = empidbox.getText();

        if(empid.equals("")){
            JOptionPane.showMessageDialog(null, "Employee ID is required");
        }
        else{
            int x = JOptionPane.showConfirmDialog(null, "Do you really want to delete?");

            if(x==0){
                String sql = "DELETE from employee where EmpID = '"+empid+"' ";

                try{
                    pst = con1.prepareStatement(sql);
                    pst.execute();

                    tableload();
                }
                catch (Exception e){

                }
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String empid = empidbox.getText();
        String fname = fnamebox.getText();
        String lname = lnamebox.getText();
        String gender = genderbox.getSelectedItem().toString();
        String nation = nationbox.getSelectedItem().toString();
        String deptid = deptidbox.getSelectedItem().toString();

        String date = dobbox.getDateStringOrEmptyString();


        String nic = nicbox.getText();
        String mobile = mobilebox.getText();
        String address = addressbox.getText();
        String mail = mailbox.getText();

        if(empid.equals("")){
            JOptionPane.showMessageDialog(null, "Employee ID is required");

        }
        else if(fname.equals("")){
            JOptionPane.showMessageDialog(null, "First Name is required");

        }
        else if(lname.equals("")){
            JOptionPane.showMessageDialog(null, "Last Name is required");

        }
        else if(gender.equals("")){
            JOptionPane.showMessageDialog(null, "Gender is required");

        }
        else if(nation.equals("")){
            JOptionPane.showMessageDialog(null, "Nationallity is required");

        }
        else if(deptid.equals("")){
            JOptionPane.showMessageDialog(null, "Department ID is required");

        }
        else if(date.equals("")){
            JOptionPane.showMessageDialog(null, "Date of Birth is required");

        }
        else if(nic.equals("")){
            JOptionPane.showMessageDialog(null, "NIC is required");

        }
        else if(mobile.equals("")){
            JOptionPane.showMessageDialog(null, "MObile Number is required");

        }
        else if(address.equals("")){
            JOptionPane.showMessageDialog(null, "Address is required");

        }
        else if(mail.equals("")){
            JOptionPane.showMessageDialog(null, "Email is required");
        }

        else if (!(Pattern.matches("^[a-zA-Z]+$", fnamebox.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid Name", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!(Pattern.matches("^[a-zA-Z]+$", lnamebox.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid Name", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", mailbox.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!(Pattern.matches("^[0-9]{9}+$", mobilebox.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid Mobile Number", "Error", JOptionPane.ERROR_MESSAGE);
        }

        else{
            int x = JOptionPane.showConfirmDialog(null, "Do you really want to update?");

            if(x==0){

                String sq = "UPDATE employee SET EmpID = '"+empid+"',FirstName = '"+fname+"',LastName = '"+lname+"',Gender = '"+gender+"',Nationality = '"+nation+"',DeptID = '"+deptid+"',Date_of_Birth = '"+date+"',NIC = '"+nic+"',MobileNo = '"+mobile+"',Address = '"+address+"',Email = '"+mail+"' where EmpID = '"+empid+"'";

                try{
                    pst = con1.prepareStatement(sq);
                    pst.execute();

                    tableload();
                }
                catch (Exception e){

                }
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        String empid = empidbox.getText();
        String fname = fnamebox.getText();
        String lname = lnamebox.getText();
        String gender = genderbox.getSelectedItem().toString();
        String nation = nationbox.getSelectedItem().toString();
        String deptid = deptidbox.getSelectedItem().toString();

        String date = dobbox.getDateStringOrEmptyString();

        String nic = nicbox.getText();
        String mobile = mobilebox.getText();
        String address = addressbox.getText();
        String mail = mailbox.getText();

        if(empid.equals("")){
            JOptionPane.showMessageDialog(null, "Employee ID is required");
        }
        else if(fname.equals("")){
            JOptionPane.showMessageDialog(null, "First Name is required");
        }
        else if(lname.equals("")){
            JOptionPane.showMessageDialog(null, "Last Name is required");
        }
        else if(gender.equals("")){
            JOptionPane.showMessageDialog(null, "Gender is required");
        }
        else if(nation.equals("")){
            JOptionPane.showMessageDialog(null, "Nationality is required");
        }
        else if(deptid.equals("")){
            JOptionPane.showMessageDialog(null, "Department ID is required");
        }
        else if(date.equals("")){
            JOptionPane.showMessageDialog(null, "Date of Birth is required");
        }
        else if(nic.equals("")){
            JOptionPane.showMessageDialog(null, "NIC is required");
        }
        else if(mobile.equals("")){
            JOptionPane.showMessageDialog(null, "Moblie No. is required");
        }
        else if(address.equals("")){
            JOptionPane.showMessageDialog(null, "Address is required");
        }
        else if(mail.equals("")){
            JOptionPane.showMessageDialog(null, "E-mail is required");
        }
        else if (!(Pattern.matches("^[E]{1}+[0-9]{3}+$", empidbox.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid Employee ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!(Pattern.matches("^[a-zA-Z]+$", fnamebox.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid Name", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!(Pattern.matches("^[a-zA-Z]+$", lnamebox.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid Name", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", mailbox.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!(Pattern.matches("^[0-9]{9}+$", mobilebox.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid Mobile Number", "Error", JOptionPane.ERROR_MESSAGE);
        }

        else{
            try{
                String em = "INSERT INTO employee(EmpID,FirstName,LastName,Gender,Nationality,DeptID,Date_of_Birth,NIC,MobileNo,Address,Email) values('"+empid+"','"+fname+"','"+lname+"','"+gender+"','"+nation+"','"+deptid+"','"+date+"','"+nic+"','"+mobile+"','"+address+"','"+mail+"')";
                pst = con1.prepareStatement(em);
                pst.execute();
                tableload();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void genderboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderboxActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        empidbox.setText("");
        fnamebox.setText("");
        lnamebox.setText("");
        dobbox.setText("");
        nicbox.setText("");
        mobilebox.setText("");
        addressbox.setText("");
        mailbox.setText("");
        searchbox.setText("");

        tableload();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        empidbox.setText("E001");
        fnamebox.setText("Mahela");
        lnamebox.setText("Jayawardana");
        dobbox.setText("September 4, 2019");
        nicbox.setText("990551255V");
        mobilebox.setText("779291222");
        addressbox.setText("Borella,Colombo 07");
        mailbox.setText("abc@gmail.com");
        
    }//GEN-LAST:event_jButton8ActionPerformed

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
    
     private void GenerateSupplierID()
    {
        AutoGenerator aid = new AutoGenerator();
        
        empidbox.setText(aid.generate("E",""));
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressbox;
    private javax.swing.JComboBox deptidbox;
    private com.github.lgooddatepicker.components.DatePicker dobbox;
    private javax.swing.JTextField empidbox;
    private javax.swing.JTextField fnamebox;
    private javax.swing.JComboBox genderbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lnamebox;
    private javax.swing.JTextField mailbox;
    private javax.swing.JTextField mobilebox;
    private javax.swing.JComboBox nationbox;
    private javax.swing.JTextField nicbox;
    private javax.swing.JTextField searchbox;
    // End of variables declaration//GEN-END:variables
}
