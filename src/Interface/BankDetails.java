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

public class BankDetails extends javax.swing.JFrame {  
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public BankDetails() {
        initComponents();
        
        //connect to DB
        con = DBconnect.connect();
        
        //load table
        deposittableload();
        withdrowtableload();
    }
    
    public void deposittableload(){
        try{
            String sql = "SELECT depositno, depositcustomerID, depositbankname, depositbranchname, depositdate, depositamount "
                    + "FROM deposit ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            depositTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception e){
        }   
    }
    
    public void withdrowtableload(){
        try{
            String sql = "SELECT withdrowno, withdrowcustomerID, withdrowbankname, withdrowbranchname, withdrowdate, withdrowamount "
                    + "FROM withdrow ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            withdrowTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception e){
        }   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        withdrownobox = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        withdrowbanknamebox = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        withdrowbranchnamebox = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        withdrowdateamountbox = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        withdrowcustomerIDbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        withdrowdatebox = new com.github.lgooddatepicker.components.DatePicker();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        withdrowTable = new javax.swing.JTable();
        jButton21 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        depositnobox = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        depositcustomerIDbox = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        depositbranchnamebox = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        depositbanknamebox = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        depositdateamountbox = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        depositdatebox = new com.github.lgooddatepicker.components.DatePicker();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        depositTable = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel22.setText("Withdrow No:");
        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        withdrownobox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        withdrownobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrownoboxActionPerformed(evt);
            }
        });

        jLabel23.setText("Bank Name:");
        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        withdrowbanknamebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sampath Bank", "NTB Bank", "Commercial Bank", "NDB bank", "BOC Bank", " " }));
        withdrowbanknamebox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel24.setText("Branch Name:");
        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        withdrowbranchnamebox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel25.setText("Date:");
        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel26.setText("Amount:");
        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        withdrowdateamountbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton19.setText("ADD");
        jButton19.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("UPDATE");
        jButton20.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton22.setText("DELETE");
        jButton22.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jLabel27.setText("Customer ID:");
        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jButton1.setText("DEMO");
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("GENARATE REPORT");
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(withdrownobox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jButton19)
                                .addGap(18, 18, 18)
                                .addComponent(jButton20)
                                .addGap(18, 18, 18)
                                .addComponent(jButton22)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(withdrowbranchnamebox, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(withdrowdateamountbox)
                                        .addComponent(withdrowdatebox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(withdrowbanknamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(withdrowcustomerIDbox)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(withdrownobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(withdrowcustomerIDbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(withdrowbanknamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(withdrowbranchnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(withdrowdatebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(withdrowdateamountbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19)
                    .addComponent(jButton20)
                    .addComponent(jButton22)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));

        withdrowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Withdrow No", "Customer ID", "Bank Name", "Branch Name", "Date", "Amount"
            }
        ));
        withdrowTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrowTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(withdrowTable);

        jButton21.setText("SEARCH");
        jButton21.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLabel2.setText("Withdrow No:");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton21)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("WITHDROW DETAILS", jPanel2);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setText("Deposit No:");
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        depositnobox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        depositnobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositnoboxActionPerformed(evt);
            }
        });

        jLabel16.setText("Customer ID:");
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        depositcustomerIDbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        depositcustomerIDbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositcustomerIDboxActionPerformed(evt);
            }
        });

        jLabel17.setText("Bank Name:");
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel18.setText("Branch Name:");
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        depositbranchnamebox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        depositbranchnamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositbranchnameboxActionPerformed(evt);
            }
        });

        jLabel19.setText("Date:");
        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        depositbanknamebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sampath Bank", "NTB Bank", "Commercial Bank", "NDB bank", "BOC Bank", " " }));
        depositbanknamebox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel20.setText("Amount:");
        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        depositdateamountbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton13.setText("ADD");
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("UPDATE");
        jButton14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton16.setText("DELETE");
        jButton16.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton2.setText("DEMO");
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("GENARATE REPORT");
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(depositbranchnamebox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depositbanknamebox, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                            .addComponent(depositcustomerIDbox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depositdateamountbox)
                            .addComponent(depositnobox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depositdatebox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14)
                        .addGap(18, 18, 18)
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositnobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(depositcustomerIDbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(depositbanknamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(depositbranchnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(depositdatebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(depositdateamountbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton16)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        depositTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Deposit No", "Customer ID", "Bank Name", "Branch Nmae", "Date", "Amount"
            }
        ));
        depositTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(depositTable);

        jButton15.setText("SEARCH");
        jButton15.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel1.setText("Deposit No:");
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
                        .addComponent(jButton15)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("DEPOSIT DETAILS", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depositnoboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositnoboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositnoboxActionPerformed

    private void depositbranchnameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositbranchnameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositbranchnameboxActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        int x =  JOptionPane.showConfirmDialog(null,"Do you really want to UPDATE");
      
        if(x==0){
            String dno = depositnobox.getText();
            String dcustomerID = depositcustomerIDbox.getText();
            String dbankname = depositbanknamebox.getSelectedItem().toString();
            String dbranchname = depositbranchnamebox.getText();
            String ddate = depositdatebox.getText();
            String damount = depositdateamountbox.getText();
      
            try{
            String q = "UPDATE deposit "
                    + "SET depositcustomerID='"+dcustomerID+"', depositbankname='"+dbankname+"', depositbranchname='"+dbranchname+"', depositdate='"+ddate+"', depositamount='"+damount+"' "
                    + "WHERE depositno='"+dno+"' ";
                pst = con.prepareStatement(q);
                pst.execute();
                //load table
                deposittableload();
            }
            catch(Exception e){
            }
        }        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String dno = searchbox.getText();
        
        String q = "SELECT depositno, depositcustomerID, depositbankname, depositbranchname, depositdate, depositamount "
                + "FROM deposit "
                + "WHERE depositno='"+dno+"' ";
        try{
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            depositTable.setModel(DbUtils.resultSetToTableModel(rs));     
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int x = JOptionPane.showConfirmDialog(null,"Do you want to DELETE this");
        if(x==0){
            String dno = depositnobox.getText();
        
            String q ="DELETE from deposit "
                    + "WHERE depositno='"+dno+"' ";
            try{
                pst = con.prepareStatement(q);
                pst.execute();
                //load table
                deposittableload();
            }
            catch(Exception e){
            }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void withdrownoboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrownoboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrownoboxActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        int x =  JOptionPane.showConfirmDialog(null,"Do you really want to UPDATE");
      
        if(x==0){
            String wno = withdrownobox.getText();
            String wcustomerID = withdrowcustomerIDbox.getText();
            String wbankname = withdrowbanknamebox.getSelectedItem().toString();
            String wbranchname = withdrowbranchnamebox.getText();
            String wdate = withdrowdatebox.getText();
            String wamount = withdrowdateamountbox.getText();
      
            try{
            String q = "UPDATE withdrow "
                    + "SET withdrowcustomerID='"+wcustomerID+"', withdrowbankname='"+wbankname+"', withdrowbranchname='"+wbranchname+"', withdrowdate='"+wdate+"', withdrowamount='"+wamount+"' "
                    + "WHERE withdrowno='"+wno+"' ";
                pst = con.prepareStatement(q);
                pst.execute();
                //load table
                withdrowtableload();
            }
            catch(Exception e){
            }
      }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void depositcustomerIDboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositcustomerIDboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositcustomerIDboxActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String dno = depositnobox.getText();
        String dcustomerID = depositcustomerIDbox.getText();
        String dbankname = depositbanknamebox.getSelectedItem().toString();
        String dbranchname = depositbranchnamebox.getText();
        String ddate = depositdatebox.getText();
        String damount = depositdateamountbox.getText();
        
        if(dno.equals("")){
            JOptionPane.showMessageDialog(null, "Enter deposit no.");
        }
        else if(dcustomerID.equals("")){
            JOptionPane.showMessageDialog(null, "Enter deposit customer ID.");
        }
        else if(dbankname.equals("")){
            JOptionPane.showMessageDialog(null, "Enter deposit bank name.");
        }
        else if(dbranchname.equals("")){
            JOptionPane.showMessageDialog(null, "Enter deposit branch name.");
        }
        else if(ddate.equals("")){
            JOptionPane.showMessageDialog(null, "Enter deposit date.");
        }
        else if(damount.equals("")){
            JOptionPane.showMessageDialog(null, "Enter deposit amount.");
        }
        
        try{
            String q = "INSERT INTO deposit (depositno, depositcustomerID, depositbankname, depositbranchname, depositdate, depositamount) "
                    + "values('"+dno+"', '"+dcustomerID+"','"+dbankname+"', '"+dbranchname+"','"+ddate+"','"+damount+"')";
            pst = con.prepareStatement(q);
            pst.execute();
            //load table
            deposittableload();
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        String wno = withdrownobox.getText();
        String wcustomerID = withdrowcustomerIDbox.getText();
        String wbankname = withdrowbanknamebox.getSelectedItem().toString();
        String wbranchname = withdrowbranchnamebox.getText();
        String wdate = withdrowdatebox.getText();
        String wamount = withdrowdateamountbox.getText();
        
        if(wno.equals("")){
            JOptionPane.showMessageDialog(null, "Enter withdrow no.");
        }
        else if(wcustomerID.equals("")){
            JOptionPane.showMessageDialog(null, "Enter withdrow customer ID.");
        }
        else if(wbankname.equals("")){
            JOptionPane.showMessageDialog(null, "Enter withdrow bank name.");
        }
        else if(wbranchname.equals("")){
            JOptionPane.showMessageDialog(null, "Enter withdrow branch name.");
        }
        else if(wdate.equals("")){
            JOptionPane.showMessageDialog(null, "Enter withdrow date.");
        }
        else if(wamount.equals("")){
            JOptionPane.showMessageDialog(null, "Enter withdrow amount.");
        }
        
        try{
            String q = "INSERT INTO withdrow (withdrowno, withdrowcustomerID, withdrowbankname, withdrowbranchname, withdrowdate, withdrowamount) "
                    + "values('"+wno+"', '"+wcustomerID+"','"+wbankname+"', '"+wbranchname+"','"+wdate+"','"+wamount+"')";
            pst = con.prepareStatement(q);
            pst.execute();
            //load table
            withdrowtableload();
        }
        catch(Exception e){   
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void depositTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositTableMouseClicked
        int r = depositTable.getSelectedRow();
        
        String wno = depositTable.getValueAt(r, 0).toString();
        String wcustomerID = depositTable.getValueAt(r, 1).toString();
        String wbankname = depositTable.getValueAt(r, 2).toString();
        String wbranchname = depositTable.getValueAt(r, 3).toString();
        String wdate = depositTable.getValueAt(r, 4).toString();
        String wamount = depositTable.getValueAt(r, 5).toString();
        
        depositnobox.setText(wno);
        depositcustomerIDbox.setText(wcustomerID);
        depositbanknamebox.setSelectedItem(wbankname);
        depositbranchnamebox.setText(wbranchname);
        depositdatebox.setText(wdate);
        depositdateamountbox.setText(wamount);
    }//GEN-LAST:event_depositTableMouseClicked

    private void withdrowTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrowTableMouseClicked
        int r = withdrowTable.getSelectedRow();
        
        String dno = withdrowTable.getValueAt(r, 0).toString();
        String dcustomerID = withdrowTable.getValueAt(r, 1).toString();
        String dbankname = withdrowTable.getValueAt(r, 2).toString();
        String dbranchname = withdrowTable.getValueAt(r, 3).toString();
        String ddate = withdrowTable.getValueAt(r, 4).toString();
        String damount = withdrowTable.getValueAt(r, 5).toString();
        
        withdrownobox.setText(dno);
        withdrowcustomerIDbox.setText(dcustomerID);
        withdrowbanknamebox.setSelectedItem(dbankname);
        withdrowbranchnamebox.setText(dbranchname);
        withdrowdatebox.setText(ddate);
        withdrowdateamountbox.setText(damount);
    }//GEN-LAST:event_withdrowTableMouseClicked

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        int x = JOptionPane.showConfirmDialog(null,"Do you want to DELETE this");
        if(x==0){
            String wno = withdrownobox.getText();
        
            String q ="DELETE from withdrow "
                    + "WHERE withdrowno='"+wno+"' ";
            try{
                pst = con.prepareStatement(q);
                pst.execute();
                //load table
                withdrowtableload();
            }
            catch(Exception e){
            }
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        String wno = searchbox.getText();
        
        String q = "SELECT withdrowno, withdrowcustomerID, withdrowbankname, withdrowbranchname, withdrowdate, withdrowamount "
                + "FROM withdrow "
                + "WHERE withdrowno='"+wno+"' ";
        try{
            pst = con.prepareStatement(q);
            rs = pst.executeQuery();
            withdrowTable.setModel(DbUtils.resultSetToTableModel(rs));     
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Demo button
        withdrownobox.setText("WNo111");
        withdrowcustomerIDbox.setText("2001");
        withdrowbanknamebox.setSelectedItem("NTB Bank");
        withdrowbranchnamebox.setText("kaduwela");
        withdrowdatebox.setText("2019-10-01");
        withdrowdateamountbox.setText("1000");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Demo button
        depositnobox.setText("DNo111");
        depositcustomerIDbox.setText("1001");
        depositbanknamebox.setSelectedItem("Sampath bank");
        depositbranchnamebox.setText("malabe");
        depositdatebox.setText("2019-10-01");
        depositdateamountbox.setText("10000");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // GENARATE REPORT
        try{
            depositTable.print();
        }
        catch(PrinterException e){
        Logger.getLogger(registerAcademic.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // GENARATE REPORT
        try{
            withdrowTable.print();
        }
        catch(PrinterException e){
        Logger.getLogger(registerAcademic.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(BankDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable depositTable;
    private javax.swing.JComboBox depositbanknamebox;
    private javax.swing.JTextField depositbranchnamebox;
    private javax.swing.JTextField depositcustomerIDbox;
    private javax.swing.JTextField depositdateamountbox;
    private com.github.lgooddatepicker.components.DatePicker depositdatebox;
    private javax.swing.JTextField depositnobox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField searchbox;
    private javax.swing.JTable withdrowTable;
    private javax.swing.JComboBox withdrowbanknamebox;
    private javax.swing.JTextField withdrowbranchnamebox;
    private javax.swing.JTextField withdrowcustomerIDbox;
    private javax.swing.JTextField withdrowdateamountbox;
    private com.github.lgooddatepicker.components.DatePicker withdrowdatebox;
    private javax.swing.JTextField withdrownobox;
    // End of variables declaration//GEN-END:variables
}
