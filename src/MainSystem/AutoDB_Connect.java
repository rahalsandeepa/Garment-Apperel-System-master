/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rashitha
 */
public class AutoDB_Connect {
    
    public static Connection DB_Connection = null;
    public static PreparedStatement DB_PreparedStatement = null;
    public static ResultSet DB_ResultSet = null;
    
      //Default Contructor will use above valuse 
    private static String DB_Host = "jdbc:mysql://localhost:3306/garment";
    private static String user_Name = "root";
    private static String password = " ";
    
    
    public AutoDB_Connect(){
    
    }
    
    
     public void connect()
   {
   try
    {  
        Class.forName("com.mysql.jdbc.Driver");
        DB_Connection=(com.mysql.jdbc.Connection) DriverManager.getConnection(DB_Host,user_Name,password);
        System.out.println("Succesfully connected to "+DB_Host);
    }
   catch(Exception e)
    {
        System.out.println(e);
    }
   } 
    
    public  void close()
    {
        try {
            DB_Connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AutoDB_Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    // this method is used to excute SQL queryies without a return value
// this method will return a boolen value if it is sucessfull and a message in the console 
    public  boolean execute(String SQL_String){
       
        DB_ResultSet =null;
        //System.out.println(SQL_String);
        try {
            DB_PreparedStatement =DB_Connection.prepareStatement(SQL_String);
            DB_PreparedStatement.execute();
            System.out.println("***Successfull***Excuted "+SQL_String);
            
            return true;
       
        } catch (SQLException ex) {
            System.out.println("***Fail***Excuted "+SQL_String);
            Logger.getLogger(AutoDB_Connect.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
    }
   
// this method is used to excute SQL queryies with a return value
// this method will return a Resultset  if it is sucessfull Or NULL value if it fails and a message in the console 
    public ResultSet executeQuery(String SQL_String)
    {   
       DB_ResultSet =null;
       System.out.println(SQL_String);
        try {
            DB_PreparedStatement =DB_Connection.prepareStatement(SQL_String);
            DB_ResultSet=DB_PreparedStatement.executeQuery();
            System.out.println("***Successfull***Excuted "+SQL_String);
            
            return DB_ResultSet;
            
        } catch (SQLException ex) {
            System.out.println("***Fail***Excuted "+SQL_String);
            Logger.getLogger(AutoDB_Connect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
            
    }
  
 
}
