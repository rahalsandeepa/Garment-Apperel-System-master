package Interface;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mycode.DBconnect;
import net.proteanit.sql.DbUtils;

public class LoanDetails extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public LoanDetails() {
        initComponents();
        
        //connect to DB
        con = DBconnect.connect();
        
        //load table
        loantableload();
    }
    
    public void loantableload(){    
        try{
            String sql = "SELECT loanbankname, loanbranchname, loanaccountno, loandate, loanperiod, loanamount, loanmonthinterest, loanpaymonth "
                    + " FROM loan";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            loanTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        loanpaymonthbox = new javax.swing.JTextField();
        loanmonthinterestbox = new javax.swing.JTextField();
        loanamountbox = new javax.swing.JTextField();
        loanbranchnamebox = new javax.swing.JTextField();
        loanaccountnobox = new javax.swing.JTextField();
        loanperiodbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        loanbanknamebox = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        loandatebox = new com.github.lgooddatepicker.components.DatePicker();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loanTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 360));

        jLabel2.setText("Bank Name:");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel3.setText("Branch Name:");
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel4.setText("Account No:");
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel5.setText("Date:");
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel6.setText("Loan Period:");
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel7.setText("Loan Amount:");
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel8.setText("Month Interest:");
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel9.setText("Payment for Month:");
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        loanpaymonthbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        loanmonthinterestbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        loanamountbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        loanbranchnamebox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        loanaccountnobox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        loanperiodbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setText("ADD");
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UPDATE");
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("DELETE");
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        loanbanknamebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sampath Bank", "NTB Bank", "Commercial Bank", "NDB bank", "BOC Bank", " ", " " }));
        loanbanknamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanbanknameboxActionPerformed(evt);
            }
        });

        jButton5.setText("DEMO");
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("GENARATE REPORT");
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel6)))
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(loanamountbox)
                                .addComponent(loanperiodbox)
                                .addComponent(loanaccountnobox)
                                .addComponent(loanbranchnamebox)
                                .addComponent(loanbanknamebox, 0, 200, Short.MAX_VALUE)
                                .addComponent(loanmonthinterestbox)
                                .addComponent(loandatebox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(loanpaymonthbox)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(loanbanknamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(loanbranchnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(loanaccountnobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(loandatebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(loanperiodbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(loanamountbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(loanmonthinterestbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(loanpaymonthbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        loanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Bank Name", "Branch Name", "Account No", "Date", "Period", "Amount", "Interest", "Month"
            }
        ));
        loanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(loanTable);

        jButton3.setText("SEARCH");
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Account No:");
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("LOAN DETAILS", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loanbanknameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanbanknameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loanbanknameboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String bankname = loanbanknamebox.getSelectedItem().toString();
        String branchname = loanbranchnamebox.getText();
        String accountno = loanaccountnobox.getText();
        String date = loandatebox.getText();
        String period = loanperiodbox.getText();
        String amount = loanamountbox.getText();
        String monthinterest = loanmonthinterestbox.getText();
        String paymonth = loanpaymonthbox.getText();
        
        if(bankname.equals("")){
            JOptionPane.showMessageDialog(null, "Enter loan bank name.");
        }
        else if(branchname.equals("")){
            JOptionPane.showMessageDialog(null, "Enter loan branch name.");
        }
        else if(accountno.equals("")){
            JOptionPane.showMessageDialog(null, "Enter loan account no.");
        }
        else if(date.equals("")){
            JOptionPane.showMessageDialog(null, "Enter loan date.");
        }
        else if(period.equals("")){
            JOptionPane.showMessageDialog(null, "Enter loan period.");
        }
        else if(amount.equals("")){
            JOptionPane.showMessageDialog(null, "Enter loan amount.");
        }
        else if(monthinterest.equals("")){
            JOptionPane.showMessageDialog(null, "Enter loan month interest.");
        }
        else if(paymonth.equals("")){
            JOptionPane.showMessageDialog(null, "Enter loan paymonth.");
        }
        
        try{
            String q = "INSERT INTO loan (loanbankname, loanbranchname, loanaccountno, loandate, loanperiod, loanamount, loanmonthinterest, loanpaymonth) "
                    + "values('"+bankname+"', '"+branchname+"','"+accountno+"', '"+date+"','"+period+"' ,'"+amount+"', '"+monthinterest+"','"+paymonth+"')";
            pst = con.prepareStatement(q);
            pst.execute();
            //load table
            loantableload();
        }
        catch(Exception e){   
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanTableMouseClicked
        int r =  loanTable.getSelectedRow();
        
        String bankname = loanTable.getValueAt(r, 0).toString();
        String branchname = loanTable.getValueAt(r, 1).toString();
        String accountno = loanTable.getValueAt(r, 2).toString();
        String date = loanTable.getValueAt(r, 3).toString();
        String period = loanTable.getValueAt(r, 4).toString();
        String amount = loanTable.getValueAt(r, 5).toString();
        String monthinterest = loanTable.getValueAt(r, 6).toString();
        String paymonth = loanTable.getValueAt(r, 7).toString();
        
        loanbanknamebox.setSelectedItem(bankname);
        loanbranchnamebox.setText(branchname);
        loanaccountnobox.setText(accountno);
        loandatebox.setText(date);
        loanperiodbox.setText(period);
        loanamountbox.setText(amount);
        loanmonthinterestbox.setText(monthinterest);
        loanpaymonthbox.setText(paymonth);
        
    }//GEN-LAST:event_loanTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to UPDATE");
        if(x==0){
            String bankname = loanbanknamebox.getSelectedItem().toString();
            String branchname = loanbranchnamebox.getText();
            String accountno = loanaccountnobox.getText();
            String date = loandatebox.getText();
            String period = loanperiodbox.getText();
            String amount = loanamountbox.getText();
            String monthinterest = loanmonthinterestbox.getText();
            String paymonth = loanpaymonthbox.getText();
            
            try{
                String q = "UPDATE loan "
                        + "SET loanbankname='"+bankname+"', loanbranchname='"+branchname+"', loandate='"+date+"', loanperiod='"+period+"', loanamount='"+amount+"', loanmonthinterest='"+monthinterest+"', loanpaymonth='"+paymonth+"' "
                        + "WHERE loanaccountno='"+accountno+"' ";
                pst = con.prepareStatement(q);
                pst.execute();
                //load table
                loantableload();
            }
            catch(Exception e){   
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int x = JOptionPane.showConfirmDialog(null,"Do you want to DELETE this");
        if(x==0){
            String accountno = loanaccountnobox.getText();
        
            String q ="DELETE from loan "
                    + "WHERE loanaccountno='"+accountno+"' ";
            try{
                pst = con.prepareStatement(q);
                pst.execute();
                //load table
                loantableload();
            }
            catch(Exception e){
            } 
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String accountno = searchbox.getText();
        
        String q = "SELECT loanbankname, loanbranchname, loanaccountno, loandate, loanperiod, loanamount, loanmonthinterest, loanpaymonth "
                + "FROM loan "
                + "WHERE loanaccountno ='"+accountno+"' ";
        try{
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            loanTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Demo button
        loanbanknamebox.setSelectedItem("NTB Bamk");
        loanbranchnamebox.setText("malabe");
        loanaccountnobox.setText("110011");
        loandatebox.setText("2019-10-01");
        loanperiodbox.setText("3");
        loanamountbox.setText("10000");
        loanmonthinterestbox.setText("2");
        loanpaymonthbox.setText("3");
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // GENARATE REPORT
        try{
            loanTable.print();
        }
        catch(PrinterException e){
        Logger.getLogger(registerAcademic.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable loanTable;
    private javax.swing.JTextField loanaccountnobox;
    private javax.swing.JTextField loanamountbox;
    private javax.swing.JComboBox loanbanknamebox;
    private javax.swing.JTextField loanbranchnamebox;
    private com.github.lgooddatepicker.components.DatePicker loandatebox;
    private javax.swing.JTextField loanmonthinterestbox;
    private javax.swing.JTextField loanpaymonthbox;
    private javax.swing.JTextField loanperiodbox;
    private javax.swing.JTextField searchbox;
    // End of variables declaration//GEN-END:variables
}
