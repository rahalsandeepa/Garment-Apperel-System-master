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

public class ProfitAndLossForm extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public ProfitAndLossForm() {
        initComponents();
        
        //connect to DB
        con = DBconnect.connect();
        
        //load table
        PLtableload();
    }
    
    public void PLtableload(){
        try{
            String sql = "SELECT date, income, expenses, deposit, withdrow, fixasset, loan, profitandloss "
                    + "FROM profit_loss ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            PLTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception e){
        }   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PLExpensesbox = new javax.swing.JTextField();
        PLDepositbox = new javax.swing.JTextField();
        PLWithdrowbox = new javax.swing.JTextField();
        PLLoanbox = new javax.swing.JTextField();
        PLbox = new javax.swing.JTextField();
        PLFixAssetsbox = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PLIncomebox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        PLDatebox = new com.github.lgooddatepicker.components.DatePicker();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PLTable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Date: ");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel5.setText("Income:");
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel6.setText("Expenses:");
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel8.setText("(+)Deposit");
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel9.setText("(-)Withdrow");
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel10.setText("Fix Assets:");
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel12.setText("Loan:");
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jButton6.setText("GENARATE REPORT");
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setText("ADD");
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("UPDATE");
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("DELETE");
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Bank Details:");
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jButton1.setText("Profit & Loss");
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setText("DEMO");
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(27, 27, 27)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(28, 28, 28)
                                    .addComponent(PLbox))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PLWithdrowbox)
                                        .addComponent(PLExpensesbox)
                                        .addComponent(PLDepositbox)))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(PLDatebox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(PLLoanbox))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(PLFixAssetsbox))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(PLIncomebox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(PLDatebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PLIncomebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PLExpensesbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(PLDepositbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(PLWithdrowbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(PLFixAssetsbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(PLLoanbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PLbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(jButton7))
                .addGap(20, 20, 20)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        PLTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "date", "income", "expenses", "deposit", "withdrow", "fixassets", "loan", "profit&loss"
            }
        ));
        PLTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PLTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PLTable);

        jButton4.setText("SEARCH");
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Date:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PROFIT & LOSS DETAILS", jPanel2);

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
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String pldate = PLDatebox.getText();
        String plincome = PLIncomebox.getText();
        String plexpenses = PLExpensesbox.getText();
        String pldeposit = PLDepositbox.getText();
        String plwithdrow = PLWithdrowbox.getText();
        String plfixAssets = PLFixAssetsbox.getText();
        String plloan = PLLoanbox.getText();
        String pldetails = PLbox.getText();
        
        if(pldate.equals("")){
            JOptionPane.showMessageDialog(null, "Enter profit and loss of the date.");
        }
        else if(plincome.equals("")){
            JOptionPane.showMessageDialog(null, "Enter the income amount at profit and loss.");
        }
        else if(plexpenses.equals("")){
            JOptionPane.showMessageDialog(null, "Enter the expenses amount at profit and loss.");
        }
        else if(pldeposit.equals("")){
            JOptionPane.showMessageDialog(null, "Enter the deposit amount at profit and loss.");
        }
        else if(plwithdrow.equals("")){
            JOptionPane.showMessageDialog(null, "Enter the withdrow amount at profit and loss.");
        }
        else if(plfixAssets.equals("")){
            JOptionPane.showMessageDialog(null, "Enter the fix assets amount at profit and loss.");
        }
        else if(plloan.equals("")){
            JOptionPane.showMessageDialog(null, "Enter the loan amount at profit and loss.");
        }
        
        try{
            String q = "INSERT INTO profit_loss (date, income, expenses, deposit, withdrow, fixasset, loan, profitandloss) "
                    + "values( '"+pldate+"', '"+plincome+"', '"+plexpenses+"', '"+pldeposit+"', '"+plwithdrow+"', '"+plfixAssets+"', '"+plloan+"', '"+pldetails+"') ";
            pst = con.prepareStatement(q);
            pst.execute();
            //load table
            PLtableload();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PLTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PLTableMouseClicked
        int r = PLTable.getSelectedRow();
        
        String pldate = PLTable.getValueAt(r, 0).toString();
        String plincome = PLTable.getValueAt(r, 1).toString();
        String plexpenses = PLTable.getValueAt(r, 2).toString();
        String pldeposit = PLTable.getValueAt(r, 3).toString();
        String plwithdrow = PLTable.getValueAt(r, 4).toString();
        String plfixAssets = PLTable.getValueAt(r, 5).toString();
        String plloan = PLTable.getValueAt(r, 6).toString();
        String pldetails = PLTable.getValueAt(r, 7).toString();

        PLDatebox.setText(pldate);
        PLIncomebox.setText(plincome);
        PLExpensesbox.setText(plexpenses);
        PLDepositbox.setText(pldeposit);
        PLWithdrowbox.setText(plwithdrow);
        PLFixAssetsbox.setText(plfixAssets);
        PLLoanbox.setText(plloan);
        PLbox.setText(pldetails);
    }//GEN-LAST:event_PLTableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       int x = JOptionPane.showConfirmDialog(null, "Do you really want to UPDATE");
        if(x==0){
            String pldate = PLDatebox.getText();
            String plincome = PLIncomebox.getText();
            String plexpenses = PLExpensesbox.getText();
            String pldeposit = PLDepositbox.getText();
            String plwithdrow = PLWithdrowbox.getText();
            String plfixAssets = PLFixAssetsbox.getText();
            String plloan = PLLoanbox.getText();
            String pldetails = PLbox.getText();
        
            try{
                String q = "UPDATE profit_loss "
                        + "SET income='"+plincome+"', expenses='"+plexpenses+"', deposit='"+pldeposit+"', withdrow='"+plwithdrow+"', fixasset='"+plfixAssets+"', loan='"+plloan+"', profitandloss='"+pldetails+"' "
                        + "WHERE date='"+pldate+"' ";
                pst = con.prepareStatement(q);
                pst.execute();
                //load table
                PLtableload(); 
            }
            catch(Exception e){   
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int x = JOptionPane.showConfirmDialog(null,"Do you want to DELETE this");
        if(x==0){
            String pldate = PLDatebox.getText();
        
            String q ="DELETE from profit_loss "
                    + "WHERE date='"+pldate+"' ";
            try{
                pst = con.prepareStatement(q);
                pst.execute();
                //load table
                PLtableload();
            }
            catch(Exception e){
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String pldate = searchbox.getText();
        
        String q = "SELECT date, income, expenses, deposit, withdrow, fixasset, loan, profitandloss "
                + "FROM profit_loss "
                + "WHERE date='"+pldate+"' ";       
        try{
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            PLTable.setModel(DbUtils.resultSetToTableModel(rs));    
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int pl1,pl2,pl3,pl4,pl5,pl6,pl7,plTotal;
        pl1=Integer.parseInt(PLIncomebox.getText());
        pl2=Integer.parseInt(PLExpensesbox.getText());
        pl3=Integer.parseInt(PLDepositbox.getText());
        pl4=Integer.parseInt(PLWithdrowbox.getText());
        pl5=Integer.parseInt(PLFixAssetsbox.getText());
        pl6=Integer.parseInt(PLLoanbox.getText());
        plTotal = pl1-pl2+pl3-pl4-pl5-pl6;
        String plTotal1 = String.valueOf(plTotal);
        PLbox.setText(plTotal1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
            PLTable.print();
        }
        catch(PrinterException e){
        Logger.getLogger(registerAcademic.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Demo button
        PLDatebox.setText("2019-10-01");
        PLIncomebox.setText("10000");
        PLExpensesbox.setText("10000");
        PLDepositbox.setText("10000");
        PLWithdrowbox.setText("10000");
        PLFixAssetsbox.setText("10000");
        PLLoanbox.setText("10000");
        PLbox.setText("10000");
        
    }//GEN-LAST:event_jButton7ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfitAndLossForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker PLDatebox;
    private javax.swing.JTextField PLDepositbox;
    private javax.swing.JTextField PLExpensesbox;
    private javax.swing.JTextField PLFixAssetsbox;
    private javax.swing.JTextField PLIncomebox;
    private javax.swing.JTextField PLLoanbox;
    private javax.swing.JTable PLTable;
    private javax.swing.JTextField PLWithdrowbox;
    private javax.swing.JTextField PLbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField searchbox;
    // End of variables declaration//GEN-END:variables

}
