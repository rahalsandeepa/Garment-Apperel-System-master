
package view;

import Code.AutoGenerator;
import Code.DBconnection;
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class salary extends javax.swing.JFrame {

    Connection con3 = null;
    PreparedStatement pst = null;
    ResultSet res = null;
    private Object JOpptionPane;
    
    public salary() {
        initComponents();
        //connect to db
        con3 = DBconnection.connect();
        
        //load table
        tableload();
    }
    
    public void tableload(){
        
        try{
            String sql = "SELECT SalaryID,EmpID,Allowance,OTrate,OThours,BasicSalary,EPF_8,NetSalary,EPF_12,ETF_3 FROM salary";
            pst = con3.prepareStatement(sql);
            res = pst.executeQuery();
            
            jTable2.setModel(DbUtils.resultSetToTableModel(res));
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
        basicbox = new javax.swing.JTextField();
        otratebox = new javax.swing.JTextField();
        netlabel = new javax.swing.JLabel();
        epflabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        allowancebox = new javax.swing.JTextField();
        otbox = new javax.swing.JTextField();
        empidbox = new javax.swing.JTextField();
        salarybox = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        etflabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        epflabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        basicbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basicboxActionPerformed(evt);
            }
        });
        basicbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                basicboxKeyPressed(evt);
            }
        });

        otratebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                otrateboxKeyPressed(evt);
            }
        });

        netlabel.setText("Amount");

        epflabel1.setText("Amount");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Salary ID     :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Employee ID :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Allowance     :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("OT rate       :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("OT Hours     :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("EPF  (8%)   :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Basic salary  :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("Net salary    :");

        allowancebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                allowanceboxKeyPressed(evt);
            }
        });

        otbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                otboxKeyPressed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        etflabel.setText("Amount");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Company Contribution");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("ETF  (3%)    :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("EPF  (12%)     :");

        epflabel2.setText("Amount");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton8.setText("Demo");
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
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(otbox, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                    .addComponent(otratebox)
                                    .addComponent(allowancebox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(epflabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(etflabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton8)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(empidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(728, 728, 728)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(825, 825, 825)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(111, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(51, 51, 51)
                                .addComponent(salarybox, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel8))
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(basicbox, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(epflabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(netlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton8)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(salarybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(basicbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(empidbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(epflabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allowancebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(netlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(otratebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(epflabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(otbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etflabel)
                            .addComponent(jLabel7))
                        .addGap(108, 220, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton4))
                        .addGap(93, 93, 93))))
        );

        jTabbedPane1.addTab("   Salary   ", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton6.setText("Report");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton7.setText("Refresh");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(586, 586, 586)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(jButton3))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton6)
                .addContainerGap(36, Short.MAX_VALUE))
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
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void basicboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basicboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_basicboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String salaryID = salarybox.getText();
        String empid = empidbox.getText();
        double allowance =  Double.parseDouble(allowancebox.getText());
        double otrate =  Double.parseDouble(otratebox.getText());
        int othours =  Integer.parseInt(otbox.getText());
        double basics =  Double.parseDouble(basicbox.getText());
        
        double epf1 = (basics/100)*8;
            epflabel1.setText(String.valueOf(epf1));
        
        double netsalary = allowance + basics +(otrate*othours) - epf1;
            netlabel.setText(String.valueOf(netsalary));
            
        double epf2 = (basics/100)*12;
            epflabel2.setText(String.valueOf(epf2));
            
        double etf = (basics/100)*3;
            etflabel.setText(String.valueOf(etf));
            
        
        
        
        if(salaryID.equals("")){
            JOptionPane.showMessageDialog(null, "Salary ID is required");
        }
        else if(empid.equals("")){
            JOptionPane.showMessageDialog(null, "Employee ID is required");
        }
        else if (allowancebox.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Allowance is required");
        }
        else if(otratebox.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "OT rate is required");
        }
        else if(otbox.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "OT Hours is required");
        }
        else if(basicbox.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Basic Salary is required");
        }
        else if (!(Pattern.matches("^[S]{1}+[0-9]{3}+$", salarybox.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid Salary ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!(Pattern.matches("^[E]{1}+[0-9]{3}+$", empidbox.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid Employee ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        else{
            try{
                String em = "INSERT INTO salary(SalaryID,EmpID,Allowance,OTrate,OThours,BasicSalary,EPF_8,NetSalary,EPF_12,ETF_3) values('"+salaryID+"','"+empid+"','"+allowance+"','"+otrate+"','"+othours+"','"+basics+"','"+epf1+"','"+netsalary+"','"+epf2+"','"+etf+"')";
                pst = con3.prepareStatement(em);
                pst.execute();
                tableload();
            }
            catch (Exception e){
                System.out.println(e);
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
        int r =  jTable2.getSelectedRow();
        
        String salaryID = jTable2.getValueAt(r,0).toString();
        String empid = jTable2.getValueAt(r,1).toString();
        String allowance = jTable2.getValueAt(r,2).toString();
        String otrate = jTable2.getValueAt(r,3).toString();
        String othours = jTable2.getValueAt(r,4).toString();
        String basics = jTable2.getValueAt(r,5).toString();
        String epf1 = jTable2.getValueAt(r,6).toString();
        String netsalary= jTable2.getValueAt(r,7).toString();
        String epf2 = jTable2.getValueAt(r,8).toString();
        String etf = jTable2.getValueAt(r,9).toString();
        
        salarybox.setText(salaryID);
        empidbox.setText(empid);
        allowancebox.setText(allowance);
        otratebox.setText(otrate);
        otbox.setText(othours);
        basicbox.setText(basics);
        epflabel1.setText(epf1);
        netlabel.setText(netsalary);
        epflabel2.setText(epf2);
        etflabel.setText(etf);
        
        
  
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
        String salaryID = salarybox.getText();
        String empid = empidbox.getText();
        double allowance =  Double.parseDouble(allowancebox.getText());
        double otrate =  Double.parseDouble(otratebox.getText());
        int othours =  Integer.parseInt(otbox.getText());
        double basics =  Double.parseDouble(basicbox.getText());
        
        double epf1 = (basics/100)*8;
            epflabel1.setText(String.valueOf(epf1));
        
        double netsalary = allowance + basics +(otrate*othours) - epf1;
            netlabel.setText(String.valueOf(netsalary));
            
        double epf2 = (basics/100)*12;
            epflabel2.setText(String.valueOf(epf2));
            
        double etf = (basics/100)*3;
            etflabel.setText(String.valueOf(etf));
            
            
        if(salaryID.equals("")){
            JOptionPane.showMessageDialog(null, "Salary ID is required");
        }
        else if(empid.equals("")){
            JOptionPane.showMessageDialog(null, "Employee ID is required");
        }
        else if (allowancebox.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Allowance is required");
        }
        else if(otratebox.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "OT rate is required");
        }
        else if(otbox.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "OT Hours is required");
        }
        else if(basicbox.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Basic Salary is required");
        }
        else if (!(Pattern.matches("^[S]{1}+[0-9]{3}+$", salarybox.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid Salary ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!(Pattern.matches("^[E]{1}+[0-9]{3}+$", empidbox.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid Employee ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int x = JOptionPane.showConfirmDialog(null, "Do you really want to update?");
       
            if(x==0){
            
            
           
                String sq = "UPDATE salary SET SalaryID = '"+salaryID+"',EmpID = '"+empid+"',Allowance = '"+allowance+"',OTrate = '"+otrate+"',OThours = '"+othours+"',BasicSalary = '"+basics+"',EPF_8 = '"+epf1+"',NetSalary = '"+netsalary+"',EPF_12 = '"+epf2+"',ETF_3 = '"+etf+"' where SalaryID = '"+salaryID+"'";

                try{
                    pst = con3.prepareStatement(sq);
                    pst.execute();

                    tableload();
                }
                catch (Exception e){

                }
            }
           
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
        String salaryID = salarybox.getText();
           
            if(salaryID.equals("")){
                JOptionPane.showMessageDialog(null, "Salary ID is required");
            }
            else{
                int x = JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
        
                if(x==0){
           
                    String sql = "DELETE from salary where salaryID = '"+salaryID+"' ";

                    try{
                        pst = con3.prepareStatement(sql);
                        pst.execute();

                        tableload();
                    }
                    catch (Exception e){

                    }
               }
            } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String search = searchbox.getText();
        
        String sql = "Select SalaryID,EmpID,Allowance,OTrate,OThours,BasicSalary,EPF_8,NetSalary,EPF_12,ETF_3 FROM salary where salaryID LIKE '%"+search+"%' ";
        
        
        try{
            pst = con3.prepareStatement(sql);
            res = pst.executeQuery();
        
            jTable2.setModel(DbUtils.resultSetToTableModel(res));
        
     
        }
        
            catch (Exception e){
            
        }
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        salarybox.setText("");
        empidbox.setText("");
        allowancebox.setText(""); 
        otratebox.setText("");
        otbox.setText("");
        basicbox.setText("");
        epflabel1.setText("");
        netlabel.setText("");
        epflabel2.setText("");
        etflabel.setText("");
        
        
        searchbox.setText("");
        
        tableload();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       try{
            jTable2.print();
        }
        catch (Exception e){
            
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void allowanceboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_allowanceboxKeyPressed
        String allowance = allowancebox.getText();
        
        int length = allowance.length();
        
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>= '0' && evt.getKeyChar()<= '9'){
            if(length < 9){
                allowancebox.setEditable(true);
            }
            else{
                allowancebox.setEditable(false);
            }
                
        }
        else{
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                allowancebox.setEditable(true);
            }
            else{
                allowancebox.setEditable(false);
            }
        }
    }//GEN-LAST:event_allowanceboxKeyPressed

    private void otrateboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otrateboxKeyPressed
        String otrate = otratebox.getText();
        
        int length = otrate.length();
        
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>= '0' && evt.getKeyChar()<= '9'){
            if(length < 5){
                otratebox.setEditable(true);
            }
            else{
                otratebox.setEditable(false);
            }
                
        }
        else{
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                otratebox.setEditable(true);
            }
            else{
                otratebox.setEditable(false);
            }
        }
    }//GEN-LAST:event_otrateboxKeyPressed

    private void otboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otboxKeyPressed
        String ot = otbox.getText();
        
        int length = ot.length();
        
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>= '0' && evt.getKeyChar()<= '9'){
            if(length < 2){
                otbox.setEditable(true);
            }
            else{
                otbox.setEditable(false);
            }
                
        }
        else{
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                otbox.setEditable(true);
            }
            else{
                otbox.setEditable(false);
            }
        }
    }//GEN-LAST:event_otboxKeyPressed

    private void basicboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_basicboxKeyPressed
        String basic = basicbox.getText();
        
        int length = basic.length();
        
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>= '0' && evt.getKeyChar()<= '9'){
            if(length < 9){
                basicbox.setEditable(true);
            }
            else{
                basicbox.setEditable(false);
            }
                
        }
        else{
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                basicbox.setEditable(true);
            }
            else{
                basicbox.setEditable(false);
            }
        }
    }//GEN-LAST:event_basicboxKeyPressed

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchboxActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        salarybox.setText("");
        empidbox.setText("");
        allowancebox.setText(""); 
        otratebox.setText("");
        otbox.setText("");
        basicbox.setText("");
        epflabel1.setText("");
        netlabel.setText("");
        epflabel2.setText("");
        etflabel.setText("");
        
        
        searchbox.setText("");
        
        tableload();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        salarybox.setText("S000");
        empidbox.setText("E000");
        allowancebox.setText("2000"); 
        otratebox.setText("200");
        otbox.setText("2");
        basicbox.setText("30000");
        epflabel1.setText("3200");
        netlabel.setText("28500");
        epflabel2.setText("4000");
        etflabel.setText("1200");
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
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salary().setVisible(true);
            }
        });
    }
    private void GenerateSupplierID(){
        AutoGenerator aid = new AutoGenerator();
        
        salarybox.setText(aid.generate("S",""));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField allowancebox;
    private javax.swing.JTextField basicbox;
    private javax.swing.JTextField empidbox;
    private javax.swing.JLabel epflabel1;
    private javax.swing.JLabel epflabel2;
    private javax.swing.JLabel etflabel;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel netlabel;
    private javax.swing.JTextField otbox;
    private javax.swing.JTextField otratebox;
    private javax.swing.JTextField salarybox;
    private javax.swing.JTextField searchbox;
    // End of variables declaration//GEN-END:variables
}
