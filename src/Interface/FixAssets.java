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

public class FixAssets extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public FixAssets() {
        initComponents();
        
        //connect to DB
        con = DBconnect.connect();
        
        //load table
        fixassetstableload();
    }
    
    public void fixassetstableload(){
    
        try{
        String sql = "SELECT fixassetsno, fixassetstype, fixassetsdate, fixassetsdep, fixassetsdeprate, fixassetsaccdep, cost FROM fixassets ";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        fixasstesTable.setModel(DbUtils.resultSetToTableModel(rs));
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fixassetsnobox = new javax.swing.JTextField();
        fixassetstypebox = new javax.swing.JTextField();
        fixassetsdepbox = new javax.swing.JTextField();
        fixassetsdepratebox = new javax.swing.JTextField();
        fixassetsaccdepbox = new javax.swing.JTextField();
        costbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        fixassetsdatebox = new com.github.lgooddatepicker.components.DatePicker();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fixasstesTable = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Fix Assets No:");
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel4.setText("Fix Assets Type:");
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel5.setText("Depreaciation Rate:");
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel6.setText("Depreaciation:");
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel7.setText("Accumulate Depreaciation:");
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

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

        jButton3.setText("DELETE");
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setText("Cost:");
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel2.setText("Date:");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jButton4.setText("DEMO");
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("GENARATE REPORT");
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fixassetsaccdepbox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(fixassetsdepratebox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fixassetsdepbox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fixassetstypebox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fixassetsnobox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(costbox)
                            .addComponent(fixassetsdatebox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fixassetsnobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fixassetstypebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fixassetsdatebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fixassetsdepbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fixassetsdepratebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fixassetsaccdepbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(costbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        fixasstesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fix Assets No", "Fix Assets Type", "Date", "Depreaciation", "Rate", "Accumulate"
            }
        ));
        fixasstesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fixasstesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(fixasstesTable);

        jButton6.setText("SEARCH");
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setText("Fix assets No:");
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("FIX ASSETS", jPanel2);

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
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String no = fixassetsnobox.getText();
        String type = fixassetstypebox.getText();
        String date = fixassetsdatebox.getText();
        String dep = fixassetsdepbox.getText();
        String deprate = fixassetsdepratebox.getText();
        String accdep = fixassetsaccdepbox.getText();
        String cost = costbox.getText();
        
        if(no.equals("")){
            JOptionPane.showMessageDialog(null, "Enter fixassets no.");
        }
        else if(type.equals("")){
            JOptionPane.showMessageDialog(null, "Enter fixassets type.");
        }
        else if(date.equals("")){
            JOptionPane.showMessageDialog(null, "Enter fixassets date.");
        }
        else if(dep.equals("")){
            JOptionPane.showMessageDialog(null, "Enter fixassets description.");
        }
        else if(deprate.equals("")){
            JOptionPane.showMessageDialog(null, "Enter fixassets description rate.");
        }
        else if(accdep.equals("")){
            JOptionPane.showMessageDialog(null, "Enter fixassets accumulate description.");
        }
        else if(cost.equals("")){
            JOptionPane.showMessageDialog(null, "Enter fixassets cost.");
        }
        
        try{
            String q = "INSERT INTO fixassets (fixassetsno, fixassetstype, fixassetsdate, fixassetsdep, fixassetsdeprate, fixassetsaccdep, cost) values('"+no+"', '"+type+"','"+date+"', '"+dep+"','"+deprate+"', '"+accdep+"','"+cost+"')";
            pst = con.prepareStatement(q);
            pst.execute();
            //load table
            fixassetstableload();
        }
        catch(Exception e){   
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fixasstesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fixasstesTableMouseClicked
        int r = fixasstesTable.getSelectedRow();
        
        String no = fixasstesTable.getValueAt(r, 0).toString();
        String type = fixasstesTable.getValueAt(r, 1).toString();
        String date = fixasstesTable.getValueAt(r, 2).toString();
        String dep = fixasstesTable.getValueAt(r, 3).toString();
        String deprate = fixasstesTable.getValueAt(r, 4).toString();
        String accdep = fixasstesTable.getValueAt(r, 5).toString();
        String cost = fixasstesTable.getValueAt(r, 6).toString();
        
        fixassetsnobox.setText(no);
        fixassetstypebox.setText(type);
        fixassetsdatebox.setText(date);
        fixassetsdepbox.setText(dep);
        fixassetsdepratebox.setText(deprate);
        fixassetsaccdepbox.setText(accdep);
        costbox.setText(cost);
        
    }//GEN-LAST:event_fixasstesTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Do you want to UPDATE");
        
        if(x==0){
            String no = fixassetsnobox.getText();
            String type = fixassetstypebox.getText();
            String date = fixassetsdatebox.getText();
            String dep = fixassetsdepbox.getText();
            String deprate = fixassetsdepratebox.getText();
            String accdep = fixassetsaccdepbox.getText();
            String cost = costbox.getText(); 
        
            try{
                String q = "UPDATE fixassets SET  fixassetstype = '"+type+"', fixassetsdate = '"+date+"', fixassetsdep = '"+dep+"', fixassetsdeprate = '"+deprate+"', fixassetsaccdep = '"+accdep+"', cost = '"+cost+"' WHERE fixassetsno = '"+no+"' ";
                pst = con.prepareStatement(q);
                pst.execute();
                //load table
                fixassetstableload();
            }
            catch(Exception e){
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int x = JOptionPane.showConfirmDialog(null,"Do you want to DELETE this");
        if(x==0){
            String no = fixassetsnobox.getText();
        
            String q ="DELEte from fixassets where fixassetsno = '"+no+"' ";
            try{
                pst = con.prepareStatement(q);
                pst.execute();
                //load table
                fixassetstableload();
            }
            catch(Exception e){
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String no = searchbox.getText();
        
        String q = "SELECT fixassetsno, fixassetstype, fixassetsdate, fixassetsdep, fixassetsdeprate, fixassetsaccdep, cost FROM fixassets where fixassetsno ='"+no+"'";
        try{
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            fixasstesTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Demo button
        fixassetsnobox.setText("FNo111");
        fixassetstypebox.setText("building");
        fixassetsdatebox.setText("2019-10-01");
        fixassetsdepbox.setText("1000");
        fixassetsdepratebox.setText("2");
        fixassetsaccdepbox.setText("1000");
        costbox.setText("1000");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // GENARATE REPORT
        try{
            fixasstesTable.print();
        }
        catch(PrinterException e){
        Logger.getLogger(registerAcademic.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]){

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FixAssets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField costbox;
    private javax.swing.JTextField fixassetsaccdepbox;
    private com.github.lgooddatepicker.components.DatePicker fixassetsdatebox;
    private javax.swing.JTextField fixassetsdepbox;
    private javax.swing.JTextField fixassetsdepratebox;
    private javax.swing.JTextField fixassetsnobox;
    private javax.swing.JTextField fixassetstypebox;
    private javax.swing.JTable fixasstesTable;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField searchbox;
    // End of variables declaration//GEN-END:variables
}
