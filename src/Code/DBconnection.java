
package Code;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBconnection {
    
    public static Connection connect(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/garment","root","");
            
        }
        catch (Exception e){
            System.out.println(e);
            
        }
      
        return con;
    }
    
}
