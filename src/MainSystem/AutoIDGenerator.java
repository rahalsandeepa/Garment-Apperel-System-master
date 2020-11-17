 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainSystem;

import java.util.Date;

/**
 *
 * @author Rashitha
 */
public class AutoIDGenerator 
{
    Date now;
    public String generate (String Prefix,String UserID){
    now=new Date();     
    int hc=now.hashCode();
    String hhc=Integer.toHexString(hc);
    String ff=Prefix+UserID+hhc;
    return ff;
}
}

