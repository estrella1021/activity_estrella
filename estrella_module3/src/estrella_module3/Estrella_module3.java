/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrella_module3;
import java.lang.*;
/**
 *
 * @author User
 */
public class Estrella_module3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        class Mytask extends Thread{
    // the thread
    @Override
    public void run(){
         for(int doc=1;doc<=10;doc++){
            System.out.println("Printing Document "+doc+" Please wait....");
            System.out.println("Printed doc #"+doc+"- Printer2");
        }
    }
    
        }
     
      System.out.println("Appliction Started");
      
      
      for(int doc=1; doc<=10;doc ++){
                System.out.println("doc printed" +doc+ " - Printer1");
      }
      
      
      Mytask task = new Mytask();
      task.start();// start thread
      
      System.out.println("Appliction Finished");      
      
      
        
    }
    
    
    
}

   
    

