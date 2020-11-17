/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycode;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Isuru
 */
public class garment {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/garment?";
    private static final String USER="root";
    private static final String PASS="";
    
    
    public static void CreateConnection(){
        try (java.sql.Connection con = DriverManager.getConnection(URL,"user","")) {
                Statement stmt=con.createStatement();
                ResultSet rs=null;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    } 
    
    public static void addToInspection(){
        //
    }
    
   /* public static Connection connect()
    {
        Connection conn = null;
        
        try
       
        {          
            class.forName("com.mysql.jdbc.Driver");
            conn;

                <error>() {
                    this.<error> = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/garment","root","");
                }
            

               
                
        }
            catch (Exception e);
            {
                    System.out.println(e);
                    }
            return conn;
                
    }*/
    
}

    

 
