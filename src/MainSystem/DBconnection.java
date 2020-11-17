
package MainSystem;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Rashitha
 */
public class DBconnection {
    
    /**
     *
     * @return
     */
    
   
    
    public static Connection connect() 
    {
        
         Connection conn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/garment","root","");
            System.out.println("Database Connected");
        }
        catch(Exception ex)
        {
            System.out.println("Connection failed : "+ex);
        }
        return conn;
      
 }

    static PreparedStatement prepareStatement(String insert_into_image_Tableimg_title_img_data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


