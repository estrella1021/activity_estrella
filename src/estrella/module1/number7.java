/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrella.module1;

import java.io.File;

/**
 *
 * @author User
 */
public class number7 {
     public static void main (String [] args){

File data = new File ("C:\\Users\\User\\Desktop\\RAQUEL\\bubbles&blossom");

String[] fileList = data.list();
for (String beef : fileList){
System.out.println(beef);}
}
    
}
