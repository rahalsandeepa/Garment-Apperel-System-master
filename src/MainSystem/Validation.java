/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainSystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rashitha
 */
public class Validation {
    
    public static boolean email_validation(String email){
        boolean status = false;
        
        String email_pattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$";
        
        Pattern pattern = Pattern.compile(email_pattern);
        Matcher matcher = pattern.matcher(email);
        
        if(matcher.matches()){
            status = true;
           }else{
            status = false;
        }
        return status;
    }
    
}
