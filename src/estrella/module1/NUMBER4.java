/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrella.module1;

/**
 *
 * @author User
 */
public class NUMBER4 {
    
   public boolean endsNg (String str) {
        int RAQ = str.length();
        String UEL = "UEL";
        if (RAQ < 3){
            return false;
        } else if (UEL.equals(str.substring( RAQ - 3, RAQ))){
            return true;
         
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        NUMBER4 m = new NUMBER4();
        String strl = "RAQUEL";
        System.out.println("The given strings is: " + strl);
        System.out.println("The string containing ng at last: " + m.endsNg(strl));
    }
}
     
