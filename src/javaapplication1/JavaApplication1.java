package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;


public class JavaApplication1 {
    public static Connection connect()  {
        Connection conn = null;    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/garment","root" ,"" );
        }
        catch (Exception e){
                System.out.println(e);
        }
        return conn;
    }
}
