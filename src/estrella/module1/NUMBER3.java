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
public class NUMBER3 {
     public static void main(String[] args){
      int[] S = new int[] {21, 21, 21, 21, 21, 21, 2121};
      double sum = 0;
  
      for (int i=0; i < S.length ; i++) {
          sum = sum + S[i];
      }
      double average = sum / S.length;
      System.out.println("Average value of the array elements is : " + average);
     }
}
