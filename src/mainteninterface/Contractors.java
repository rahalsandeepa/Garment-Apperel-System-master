package mainteninterface;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import javaapplication1.JavaApplication1;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Contractors extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
   
    public Contractors () {
        initComponents();
        
        con = JavaApplication1.connect();
        
        contractorParttableload();
    }
    public void contractorParttableload(){
        try{
            String sql = "SELECT ContractorId, ContractorName, Phone, Email, Address, Date FROM jobcontractor";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            contractable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contractable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idcbox = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        namecbox = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        phonecbox = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        emailcbox = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        addresscbox = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        datecbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        contractable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Contractor ID", "Contractor Name", "Phone", "E-Mail", "Address", "Date"
            }
        ));
        contractable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contractableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(contractable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Contractors Form");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setText("Contractors ID");

        idcbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idcboxActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel13.setText("Contractors Name");

        namecbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namecboxActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel14.setText("Phone");

        phonecbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonecboxActionPerformed(evt);
            }
        });
        phonecbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonecboxKeyPressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel17.setText("E-Mail");

        emailcbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailcboxActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel18.setText("Address");

        addresscbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresscboxActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel15.setText("Date");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setText("DEMO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(phonecbox, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idcbox, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailcbox)
                                    .addComponent(addresscbox)
                                    .addComponent(datecbox)
                                    .addComponent(namecbox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(idcbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(namecbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(phonecbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailcbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(addresscbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datecbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addGap(123, 123, 123))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Contractors", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namecboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namecboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namecboxActionPerformed

    private void phonecboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonecboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonecboxActionPerformed

    private void emailcboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailcboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailcboxActionPerformed

    private void addresscboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresscboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresscboxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int x = JOptionPane.showConfirmDialog(null, "Do you want to update");
        
        if(x==0){
        String id = idcbox.getText();
        String name = namecbox.getText();
        String phone = phonecbox.getText();
        String email = emailcbox.getText();
        String address = addresscbox.getText();
        String date = datecbox.getText();
        
        
        if(id.equals(" ")){
            JOptionPane.showMessageDialog(null, "Enter the Id:");
        }
        else if(name.equals(" ")){
            JOptionPane.showMessageDialog(null, "Enter the name:");
        }
        else if(phone.equals(" ")){
            JOptionPane.showMessageDialog(null, "Enter the phone:");
        }
        else if(email.equals(" ")){
            JOptionPane.showMessageDialog(null, "Enter the E-Mail:");
        }
        else if(date.equals(" ")){
            JOptionPane.showMessageDialog(null, "Enter the Date:");
        }
        else if (!(Pattern.matches("^[0-9]{9}+$", phonecbox.getText()))) {

                JOptionPane.showMessageDialog(null, "Please enter a valid Mobile Number", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", emailcbox.getText()))) {

                JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
        
        
         try{
                String sql = "UPDATE jobcontractor SET ContractorId='"+id+"', ContractorName='"+name+"', Phone='"+phone+"', Email='"+email+"', Address='"+address+"', Date='"+date+"' where ContractorId = '"+id+"' ";           
                pst = con.prepareStatement(sql);
                pst.execute();
                contractorParttableload();
            }
            catch(Exception e){
            }   
        } 
       }
        
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       int x =JOptionPane.showConfirmDialog(null,"Do you want to delete this");
       if(x==0){
           String id = idcbox.getText();
           
           String sql = "DELETE FROM jobcontractor where ContractorId = '"+id+"' ";
           try{
               pst = con.prepareStatement(sql);
               pst.execute();
               contractorParttableload();
           }
           catch(Exception e){
               
           }
       }
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        
        
        String id = idcbox.getText();
        String name = namecbox.getText();
        String phone = phonecbox.getText();
        String email = emailcbox.getText();
        String address = addresscbox.getText();
        String date = datecbox.getText();
        
        if(id.equals(" ")){
            JOptionPane.showMessageDialog(null, "Enter the Id:");
        }
        else if(name.equals(" ")){
            JOptionPane.showMessageDialog(null, "Enter the name:");
        }
        else if(phone.equals(" ")){
            JOptionPane.showMessageDialog(null, "Enter the phone:");
        }
        else if(email.equals(" ")){
            JOptionPane.showMessageDialog(null, "Enter the E-Mail:");
        }
        else if(date.equals(" ")){
            JOptionPane.showMessageDialog(null, "Enter the Date:");
        }
        else if (!(Pattern.matches("^[0-9]{9}+$", phonecbox.getText()))) {

                JOptionPane.showMessageDialog(null, "Please enter a valid Mobile Number", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", emailcbox.getText()))) {

                JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
        
        
        
        
        
        
        try{
            String sql ="INSERT INTO jobcontractor(ContractorId, ContractorName, Phone, Email, Address, Date) value('"+id+"', '"+name+"', '"+phone+"', '"+email+"', '"+address+"', '"+date+"')";
            pst = con.prepareStatement(sql);
            pst.execute();
            contractorParttableload();
            
            idcbox.setText("");
            namecbox.setText("");
            phonecbox.setText("");
            emailcbox.setText("");
            addresscbox.setText("");
            datecbox.setText("");
              
        }
        catch(Exception e){
        }
       }
    }            
        
        
         
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contractors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
*/
    private void contractableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contractableMouseClicked
        // TODO add your handling code here:
        int r = contractable.getSelectedRow();
        
        String id = contractable.getValueAt(r, 0).toString();
        String name = contractable.getValueAt(r, 1).toString();
        String phone = contractable.getValueAt(r, 2).toString();
        String email = contractable.getValueAt(r, 3).toString();
        String address = contractable.getValueAt(r, 4).toString();
        String date = contractable.getValueAt(r, 5).toString();
       
        
        idcbox.setText(id);
        namecbox.setText(name);
        phonecbox.setText(phone);
        emailcbox.setText(email);
        addresscbox.setText(address);
        datecbox.setText(date);
        
    }//GEN-LAST:event_contractableMouseClicked

    private void idcboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idcboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idcboxActionPerformed

    private void phonecboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonecboxKeyPressed
        
        String mobilenum = phonecbox.getText();

        int length = mobilenum.length();

        char c = evt.getKeyChar();

        if(evt.getKeyChar()>= '0' && evt.getKeyChar()<= '9'){
            if(length < 9){
                phonecbox.setEditable(true);
            }
            else{
                phonecbox.setEditable(false);
            }

        }
        else{
            if(evt.getExtendedKeyCode()== KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                phonecbox.setEditable(true);
            }
            else{
                phonecbox.setEditable(false);
            }
        }
    }//GEN-LAST:event_phonecboxKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        idcbox.setText("0750");
        namecbox.setText("Pasan");
        phonecbox.setText("0775379871");
        emailcbox.setText("isurusasantha@gmail.com");
        addresscbox.setText("Wathupitiwala,Nittambuwa");
        datecbox.setText("2019/02/03");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       idcbox.setText("");
        namecbox.setText("");
        phonecbox.setText("");
        emailcbox.setText("");
        addresscbox.setText("");
        datecbox.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Contractors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contractors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contractors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contractors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Contractors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contractors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contractors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contractors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new Contractors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresscbox;
    private javax.swing.JTable contractable;
    private javax.swing.JTextField datecbox;
    private javax.swing.JTextField emailcbox;
    private javax.swing.JTextField idcbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField namecbox;
    private javax.swing.JTextField phonecbox;
    // End of variables declaration//GEN-END:variables

   // private void contractorParttableload() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
   // }

}

